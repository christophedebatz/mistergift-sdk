package com.gvstave.sdk.cdiscount.api;

import com.google.common.collect.ImmutableList;
import com.gvstave.sdk.cdiscount.common.CdiscountApiException;
import com.gvstave.sdk.cdiscount.common.ParameterBag;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * The Cdiscount connector.
 */
@Service
public class CdiscountConnector<T extends Serializable> implements Connector {

    /** The logger. */
    private static Logger LOGGER = LoggerFactory.getLogger(CdiscountConnector.class);

    /** The environment. */
    @Inject
    private Environment env;

    /**
     * {@inheritDoc}
     */
    @Override
    public T fetch(CdiscountQueryType queryType, CdiscountAbstractQuery query, ParameterBag parameterBag) {
        try {
            //@formatter:off
            String baseUrl = String.format("%s/%s", env.getProperty("cdiscount.api.baseurl"), queryType.getKey());
            URIBuilder uriBuilder = new URIBuilder(baseUrl);

            if (parameterBag != null) {
                uriBuilder.addParameters(parameterBag.getParameters());
            }

            URI uri = uriBuilder.build();

            if (query.getApiKey() == null) {
                query.setApiKey(env.getProperty("cdiscount.api.key"));
            }

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<? extends CdiscountAbstractQuery> entity = new HttpEntity<>(query, headers);

            RestTemplate restTemplate = new RestTemplate();
            restTemplate.setErrorHandler(new ResponseErrorHandler() {

                /**
                 * {@inheritDoc}
                 */
                @Override
                public boolean hasError(ClientHttpResponse response) throws IOException {
                    return response.getRawStatusCode() > 400;
                }

                /**
                 * {@inheritDoc}
                 */
                @Override
                public void handleError(ClientHttpResponse response) throws IOException {
                    LOGGER.error("An error occurred when requesting data from Cdiscount.", response.getRawStatusCode());
                    LOGGER.error(IOUtils.toString(response.getBody(), StandardCharsets.UTF_8));
                }

            });

            List<HttpMessageConverter<?>> mc = new ArrayList<>();
            MappingJackson2HttpMessageConverter converters = new MappingJackson2HttpMessageConverter();
            converters.setSupportedMediaTypes(ImmutableList.of(
                new MediaType("application", "json", Charset.forName("utf-8"))
            ));
            mc.add(converters);

            restTemplate.setMessageConverters(mc);
            ResponseEntity<? extends Serializable> response = restTemplate.exchange(uri, HttpMethod.POST, entity, query.getResponseType());
            //@formatter:on

            if (response.getStatusCodeValue() < 400) {
                return (T)response.getBody();
            } else {
                String error = String.format("Remote server throws an internal server error with %s", response.getBody());
                throw new CdiscountApiException(error);
            }

        } catch (URISyntaxException e) {
            assert parameterBag != null;
            String message = String.format("Cannot create URI with params=%s", parameterBag.toString());
            LOGGER.error(message, e);
            throw new CdiscountApiException(message, e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T fetch(CdiscountQueryType queryType, CdiscountAbstractQuery query) {
        return fetch(queryType, query, null);
    }

}

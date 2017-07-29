package com.gvstave.sdk.cdiscount.service;

import com.gvstave.sdk.cdiscount.api.CdiscountConnector;
import com.gvstave.sdk.cdiscount.api.product.response.CdiscountProductResponse;
import com.gvstave.sdk.cdiscount.domain.Api;
import com.gvstave.sdk.cdiscount.domain.RemoteProduct;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 */
@Service
class CdiscountProductSupplierService implements Supplier<RemoteProduct>, Predicate<Api> {

    /** The environment. */
    @Inject
    private Environment environment;

    /** The CDiscount connector. */
    @Inject
    private CdiscountConnector<CdiscountProductResponse> connector;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean test(Api api) {
        return Api.CDISCOUNT == api;
    }



    @Override
    public RemoteProduct get() {
        return null;
    }
}

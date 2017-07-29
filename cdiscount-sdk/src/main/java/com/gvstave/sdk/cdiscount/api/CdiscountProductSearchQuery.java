package com.gvstave.sdk.cdiscount.api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gvstave.sdk.cdiscount.api.product.response.CdiscountSearchProductResponse;
import com.gvstave.sdk.cdiscount.api.product.search.CdiscountProductSearchRequest;

import java.io.Serializable;

/**
 *
 */
@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdiscountProductSearchQuery extends CdiscountAbstractQuery implements Serializable {

    /** The serial default version id. */
    private static final long serialVersionUID = 1L;

    /** The search request. */
    @JsonProperty("SearchRequest")
    private CdiscountProductSearchRequest searchRequest;

    /**
     * Constructor.
     */
    public CdiscountProductSearchQuery() {
        // this is for jackson
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends Serializable> getResponseType() {
        return CdiscountSearchProductResponse.class;
    }

    /**
     * Returns the search request.
     *
     * @return The search request.
     */
    public CdiscountProductSearchRequest getSearchRequest() {
        return searchRequest;
    }

    /**
     * Sets the search request.
     *
     * @param searchRequest The search request.
     */
    public void setSearchRequest(CdiscountProductSearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

}

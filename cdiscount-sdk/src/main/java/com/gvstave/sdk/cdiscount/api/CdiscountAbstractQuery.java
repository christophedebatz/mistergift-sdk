package com.gvstave.sdk.cdiscount.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The Cdiscount abstract query.
 */
abstract class CdiscountAbstractQuery implements Serializable {

    /** The serial default version uid. */
    private static final long serialVersionUID = 1L;

    /** The API key. */
    @JsonProperty("ApiKey")
    private String apiKey;

    /**
     * Constructor.
     */
    public CdiscountAbstractQuery() {
        // this is for jackson
    }

    /**
     * Returns the api key.
     *
     * @return The api key.
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the api key.
     *
     * @param apiKey The api key.
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Returns the response type class.
     *
     * @return The response type class.
     */
    @JsonIgnore
    abstract Class<? extends Serializable> getResponseType();
}

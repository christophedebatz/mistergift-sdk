package com.gvstave.sdk.cdiscount.api.product.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 */
public class CdiscountSellerResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public CdiscountSellerResponse() {
        // this is for jackson
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
}

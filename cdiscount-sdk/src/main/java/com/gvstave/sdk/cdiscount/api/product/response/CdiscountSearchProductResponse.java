package com.gvstave.sdk.cdiscount.api.product.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Describes a response.
 */
@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdiscountSearchProductResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The error. */
    private String error;

    /** The item count. */
    private Integer itemCount;

    /** The page count. */
    private Integer pageCount;

    /** The page number. */
    private Integer page;

    /** The products list. */
    private List<CdiscountProductResponse> products;

    public CdiscountSearchProductResponse() {
        // this is for jackson
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    @JsonProperty("ErrorMessage")
    public void setErrorMessage(String error) {
        this.error = error;
    }

    @JsonProperty("itemCount")
    public Integer getItemCount() {
        return itemCount;
    }

    @JsonProperty("ItemCount")
    public void setItemCount(String itemCount) {
        this.itemCount = Integer.valueOf(itemCount);
    }

    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("PageCount")
    public void setPageCount(String pageCount) {
        this.pageCount = Integer.valueOf(pageCount);
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("PageNumber")
    public void setPageNumber(String page) {
        this.page = Integer.valueOf(page);
    }

    @JsonProperty("products")
    public List<CdiscountProductResponse> getProducts() {
        return products;
    }

    @JsonProperty("Products")
    public void setProducts(List<CdiscountProductResponse> products) {
        this.products = products;
    }
}

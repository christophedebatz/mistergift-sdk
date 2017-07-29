package com.gvstave.sdk.cdiscount.domain;

import com.gvstave.sdk.Provider;

import java.io.Serializable;

/**
 * Describes a product.
 */
public class RemoteProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum RemoteProductType {

        CLOTH("cloth"),

        ENTERTAINMENT("entertainment"),

        JOURNEY("journey"),

        BOOK("book");

        String type;

        RemoteProductType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    /** The provider. */
    private Provider provider;

    /** The product name. */
    private String name;

    /** The product type. */
    private RemoteProductType type;

    /** The api id. */
    private String apiId;

    /** The product brand. */
    private String brand;

    /** The product description. */
    private String description;

    /** The product price. */
    private Double price;

    /** The price discount. */
    private Double discount;

    /** The product rating. */
    private Double rating;

    /** The product picture url. */
    private String pictureUrl;

    /** The product url. */
    private String url;

    /** The product seller name. */
    private String seller;

    /** The product shipping fees. */
    private Double shippingFees;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public RemoteProductType getType() {
        return type;
    }

    public void setType(RemoteProductType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getShippingFees() {
        return shippingFees;
    }

    public void setShippingFees(Double shippingFees) {
        this.shippingFees = shippingFees;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

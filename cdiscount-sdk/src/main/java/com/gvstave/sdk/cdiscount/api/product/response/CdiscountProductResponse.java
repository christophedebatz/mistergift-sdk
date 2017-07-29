package com.gvstave.sdk.cdiscount.api.product.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdiscountProductResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<CdiscountProductResponse> associatedProducts;

    private CdiscountOfferResponse bestOffer;

    private List<CdiscountOfferResponse> offers;

    private Long offersCount;

    private Double rating;

    private String description;

    private List<CdiscountOfferResponse.CdiscountProductImageResponse> pictures;

    private String mainPictureUrl;

    private String name;

    private String brand;

    private String eanCode;

    private String id;

    public CdiscountProductResponse() {
        // this is for jackson
    }

    @JsonProperty("associatedProducts")
    public List<CdiscountProductResponse> getAssociatedProducts() {
        return associatedProducts;
    }

    @JsonProperty("AssociatedProducts")
    public void setAssociatedProducts(List<CdiscountProductResponse> associatedProducts) {
        this.associatedProducts = associatedProducts;
    }

    @JsonProperty("bestOffer")
    public CdiscountOfferResponse getBestOffer() {
        return bestOffer;
    }

    @JsonProperty("BestOffer")
    public void setBestOffer(CdiscountOfferResponse bestOffer) {
        this.bestOffer = bestOffer;
    }

    @JsonProperty("offers")
    public List<CdiscountOfferResponse> getOffers() {
        return offers;
    }

    @JsonProperty("Offers")
    public void setOffers(List<CdiscountOfferResponse> offers) {
        this.offers = offers;
    }

    @JsonProperty("offersCount")
    public Long getOffersCount() {
        return offersCount;
    }

    @JsonProperty("OffersCount")
    public void setOffersCount(Long offersCount) {
        this.offersCount = offersCount;
    }

    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    @JsonProperty("Rating")
    public void setRating(String rating) {
        this.rating = Double.valueOf(rating);
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("images")
    public List<CdiscountOfferResponse.CdiscountProductImageResponse> getPictures() {
        return pictures;
    }

    @JsonProperty("Images")
    public void setPictures(List<CdiscountOfferResponse.CdiscountProductImageResponse> pictures) {
        this.pictures = pictures;
    }

    @JsonProperty("pictureUrl")
    public String getPictureUrl() {
        return mainPictureUrl;
    }

    @JsonProperty("MainImageUrl")
    public void setMainPictureUrl(String mainPictureUrl) {
        this.mainPictureUrl = mainPictureUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("eanCode")
    public String getEanCode() {
        return eanCode;
    }

    @JsonProperty("Ean")
    public void setEan(String eanCode) {
        this.eanCode = eanCode;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }
}
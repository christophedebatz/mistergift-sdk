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
public class CdiscountOfferResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String condition;

    private String id;

    private Boolean available;

    private CdiscountPriceDetailsResponse priceDetails;

    private Double price;

    private CdiscountSellerResponse seller;

    private String productUrl;

    @JsonProperty("SalePrice")
    private String salePrice;

    public CdiscountOfferResponse() {
        // this is for jackson
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("Condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("isAvailable")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("IsAvailable")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("priceDetails")
    public CdiscountPriceDetailsResponse getPriceDetails() {
        return priceDetails;
    }

    @JsonProperty("PriceDetails")
    public void setPriceDetails(CdiscountPriceDetailsResponse priceDetails) {
        this.priceDetails = priceDetails;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("SalePrice")
    public void setSalePrice(String price) {
        this.price = Double.valueOf(price);
    }

    @JsonProperty("seller")
    public CdiscountSellerResponse getSeller() {
        return seller;
    }

    @JsonProperty("Seller")
    public void setSeller(CdiscountSellerResponse seller) {
        this.seller = seller;
    }

    @JsonProperty("productUrl")
    public String getProductUrl() {
        return productUrl;
    }

    @JsonProperty("ProductURL")
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * The Cdiscount price details response mapping object.
     */
    public class CdiscountPriceDetailsResponse implements Serializable {

        private static final long serialVersionUID = 1L;

        private CdiscountPriceDetailsDiscountResponse discount;

        private Double referencePrice;

        //private CdiscountPriceDetailsSavingResponse saving;

        public CdiscountPriceDetailsResponse() {
            // this is for jackson
        }

        @JsonProperty("discount")
        public CdiscountPriceDetailsDiscountResponse getDiscount() {
            return discount;
        }

        @JsonProperty("Discount")
        public void setDiscount(CdiscountPriceDetailsDiscountResponse discount) {
            this.discount = discount;
        }

        @JsonProperty("referencePrice")
        public Double getReferencePrice() {
            return referencePrice;
        }

        @JsonProperty("ReferencePrice")
        public void setReferencePrice(String referencePrice) {
            this.referencePrice = Double.valueOf(referencePrice);
        }
//
//        @JsonProperty("saving")
//        public CdiscountPriceDetailsSavingResponse getSaving() {
//            return saving;
//        }
//
//        @JsonProperty("Saving")
//        public void setSaving(CdiscountPriceDetailsSavingResponse saving) {
//            this.saving = saving;
//        }

        /**
         * The Cdiscount price details discount response mapping object.
         */
        public class CdiscountPriceDetailsDiscountResponse implements Serializable {

            private static final long serialVersionUID = 1L;

            private String startDate;

            private String endDate;

            private String type;

            public CdiscountPriceDetailsDiscountResponse() {
                // this is for jackson
            }

            @JsonProperty("startDate")
            public String getStartDate() {
                return startDate;
            }

            @JsonProperty("StartDate")
            public void setStartDate(String startDate) {
                this.startDate = startDate;
            }

            @JsonProperty("endDate")
            public String getEndDate() {
                return endDate;
            }

            @JsonProperty("EndDate")
            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            @JsonProperty("type")
            public String getType() {
                return type;
            }

            @JsonProperty("Type")
            public void setType(String type) {
                this.type = type;
            }
        }
    }

    /**
     *
     */
    public class CdiscountPriceDetailsSavingResponse implements Serializable {

        private static final long serialVersionUID = 1L;

        private String type;

        private String value;

        public CdiscountPriceDetailsSavingResponse() {
            // this is for jackson
        }

        @JsonProperty("type")
        public String getType() {
            return type;
        }

        @JsonProperty("Type")
        public void setType(String type) {
            this.type = type;
        }

        @JsonProperty("value")
        public String getValue() {
            return value;
        }

        @JsonProperty("Value")
        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     *
     */
    public class CdiscountProductImageResponse implements Serializable {

        private static final long serialVersionUID = 1L;

        public CdiscountProductImageResponse() {
        }
    }
}

package com.gvstave.sdk.cdiscount.api.product.search;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Represents the search request that contains both pagination and filters.
 */
@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdiscountProductSearchRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The search keyword. */
    @JsonProperty("Keyword")
    private String keyword;

    /** The search sort. */
    @JsonProperty("SortBy")
    private CdiscountSearchSort sort = CdiscountSearchSort.RELEVANCE;

    /** The filters. */
    @JsonProperty("Filters")
    private CdiscountSearchFilter filters;

    /** The pagination. */
    @JsonProperty("Pagination")
    private CdiscountPagination pagination = new CdiscountPagination();

    /**
     * Constructor.
     *
     * @param keyword The search keyword.
     */
    public CdiscountProductSearchRequest(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets the result sort.
     *
     * @param sort The sort.
     * @return The search request.
     */
    public CdiscountProductSearchRequest withSort(CdiscountSearchSort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Sets the pagination.
     *
     * @param pagination The pagination.
     * @return The search request.
     */
    public CdiscountProductSearchRequest withPagination(CdiscountPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Sets the filters.
     *
     * @param filter The filters.
     * @return The search request.
     */
    public CdiscountProductSearchRequest withFilter(CdiscountSearchFilter filter) {
        this.filters = filter;
        return this;
    }

    /**
     *
     * @return
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     *
     * @return
     */
    public CdiscountSearchSort getSort() {
        return sort;
    }

    /**
     *
     * @return
     */
    public CdiscountSearchFilter getFilters() {
        return filters;
    }

    /**
     *
     * @return
     */
    public CdiscountPagination getPagination() {
        return pagination;
    }

    /**
     *
     */
    public enum CdiscountSearchSort {

        /** Sort by result relevance. */
        RELEVANCE("relevance"),

        /** Sort by product minimum price. */
        MINIMUM_PRICE("minprice"),

        /** Sort by product maximum price. */
        MAXIMUM_PRICE("maxprice"),

        /** Sort by product rating. */
        RATING("rating");

        /** The sort. */
        String sort;

        /**
         * Constructor.
         *
         * @param sort The sort.
         */
        CdiscountSearchSort(String sort) {
            this.sort = sort;
        }

        /**
         * Returns the sort.
         *
         * @return The sort.
         */
        public String getSort() {
            return sort;
        }

    }

    /**
     * Represents the pagination.
     */
    public class CdiscountPagination implements Serializable {

        private static final long serialVersionUID = 1L;

        /** The number of items per page. */
        @JsonProperty("ItemsPerPage")
        private int pageSize = 10;

        /** The current page. */
        @JsonProperty("PageNumber")
        private int currentPage = 0;

        /**
         * Sets the page size.
         *
         * @param pageSize The page size.
         * @return The pagination.
         */
        CdiscountPagination withPageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sets the current page.
         *
         * @param currentPage The current page.
         * @return The pagination.
         */
        CdiscountPagination withCurrentPage(int currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        public int getPageSize() {
            return pageSize;
        }

        public int getCurrentPage() {
            return currentPage;
        }
    }

    /**
     * Represents the main filters that contains sub filters for querying.
     */
    public class CdiscountSearchFilter implements Serializable {

        private static final long serialVersionUID = 1L;

        /** The price filters. */
        @JsonProperty("Price")
        private CdiscountPriceFilter priceFilter;

        /** Whether market places products are retrieved. */
        @JsonProperty("IncludeMarketPlace")
        private boolean includeMarketPlace;

        /** The list of brands for the product. */
        @JsonProperty("Brands")
        private List<String> brands;

        /**
         * Constructor.
         *
         * @param priceFilter The price filters.
         * @return The filters.
         */
        public CdiscountSearchFilter withPriceFilter(CdiscountPriceFilter priceFilter) {
            this.priceFilter = priceFilter;
            return this;
        }

        /**
         * Includes the markets place products into the results.
         *
         * @param includeMarketPlace If market place are included.
         * @return The filters.
         */
        public CdiscountSearchFilter includeMarketPlace(boolean includeMarketPlace) {
            this.includeMarketPlace = includeMarketPlace;
            return this;
        }

        /**
         * Sets the list of brands.
         *
         * @param brands The list of brands.
         * @return The filters.
         */
        CdiscountSearchFilter withBrands(List<String> brands) {
            this.brands = brands;
            return this;
        }

        /**
         *
         * @return
         */
        public CdiscountPriceFilter getPriceFilter() {
            return priceFilter;
        }

        /**
         *
         * @return
         */
        public boolean isIncludeMarketPlace() {
            return includeMarketPlace;
        }

        /**
         *
         * @return
         */
        public List<String> getBrands() {
            return brands;
        }
    }

    /**
     * Represents the price filters for product querying.
     */
    private class CdiscountPriceFilter implements Serializable {

        private static final long serialVersionUID = 1L;

        /** The minimum price. */
        @JsonProperty("Min")
        private int minimum;

        /** The maximum price. */
        @JsonProperty("Max")
        private int maximum;

        /**
         * Constructor.
         *
         * @param minimum The minimum price.
         * @param maximum The maximum price.
         */
        CdiscountPriceFilter(int minimum, int maximum) {
            this.minimum = minimum;
            this.maximum = maximum;
        }

        /**
         *
         * @return
         */
        public int getMinimum() {
            return minimum;
        }

        /**
         *
         * @return
         */
        public int getMaximum() {
            return maximum;
        }
    }

}

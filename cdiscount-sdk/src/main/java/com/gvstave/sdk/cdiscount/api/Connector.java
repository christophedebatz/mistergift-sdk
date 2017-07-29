package com.gvstave.sdk.cdiscount.api;

import com.gvstave.sdk.cdiscount.common.ParameterBag;

public interface Connector {

    /**
     *
     */
    enum CdiscountQueryType {

        Search("Search");

        String key;

        CdiscountQueryType(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }

    /**
     * Returns the json response for an API.
     *
     * @param queryType    The query type.
     * @param query        The query.
     * @param parameterBag The parameters.
     * @return The json.
     */
    Object fetch(CdiscountQueryType queryType, CdiscountAbstractQuery query, ParameterBag parameterBag);

    /**
     * Returns the json response for an API.
     *
     * @param queryType    The query type.
     * @param query        The query.
     * @return The json.
     */
    Object fetch(CdiscountQueryType queryType, CdiscountAbstractQuery query);

}

package com.gvstave.sdk.cdiscount.domain;

public enum Api {

    /**
     * The CDISCOUNT api.
     */
    CDISCOUNT("CDISCOUNT"),

    /**
     * The AMAZON api.
     */
    AMAZON("AMAZON"),

    /**
     * The DARTY api.
     */
    DARTY("DARTY"),

    /**
     * The FNAC api.
     */
    FNAC("FNAC");

    /**
     * The key.
     */
    String key;

    /**
     * Constructor.
     *
     * @param key The key.
     */
    Api(String key) {
        this.key = key;
    }

    /**
     * Returns the key.
     *
     * @return The key.
     */
    public String getKey() {
        return key;
    }

}

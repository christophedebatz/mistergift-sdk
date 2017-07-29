package com.gvstave.sdk.cdiscount.common;

/**
 *
 */
public class CdiscountApiException extends RuntimeException {

    /**
     *
     * @param message
     */
    public CdiscountApiException(String message) {
        super(message);
    }

    /**
     *
     * @param message
     * @param cause
     */
    public CdiscountApiException(String message, Throwable cause) {
        super(message, cause);
    }
}

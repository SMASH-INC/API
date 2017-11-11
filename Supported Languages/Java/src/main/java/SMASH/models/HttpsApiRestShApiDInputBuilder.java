/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class HttpsApiRestShApiDInputBuilder {
    //the instance to build
    private HttpsApiRestShApiDInput httpsApiRestShApiDInput;

    /**
     * Default constructor to initialize the instance
     */
    public HttpsApiRestShApiDInputBuilder() {
        httpsApiRestShApiDInput = new HttpsApiRestShApiDInput();
    }

    /**
     * Data URL, data as a query string, or direct upload
     */
    public HttpsApiRestShApiDInputBuilder data(String data) {
        httpsApiRestShApiDInput.setData(data);
        return this;
    }

    /**
     * Transformations to perform
     */
    public HttpsApiRestShApiDInputBuilder transform(String transform) {
        httpsApiRestShApiDInput.setTransform(transform);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HttpsApiRestShApiDInput build() {
        return httpsApiRestShApiDInput;
    }
}
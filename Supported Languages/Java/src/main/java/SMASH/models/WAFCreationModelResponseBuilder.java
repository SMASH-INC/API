/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class WAFCreationModelResponseBuilder {
    //the instance to build
    private WAFCreationModelResponse wAFCreationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public WAFCreationModelResponseBuilder() {
        wAFCreationModelResponse = new WAFCreationModelResponse();
    }

    public WAFCreationModelResponseBuilder success(String success) {
        wAFCreationModelResponse.setSuccess(success);
        return this;
    }

    public WAFCreationModelResponseBuilder cname(String cname) {
        wAFCreationModelResponse.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WAFCreationModelResponse build() {
        return wAFCreationModelResponse;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class VerifyModelResponseBuilder {
    //the instance to build
    private VerifyModelResponse verifyModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyModelResponseBuilder() {
        verifyModelResponse = new VerifyModelResponse();
    }

    public VerifyModelResponseBuilder request(String request) {
        verifyModelResponse.setRequest(request);
        return this;
    }

    public VerifyModelResponseBuilder to(String to) {
        verifyModelResponse.setTo(to);
        return this;
    }

    public VerifyModelResponseBuilder verified(String verified) {
        verifyModelResponse.setVerified(verified);
        return this;
    }

    public VerifyModelResponseBuilder id(String id) {
        verifyModelResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyModelResponse build() {
        return verifyModelResponse;
    }
}
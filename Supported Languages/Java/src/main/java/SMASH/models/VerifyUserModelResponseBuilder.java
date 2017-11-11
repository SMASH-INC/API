/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class VerifyUserModelResponseBuilder {
    //the instance to build
    private VerifyUserModelResponse verifyUserModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyUserModelResponseBuilder() {
        verifyUserModelResponse = new VerifyUserModelResponse();
    }

    public VerifyUserModelResponseBuilder request(String request) {
        verifyUserModelResponse.setRequest(request);
        return this;
    }

    public VerifyUserModelResponseBuilder correct(String correct) {
        verifyUserModelResponse.setCorrect(correct);
        return this;
    }

    public VerifyUserModelResponseBuilder id(String id) {
        verifyUserModelResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyUserModelResponse build() {
        return verifyUserModelResponse;
    }
}
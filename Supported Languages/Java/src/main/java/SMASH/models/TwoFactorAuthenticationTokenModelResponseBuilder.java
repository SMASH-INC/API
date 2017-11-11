/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class TwoFactorAuthenticationTokenModelResponseBuilder {
    //the instance to build
    private TwoFactorAuthenticationTokenModelResponse twoFactorAuthenticationTokenModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public TwoFactorAuthenticationTokenModelResponseBuilder() {
        twoFactorAuthenticationTokenModelResponse = new TwoFactorAuthenticationTokenModelResponse();
    }

    public TwoFactorAuthenticationTokenModelResponseBuilder request(String request) {
        twoFactorAuthenticationTokenModelResponse.setRequest(request);
        return this;
    }

    public TwoFactorAuthenticationTokenModelResponseBuilder correct(String correct) {
        twoFactorAuthenticationTokenModelResponse.setCorrect(correct);
        return this;
    }

    public TwoFactorAuthenticationTokenModelResponseBuilder id(String id) {
        twoFactorAuthenticationTokenModelResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TwoFactorAuthenticationTokenModelResponse build() {
        return twoFactorAuthenticationTokenModelResponse;
    }
}
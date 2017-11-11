/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class TwoFactorAuthenticationModelResponseBuilder {
    //the instance to build
    private TwoFactorAuthenticationModelResponse twoFactorAuthenticationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public TwoFactorAuthenticationModelResponseBuilder() {
        twoFactorAuthenticationModelResponse = new TwoFactorAuthenticationModelResponse();
    }

    public TwoFactorAuthenticationModelResponseBuilder key(String key) {
        twoFactorAuthenticationModelResponse.setKey(key);
        return this;
    }

    public TwoFactorAuthenticationModelResponseBuilder uid(String uid) {
        twoFactorAuthenticationModelResponse.setUid(uid);
        return this;
    }

    public TwoFactorAuthenticationModelResponseBuilder to(String to) {
        twoFactorAuthenticationModelResponse.setTo(to);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TwoFactorAuthenticationModelResponse build() {
        return twoFactorAuthenticationModelResponse;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserAuthenticationModelResponseBuilder {
    //the instance to build
    private UserAuthenticationModelResponse userAuthenticationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UserAuthenticationModelResponseBuilder() {
        userAuthenticationModelResponse = new UserAuthenticationModelResponse();
    }

    public UserAuthenticationModelResponseBuilder request(String request) {
        userAuthenticationModelResponse.setRequest(request);
        return this;
    }

    public UserAuthenticationModelResponseBuilder uid(String uid) {
        userAuthenticationModelResponse.setUid(uid);
        return this;
    }

    public UserAuthenticationModelResponseBuilder valid(String valid) {
        userAuthenticationModelResponse.setValid(valid);
        return this;
    }

    public UserAuthenticationModelResponseBuilder id(String id) {
        userAuthenticationModelResponse.setId(id);
        return this;
    }

    public UserAuthenticationModelResponseBuilder info(InfoModel info) {
        userAuthenticationModelResponse.setInfo(info);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserAuthenticationModelResponse build() {
        return userAuthenticationModelResponse;
    }
}
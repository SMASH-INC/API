/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserRegistrationModelResponseBuilder {
    //the instance to build
    private UserRegistrationModelResponse userRegistrationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UserRegistrationModelResponseBuilder() {
        userRegistrationModelResponse = new UserRegistrationModelResponse();
    }

    public UserRegistrationModelResponseBuilder request(String request) {
        userRegistrationModelResponse.setRequest(request);
        return this;
    }

    public UserRegistrationModelResponseBuilder active(String active) {
        userRegistrationModelResponse.setActive(active);
        return this;
    }

    public UserRegistrationModelResponseBuilder id(String id) {
        userRegistrationModelResponse.setId(id);
        return this;
    }

    public UserRegistrationModelResponseBuilder info(UserProfileInformationModel info) {
        userRegistrationModelResponse.setInfo(info);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserRegistrationModelResponse build() {
        return userRegistrationModelResponse;
    }
}
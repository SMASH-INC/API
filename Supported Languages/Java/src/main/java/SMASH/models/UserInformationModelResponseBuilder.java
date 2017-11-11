/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserInformationModelResponseBuilder {
    //the instance to build
    private UserInformationModelResponse userInformationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UserInformationModelResponseBuilder() {
        userInformationModelResponse = new UserInformationModelResponse();
    }

    public UserInformationModelResponseBuilder user(String user) {
        userInformationModelResponse.setUser(user);
        return this;
    }

    /**
     * Users API Private Key
     */
    public UserInformationModelResponseBuilder key(String key) {
        userInformationModelResponse.setKey(key);
        return this;
    }

    /**
     * Users API Public Key
     */
    public UserInformationModelResponseBuilder api(String api) {
        userInformationModelResponse.setApi(api);
        return this;
    }

    /**
     * Users Profile Information
     */
    public UserInformationModelResponseBuilder info(UserInformationSecondaryModel info) {
        userInformationModelResponse.setInfo(info);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserInformationModelResponse build() {
        return userInformationModelResponse;
    }
}
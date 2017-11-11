/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserUpdateModelResponseBuilder {
    //the instance to build
    private UserUpdateModelResponse userUpdateModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UserUpdateModelResponseBuilder() {
        userUpdateModelResponse = new UserUpdateModelResponse();
    }

    public UserUpdateModelResponseBuilder request(String request) {
        userUpdateModelResponse.setRequest(request);
        return this;
    }

    public UserUpdateModelResponseBuilder updated(String updated) {
        userUpdateModelResponse.setUpdated(updated);
        return this;
    }

    public UserUpdateModelResponseBuilder id(String id) {
        userUpdateModelResponse.setId(id);
        return this;
    }

    public UserUpdateModelResponseBuilder info(UserCustomUpdateModel info) {
        userUpdateModelResponse.setInfo(info);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserUpdateModelResponse build() {
        return userUpdateModelResponse;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserDeletionResponseModelBuilder {
    //the instance to build
    private UserDeletionResponseModel userDeletionResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserDeletionResponseModelBuilder() {
        userDeletionResponseModel = new UserDeletionResponseModel();
    }

    public UserDeletionResponseModelBuilder request(String request) {
        userDeletionResponseModel.setRequest(request);
        return this;
    }

    public UserDeletionResponseModelBuilder deleted(String deleted) {
        userDeletionResponseModel.setDeleted(deleted);
        return this;
    }

    public UserDeletionResponseModelBuilder id(String id) {
        userDeletionResponseModel.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserDeletionResponseModel build() {
        return userDeletionResponseModel;
    }
}
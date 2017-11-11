/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserDeletionModelBuilder {
    //the instance to build
    private UserDeletionModel userDeletionModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserDeletionModelBuilder() {
        userDeletionModel = new UserDeletionModel();
    }

    public UserDeletionModelBuilder key(String key) {
        userDeletionModel.setKey(key);
        return this;
    }

    public UserDeletionModelBuilder uid(String uid) {
        userDeletionModel.setUid(uid);
        return this;
    }

    public UserDeletionModelBuilder user(String user) {
        userDeletionModel.setUser(user);
        return this;
    }

    public UserDeletionModelBuilder apiuid(String apiuid) {
        userDeletionModel.setApiuid(apiuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserDeletionModel build() {
        return userDeletionModel;
    }
}
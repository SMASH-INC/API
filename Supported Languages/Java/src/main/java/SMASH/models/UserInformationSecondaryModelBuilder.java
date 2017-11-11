/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserInformationSecondaryModelBuilder {
    //the instance to build
    private UserInformationSecondaryModel userInformationSecondaryModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserInformationSecondaryModelBuilder() {
        userInformationSecondaryModel = new UserInformationSecondaryModel();
    }

    public UserInformationSecondaryModelBuilder key(String key) {
        userInformationSecondaryModel.setKey(key);
        return this;
    }

    public UserInformationSecondaryModelBuilder uid(String uid) {
        userInformationSecondaryModel.setUid(uid);
        return this;
    }

    public UserInformationSecondaryModelBuilder user(String user) {
        userInformationSecondaryModel.setUser(user);
        return this;
    }

    public UserInformationSecondaryModelBuilder apiuid(String apiuid) {
        userInformationSecondaryModel.setApiuid(apiuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserInformationSecondaryModel build() {
        return userInformationSecondaryModel;
    }
}
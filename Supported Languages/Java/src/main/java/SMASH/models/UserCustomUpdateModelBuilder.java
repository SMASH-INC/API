/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserCustomUpdateModelBuilder {
    //the instance to build
    private UserCustomUpdateModel userCustomUpdateModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserCustomUpdateModelBuilder() {
        userCustomUpdateModel = new UserCustomUpdateModel();
    }

    public UserCustomUpdateModelBuilder uid(String uid) {
        userCustomUpdateModel.setUid(uid);
        return this;
    }

    public UserCustomUpdateModelBuilder apiuid(String apiuid) {
        userCustomUpdateModel.setApiuid(apiuid);
        return this;
    }

    public UserCustomUpdateModelBuilder avatar(String avatar) {
        userCustomUpdateModel.setAvatar(avatar);
        return this;
    }

    public UserCustomUpdateModelBuilder customInput(String customInput) {
        userCustomUpdateModel.setCustomInput(customInput);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserCustomUpdateModel build() {
        return userCustomUpdateModel;
    }
}
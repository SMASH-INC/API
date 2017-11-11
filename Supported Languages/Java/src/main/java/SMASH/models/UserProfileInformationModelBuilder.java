/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserProfileInformationModelBuilder {
    //the instance to build
    private UserProfileInformationModel userProfileInformationModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserProfileInformationModelBuilder() {
        userProfileInformationModel = new UserProfileInformationModel();
    }

    public UserProfileInformationModelBuilder uid(String uid) {
        userProfileInformationModel.setUid(uid);
        return this;
    }

    public UserProfileInformationModelBuilder apiuid(String apiuid) {
        userProfileInformationModel.setApiuid(apiuid);
        return this;
    }

    public UserProfileInformationModelBuilder realname(String realname) {
        userProfileInformationModel.setRealname(realname);
        return this;
    }

    public UserProfileInformationModelBuilder displayname(String displayname) {
        userProfileInformationModel.setDisplayname(displayname);
        return this;
    }

    public UserProfileInformationModelBuilder email(String email) {
        userProfileInformationModel.setEmail(email);
        return this;
    }

    public UserProfileInformationModelBuilder address(String address) {
        userProfileInformationModel.setAddress(address);
        return this;
    }

    public UserProfileInformationModelBuilder phone(String phone) {
        userProfileInformationModel.setPhone(phone);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserProfileInformationModel build() {
        return userProfileInformationModel;
    }
}
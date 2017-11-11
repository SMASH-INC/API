/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserUpdateModelBuilder {
    //the instance to build
    private UserUpdateModel userUpdateModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserUpdateModelBuilder() {
        userUpdateModel = new UserUpdateModel();
    }

    public UserUpdateModelBuilder key(String key) {
        userUpdateModel.setKey(key);
        return this;
    }

    public UserUpdateModelBuilder uid(String uid) {
        userUpdateModel.setUid(uid);
        return this;
    }

    public UserUpdateModelBuilder user(String user) {
        userUpdateModel.setUser(user);
        return this;
    }

    public UserUpdateModelBuilder apiuid(String apiuid) {
        userUpdateModel.setApiuid(apiuid);
        return this;
    }

    public UserUpdateModelBuilder oldpassword(String oldpassword) {
        userUpdateModel.setOldpassword(oldpassword);
        return this;
    }

    public UserUpdateModelBuilder newpassword(String newpassword) {
        userUpdateModel.setNewpassword(newpassword);
        return this;
    }

    public UserUpdateModelBuilder name(String name) {
        userUpdateModel.setName(name);
        return this;
    }

    public UserUpdateModelBuilder email(String email) {
        userUpdateModel.setEmail(email);
        return this;
    }

    public UserUpdateModelBuilder phone(String phone) {
        userUpdateModel.setPhone(phone);
        return this;
    }

    public UserUpdateModelBuilder avatar(String avatar) {
        userUpdateModel.setAvatar(avatar);
        return this;
    }

    public UserUpdateModelBuilder countrycode(String countrycode) {
        userUpdateModel.setCountrycode(countrycode);
        return this;
    }

    public UserUpdateModelBuilder address(String address) {
        userUpdateModel.setAddress(address);
        return this;
    }

    public UserUpdateModelBuilder a(String a) {
        userUpdateModel.setA(a);
        return this;
    }

    public UserUpdateModelBuilder sa(String sa) {
        userUpdateModel.setSa(sa);
        return this;
    }

    public UserUpdateModelBuilder c(String c) {
        userUpdateModel.setC(c);
        return this;
    }

    public UserUpdateModelBuilder s(String s) {
        userUpdateModel.setS(s);
        return this;
    }

    public UserUpdateModelBuilder z(String z) {
        userUpdateModel.setZ(z);
        return this;
    }

    public UserUpdateModelBuilder customInput(String customInput) {
        userUpdateModel.setCustomInput(customInput);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserUpdateModel build() {
        return userUpdateModel;
    }
}
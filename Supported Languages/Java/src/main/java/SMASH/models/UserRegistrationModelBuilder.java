/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserRegistrationModelBuilder {
    //the instance to build
    private UserRegistrationModel userRegistrationModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserRegistrationModelBuilder() {
        userRegistrationModel = new UserRegistrationModel();
    }

    public UserRegistrationModelBuilder key(String key) {
        userRegistrationModel.setKey(key);
        return this;
    }

    public UserRegistrationModelBuilder uid(String uid) {
        userRegistrationModel.setUid(uid);
        return this;
    }

    public UserRegistrationModelBuilder user(String user) {
        userRegistrationModel.setUser(user);
        return this;
    }

    public UserRegistrationModelBuilder password(String password) {
        userRegistrationModel.setPassword(password);
        return this;
    }

    public UserRegistrationModelBuilder name(String name) {
        userRegistrationModel.setName(name);
        return this;
    }

    public UserRegistrationModelBuilder email(String email) {
        userRegistrationModel.setEmail(email);
        return this;
    }

    public UserRegistrationModelBuilder phone(String phone) {
        userRegistrationModel.setPhone(phone);
        return this;
    }

    public UserRegistrationModelBuilder countrycode(String countrycode) {
        userRegistrationModel.setCountrycode(countrycode);
        return this;
    }

    public UserRegistrationModelBuilder address(String address) {
        userRegistrationModel.setAddress(address);
        return this;
    }

    public UserRegistrationModelBuilder a(String a) {
        userRegistrationModel.setA(a);
        return this;
    }

    public UserRegistrationModelBuilder sa(String sa) {
        userRegistrationModel.setSa(sa);
        return this;
    }

    public UserRegistrationModelBuilder c(String c) {
        userRegistrationModel.setC(c);
        return this;
    }

    public UserRegistrationModelBuilder s(String s) {
        userRegistrationModel.setS(s);
        return this;
    }

    public UserRegistrationModelBuilder z(String z) {
        userRegistrationModel.setZ(z);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserRegistrationModel build() {
        return userRegistrationModel;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserAuthenticationModelBuilder {
    //the instance to build
    private UserAuthenticationModel userAuthenticationModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserAuthenticationModelBuilder() {
        userAuthenticationModel = new UserAuthenticationModel();
    }

    public UserAuthenticationModelBuilder key(String key) {
        userAuthenticationModel.setKey(key);
        return this;
    }

    public UserAuthenticationModelBuilder uid(String uid) {
        userAuthenticationModel.setUid(uid);
        return this;
    }

    public UserAuthenticationModelBuilder user(String user) {
        userAuthenticationModel.setUser(user);
        return this;
    }

    public UserAuthenticationModelBuilder password(String password) {
        userAuthenticationModel.setPassword(password);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserAuthenticationModel build() {
        return userAuthenticationModel;
    }
}
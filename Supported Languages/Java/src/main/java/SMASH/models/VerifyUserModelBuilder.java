/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class VerifyUserModelBuilder {
    //the instance to build
    private VerifyUserModel verifyUserModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyUserModelBuilder() {
        verifyUserModel = new VerifyUserModel();
    }

    public VerifyUserModelBuilder key(String key) {
        verifyUserModel.setKey(key);
        return this;
    }

    public VerifyUserModelBuilder uid(String uid) {
        verifyUserModel.setUid(uid);
        return this;
    }

    public VerifyUserModelBuilder user(String user) {
        verifyUserModel.setUser(user);
        return this;
    }

    public VerifyUserModelBuilder code(String code) {
        verifyUserModel.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyUserModel build() {
        return verifyUserModel;
    }
}
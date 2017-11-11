/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class VerifyModelBuilder {
    //the instance to build
    private VerifyModel verifyModel;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyModelBuilder() {
        verifyModel = new VerifyModel();
    }

    public VerifyModelBuilder key(String key) {
        verifyModel.setKey(key);
        return this;
    }

    public VerifyModelBuilder uid(String uid) {
        verifyModel.setUid(uid);
        return this;
    }

    public VerifyModelBuilder to(String to) {
        verifyModel.setTo(to);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyModel build() {
        return verifyModel;
    }
}
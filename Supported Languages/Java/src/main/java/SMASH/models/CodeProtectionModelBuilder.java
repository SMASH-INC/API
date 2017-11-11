/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CodeProtectionModelBuilder {
    //the instance to build
    private CodeProtectionModel codeProtectionModel;

    /**
     * Default constructor to initialize the instance
     */
    public CodeProtectionModelBuilder() {
        codeProtectionModel = new CodeProtectionModel();
    }

    public CodeProtectionModelBuilder key(String key) {
        codeProtectionModel.setKey(key);
        return this;
    }

    public CodeProtectionModelBuilder uid(String uid) {
        codeProtectionModel.setUid(uid);
        return this;
    }

    public CodeProtectionModelBuilder app(String app) {
        codeProtectionModel.setApp(app);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CodeProtectionModel build() {
        return codeProtectionModel;
    }
}
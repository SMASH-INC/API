/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class WAFCreationModelBuilder {
    //the instance to build
    private WAFCreationModel wAFCreationModel;

    /**
     * Default constructor to initialize the instance
     */
    public WAFCreationModelBuilder() {
        wAFCreationModel = new WAFCreationModel();
    }

    public WAFCreationModelBuilder key(String key) {
        wAFCreationModel.setKey(key);
        return this;
    }

    public WAFCreationModelBuilder uid(String uid) {
        wAFCreationModel.setUid(uid);
        return this;
    }

    public WAFCreationModelBuilder origin(String origin) {
        wAFCreationModel.setOrigin(origin);
        return this;
    }

    public WAFCreationModelBuilder cname(String cname) {
        wAFCreationModel.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WAFCreationModel build() {
        return wAFCreationModel;
    }
}
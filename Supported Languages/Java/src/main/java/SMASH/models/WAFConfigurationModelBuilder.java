/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class WAFConfigurationModelBuilder {
    //the instance to build
    private WAFConfigurationModel wAFConfigurationModel;

    /**
     * Default constructor to initialize the instance
     */
    public WAFConfigurationModelBuilder() {
        wAFConfigurationModel = new WAFConfigurationModel();
    }

    public WAFConfigurationModelBuilder key(String key) {
        wAFConfigurationModel.setKey(key);
        return this;
    }

    public WAFConfigurationModelBuilder uid(String uid) {
        wAFConfigurationModel.setUid(uid);
        return this;
    }

    public WAFConfigurationModelBuilder name(String name) {
        wAFConfigurationModel.setName(name);
        return this;
    }

    public WAFConfigurationModelBuilder origin(String origin) {
        wAFConfigurationModel.setOrigin(origin);
        return this;
    }

    public WAFConfigurationModelBuilder cname(String cname) {
        wAFConfigurationModel.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WAFConfigurationModel build() {
        return wAFConfigurationModel;
    }
}
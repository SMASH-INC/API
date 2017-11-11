/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CDNPushModelBuilder {
    //the instance to build
    private CDNPushModel cDNPushModel;

    /**
     * Default constructor to initialize the instance
     */
    public CDNPushModelBuilder() {
        cDNPushModel = new CDNPushModel();
    }

    public CDNPushModelBuilder key(String key) {
        cDNPushModel.setKey(key);
        return this;
    }

    public CDNPushModelBuilder uid(String uid) {
        cDNPushModel.setUid(uid);
        return this;
    }

    public CDNPushModelBuilder cname(String cname) {
        cDNPushModel.setCname(cname);
        return this;
    }

    public CDNPushModelBuilder file(String file) {
        cDNPushModel.setFile(file);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CDNPushModel build() {
        return cDNPushModel;
    }
}
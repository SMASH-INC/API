/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CDNPullModelBuilder {
    //the instance to build
    private CDNPullModel cDNPullModel;

    /**
     * Default constructor to initialize the instance
     */
    public CDNPullModelBuilder() {
        cDNPullModel = new CDNPullModel();
    }

    public CDNPullModelBuilder key(String key) {
        cDNPullModel.setKey(key);
        return this;
    }

    public CDNPullModelBuilder uid(String uid) {
        cDNPullModel.setUid(uid);
        return this;
    }

    public CDNPullModelBuilder origin(String origin) {
        cDNPullModel.setOrigin(origin);
        return this;
    }

    public CDNPullModelBuilder cname(String cname) {
        cDNPullModel.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CDNPullModel build() {
        return cDNPullModel;
    }
}
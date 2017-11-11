/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class HostingModelBuilder {
    //the instance to build
    private HostingModel hostingModel;

    /**
     * Default constructor to initialize the instance
     */
    public HostingModelBuilder() {
        hostingModel = new HostingModel();
    }

    public HostingModelBuilder key(String key) {
        hostingModel.setKey(key);
        return this;
    }

    public HostingModelBuilder uid(String uid) {
        hostingModel.setUid(uid);
        return this;
    }

    public HostingModelBuilder app(String app) {
        hostingModel.setApp(app);
        return this;
    }

    public HostingModelBuilder domain(String domain) {
        hostingModel.setDomain(domain);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HostingModel build() {
        return hostingModel;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DNSCreationModelBuilder {
    //the instance to build
    private DNSCreationModel dNSCreationModel;

    /**
     * Default constructor to initialize the instance
     */
    public DNSCreationModelBuilder() {
        dNSCreationModel = new DNSCreationModel();
    }

    public DNSCreationModelBuilder key(String key) {
        dNSCreationModel.setKey(key);
        return this;
    }

    public DNSCreationModelBuilder uid(String uid) {
        dNSCreationModel.setUid(uid);
        return this;
    }

    public DNSCreationModelBuilder domain(String domain) {
        dNSCreationModel.setDomain(domain);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DNSCreationModel build() {
        return dNSCreationModel;
    }
}
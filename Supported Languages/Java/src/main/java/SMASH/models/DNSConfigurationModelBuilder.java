/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DNSConfigurationModelBuilder {
    //the instance to build
    private DNSConfigurationModel dNSConfigurationModel;

    /**
     * Default constructor to initialize the instance
     */
    public DNSConfigurationModelBuilder() {
        dNSConfigurationModel = new DNSConfigurationModel();
    }

    public DNSConfigurationModelBuilder key(String key) {
        dNSConfigurationModel.setKey(key);
        return this;
    }

    public DNSConfigurationModelBuilder uid(String uid) {
        dNSConfigurationModel.setUid(uid);
        return this;
    }

    public DNSConfigurationModelBuilder domain(String domain) {
        dNSConfigurationModel.setDomain(domain);
        return this;
    }

    public DNSConfigurationModelBuilder records(String records) {
        dNSConfigurationModel.setRecords(records);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DNSConfigurationModel build() {
        return dNSConfigurationModel;
    }
}
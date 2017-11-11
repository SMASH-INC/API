/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DNSConfigurationModelResponseBuilder {
    //the instance to build
    private DNSConfigurationModelResponse dNSConfigurationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DNSConfigurationModelResponseBuilder() {
        dNSConfigurationModelResponse = new DNSConfigurationModelResponse();
    }

    public DNSConfigurationModelResponseBuilder success(String success) {
        dNSConfigurationModelResponse.setSuccess(success);
        return this;
    }

    public DNSConfigurationModelResponseBuilder domain(String domain) {
        dNSConfigurationModelResponse.setDomain(domain);
        return this;
    }

    public DNSConfigurationModelResponseBuilder records(String records) {
        dNSConfigurationModelResponse.setRecords(records);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DNSConfigurationModelResponse build() {
        return dNSConfigurationModelResponse;
    }
}
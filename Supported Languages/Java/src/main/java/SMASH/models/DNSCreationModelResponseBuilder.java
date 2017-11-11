/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DNSCreationModelResponseBuilder {
    //the instance to build
    private DNSCreationModelResponse dNSCreationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DNSCreationModelResponseBuilder() {
        dNSCreationModelResponse = new DNSCreationModelResponse();
    }

    public DNSCreationModelResponseBuilder domain(String domain) {
        dNSCreationModelResponse.setDomain(domain);
        return this;
    }

    public DNSCreationModelResponseBuilder nameservers(NameserversModel nameservers) {
        dNSCreationModelResponse.setNameservers(nameservers);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DNSCreationModelResponse build() {
        return dNSCreationModelResponse;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DNSConfigurationInputBuilder {
    //the instance to build
    private DNSConfigurationInput dNSConfigurationInput;

    /**
     * Default constructor to initialize the instance
     */
    public DNSConfigurationInputBuilder() {
        dNSConfigurationInput = new DNSConfigurationInput();
    }

    /**
     * Domain or domain names separated by a comma
     */
    public DNSConfigurationInputBuilder domain(String domain) {
        dNSConfigurationInput.setDomain(domain);
        return this;
    }

    /**
     * Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
     */
    public DNSConfigurationInputBuilder records(String records) {
        dNSConfigurationInput.setRecords(records);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DNSConfigurationInput build() {
        return dNSConfigurationInput;
    }
}
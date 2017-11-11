/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CDNPullZoneInputBuilder {
    //the instance to build
    private CDNPullZoneInput cDNPullZoneInput;

    /**
     * Default constructor to initialize the instance
     */
    public CDNPullZoneInputBuilder() {
        cDNPullZoneInput = new CDNPullZoneInput();
    }

    /**
     * Domain or domain names separated by a comma
     */
    public CDNPullZoneInputBuilder origin(String origin) {
        cDNPullZoneInput.setOrigin(origin);
        return this;
    }

    /**
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    public CDNPullZoneInputBuilder cname(String cname) {
        cDNPullZoneInput.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CDNPullZoneInput build() {
        return cDNPullZoneInput;
    }
}
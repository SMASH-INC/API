/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CDNPushZoneInputBuilder {
    //the instance to build
    private CDNPushZoneInput cDNPushZoneInput;

    /**
     * Default constructor to initialize the instance
     */
    public CDNPushZoneInputBuilder() {
        cDNPushZoneInput = new CDNPushZoneInput();
    }

    /**
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    public CDNPushZoneInputBuilder cname(String cname) {
        cDNPushZoneInput.setCname(cname);
        return this;
    }

    /**
     * GIT URL, file URL, or direct upload of file
     */
    public CDNPushZoneInputBuilder file(String file) {
        cDNPushZoneInput.setFile(file);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CDNPushZoneInput build() {
        return cDNPushZoneInput;
    }
}
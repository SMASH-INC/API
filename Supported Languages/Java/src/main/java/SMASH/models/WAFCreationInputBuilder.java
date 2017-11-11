/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class WAFCreationInputBuilder {
    //the instance to build
    private WAFCreationInput wAFCreationInput;

    /**
     * Default constructor to initialize the instance
     */
    public WAFCreationInputBuilder() {
        wAFCreationInput = new WAFCreationInput();
    }

    /**
     * IP of the Web server you wish to protect
     */
    public WAFCreationInputBuilder origin(String origin) {
        wAFCreationInput.setOrigin(origin);
        return this;
    }

    /**
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    public WAFCreationInputBuilder cname(String cname) {
        wAFCreationInput.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WAFCreationInput build() {
        return wAFCreationInput;
    }
}
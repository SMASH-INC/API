/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class VerifyAddressResponseBuilder {
    //the instance to build
    private VerifyAddressResponse verifyAddressResponse;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyAddressResponseBuilder() {
        verifyAddressResponse = new VerifyAddressResponse();
    }

    public VerifyAddressResponseBuilder request(String request) {
        verifyAddressResponse.setRequest(request);
        return this;
    }

    public VerifyAddressResponseBuilder active(String active) {
        verifyAddressResponse.setActive(active);
        return this;
    }

    public VerifyAddressResponseBuilder id(String id) {
        verifyAddressResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyAddressResponse build() {
        return verifyAddressResponse;
    }
}
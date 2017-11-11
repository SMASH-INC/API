/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CDNPullModelResponseBuilder {
    //the instance to build
    private CDNPullModelResponse cDNPullModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CDNPullModelResponseBuilder() {
        cDNPullModelResponse = new CDNPullModelResponse();
    }

    public CDNPullModelResponseBuilder success(String success) {
        cDNPullModelResponse.setSuccess(success);
        return this;
    }

    public CDNPullModelResponseBuilder cname(String cname) {
        cDNPullModelResponse.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CDNPullModelResponse build() {
        return cDNPullModelResponse;
    }
}
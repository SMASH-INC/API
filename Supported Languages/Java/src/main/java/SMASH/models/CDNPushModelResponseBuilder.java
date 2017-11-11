/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CDNPushModelResponseBuilder {
    //the instance to build
    private CDNPushModelResponse cDNPushModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CDNPushModelResponseBuilder() {
        cDNPushModelResponse = new CDNPushModelResponse();
    }

    public CDNPushModelResponseBuilder success(String success) {
        cDNPushModelResponse.setSuccess(success);
        return this;
    }

    public CDNPushModelResponseBuilder upload(String upload) {
        cDNPushModelResponse.setUpload(upload);
        return this;
    }

    public CDNPushModelResponseBuilder cname(String cname) {
        cDNPushModelResponse.setCname(cname);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CDNPushModelResponse build() {
        return cDNPushModelResponse;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class HostingModelResponseBuilder {
    //the instance to build
    private HostingModelResponse hostingModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HostingModelResponseBuilder() {
        hostingModelResponse = new HostingModelResponse();
    }

    public HostingModelResponseBuilder request(String request) {
        hostingModelResponse.setRequest(request);
        return this;
    }

    public HostingModelResponseBuilder url(String url) {
        hostingModelResponse.setUrl(url);
        return this;
    }

    public HostingModelResponseBuilder success(String success) {
        hostingModelResponse.setSuccess(success);
        return this;
    }

    public HostingModelResponseBuilder id(String id) {
        hostingModelResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HostingModelResponse build() {
        return hostingModelResponse;
    }
}
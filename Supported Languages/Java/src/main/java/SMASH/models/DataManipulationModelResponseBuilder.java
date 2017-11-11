/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DataManipulationModelResponseBuilder {
    //the instance to build
    private DataManipulationModelResponse dataManipulationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DataManipulationModelResponseBuilder() {
        dataManipulationModelResponse = new DataManipulationModelResponse();
    }

    public DataManipulationModelResponseBuilder request(String request) {
        dataManipulationModelResponse.setRequest(request);
        return this;
    }

    public DataManipulationModelResponseBuilder url(String url) {
        dataManipulationModelResponse.setUrl(url);
        return this;
    }

    public DataManipulationModelResponseBuilder success(String success) {
        dataManipulationModelResponse.setSuccess(success);
        return this;
    }

    public DataManipulationModelResponseBuilder id(String id) {
        dataManipulationModelResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DataManipulationModelResponse build() {
        return dataManipulationModelResponse;
    }
}
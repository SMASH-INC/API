/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LoggingSetupModelResponseBuilder {
    //the instance to build
    private LoggingSetupModelResponse loggingSetupModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public LoggingSetupModelResponseBuilder() {
        loggingSetupModelResponse = new LoggingSetupModelResponse();
    }

    public LoggingSetupModelResponseBuilder success(String success) {
        loggingSetupModelResponse.setSuccess(success);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoggingSetupModelResponse build() {
        return loggingSetupModelResponse;
    }
}
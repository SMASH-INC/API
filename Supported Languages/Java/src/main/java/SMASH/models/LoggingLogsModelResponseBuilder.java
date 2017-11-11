/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LoggingLogsModelResponseBuilder {
    //the instance to build
    private LoggingLogsModelResponse loggingLogsModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public LoggingLogsModelResponseBuilder() {
        loggingLogsModelResponse = new LoggingLogsModelResponse();
    }

    public LoggingLogsModelResponseBuilder log(LogModel log) {
        loggingLogsModelResponse.setLog(log);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoggingLogsModelResponse build() {
        return loggingLogsModelResponse;
    }
}
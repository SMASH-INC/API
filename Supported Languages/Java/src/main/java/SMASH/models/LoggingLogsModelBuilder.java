/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LoggingLogsModelBuilder {
    //the instance to build
    private LoggingLogsModel loggingLogsModel;

    /**
     * Default constructor to initialize the instance
     */
    public LoggingLogsModelBuilder() {
        loggingLogsModel = new LoggingLogsModel();
    }

    public LoggingLogsModelBuilder key(String key) {
        loggingLogsModel.setKey(key);
        return this;
    }

    public LoggingLogsModelBuilder uid(String uid) {
        loggingLogsModel.setUid(uid);
        return this;
    }

    public LoggingLogsModelBuilder name(String name) {
        loggingLogsModel.setName(name);
        return this;
    }

    public LoggingLogsModelBuilder origin(String origin) {
        loggingLogsModel.setOrigin(origin);
        return this;
    }

    public LoggingLogsModelBuilder time(String time) {
        loggingLogsModel.setTime(time);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoggingLogsModel build() {
        return loggingLogsModel;
    }
}
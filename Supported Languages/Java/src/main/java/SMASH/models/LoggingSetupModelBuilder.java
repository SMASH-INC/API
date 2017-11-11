/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LoggingSetupModelBuilder {
    //the instance to build
    private LoggingSetupModel loggingSetupModel;

    /**
     * Default constructor to initialize the instance
     */
    public LoggingSetupModelBuilder() {
        loggingSetupModel = new LoggingSetupModel();
    }

    public LoggingSetupModelBuilder key(String key) {
        loggingSetupModel.setKey(key);
        return this;
    }

    public LoggingSetupModelBuilder uid(String uid) {
        loggingSetupModel.setUid(uid);
        return this;
    }

    public LoggingSetupModelBuilder name(String name) {
        loggingSetupModel.setName(name);
        return this;
    }

    public LoggingSetupModelBuilder origin(String origin) {
        loggingSetupModel.setOrigin(origin);
        return this;
    }

    public LoggingSetupModelBuilder activate(String activate) {
        loggingSetupModel.setActivate(activate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoggingSetupModel build() {
        return loggingSetupModel;
    }
}
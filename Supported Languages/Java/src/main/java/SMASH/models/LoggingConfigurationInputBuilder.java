/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LoggingConfigurationInputBuilder {
    //the instance to build
    private LoggingConfigurationInput loggingConfigurationInput;

    /**
     * Default constructor to initialize the instance
     */
    public LoggingConfigurationInputBuilder() {
        loggingConfigurationInput = new LoggingConfigurationInput();
    }

    /**
     * Name of the WAF zone
     */
    public LoggingConfigurationInputBuilder name(String name) {
        loggingConfigurationInput.setName(name);
        return this;
    }

    /**
     * IP Address of the Web Application you wish to configure logging on
     */
    public LoggingConfigurationInputBuilder origin(String origin) {
        loggingConfigurationInput.setOrigin(origin);
        return this;
    }

    /**
     * Activate or Disable
     */
    public LoggingConfigurationInputBuilder activate(String activate) {
        loggingConfigurationInput.setActivate(activate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoggingConfigurationInput build() {
        return loggingConfigurationInput;
    }
}
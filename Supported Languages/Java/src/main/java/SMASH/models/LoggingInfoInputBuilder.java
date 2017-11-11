/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LoggingInfoInputBuilder {
    //the instance to build
    private LoggingInfoInput loggingInfoInput;

    /**
     * Default constructor to initialize the instance
     */
    public LoggingInfoInputBuilder() {
        loggingInfoInput = new LoggingInfoInput();
    }

    /**
     * Name of your WAF zone
     */
    public LoggingInfoInputBuilder name(String name) {
        loggingInfoInput.setName(name);
        return this;
    }

    /**
     * IP Address of the Web Application
     */
    public LoggingInfoInputBuilder origin(String origin) {
        loggingInfoInput.setOrigin(origin);
        return this;
    }

    /**
     * Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
     */
    public LoggingInfoInputBuilder time(String time) {
        loggingInfoInput.setTime(time);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LoggingInfoInput build() {
        return loggingInfoInput;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class WAFConfigurationModelResponseBuilder {
    //the instance to build
    private WAFConfigurationModelResponse wAFConfigurationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public WAFConfigurationModelResponseBuilder() {
        wAFConfigurationModelResponse = new WAFConfigurationModelResponse();
    }

    public WAFConfigurationModelResponseBuilder success(String success) {
        wAFConfigurationModelResponse.setSuccess(success);
        return this;
    }

    public WAFConfigurationModelResponseBuilder rule(String rule) {
        wAFConfigurationModelResponse.setRule(rule);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WAFConfigurationModelResponse build() {
        return wAFConfigurationModelResponse;
    }
}
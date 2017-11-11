/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class WAFConfigurationInputBuilder {
    //the instance to build
    private WAFConfigurationInput wAFConfigurationInput;

    /**
     * Default constructor to initialize the instance
     */
    public WAFConfigurationInputBuilder() {
        wAFConfigurationInput = new WAFConfigurationInput();
    }

    /**
     * Name of your WAF zone
     */
    public WAFConfigurationInputBuilder name(String name) {
        wAFConfigurationInput.setName(name);
        return this;
    }

    /**
     * Rule or rules to add or update separated by a comma
     */
    public WAFConfigurationInputBuilder rule(String rule) {
        wAFConfigurationInput.setRule(rule);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WAFConfigurationInput build() {
        return wAFConfigurationInput;
    }
}
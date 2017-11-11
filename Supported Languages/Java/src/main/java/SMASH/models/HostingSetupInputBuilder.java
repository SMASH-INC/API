/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class HostingSetupInputBuilder {
    //the instance to build
    private HostingSetupInput hostingSetupInput;

    /**
     * Default constructor to initialize the instance
     */
    public HostingSetupInputBuilder() {
        hostingSetupInput = new HostingSetupInput();
    }

    /**
     * GIT URL or ZIP package containing your APP
     */
    public HostingSetupInputBuilder app(String app) {
        hostingSetupInput.setApp(app);
        return this;
    }

    /**
     * Domain or domain names separated by a comma
     */
    public HostingSetupInputBuilder domain(String domain) {
        hostingSetupInput.setDomain(domain);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HostingSetupInput build() {
        return hostingSetupInput;
    }
}
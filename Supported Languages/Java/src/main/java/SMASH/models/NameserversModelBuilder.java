/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class NameserversModelBuilder {
    //the instance to build
    private NameserversModel nameserversModel;

    /**
     * Default constructor to initialize the instance
     */
    public NameserversModelBuilder() {
        nameserversModel = new NameserversModel();
    }

    public NameserversModelBuilder ns1(String ns1) {
        nameserversModel.setNs1(ns1);
        return this;
    }

    public NameserversModelBuilder ns2(String ns2) {
        nameserversModel.setNs2(ns2);
        return this;
    }

    public NameserversModelBuilder ns3(String ns3) {
        nameserversModel.setNs3(ns3);
        return this;
    }

    public NameserversModelBuilder ns4(String ns4) {
        nameserversModel.setNs4(ns4);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NameserversModel build() {
        return nameserversModel;
    }
}
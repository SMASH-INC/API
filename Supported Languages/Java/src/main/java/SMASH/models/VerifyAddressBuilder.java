/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class VerifyAddressBuilder {
    //the instance to build
    private VerifyAddress verifyAddress;

    /**
     * Default constructor to initialize the instance
     */
    public VerifyAddressBuilder() {
        verifyAddress = new VerifyAddress();
    }

    public VerifyAddressBuilder key(String key) {
        verifyAddress.setKey(key);
        return this;
    }

    public VerifyAddressBuilder uid(String uid) {
        verifyAddress.setUid(uid);
        return this;
    }

    public VerifyAddressBuilder user(String user) {
        verifyAddress.setUser(user);
        return this;
    }

    public VerifyAddressBuilder address(String address) {
        verifyAddress.setAddress(address);
        return this;
    }

    public VerifyAddressBuilder a(String a) {
        verifyAddress.setA(a);
        return this;
    }

    public VerifyAddressBuilder sa(String sa) {
        verifyAddress.setSa(sa);
        return this;
    }

    public VerifyAddressBuilder c(String c) {
        verifyAddress.setC(c);
        return this;
    }

    public VerifyAddressBuilder s(String s) {
        verifyAddress.setS(s);
        return this;
    }

    public VerifyAddressBuilder z(String z) {
        verifyAddress.setZ(z);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifyAddress build() {
        return verifyAddress;
    }
}
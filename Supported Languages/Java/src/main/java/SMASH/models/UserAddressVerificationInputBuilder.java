/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserAddressVerificationInputBuilder {
    //the instance to build
    private UserAddressVerificationInput userAddressVerificationInput;

    /**
     * Default constructor to initialize the instance
     */
    public UserAddressVerificationInputBuilder() {
        userAddressVerificationInput = new UserAddressVerificationInput();
    }

    /**
     * Users UID, Username, or Email
     */
    public UserAddressVerificationInputBuilder user(String user) {
        userAddressVerificationInput.setUser(user);
        return this;
    }

    /**
     * Address Line One
     */
    public UserAddressVerificationInputBuilder a(String a) {
        userAddressVerificationInput.setA(a);
        return this;
    }

    /**
     * Address Line Two
     */
    public UserAddressVerificationInputBuilder sa(String sa) {
        userAddressVerificationInput.setSa(sa);
        return this;
    }

    /**
     * Address City
     */
    public UserAddressVerificationInputBuilder c(String c) {
        userAddressVerificationInput.setC(c);
        return this;
    }

    /**
     * Address State or Province
     */
    public UserAddressVerificationInputBuilder s(String s) {
        userAddressVerificationInput.setS(s);
        return this;
    }

    /**
     * Address Zipcode
     */
    public UserAddressVerificationInputBuilder z(int z) {
        userAddressVerificationInput.setZ(z);
        return this;
    }

    /**
     * Address as a one line input separated by commas
     */
    public UserAddressVerificationInputBuilder address(String address) {
        userAddressVerificationInput.setAddress(address);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserAddressVerificationInput build() {
        return userAddressVerificationInput;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class M2FATokenResponseInputBuilder {
    //the instance to build
    private M2FATokenResponseInput m2FATokenResponseInput;

    /**
     * Default constructor to initialize the instance
     */
    public M2FATokenResponseInputBuilder() {
        m2FATokenResponseInput = new M2FATokenResponseInput();
    }

    /**
     * Users UID, Username or Email
     */
    public M2FATokenResponseInputBuilder user(String user) {
        m2FATokenResponseInput.setUser(user);
        return this;
    }

    /**
     * Response From User Containing 2FA Code
     */
    public M2FATokenResponseInputBuilder code(String code) {
        m2FATokenResponseInput.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public M2FATokenResponseInput build() {
        return m2FATokenResponseInput;
    }
}
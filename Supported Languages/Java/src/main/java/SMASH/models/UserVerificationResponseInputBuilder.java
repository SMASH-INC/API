/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserVerificationResponseInputBuilder {
    //the instance to build
    private UserVerificationResponseInput userVerificationResponseInput;

    /**
     * Default constructor to initialize the instance
     */
    public UserVerificationResponseInputBuilder() {
        userVerificationResponseInput = new UserVerificationResponseInput();
    }

    /**
     * Users UID, Username, Or Email
     */
    public UserVerificationResponseInputBuilder user(String user) {
        userVerificationResponseInput.setUser(user);
        return this;
    }

    /**
     * Verification code entered by the user
     */
    public UserVerificationResponseInputBuilder code(String code) {
        userVerificationResponseInput.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserVerificationResponseInput build() {
        return userVerificationResponseInput;
    }
}
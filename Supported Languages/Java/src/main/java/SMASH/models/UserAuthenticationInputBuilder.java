/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserAuthenticationInputBuilder {
    //the instance to build
    private UserAuthenticationInput userAuthenticationInput;

    /**
     * Default constructor to initialize the instance
     */
    public UserAuthenticationInputBuilder() {
        userAuthenticationInput = new UserAuthenticationInput();
    }

    /**
     * Users Username or Email
     */
    public UserAuthenticationInputBuilder user(String user) {
        userAuthenticationInput.setUser(user);
        return this;
    }

    /**
     * Users Password
     */
    public UserAuthenticationInputBuilder password(String password) {
        userAuthenticationInput.setPassword(password);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserAuthenticationInput build() {
        return userAuthenticationInput;
    }
}
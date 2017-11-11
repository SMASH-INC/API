/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserRegistrationInputBuilder {
    //the instance to build
    private UserRegistrationInput userRegistrationInput;

    /**
     * Default constructor to initialize the instance
     */
    public UserRegistrationInputBuilder() {
        userRegistrationInput = new UserRegistrationInput();
    }

    /**
     * Users Email
     */
    public UserRegistrationInputBuilder email(String email) {
        userRegistrationInput.setEmail(email);
        return this;
    }

    /**
     * Users Username
     */
    public UserRegistrationInputBuilder user(String user) {
        userRegistrationInput.setUser(user);
        return this;
    }

    /**
     * Users Password
     */
    public UserRegistrationInputBuilder password(String password) {
        userRegistrationInput.setPassword(password);
        return this;
    }

    /**
     * Users Name
     */
    public UserRegistrationInputBuilder name(String name) {
        userRegistrationInput.setName(name);
        return this;
    }

    /**
     * Users Cellphone Number
     */
    public UserRegistrationInputBuilder phone(Integer phone) {
        userRegistrationInput.setPhone(phone);
        return this;
    }

    /**
     * Users Country Code (US = 1)
     */
    public UserRegistrationInputBuilder countrycode(Integer countrycode) {
        userRegistrationInput.setCountrycode(countrycode);
        return this;
    }

    /**
     * Users Address
     */
    public UserRegistrationInputBuilder address(String address) {
        userRegistrationInput.setAddress(address);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserRegistrationInput build() {
        return userRegistrationInput;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UpdateUserInputBuilder {
    //the instance to build
    private UpdateUserInput updateUserInput;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateUserInputBuilder() {
        updateUserInput = new UpdateUserInput();
    }

    /**
     * Users UID, Username, Or Email
     */
    public UpdateUserInputBuilder user(String user) {
        updateUserInput.setUser(user);
        return this;
    }

    /**
     * Avatar Image URL
     */
    public UpdateUserInputBuilder avatar(String avatar) {
        updateUserInput.setAvatar(avatar);
        return this;
    }

    /**
     * Custom input variable for users profile
     */
    public UpdateUserInputBuilder customInput(String customInput) {
        updateUserInput.setCustomInput(customInput);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateUserInput build() {
        return updateUserInput;
    }
}
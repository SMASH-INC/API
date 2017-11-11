/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class TwoFactorAuthenticationModelBuilder {
    //the instance to build
    private TwoFactorAuthenticationModel twoFactorAuthenticationModel;

    /**
     * Default constructor to initialize the instance
     */
    public TwoFactorAuthenticationModelBuilder() {
        twoFactorAuthenticationModel = new TwoFactorAuthenticationModel();
    }

    public TwoFactorAuthenticationModelBuilder request(String request) {
        twoFactorAuthenticationModel.setRequest(request);
        return this;
    }

    public TwoFactorAuthenticationModelBuilder to(String to) {
        twoFactorAuthenticationModel.setTo(to);
        return this;
    }

    public TwoFactorAuthenticationModelBuilder verified(String verified) {
        twoFactorAuthenticationModel.setVerified(verified);
        return this;
    }

    public TwoFactorAuthenticationModelBuilder id(String id) {
        twoFactorAuthenticationModel.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TwoFactorAuthenticationModel build() {
        return twoFactorAuthenticationModel;
    }
}
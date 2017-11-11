/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class TwoFactorAuthenticationTokenModelBuilder {
    //the instance to build
    private TwoFactorAuthenticationTokenModel twoFactorAuthenticationTokenModel;

    /**
     * Default constructor to initialize the instance
     */
    public TwoFactorAuthenticationTokenModelBuilder() {
        twoFactorAuthenticationTokenModel = new TwoFactorAuthenticationTokenModel();
    }

    public TwoFactorAuthenticationTokenModelBuilder key(String key) {
        twoFactorAuthenticationTokenModel.setKey(key);
        return this;
    }

    public TwoFactorAuthenticationTokenModelBuilder uid(String uid) {
        twoFactorAuthenticationTokenModel.setUid(uid);
        return this;
    }

    public TwoFactorAuthenticationTokenModelBuilder user(String user) {
        twoFactorAuthenticationTokenModel.setUser(user);
        return this;
    }

    public TwoFactorAuthenticationTokenModelBuilder code(String code) {
        twoFactorAuthenticationTokenModel.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TwoFactorAuthenticationTokenModel build() {
        return twoFactorAuthenticationTokenModel;
    }
}
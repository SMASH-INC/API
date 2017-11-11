/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class EncryptionModelBuilder {
    //the instance to build
    private EncryptionModel encryptionModel;

    /**
     * Default constructor to initialize the instance
     */
    public EncryptionModelBuilder() {
        encryptionModel = new EncryptionModel();
    }

    public EncryptionModelBuilder key(String key) {
        encryptionModel.setKey(key);
        return this;
    }

    public EncryptionModelBuilder uid(String uid) {
        encryptionModel.setUid(uid);
        return this;
    }

    public EncryptionModelBuilder data(String data) {
        encryptionModel.setData(data);
        return this;
    }

    public EncryptionModelBuilder file(String file) {
        encryptionModel.setFile(file);
        return this;
    }

    public EncryptionModelBuilder method(String method) {
        encryptionModel.setMethod(method);
        return this;
    }

    public EncryptionModelBuilder bit(String bit) {
        encryptionModel.setBit(bit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EncryptionModel build() {
        return encryptionModel;
    }
}
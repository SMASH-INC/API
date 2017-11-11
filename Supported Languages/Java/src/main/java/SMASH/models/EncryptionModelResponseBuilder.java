/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class EncryptionModelResponseBuilder {
    //the instance to build
    private EncryptionModelResponse encryptionModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EncryptionModelResponseBuilder() {
        encryptionModelResponse = new EncryptionModelResponse();
    }

    public EncryptionModelResponseBuilder data(String data) {
        encryptionModelResponse.setData(data);
        return this;
    }

    public EncryptionModelResponseBuilder file(String file) {
        encryptionModelResponse.setFile(file);
        return this;
    }

    public EncryptionModelResponseBuilder success(String success) {
        encryptionModelResponse.setSuccess(success);
        return this;
    }

    public EncryptionModelResponseBuilder mpublic(String mpublic) {
        encryptionModelResponse.setPublic(mpublic);
        return this;
    }

    public EncryptionModelResponseBuilder mprivate(String mprivate) {
        encryptionModelResponse.setPrivate(mprivate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EncryptionModelResponse build() {
        return encryptionModelResponse;
    }
}
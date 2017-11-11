/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DataAndFileEncryptionInputBuilder {
    //the instance to build
    private DataAndFileEncryptionInput dataAndFileEncryptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public DataAndFileEncryptionInputBuilder() {
        dataAndFileEncryptionInput = new DataAndFileEncryptionInput();
    }

    /**
     * GIT URL, file URL, direct upload of file, or data as a query string
     */
    public DataAndFileEncryptionInputBuilder data(String data) {
        dataAndFileEncryptionInput.setData(data);
        return this;
    }

    /**
     * Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP)
     */
    public DataAndFileEncryptionInputBuilder method(String method) {
        dataAndFileEncryptionInput.setMethod(method);
        return this;
    }

    /**
     * Encryption key size (4096)
     */
    public DataAndFileEncryptionInputBuilder bit(int bit) {
        dataAndFileEncryptionInput.setBit(bit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DataAndFileEncryptionInput build() {
        return dataAndFileEncryptionInput;
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class CodeProtectionModelResponseBuilder {
    //the instance to build
    private CodeProtectionModelResponse codeProtectionModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CodeProtectionModelResponseBuilder() {
        codeProtectionModelResponse = new CodeProtectionModelResponse();
    }

    public CodeProtectionModelResponseBuilder success(String success) {
        codeProtectionModelResponse.setSuccess(success);
        return this;
    }

    public CodeProtectionModelResponseBuilder app(String app) {
        codeProtectionModelResponse.setApp(app);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CodeProtectionModelResponse build() {
        return codeProtectionModelResponse;
    }
}
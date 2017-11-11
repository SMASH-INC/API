/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DataAndFileEncryptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4924597868840077187L;
    private String data;
    private String method;
    private int bit;
    /** GETTER
     * GIT URL, file URL, direct upload of file, or data as a query string
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * GIT URL, file URL, direct upload of file, or data as a query string
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
    }
 
    /** GETTER
     * Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP)
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP)
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * Encryption key size (4096)
     */
    @JsonGetter("bit")
    public int getBit ( ) { 
        return this.bit;
    }
    
    /** SETTER
     * Encryption key size (4096)
     */
    @JsonSetter("bit")
    public void setBit (int value) { 
        this.bit = value;
    }
 
}
 
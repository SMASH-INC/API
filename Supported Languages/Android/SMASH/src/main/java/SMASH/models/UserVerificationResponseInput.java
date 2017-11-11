/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserVerificationResponseInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5479458923400018319L;
    private String user;
    private String code;
    /** GETTER
     * Users UID, Username, Or Email
     */
    @JsonGetter("user")
    public String getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * Users UID, Username, Or Email
     */
    @JsonSetter("user")
    public void setUser (String value) { 
        this.user = value;
        notifyObservers(this.user);
    }
 
    /** GETTER
     * Verification code entered by the user
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Verification code entered by the user
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
        notifyObservers(this.code);
    }
 
}
 
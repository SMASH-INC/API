/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class M2FATokenResponseInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4978664398182661416L;
    private String user;
    private String code;
    /** GETTER
     * Users UID, Username or Email
     */
    @JsonGetter("user")
    public String getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * Users UID, Username or Email
     */
    @JsonSetter("user")
    public void setUser (String value) { 
        this.user = value;
    }
 
    /** GETTER
     * Response From User Containing 2FA Code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Response From User Containing 2FA Code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
}
 
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateUserInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5581967983984526574L;
    private String user;
    private String avatar;
    private String customInput;
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
    }
 
    /** GETTER
     * Avatar Image URL
     */
    @JsonGetter("avatar")
    public String getAvatar ( ) { 
        return this.avatar;
    }
    
    /** SETTER
     * Avatar Image URL
     */
    @JsonSetter("avatar")
    public void setAvatar (String value) { 
        this.avatar = value;
    }
 
    /** GETTER
     * Custom input variable for users profile
     */
    @JsonGetter("custom input")
    public String getCustomInput ( ) { 
        return this.customInput;
    }
    
    /** SETTER
     * Custom input variable for users profile
     */
    @JsonSetter("custom input")
    public void setCustomInput (String value) { 
        this.customInput = value;
    }
 
}
 
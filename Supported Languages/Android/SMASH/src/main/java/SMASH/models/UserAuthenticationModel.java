/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserAuthenticationModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5457387349455737341L;
    private String key;
    private String uid;
    private String user;
    private String password;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("key")
    public String getKey ( ) { 
        return this.key;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("key")
    public void setKey (String value) { 
        this.key = value;
        notifyObservers(this.key);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("uid")
    public String getUid ( ) { 
        return this.uid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uid")
    public void setUid (String value) { 
        this.uid = value;
        notifyObservers(this.uid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user")
    public String getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user")
    public void setUser (String value) { 
        this.user = value;
        notifyObservers(this.user);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
        notifyObservers(this.password);
    }
 
}
 
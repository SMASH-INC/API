/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifyUserModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5511781583047623551L;
    private String key;
    private String uid;
    private String user;
    private String code;
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
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
        notifyObservers(this.code);
    }
 
}
 
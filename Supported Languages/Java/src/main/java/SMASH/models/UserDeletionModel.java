/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserDeletionModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5349851299583972696L;
    private String key;
    private String uid;
    private String user;
    private String apiuid;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("apiuid")
    public String getApiuid ( ) { 
        return this.apiuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("apiuid")
    public void setApiuid (String value) { 
        this.apiuid = value;
    }
 
}
 
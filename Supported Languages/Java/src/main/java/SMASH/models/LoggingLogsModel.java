/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoggingLogsModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4956836281041469356L;
    private String key;
    private String uid;
    private String name;
    private String origin;
    private String time;
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
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("time")
    public String getTime ( ) { 
        return this.time;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("time")
    public void setTime (String value) { 
        this.time = value;
    }
 
}
 
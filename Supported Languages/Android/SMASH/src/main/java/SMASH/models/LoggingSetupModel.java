/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoggingSetupModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5431570727504058844L;
    private String key;
    private String uid;
    private String name;
    private String origin;
    private String activate;
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
        notifyObservers(this.name);
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
        notifyObservers(this.origin);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("activate")
    public String getActivate ( ) { 
        return this.activate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activate")
    public void setActivate (String value) { 
        this.activate = value;
        notifyObservers(this.activate);
    }
 
}
 
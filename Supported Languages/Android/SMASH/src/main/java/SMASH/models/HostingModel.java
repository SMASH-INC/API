/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HostingModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4628334018543955569L;
    private String key;
    private String uid;
    private String app;
    private String domain;
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
    @JsonGetter("app")
    public String getApp ( ) { 
        return this.app;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("app")
    public void setApp (String value) { 
        this.app = value;
        notifyObservers(this.app);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("domain")
    public String getDomain ( ) { 
        return this.domain;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("domain")
    public void setDomain (String value) { 
        this.domain = value;
        notifyObservers(this.domain);
    }
 
}
 
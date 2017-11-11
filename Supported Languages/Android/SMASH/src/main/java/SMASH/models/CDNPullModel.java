/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CDNPullModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5131974009480216441L;
    private String key;
    private String uid;
    private String origin;
    private String cname;
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
    @JsonGetter("cname")
    public String getCname ( ) { 
        return this.cname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cname")
    public void setCname (String value) { 
        this.cname = value;
        notifyObservers(this.cname);
    }
 
}
 
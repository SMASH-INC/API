/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CDNPushModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5159323020047241651L;
    private String key;
    private String uid;
    private String cname;
    private String file;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("file")
    public String getFile ( ) { 
        return this.file;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("file")
    public void setFile (String value) { 
        this.file = value;
    }
 
}
 
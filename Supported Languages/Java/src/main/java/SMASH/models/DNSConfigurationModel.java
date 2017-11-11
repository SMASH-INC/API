/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DNSConfigurationModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4932079454240781931L;
    private String key;
    private String uid;
    private String domain;
    private String records;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("records")
    public String getRecords ( ) { 
        return this.records;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("records")
    public void setRecords (String value) { 
        this.records = value;
    }
 
}
 
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DNSConfigurationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4804983048837438343L;
    private String success;
    private String domain;
    private String records;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("success")
    public String getSuccess ( ) { 
        return this.success;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("success")
    public void setSuccess (String value) { 
        this.success = value;
        notifyObservers(this.success);
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
        notifyObservers(this.records);
    }
 
}
 
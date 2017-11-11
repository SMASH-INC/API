/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DNSCreationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5149067517949201643L;
    private String domain;
    private NameserversModel nameservers;
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
    @JsonGetter("nameservers")
    public NameserversModel getNameservers ( ) { 
        return this.nameservers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("nameservers")
    public void setNameservers (NameserversModel value) { 
        this.nameservers = value;
    }
 
}
 
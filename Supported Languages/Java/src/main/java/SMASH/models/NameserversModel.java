/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NameserversModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4774581235900209949L;
    private String ns1;
    private String ns2;
    private String ns3;
    private String ns4;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ns1")
    public String getNs1 ( ) { 
        return this.ns1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ns1")
    public void setNs1 (String value) { 
        this.ns1 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ns2")
    public String getNs2 ( ) { 
        return this.ns2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ns2")
    public void setNs2 (String value) { 
        this.ns2 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ns3")
    public String getNs3 ( ) { 
        return this.ns3;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ns3")
    public void setNs3 (String value) { 
        this.ns3 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ns4")
    public String getNs4 ( ) { 
        return this.ns4;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ns4")
    public void setNs4 (String value) { 
        this.ns4 = value;
    }
 
}
 
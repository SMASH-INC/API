/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifyAddressResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5071983639387468994L;
    private String request;
    private String active;
    private String id;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("request")
    public String getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("request")
    public void setRequest (String value) { 
        this.request = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active")
    public String getActive ( ) { 
        return this.active;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active")
    public void setActive (String value) { 
        this.active = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
}
 
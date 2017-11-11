/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WAFCreationInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4887378215826712650L;
    private String origin;
    private String cname;
    /** GETTER
     * IP of the Web server you wish to protect
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * IP of the Web server you wish to protect
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
        notifyObservers(this.origin);
    }
 
    /** GETTER
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    @JsonGetter("cname")
    public String getCname ( ) { 
        return this.cname;
    }
    
    /** SETTER
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    @JsonSetter("cname")
    public void setCname (String value) { 
        this.cname = value;
        notifyObservers(this.cname);
    }
 
}
 
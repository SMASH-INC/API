/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoggingConfigurationInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4741724495826019743L;
    private String name;
    private String origin;
    private String activate;
    /** GETTER
     * Name of the WAF zone
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of the WAF zone
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * IP Address of the Web Application you wish to configure logging on
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * IP Address of the Web Application you wish to configure logging on
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
    }
 
    /** GETTER
     * Activate or Disable
     */
    @JsonGetter("activate")
    public String getActivate ( ) { 
        return this.activate;
    }
    
    /** SETTER
     * Activate or Disable
     */
    @JsonSetter("activate")
    public void setActivate (String value) { 
        this.activate = value;
    }
 
}
 
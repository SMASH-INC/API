/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoggingInfoInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5375734204377986862L;
    private String name;
    private String origin;
    private String time;
    /** GETTER
     * Name of your WAF zone
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name of your WAF zone
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * IP Address of the Web Application
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * IP Address of the Web Application
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
    }
 
    /** GETTER
     * Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
     */
    @JsonGetter("time")
    public String getTime ( ) { 
        return this.time;
    }
    
    /** SETTER
     * Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
     */
    @JsonSetter("time")
    public void setTime (String value) { 
        this.time = value;
    }
 
}
 
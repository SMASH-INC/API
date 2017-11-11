/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WAFConfigurationInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4729806355803565115L;
    private String name;
    private String rule;
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
     * Rule or rules to add or update separated by a comma
     */
    @JsonGetter("rule")
    public String getRule ( ) { 
        return this.rule;
    }
    
    /** SETTER
     * Rule or rules to add or update separated by a comma
     */
    @JsonSetter("rule")
    public void setRule (String value) { 
        this.rule = value;
    }
 
}
 
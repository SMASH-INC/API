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
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5504648269244459354L;
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
        notifyObservers(this.name);
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
        notifyObservers(this.rule);
    }
 
}
 
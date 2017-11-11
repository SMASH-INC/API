/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WAFConfigurationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5619496194129861924L;
    private String success;
    private String rule;
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
    @JsonGetter("rule")
    public String getRule ( ) { 
        return this.rule;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("rule")
    public void setRule (String value) { 
        this.rule = value;
        notifyObservers(this.rule);
    }
 
}
 
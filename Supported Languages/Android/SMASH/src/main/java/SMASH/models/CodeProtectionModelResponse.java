/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CodeProtectionModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5300513111994443411L;
    private String success;
    private String app;
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
    @JsonGetter("app")
    public String getApp ( ) { 
        return this.app;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("app")
    public void setApp (String value) { 
        this.app = value;
        notifyObservers(this.app);
    }
 
}
 
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WAFCreationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4897351484394210703L;
    private String success;
    private String cname;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cname")
    public String getCname ( ) { 
        return this.cname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cname")
    public void setCname (String value) { 
        this.cname = value;
    }
 
}
 
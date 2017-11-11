/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EncryptionModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5101714294637827417L;
    private String data;
    private String file;
    private String success;
    private String mpublic;
    private String mprivate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("file")
    public String getFile ( ) { 
        return this.file;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("file")
    public void setFile (String value) { 
        this.file = value;
    }
 
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
    @JsonGetter("public")
    public String getPublic ( ) { 
        return this.mpublic;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("public")
    public void setPublic (String value) { 
        this.mpublic = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("private")
    public String getPrivate ( ) { 
        return this.mprivate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("private")
    public void setPrivate (String value) { 
        this.mprivate = value;
    }
 
}
 
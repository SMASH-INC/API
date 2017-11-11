/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CDNPushModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5538742326216067912L;
    private String success;
    private String upload;
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
        notifyObservers(this.success);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("upload")
    public String getUpload ( ) { 
        return this.upload;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("upload")
    public void setUpload (String value) { 
        this.upload = value;
        notifyObservers(this.upload);
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
        notifyObservers(this.cname);
    }
 
}
 
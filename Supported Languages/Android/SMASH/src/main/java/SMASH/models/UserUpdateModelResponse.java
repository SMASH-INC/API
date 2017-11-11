/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserUpdateModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4836586097507077413L;
    private String request;
    private String updated;
    private String id;
    private UserCustomUpdateModel info;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("request")
    public String getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("request")
    public void setRequest (String value) { 
        this.request = value;
        notifyObservers(this.request);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated")
    public String getUpdated ( ) { 
        return this.updated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated")
    public void setUpdated (String value) { 
        this.updated = value;
        notifyObservers(this.updated);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("info")
    public UserCustomUpdateModel getInfo ( ) { 
        return this.info;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("info")
    public void setInfo (UserCustomUpdateModel value) { 
        this.info = value;
        notifyObservers(this.info);
    }
 
}
 
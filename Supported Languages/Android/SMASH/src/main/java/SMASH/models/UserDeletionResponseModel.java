/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserDeletionResponseModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5018525354539160997L;
    private String request;
    private String deleted;
    private String id;
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
    @JsonGetter("deleted")
    public String getDeleted ( ) { 
        return this.deleted;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deleted")
    public void setDeleted (String value) { 
        this.deleted = value;
        notifyObservers(this.deleted);
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
 
}
 
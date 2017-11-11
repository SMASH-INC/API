/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserAuthenticationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5547128652516923094L;
    private String request;
    private String uid;
    private String valid;
    private String id;
    private InfoModel info;
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
    @JsonGetter("uid")
    public String getUid ( ) { 
        return this.uid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uid")
    public void setUid (String value) { 
        this.uid = value;
        notifyObservers(this.uid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("valid")
    public String getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("valid")
    public void setValid (String value) { 
        this.valid = value;
        notifyObservers(this.valid);
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
    public InfoModel getInfo ( ) { 
        return this.info;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("info")
    public void setInfo (InfoModel value) { 
        this.info = value;
        notifyObservers(this.info);
    }
 
}
 
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ImageManipulationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5109646416238346027L;
    private String request;
    private String url;
    private String success;
    private String moderated;
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
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
        notifyObservers(this.url);
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
        notifyObservers(this.success);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("moderated")
    public String getModerated ( ) { 
        return this.moderated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("moderated")
    public void setModerated (String value) { 
        this.moderated = value;
        notifyObservers(this.moderated);
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
 
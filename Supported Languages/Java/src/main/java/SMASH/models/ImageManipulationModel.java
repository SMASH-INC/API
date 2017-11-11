/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ImageManipulationModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5238655024699031287L;
    private String key;
    private String uid;
    private String image;
    private String transform;
    private String moderate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("key")
    public String getKey ( ) { 
        return this.key;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("key")
    public void setKey (String value) { 
        this.key = value;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("image")
    public String getImage ( ) { 
        return this.image;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("image")
    public void setImage (String value) { 
        this.image = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transform")
    public String getTransform ( ) { 
        return this.transform;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transform")
    public void setTransform (String value) { 
        this.transform = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("moderate")
    public String getModerate ( ) { 
        return this.moderate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("moderate")
    public void setModerate (String value) { 
        this.moderate = value;
    }
 
}
 
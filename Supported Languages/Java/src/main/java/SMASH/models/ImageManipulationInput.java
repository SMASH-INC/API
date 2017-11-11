/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ImageManipulationInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5709364265164917451L;
    private String image;
    private String transform;
    /** GETTER
     * Image URL or direct upload
     */
    @JsonGetter("image")
    public String getImage ( ) { 
        return this.image;
    }
    
    /** SETTER
     * Image URL or direct upload
     */
    @JsonSetter("image")
    public void setImage (String value) { 
        this.image = value;
    }
 
    /** GETTER
     * Transformations to perform
     */
    @JsonGetter("transform")
    public String getTransform ( ) { 
        return this.transform;
    }
    
    /** SETTER
     * Transformations to perform
     */
    @JsonSetter("transform")
    public void setTransform (String value) { 
        this.transform = value;
    }
 
}
 
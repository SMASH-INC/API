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
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5663009399505948253L;
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
        notifyObservers(this.image);
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
        notifyObservers(this.transform);
    }
 
}
 
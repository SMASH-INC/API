/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HttpsApiRestShApiDInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4993997831212327215L;
    private String data;
    private String transform;
    /** GETTER
     * Data URL, data as a query string, or direct upload
     */
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * Data URL, data as a query string, or direct upload
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
        notifyObservers(this.data);
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
 
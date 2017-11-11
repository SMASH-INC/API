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
        implements java.io.Serializable {
    private static final long serialVersionUID = 5149262580703497436L;
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
 
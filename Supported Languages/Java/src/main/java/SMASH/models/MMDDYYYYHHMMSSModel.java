/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MMDDYYYYHHMMSSModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5157670692682570109L;
    private DataModel data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public DataModel getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (DataModel value) { 
        this.data = value;
    }
 
}
 
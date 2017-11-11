/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EncryptionModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4935492446670422748L;
    private String key;
    private String uid;
    private String data;
    private String file;
    private String method;
    private String bit;
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
    @JsonGetter("data")
    public String getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (String value) { 
        this.data = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("file")
    public String getFile ( ) { 
        return this.file;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("file")
    public void setFile (String value) { 
        this.file = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bit")
    public String getBit ( ) { 
        return this.bit;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bit")
    public void setBit (String value) { 
        this.bit = value;
    }
 
}
 
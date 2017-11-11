/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DataManipulationModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5038503348009017390L;
    private String key;
    private String uid;
    private String user;
    private String apiuid;
    private String url;
    private String manipulation;
    private String conversion;
    private String sorting;
    private String compression;
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
        notifyObservers(this.key);
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
    @JsonGetter("user")
    public String getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user")
    public void setUser (String value) { 
        this.user = value;
        notifyObservers(this.user);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("apiuid")
    public String getApiuid ( ) { 
        return this.apiuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("apiuid")
    public void setApiuid (String value) { 
        this.apiuid = value;
        notifyObservers(this.apiuid);
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
    @JsonGetter("manipulation")
    public String getManipulation ( ) { 
        return this.manipulation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("manipulation")
    public void setManipulation (String value) { 
        this.manipulation = value;
        notifyObservers(this.manipulation);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("conversion")
    public String getConversion ( ) { 
        return this.conversion;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("conversion")
    public void setConversion (String value) { 
        this.conversion = value;
        notifyObservers(this.conversion);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sorting")
    public String getSorting ( ) { 
        return this.sorting;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sorting")
    public void setSorting (String value) { 
        this.sorting = value;
        notifyObservers(this.sorting);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("compression")
    public String getCompression ( ) { 
        return this.compression;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("compression")
    public void setCompression (String value) { 
        this.compression = value;
        notifyObservers(this.compression);
    }
 
}
 
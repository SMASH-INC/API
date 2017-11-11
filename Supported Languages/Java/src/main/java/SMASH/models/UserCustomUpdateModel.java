/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserCustomUpdateModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4882100781576830941L;
    private String uid;
    private String apiuid;
    private String avatar;
    private String customInput;
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
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("avatar")
    public String getAvatar ( ) { 
        return this.avatar;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("avatar")
    public void setAvatar (String value) { 
        this.avatar = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("custom-input")
    public String getCustomInput ( ) { 
        return this.customInput;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("custom-input")
    public void setCustomInput (String value) { 
        this.customInput = value;
    }
 
}
 
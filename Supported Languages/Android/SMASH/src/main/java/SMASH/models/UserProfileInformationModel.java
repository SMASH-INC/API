/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserProfileInformationModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5624011449261157904L;
    private String uid;
    private String apiuid;
    private String realname;
    private String displayname;
    private String email;
    private String address;
    private String phone;
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
    @JsonGetter("realname")
    public String getRealname ( ) { 
        return this.realname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("realname")
    public void setRealname (String value) { 
        this.realname = value;
        notifyObservers(this.realname);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("displayname")
    public String getDisplayname ( ) { 
        return this.displayname;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("displayname")
    public void setDisplayname (String value) { 
        this.displayname = value;
        notifyObservers(this.displayname);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("phone")
    public void setPhone (String value) { 
        this.phone = value;
        notifyObservers(this.phone);
    }
 
}
 
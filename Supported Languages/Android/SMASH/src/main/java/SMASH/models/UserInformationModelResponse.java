/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserInformationModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5106436122540718886L;
    private String user;
    private String key;
    private String api;
    private UserInformationSecondaryModel info;
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
     * Users API Private Key
     */
    @JsonGetter("key")
    public String getKey ( ) { 
        return this.key;
    }
    
    /** SETTER
     * Users API Private Key
     */
    @JsonSetter("key")
    public void setKey (String value) { 
        this.key = value;
        notifyObservers(this.key);
    }
 
    /** GETTER
     * Users API Public Key
     */
    @JsonGetter("api")
    public String getApi ( ) { 
        return this.api;
    }
    
    /** SETTER
     * Users API Public Key
     */
    @JsonSetter("api")
    public void setApi (String value) { 
        this.api = value;
        notifyObservers(this.api);
    }
 
    /** GETTER
     * Users Profile Information
     */
    @JsonGetter("info")
    public UserInformationSecondaryModel getInfo ( ) { 
        return this.info;
    }
    
    /** SETTER
     * Users Profile Information
     */
    @JsonSetter("info")
    public void setInfo (UserInformationSecondaryModel value) { 
        this.info = value;
        notifyObservers(this.info);
    }
 
}
 
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class InfoModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5441751482013600409L;
    private String uid;
    private String apiuid;
    private String realname;
    private String displayname;
    private String avatar;
    private String email;
    private String address;
    private String phone;
    private String lastlogin;
    private String ip;
    private String m2fa;
    private String iplock;
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
        notifyObservers(this.avatar);
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lastlogin")
    public String getLastlogin ( ) { 
        return this.lastlogin;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastlogin")
    public void setLastlogin (String value) { 
        this.lastlogin = value;
        notifyObservers(this.lastlogin);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ip")
    public String getIp ( ) { 
        return this.ip;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ip")
    public void setIp (String value) { 
        this.ip = value;
        notifyObservers(this.ip);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("2fa")
    public String getM2fa ( ) { 
        return this.m2fa;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("2fa")
    public void setM2fa (String value) { 
        this.m2fa = value;
        notifyObservers(this.m2fa);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("iplock")
    public String getIplock ( ) { 
        return this.iplock;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("iplock")
    public void setIplock (String value) { 
        this.iplock = value;
        notifyObservers(this.iplock);
    }
 
}
 
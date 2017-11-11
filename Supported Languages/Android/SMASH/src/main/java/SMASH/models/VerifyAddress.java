/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifyAddress 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4931431197509834729L;
    private String key;
    private String uid;
    private String user;
    private String address;
    private String a;
    private String sa;
    private String c;
    private String s;
    private String z;
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
    @JsonGetter("a")
    public String getA ( ) { 
        return this.a;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("a")
    public void setA (String value) { 
        this.a = value;
        notifyObservers(this.a);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sa")
    public String getSa ( ) { 
        return this.sa;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sa")
    public void setSa (String value) { 
        this.sa = value;
        notifyObservers(this.sa);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("c")
    public String getC ( ) { 
        return this.c;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("c")
    public void setC (String value) { 
        this.c = value;
        notifyObservers(this.c);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("s")
    public String getS ( ) { 
        return this.s;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("s")
    public void setS (String value) { 
        this.s = value;
        notifyObservers(this.s);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("z")
    public String getZ ( ) { 
        return this.z;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("z")
    public void setZ (String value) { 
        this.z = value;
        notifyObservers(this.z);
    }
 
}
 
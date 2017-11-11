/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserAddressVerificationInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5517003523379966725L;
    private String user;
    private String a;
    private String sa;
    private String c;
    private String s;
    private int z;
    private String address;
    /** GETTER
     * Users UID, Username, or Email
     */
    @JsonGetter("user")
    public String getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * Users UID, Username, or Email
     */
    @JsonSetter("user")
    public void setUser (String value) { 
        this.user = value;
        notifyObservers(this.user);
    }
 
    /** GETTER
     * Address Line One
     */
    @JsonGetter("a")
    public String getA ( ) { 
        return this.a;
    }
    
    /** SETTER
     * Address Line One
     */
    @JsonSetter("a")
    public void setA (String value) { 
        this.a = value;
        notifyObservers(this.a);
    }
 
    /** GETTER
     * Address Line Two
     */
    @JsonGetter("sa")
    public String getSa ( ) { 
        return this.sa;
    }
    
    /** SETTER
     * Address Line Two
     */
    @JsonSetter("sa")
    public void setSa (String value) { 
        this.sa = value;
        notifyObservers(this.sa);
    }
 
    /** GETTER
     * Address City
     */
    @JsonGetter("c")
    public String getC ( ) { 
        return this.c;
    }
    
    /** SETTER
     * Address City
     */
    @JsonSetter("c")
    public void setC (String value) { 
        this.c = value;
        notifyObservers(this.c);
    }
 
    /** GETTER
     * Address State or Province
     */
    @JsonGetter("s")
    public String getS ( ) { 
        return this.s;
    }
    
    /** SETTER
     * Address State or Province
     */
    @JsonSetter("s")
    public void setS (String value) { 
        this.s = value;
        notifyObservers(this.s);
    }
 
    /** GETTER
     * Address Zipcode
     */
    @JsonGetter("z")
    public int getZ ( ) { 
        return this.z;
    }
    
    /** SETTER
     * Address Zipcode
     */
    @JsonSetter("z")
    public void setZ (int value) { 
        this.z = value;
        notifyObservers(this.z);
    }
 
    /** GETTER
     * Address as a one line input separated by commas
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address as a one line input separated by commas
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
}
 
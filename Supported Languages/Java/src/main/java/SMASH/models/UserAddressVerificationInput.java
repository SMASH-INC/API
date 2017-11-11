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
        implements java.io.Serializable {
    private static final long serialVersionUID = 4680321975246200896L;
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
    }
 
}
 
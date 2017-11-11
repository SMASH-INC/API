/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserRegistrationInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5340988154632452423L;
    private String email;
    private String user;
    private String password;
    private String name;
    private Integer phone;
    private Integer countrycode;
    private String address;
    /** GETTER
     * Users Email
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Users Email
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
    }
 
    /** GETTER
     * Users Username
     */
    @JsonGetter("user")
    public String getUser ( ) { 
        return this.user;
    }
    
    /** SETTER
     * Users Username
     */
    @JsonSetter("user")
    public void setUser (String value) { 
        this.user = value;
        notifyObservers(this.user);
    }
 
    /** GETTER
     * Users Password
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * Users Password
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
        notifyObservers(this.password);
    }
 
    /** GETTER
     * Users Name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Users Name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
    /** GETTER
     * Users Cellphone Number
     */
    @JsonGetter("phone")
    public Integer getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * Users Cellphone Number
     */
    @JsonSetter("phone")
    public void setPhone (Integer value) { 
        this.phone = value;
        notifyObservers(this.phone);
    }
 
    /** GETTER
     * Users Country Code (US = 1)
     */
    @JsonGetter("countrycode")
    public Integer getCountrycode ( ) { 
        return this.countrycode;
    }
    
    /** SETTER
     * Users Country Code (US = 1)
     */
    @JsonSetter("countrycode")
    public void setCountrycode (Integer value) { 
        this.countrycode = value;
        notifyObservers(this.countrycode);
    }
 
    /** GETTER
     * Users Address
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Users Address
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
}
 
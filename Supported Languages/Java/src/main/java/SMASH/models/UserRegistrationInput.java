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
        implements java.io.Serializable {
    private static final long serialVersionUID = 5196868106208464754L;
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
    }
 
}
 
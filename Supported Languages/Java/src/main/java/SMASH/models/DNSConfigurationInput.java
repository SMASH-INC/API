/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DNSConfigurationInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4810100139790895358L;
    private String domain;
    private String records;
    /** GETTER
     * Domain or domain names separated by a comma
     */
    @JsonGetter("domain")
    public String getDomain ( ) { 
        return this.domain;
    }
    
    /** SETTER
     * Domain or domain names separated by a comma
     */
    @JsonSetter("domain")
    public void setDomain (String value) { 
        this.domain = value;
    }
 
    /** GETTER
     * Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
     */
    @JsonGetter("records")
    public String getRecords ( ) { 
        return this.records;
    }
    
    /** SETTER
     * Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
     */
    @JsonSetter("records")
    public void setRecords (String value) { 
        this.records = value;
    }
 
}
 
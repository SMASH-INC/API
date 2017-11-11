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
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5027262907991674166L;
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
        notifyObservers(this.domain);
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
        notifyObservers(this.records);
    }
 
}
 
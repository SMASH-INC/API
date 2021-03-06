/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HostingSetupInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4647276001920757034L;
    private String app;
    private String domain;
    /** GETTER
     * GIT URL or ZIP package containing your APP
     */
    @JsonGetter("app")
    public String getApp ( ) { 
        return this.app;
    }
    
    /** SETTER
     * GIT URL or ZIP package containing your APP
     */
    @JsonSetter("app")
    public void setApp (String value) { 
        this.app = value;
        notifyObservers(this.app);
    }
 
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
 
}
 
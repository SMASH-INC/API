/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CDNPushZoneInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5323856932590682256L;
    private String cname;
    private String file;
    /** GETTER
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    @JsonGetter("cname")
    public String getCname ( ) { 
        return this.cname;
    }
    
    /** SETTER
     * Domain or domain names separated by a comma you wish to allow CNAME access
     */
    @JsonSetter("cname")
    public void setCname (String value) { 
        this.cname = value;
        notifyObservers(this.cname);
    }
 
    /** GETTER
     * GIT URL, file URL, or direct upload of file
     */
    @JsonGetter("file")
    public String getFile ( ) { 
        return this.file;
    }
    
    /** SETTER
     * GIT URL, file URL, or direct upload of file
     */
    @JsonSetter("file")
    public void setFile (String value) { 
        this.file = value;
        notifyObservers(this.file);
    }
 
}
 
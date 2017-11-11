/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TwoFactorAuthenticationTokenModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5672009144942791745L;
    private String request;
    private String correct;
    private String id;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("request")
    public String getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("request")
    public void setRequest (String value) { 
        this.request = value;
        notifyObservers(this.request);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("correct")
    public String getCorrect ( ) { 
        return this.correct;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("correct")
    public void setCorrect (String value) { 
        this.correct = value;
        notifyObservers(this.correct);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
}
 
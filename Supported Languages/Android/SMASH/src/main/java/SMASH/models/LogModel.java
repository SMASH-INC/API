/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LogModel 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5130203594385346631L;
    private MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSX;
    private MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSY;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MMDDYYYYHHMMSSX")
    public MMDDYYYYHHMMSSModel getMMDDYYYYHHMMSSX ( ) { 
        return this.mMDDYYYYHHMMSSX;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MMDDYYYYHHMMSSX")
    public void setMMDDYYYYHHMMSSX (MMDDYYYYHHMMSSModel value) { 
        this.mMDDYYYYHHMMSSX = value;
        notifyObservers(this.mMDDYYYYHHMMSSX);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MMDDYYYYHHMMSSY")
    public MMDDYYYYHHMMSSModel getMMDDYYYYHHMMSSY ( ) { 
        return this.mMDDYYYYHHMMSSY;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MMDDYYYYHHMMSSY")
    public void setMMDDYYYYHHMMSSY (MMDDYYYYHHMMSSModel value) { 
        this.mMDDYYYYHHMMSSY = value;
        notifyObservers(this.mMDDYYYYHHMMSSY);
    }
 
}
 
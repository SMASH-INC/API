/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoggingLogsModelResponse 
        extends BaseModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 5342933884459933582L;
    private LogModel log;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("log")
    public LogModel getLog ( ) { 
        return this.log;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("log")
    public void setLog (LogModel value) { 
        this.log = value;
        notifyObservers(this.log);
    }
 
}
 
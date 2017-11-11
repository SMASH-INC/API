/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class LogModelBuilder {
    //the instance to build
    private LogModel logModel;

    /**
     * Default constructor to initialize the instance
     */
    public LogModelBuilder() {
        logModel = new LogModel();
    }

    public LogModelBuilder mMDDYYYYHHMMSSX(MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSX) {
        logModel.setMMDDYYYYHHMMSSX(mMDDYYYYHHMMSSX);
        return this;
    }

    public LogModelBuilder mMDDYYYYHHMMSSY(MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSY) {
        logModel.setMMDDYYYYHHMMSSY(mMDDYYYYHHMMSSY);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public LogModel build() {
        return logModel;
    }
}
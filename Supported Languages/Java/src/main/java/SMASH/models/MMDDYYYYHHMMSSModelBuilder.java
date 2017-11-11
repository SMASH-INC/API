/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class MMDDYYYYHHMMSSModelBuilder {
    //the instance to build
    private MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSModel;

    /**
     * Default constructor to initialize the instance
     */
    public MMDDYYYYHHMMSSModelBuilder() {
        mMDDYYYYHHMMSSModel = new MMDDYYYYHHMMSSModel();
    }

    public MMDDYYYYHHMMSSModelBuilder data(DataModel data) {
        mMDDYYYYHHMMSSModel.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MMDDYYYYHHMMSSModel build() {
        return mMDDYYYYHHMMSSModel;
    }
}
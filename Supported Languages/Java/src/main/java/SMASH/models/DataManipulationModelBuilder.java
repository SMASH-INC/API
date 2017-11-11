/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DataManipulationModelBuilder {
    //the instance to build
    private DataManipulationModel dataManipulationModel;

    /**
     * Default constructor to initialize the instance
     */
    public DataManipulationModelBuilder() {
        dataManipulationModel = new DataManipulationModel();
    }

    public DataManipulationModelBuilder key(String key) {
        dataManipulationModel.setKey(key);
        return this;
    }

    public DataManipulationModelBuilder uid(String uid) {
        dataManipulationModel.setUid(uid);
        return this;
    }

    public DataManipulationModelBuilder user(String user) {
        dataManipulationModel.setUser(user);
        return this;
    }

    public DataManipulationModelBuilder apiuid(String apiuid) {
        dataManipulationModel.setApiuid(apiuid);
        return this;
    }

    public DataManipulationModelBuilder url(String url) {
        dataManipulationModel.setUrl(url);
        return this;
    }

    public DataManipulationModelBuilder manipulation(String manipulation) {
        dataManipulationModel.setManipulation(manipulation);
        return this;
    }

    public DataManipulationModelBuilder conversion(String conversion) {
        dataManipulationModel.setConversion(conversion);
        return this;
    }

    public DataManipulationModelBuilder sorting(String sorting) {
        dataManipulationModel.setSorting(sorting);
        return this;
    }

    public DataManipulationModelBuilder compression(String compression) {
        dataManipulationModel.setCompression(compression);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DataManipulationModel build() {
        return dataManipulationModel;
    }
}
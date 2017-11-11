/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class DataModelBuilder {
    //the instance to build
    private DataModel dataModel;

    /**
     * Default constructor to initialize the instance
     */
    public DataModelBuilder() {
        dataModel = new DataModel();
    }

    public DataModelBuilder result(String result) {
        dataModel.setResult(result);
        return this;
    }

    public DataModelBuilder content(String content) {
        dataModel.setContent(content);
        return this;
    }

    public DataModelBuilder id(String id) {
        dataModel.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DataModel build() {
        return dataModel;
    }
}
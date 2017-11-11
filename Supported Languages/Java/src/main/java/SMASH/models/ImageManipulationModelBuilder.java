/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class ImageManipulationModelBuilder {
    //the instance to build
    private ImageManipulationModel imageManipulationModel;

    /**
     * Default constructor to initialize the instance
     */
    public ImageManipulationModelBuilder() {
        imageManipulationModel = new ImageManipulationModel();
    }

    public ImageManipulationModelBuilder key(String key) {
        imageManipulationModel.setKey(key);
        return this;
    }

    public ImageManipulationModelBuilder uid(String uid) {
        imageManipulationModel.setUid(uid);
        return this;
    }

    public ImageManipulationModelBuilder image(String image) {
        imageManipulationModel.setImage(image);
        return this;
    }

    public ImageManipulationModelBuilder transform(String transform) {
        imageManipulationModel.setTransform(transform);
        return this;
    }

    public ImageManipulationModelBuilder moderate(String moderate) {
        imageManipulationModel.setModerate(moderate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ImageManipulationModel build() {
        return imageManipulationModel;
    }
}
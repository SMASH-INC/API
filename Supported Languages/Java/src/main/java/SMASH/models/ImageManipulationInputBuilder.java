/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class ImageManipulationInputBuilder {
    //the instance to build
    private ImageManipulationInput imageManipulationInput;

    /**
     * Default constructor to initialize the instance
     */
    public ImageManipulationInputBuilder() {
        imageManipulationInput = new ImageManipulationInput();
    }

    /**
     * Image URL or direct upload
     */
    public ImageManipulationInputBuilder image(String image) {
        imageManipulationInput.setImage(image);
        return this;
    }

    /**
     * Transformations to perform
     */
    public ImageManipulationInputBuilder transform(String transform) {
        imageManipulationInput.setTransform(transform);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ImageManipulationInput build() {
        return imageManipulationInput;
    }
}
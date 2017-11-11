/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class ImageManipulationModelResponseBuilder {
    //the instance to build
    private ImageManipulationModelResponse imageManipulationModelResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ImageManipulationModelResponseBuilder() {
        imageManipulationModelResponse = new ImageManipulationModelResponse();
    }

    public ImageManipulationModelResponseBuilder request(String request) {
        imageManipulationModelResponse.setRequest(request);
        return this;
    }

    public ImageManipulationModelResponseBuilder url(String url) {
        imageManipulationModelResponse.setUrl(url);
        return this;
    }

    public ImageManipulationModelResponseBuilder success(String success) {
        imageManipulationModelResponse.setSuccess(success);
        return this;
    }

    public ImageManipulationModelResponseBuilder moderated(String moderated) {
        imageManipulationModelResponse.setModerated(moderated);
        return this;
    }

    public ImageManipulationModelResponseBuilder id(String id) {
        imageManipulationModelResponse.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ImageManipulationModelResponse build() {
        return imageManipulationModelResponse;
    }
}
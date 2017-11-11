/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import SMASH.models.*;
import SMASH.exceptions.*;
import SMASH.APIHelper;
import SMASH.Configuration;
import SMASH.testing.TestHelper;
import SMASH.controllers.ImageManipulation;

import com.fasterxml.jackson.core.type.TypeReference;

public class ImageManipulationTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static ImageManipulation controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getImageManipulation();
        applyConfiguration();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Image manipulation test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiI() throws Throwable {
        // Parameters for the API call
        ImageManipulationInput input = new ImageManipulationInput();
        input.setImage(null);
        input.setTransform(null);

        // Set callback and perform API call
        ImageManipulationModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.imageManipulation(input);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "{\n    \"request\": \"REQUEST TYPE\",\n    \"url\": \"RETURNED IMAGE URL AND DATA\",\n    \"success\": \"RETURNS TRUE IF IMAGE MANIPULATION WAS SUCCESSFULL\",\n    \"moderated\": \"RETURNS TRUE IF IMAGE CONTAINED GRAPHIC IMAGERY\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

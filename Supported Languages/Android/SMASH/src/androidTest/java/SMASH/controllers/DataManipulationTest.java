/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import SMASH.models.*;
import SMASH.exceptions.*;
import SMASH.APIHelper;
import SMASH.Configuration;
import SMASH.testing.TestHelper;
import SMASH.controllers.DataManipulation;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DataManipulationTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static DataManipulation controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getDataManipulation();
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
     * Data Manipulation test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiD() throws Throwable {
        // Parameters for the API call
        HttpsApiRestShApiDInput input = new HttpsApiRestShApiDInput();
        input.setData(null);
        input.setTransform(null);

        // Set callback and perform API call
        DataManipulationModelResponse result = null;
        APICallBackCatcher<DataManipulationModelResponse> response = new APICallBackCatcher<DataManipulationModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.httpsApiRestShApiDAsync(input, response);
        result = response.getResult();

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
                "{\n    \"request\": \"REQUEST TYPE\",\n    \"url\": \"RETURNED DATA URL\",\n    \"success\": \"RETURNS TRUE IF DATA MANIPULATION WAS SUCCESSFULL\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

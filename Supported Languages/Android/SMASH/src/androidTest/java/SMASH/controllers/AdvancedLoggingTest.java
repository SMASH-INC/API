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
import SMASH.controllers.AdvancedLogging;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdvancedLoggingTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static AdvancedLogging controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getAdvancedLogging();
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
     * Advanced logging configuration test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSL() throws Throwable {
        // Parameters for the API call
        LoggingConfigurationInput input = new LoggingConfigurationInput();
        input.setName(null);
        input.setOrigin(null);
        input.setActivate(null);

        // Set callback and perform API call
        LoggingSetupModelResponse result = null;
        APICallBackCatcher<LoggingSetupModelResponse> response = new APICallBackCatcher<LoggingSetupModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.loggingConfigurationAsync(input, response);
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
                "{\r\n  \"success\": \"RETURNS TRUE IF ADVANCED LOGGING IS ACTIVATED\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * Advanced logging info test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSLI() throws Throwable {
        // Parameters for the API call
        LoggingInfoInput input = new LoggingInfoInput();
        input.setName(null);
        input.setOrigin(null);
        input.setTime(null);

        // Set callback and perform API call
        LoggingLogsModelResponse result = null;
        APICallBackCatcher<LoggingLogsModelResponse> response = new APICallBackCatcher<LoggingLogsModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.loggingInfoAsync(input, response);
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
                "{\n    \"log\": {\n        \"01010101245901\": {\n            \"data\": {\n                \"result\": \"INFO\",\n                \"content\": \"LOG: CONTENT AND ACTIONS PERFORMED\",\n                \"id\": \"FUNCTION ID\"\n            }\n        },\n        \"01010101245902\": {\n            \"data\": {\n                \"result\": \"ERROR\",\n                \"content\": \"LOG: ERROR CONTENT AND ACTIONS PERFORMED\",\n                \"id\": \"FUNCTION ID\"\n            }\n        }\n    }\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

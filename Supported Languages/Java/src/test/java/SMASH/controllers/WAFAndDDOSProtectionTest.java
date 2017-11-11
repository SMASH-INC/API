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
import SMASH.controllers.WAFAndDDOSProtection;

import com.fasterxml.jackson.core.type.TypeReference;

public class WAFAndDDOSProtectionTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static WAFAndDDOSProtection controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getWAFAndDDOSProtection();
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
     * WAF and DDOS configuration test case
     * @throws Throwable
     */
    @Test
    public void testWAFConfiguration() throws Throwable {
        // Parameters for the API call
        WAFConfigurationInput input = new WAFConfigurationInput();
        input.setName(null);
        input.setRule(null);

        // Set callback and perform API call
        WAFConfigurationModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.wAFConfiguration(input);
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
                "{\r\n  \"success\": \"SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY\",\r\n  \"rule\": \"RULES APPLIED TO WAF\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * WAF and DDOS test case
     * @throws Throwable
     */
    @Test
    public void testWAFCreation() throws Throwable {
        // Parameters for the API call
        WAFCreationInput input = new WAFCreationInput();
        input.setOrigin(null);
        input.setCname(null);

        // Set callback and perform API call
        WAFCreationModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.wAFCreation(input);
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
                "{\r\n  \"success\": \"SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

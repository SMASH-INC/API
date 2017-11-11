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
import SMASH.controllers.CDN;

import com.fasterxml.jackson.core.type.TypeReference;

public class CDNTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static CDN controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getCDN();
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
     * CDN push zone creation and configuration test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSCPush() throws Throwable {
        // Parameters for the API call
        CDNPushZoneInput input = new CDNPushZoneInput();
        input.setCname(null);
        input.setFile(null);

        // Set callback and perform API call
        CDNPushModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.cDNPushZone(input);
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
                "{\r\n  \"success\": \"SHOWS TRUE WHEN PUSH ZONE IS DEPLOYED SUCCESSFULLY\",\r\n  \"upload\": \"LIST OF FILES UPLOADED TO YOUR PUSH ZONE\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * CDN pull zone creation and configuration test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSCPull() throws Throwable {
        // Parameters for the API call
        CDNPullZoneInput input = new CDNPullZoneInput();
        input.setOrigin(null);
        input.setCname(null);

        // Set callback and perform API call
        CDNPullModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.cDNPullZone(input);
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
                "{\r\n  \"success\": \"SHOWS TRUE WHEN PULL ZONE IS DEPLOYED SUCCESSFULLY\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

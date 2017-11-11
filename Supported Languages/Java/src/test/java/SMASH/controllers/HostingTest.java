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
import SMASH.controllers.Hosting;

import com.fasterxml.jackson.core.type.TypeReference;

public class HostingTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static Hosting controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getHosting();
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
     * Web hosting testing case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSH() throws Throwable {
        // Parameters for the API call
        HostingSetupInput input = new HostingSetupInput();
        input.setApp(null);
        input.setDomain(null);

        // Set callback and perform API call
        HostingModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.hostingSetup(input);
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
                "{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"url\": \"RETURNED APP HOSTING URL\",\r\n  \"success\": \"RETURNS TRUE IF APP WAS SUCCESSFULLY DEPLOYED\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

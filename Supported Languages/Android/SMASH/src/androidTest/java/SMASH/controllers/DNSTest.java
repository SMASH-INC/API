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
import SMASH.controllers.DNS;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DNSTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static DNS controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getDNS();
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
     * DNS configuration test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSDC() throws Throwable {
        // Parameters for the API call
        DNSConfigurationInput input = new DNSConfigurationInput();
        input.setDomain(null);
        input.setRecords(null);

        // Set callback and perform API call
        DNSConfigurationModelResponse result = null;
        APICallBackCatcher<DNSConfigurationModelResponse> response = new APICallBackCatcher<DNSConfigurationModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.dNSConfigurationAsync(input, response);
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
                "{\n    \"success\": \"SHOWS TRUE IF RECORDS WERE SUCCESSFULLY SET\",\n    \"domain\": \"DOMAIN\",\n    \"records\": \"RECORDS SET TO DOMAIN\"\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * DNS addition test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSDA() throws Throwable {
        // Parameters for the API call
        String domain = null;

        // Set callback and perform API call
        DNSCreationModelResponse result = null;
        APICallBackCatcher<DNSCreationModelResponse> response = new APICallBackCatcher<DNSCreationModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.dNSCreationAsync(domain, response);
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
                "{\n    \"domain\": \"LIST OF DOMAINS ADDED\",\n    \"nameservers\": {\n        \"ns1\": \"NAME SERVER ONE TO POINT YOUR DOMAIN AT\",\n        \"ns2\": \"NAME SERVER TWO TO POINT YOUR DOMAIN AT\",\n        \"ns3\": \"NAME SERVER THREE TO POINT YOUR DOMAIN AT\",\n        \"ns4\": \"NAME SERVER FOUR TO POINT YOUR DOMAIN AT\"\n    }\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

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
import SMASH.controllers.TwoFactorAuthenticationAPI;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TwoFactorAuthenticationAPITest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static TwoFactorAuthenticationAPI controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getTwoFactorAuthenticationAPI();
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
     * User 2FA response test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApi2faT() throws Throwable {
        // Parameters for the API call
        M2FATokenResponseInput input = new M2FATokenResponseInput();
        input.setUser(null);
        input.setCode(null);

        // Set callback and perform API call
        TwoFactorAuthenticationTokenModelResponse result = null;
        APICallBackCatcher<TwoFactorAuthenticationTokenModelResponse> response = new APICallBackCatcher<TwoFactorAuthenticationTokenModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.m2FATokenResponseAsync(input, response);
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
                "{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"correct\": \"RETURNS IF 2FA TOKEN IS CORRECT\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * 2FA test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApi2fa() throws Throwable {
        // Parameters for the API call
        String to = null;

        // Set callback and perform API call
        TwoFactorAuthenticationModelResponse result = null;
        APICallBackCatcher<TwoFactorAuthenticationModelResponse> response = new APICallBackCatcher<TwoFactorAuthenticationModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.twoFactorAuthenticationAsync(to, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Accept-Ranges", TestHelper.nullString);
        headers.put("Connection", TestHelper.nullString);
        headers.put("Content-Length", TestHelper.nullString);
        headers.put("Content-Type", TestHelper.nullString);
        headers.put("Date", TestHelper.nullString);
        headers.put("Server", TestHelper.nullString);
        headers.put("Vary", TestHelper.nullString);
        headers.put("Via", TestHelper.nullString);
        headers.put("X-Cache", TestHelper.nullString);
        headers.put("X-Cache-Hits", TestHelper.nullString);
        headers.put("X-Served-By", TestHelper.nullString);
        headers.put("X-Timer", TestHelper.nullString);
        headers.put("access-control-allow-origin", TestHelper.nullString);
        headers.put("cache-control", TestHelper.nullString);
        headers.put("etag", TestHelper.nullString);
        headers.put("function-execution-id", TestHelper.nullString);
        headers.put("strict-transport-security", TestHelper.nullString);
        headers.put("x-cloud-trace-context", TestHelper.nullString);
        headers.put("x-content-type-options", TestHelper.nullString);
        headers.put("x-dns-prefetch-control", TestHelper.nullString);
        headers.put("x-download-options", TestHelper.nullString);
        headers.put("x-frame-options", TestHelper.nullString);
        headers.put("x-powered-by", TestHelper.nullString);
        headers.put("x-xss-protection", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "{\n    \"request\": \"REQUEST TYPE\",\n    \"to\": \"USER BEING VERIFIED\",\n    \"verified\": \"RETURNS TRUE OR FALSE\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

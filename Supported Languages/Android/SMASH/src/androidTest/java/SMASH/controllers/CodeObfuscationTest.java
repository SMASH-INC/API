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
import SMASH.controllers.CodeObfuscation;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class CodeObfuscationTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static CodeObfuscation controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getCodeObfuscation();
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
     * Code obfuscation test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSO() throws Throwable {
        // Parameters for the API call
        String app = null;

        // Set callback and perform API call
        CodeProtectionModelResponse result = null;
        APICallBackCatcher<CodeProtectionModelResponse> response = new APICallBackCatcher<CodeProtectionModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.obfuscationAndAntiTamperingAsync(app, response);
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
                "{\r\n  \"success\": \"RETURNS TRUE IF APP WAS SUCCESSFULLY OBFUSCTATED AND PROTECTED\",\r\n  \"app\": \"OBFUSCATED APP URL\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

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
import SMASH.controllers.Encryption;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EncryptionTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static Encryption controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        Configuration.initialize(InstrumentationRegistry.getContext());
        controller = getClient().getEncryption();
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
     * File and Data encryption test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiSE() throws Throwable {
        // Parameters for the API call
        DataAndFileEncryptionInput input = new DataAndFileEncryptionInput();
        input.setData(null);
        input.setMethod(null);
        input.setBit(0);

        // Set callback and perform API call
        EncryptionModelResponse result = null;
        APICallBackCatcher<EncryptionModelResponse> response = new APICallBackCatcher<EncryptionModelResponse>();
        controller.setHttpCallBack(httpResponse);
        controller.dataAndFileEncryptionAsync(input, response);
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
                "{\n    \"data\": \"RETURNED ENCRYPTED DATA URL\",\n    \"file\": \"RETURNED ENCRYPTED FILE URL\",\n    \"success\": \"SHOWS TRUE IF ENCRYPTION WAS SUCCESSFULL\",\n    \"public\": \"PUBLIC ENCRYPTION KEY FOR YOUR DATA OR FILES\",\n    \"private\": \"PRIVATE ENCRYPTION KEY FOR YOUR DATA OR FILES\"\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

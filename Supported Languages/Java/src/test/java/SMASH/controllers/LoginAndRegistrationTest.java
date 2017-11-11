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
import SMASH.controllers.LoginAndRegistration;

import com.fasterxml.jackson.core.type.TypeReference;

public class LoginAndRegistrationTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static LoginAndRegistration controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getLoginAndRegistration();
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
     * User registration test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiAUR() throws Throwable {
        // Parameters for the API call
        UserRegistrationInput input = new UserRegistrationInput();
        input.setEmail(null);
        input.setUser(null);
        input.setPassword(null);
        input.setName(null);
        input.setPhone(null);
        input.setCountrycode(null);
        input.setAddress(null);
        // key-value map for optional query parameters
        Map<String, Object> queryParams = new LinkedHashMap<String, Object>();

        // Set callback and perform API call
        UserRegistrationModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.userRegistration(input, queryParams);
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
                "{\n    \"request\": \"REQUEST TYPE\",\n    \"active\": \"RETURNS TRUE, IF USER WAS SUCCESSFULLY REGISTERED\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n        \"uid\": \"USERS ID\",\n        \"apiuid\": \"API SIDE USER ID\",\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS\",\n        \"phone\": \"USERS CELL PHONE NUMBER\"\n    }\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * User authentication test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiAUL() throws Throwable {
        // Parameters for the API call
        UserAuthenticationInput input = new UserAuthenticationInput();
        input.setUser(null);
        input.setPassword(null);

        // Set callback and perform API call
        UserAuthenticationModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.userAuthentication(input);
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
                "{\n    \"request\": \"REQUEST TYPE\",\n    \"uid\": \"Users UID\",\n    \"valid\": \"RETURNS TRUE IF USER LOGIN DETAILS ARE VALID\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n    	\"uid\": \"USERS ID\",\n    	\"apiuid\": \"API SIDE USER ID\",\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"avatar\": \"USER AVATAR URL\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS\",\n        \"phone\": \"USERS CELL PHONE NUMBER\",\n        \"lastlogin\": \"USERS LAST LOGIN\",\n        \"ip\": \"USERS IP\",\n        \"2fa\": \"RETURNS TRUE IF 2FA IS ENABLED\",\n        \"iplock\": \"RETURNS TRUE IF IP LOCK IS ENABLED\"\n    }\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

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
import SMASH.controllers.UserManagement;

import com.fasterxml.jackson.core.type.TypeReference;

public class UserManagementTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static UserManagement controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getUserManagement();
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
     * User information test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiUI() throws Throwable {
        // Parameters for the API call
        String user = null;

        // Set callback and perform API call
        UserInformationModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getUserInfo(user);
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
                "{\n    \"request\": \"REQUEST TYPE\",\n    \"uid\": \"Users UID\",\n    \"apiuid\": \"API SIDE USER ID\",\n    \"verified\": \"RETURNS TRUE IF USER IS VERIFIED\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"avatar\": \"USER AVATAR URL\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS IN ONE LINE SEPERATED BY COMMAS\",\n        \"address1\": \"USERS ADDRESS LINE ONE\",\n        \"address2\": \"USERS ADDRESS LINE TWO\",\n        \"city\": \"USERS ADDRESS CITY\",\n        \"state\": \"USERS ADDRESS STATE\",\n        \"zipcode\": \"USERS ADDRESS ZIPCODE\",\n        \"phone\": \"USERS CELL PHONE NUMBER\",\n        \"lastlogin\": \"USERS LAST LOGIN\",\n        \"ip\": \"USERS IP\",\n        \"2fa\": \"RETURNS TRUE IF 2FA IS ENABLED\",\n        \"iplock\": \"RETURNS TRUE IF IP LOCK IS ENABLED\"\n    }\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * User update test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiUU() throws Throwable {
        // Parameters for the API call
        UpdateUserInput input = new UpdateUserInput();
        input.setUser(null);
        input.setAvatar(null);
        input.setCustomInput(null);
        // key-value map for optional query parameters
        Map<String, Object> queryParams = new LinkedHashMap<String, Object>();

        // Set callback and perform API call
        UserUpdateModelResponse result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.updateUser(input, queryParams);
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
                "{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"updated\": \"RETURNS TRUE, IF USERS PROFILE WAS SUCCESSFULLY UPDATED\",\r\n  \"id\": \"TRANSACTION ID\",\r\n  \"info\": {\r\n    \"uid\": \"USERS ID\",\r\n    \"apiuid\": \"API SIDE USER ID\",\r\n    \"avatar\": \"INPUTTED AVATAR URL\",\r\n    \"custom-input\": \"CUSTOM INPUTTED PROFILE DATA\"\r\n  }\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * User deletion test case
     * @throws Throwable
     */
    @Test
    public void testHttpsApiRestShApiUD() throws Throwable {
        // Parameters for the API call
        String user = null;

        // Set callback and perform API call
        UserDeletionResponseModel result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.deleteUser(user);
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
                "{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"deleted\": \"RETURNS TRUE, IF USERS ACCOUNT WAS SUCCESSFULLY DELETED\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}

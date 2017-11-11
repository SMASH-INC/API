/*
 * SMASH.Tests
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Threading.Tasks;
using Newtonsoft.Json.Converters;
using SMASH.SDK.Common; 
using SMASH.SDK.Http.Client;
using SMASH.SDK.Http.Response;
using SMASH.Helpers;
using NUnit.Framework;
using SMASH;
using SMASH.Controllers;

namespace SMASH
{
    [TestFixture]
    public class UserManagementTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IUserManagement controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().UserManagement;
            applyConfiguration();
        }

        /// <summary>
        /// User information test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiUI() 
        {
            // Parameters for the API call
            string user = null;

            // Perform API call
            Models.UserInformationModelResponse result = null;

            try
            {
                result = await controller.GetUserInfoAsync(user);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"request\": \"REQUEST TYPE\",\n    \"uid\": \"Users UID\",\n    \"apiuid\": \"API SIDE USER ID\",\n    \"verified\": \"RETURNS TRUE IF USER IS VERIFIED\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"avatar\": \"USER AVATAR URL\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS IN ONE LINE SEPERATED BY COMMAS\",\n        \"address1\": \"USERS ADDRESS LINE ONE\",\n        \"address2\": \"USERS ADDRESS LINE TWO\",\n        \"city\": \"USERS ADDRESS CITY\",\n        \"state\": \"USERS ADDRESS STATE\",\n        \"zipcode\": \"USERS ADDRESS ZIPCODE\",\n        \"phone\": \"USERS CELL PHONE NUMBER\",\n        \"lastlogin\": \"USERS LAST LOGIN\",\n        \"ip\": \"USERS IP\",\n        \"2fa\": \"RETURNS TRUE IF 2FA IS ENABLED\",\n        \"iplock\": \"RETURNS TRUE IF IP LOCK IS ENABLED\"\n    }\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// User update test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiUU() 
        {
            // Parameters for the API call
            Models.UpdateUserInput input = new Models.UpdateUserInput();
            input.User = null;
            input.Avatar = null;
            input.CustomInput = null;
            // key-value map for optional query parameters
            Dictionary<string, object> queryParams = new Dictionary<string, object>();

            // Perform API call
            Models.UserUpdateModelResponse result = null;

            try
            {
                result = await controller.UpdateUserAsync(input, queryParams);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"updated\": \"RETURNS TRUE, IF USERS PROFILE WAS SUCCESSFULLY UPDATED\",\r\n  \"id\": \"TRANSACTION ID\",\r\n  \"info\": {\r\n    \"uid\": \"USERS ID\",\r\n    \"apiuid\": \"API SIDE USER ID\",\r\n    \"avatar\": \"INPUTTED AVATAR URL\",\r\n    \"custom-input\": \"CUSTOM INPUTTED PROFILE DATA\"\r\n  }\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// User deletion test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiUD() 
        {
            // Parameters for the API call
            string user = null;

            // Perform API call
            Models.UserDeletionResponseModel result = null;

            try
            {
                result = await controller.DeleteUserAsync(user);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"deleted\": \"RETURNS TRUE, IF USERS ACCOUNT WAS SUCCESSFULLY DELETED\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
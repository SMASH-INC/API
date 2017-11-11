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
    public class LoginAndRegistrationTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static ILoginAndRegistration controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().LoginAndRegistration;
            applyConfiguration();
        }

        /// <summary>
        /// User registration test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiAUR() 
        {
            // Parameters for the API call
            Models.UserRegistrationInput input = new Models.UserRegistrationInput();
            input.Email = null;
            input.User = null;
            input.Password = null;
            input.Name = null;
            input.Phone = null;
            input.Countrycode = null;
            input.Address = null;
            // key-value map for optional query parameters
            Dictionary<string, object> queryParams = new Dictionary<string, object>();

            // Perform API call
            Models.UserRegistrationModelResponse result = null;

            try
            {
                result = await controller.UserRegistrationAsync(input, queryParams);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"request\": \"REQUEST TYPE\",\n    \"active\": \"RETURNS TRUE, IF USER WAS SUCCESSFULLY REGISTERED\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n        \"uid\": \"USERS ID\",\n        \"apiuid\": \"API SIDE USER ID\",\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS\",\n        \"phone\": \"USERS CELL PHONE NUMBER\"\n    }\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// User authentication test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiAUL() 
        {
            // Parameters for the API call
            Models.UserAuthenticationInput input = new Models.UserAuthenticationInput();
            input.User = null;
            input.Password = null;

            // Perform API call
            Models.UserAuthenticationModelResponse result = null;

            try
            {
                result = await controller.UserAuthenticationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"request\": \"REQUEST TYPE\",\n    \"uid\": \"Users UID\",\n    \"valid\": \"RETURNS TRUE IF USER LOGIN DETAILS ARE VALID\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n    	\"uid\": \"USERS ID\",\n    	\"apiuid\": \"API SIDE USER ID\",\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"avatar\": \"USER AVATAR URL\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS\",\n        \"phone\": \"USERS CELL PHONE NUMBER\",\n        \"lastlogin\": \"USERS LAST LOGIN\",\n        \"ip\": \"USERS IP\",\n        \"2fa\": \"RETURNS TRUE IF 2FA IS ENABLED\",\n        \"iplock\": \"RETURNS TRUE IF IP LOCK IS ENABLED\"\n    }\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
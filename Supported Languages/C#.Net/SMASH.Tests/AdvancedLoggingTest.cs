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
    public class AdvancedLoggingTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IAdvancedLogging controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().AdvancedLogging;
            applyConfiguration();
        }

        /// <summary>
        /// Advanced logging configuration test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSL() 
        {
            // Parameters for the API call
            Models.LoggingConfigurationInput input = new Models.LoggingConfigurationInput();
            input.Name = null;
            input.Origin = null;
            input.Activate = null;

            // Perform API call
            Models.LoggingSetupModelResponse result = null;

            try
            {
                result = await controller.LoggingConfigurationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"success\": \"RETURNS TRUE IF ADVANCED LOGGING IS ACTIVATED\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// Advanced logging info test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSLI() 
        {
            // Parameters for the API call
            Models.LoggingInfoInput input = new Models.LoggingInfoInput();
            input.Name = null;
            input.Origin = null;
            input.Time = null;

            // Perform API call
            Models.LoggingLogsModelResponse result = null;

            try
            {
                result = await controller.LoggingInfoAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"log\": {\n        \"01010101245901\": {\n            \"data\": {\n                \"result\": \"INFO\",\n                \"content\": \"LOG: CONTENT AND ACTIONS PERFORMED\",\n                \"id\": \"FUNCTION ID\"\n            }\n        },\n        \"01010101245902\": {\n            \"data\": {\n                \"result\": \"ERROR\",\n                \"content\": \"LOG: ERROR CONTENT AND ACTIONS PERFORMED\",\n                \"id\": \"FUNCTION ID\"\n            }\n        }\n    }\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
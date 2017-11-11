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
    public class CDNTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static ICDN controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().CDN;
            applyConfiguration();
        }

        /// <summary>
        /// CDN push zone creation and configuration test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSCPush() 
        {
            // Parameters for the API call
            Models.CDNPushZoneInput input = new Models.CDNPushZoneInput();
            input.Cname = null;
            input.File = null;

            // Perform API call
            Models.CDNPushModelResponse result = null;

            try
            {
                result = await controller.CDNPushZoneAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"success\": \"SHOWS TRUE WHEN PUSH ZONE IS DEPLOYED SUCCESSFULLY\",\r\n  \"upload\": \"LIST OF FILES UPLOADED TO YOUR PUSH ZONE\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// CDN pull zone creation and configuration test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSCPull() 
        {
            // Parameters for the API call
            Models.CDNPullZoneInput input = new Models.CDNPullZoneInput();
            input.Origin = null;
            input.Cname = null;

            // Perform API call
            Models.CDNPullModelResponse result = null;

            try
            {
                result = await controller.CDNPullZoneAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"success\": \"SHOWS TRUE WHEN PULL ZONE IS DEPLOYED SUCCESSFULLY\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
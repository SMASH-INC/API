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
    public class WAFAndDDOSProtectionTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IWAFAndDDOSProtection controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().WAFAndDDOSProtection;
            applyConfiguration();
        }

        /// <summary>
        /// WAF and DDOS configuration test case 
        /// </summary>
        [Test]
        public async Task TestWAFConfiguration() 
        {
            // Parameters for the API call
            Models.WAFConfigurationInput input = new Models.WAFConfigurationInput();
            input.Name = null;
            input.Rule = null;

            // Perform API call
            Models.WAFConfigurationModelResponse result = null;

            try
            {
                result = await controller.WAFConfigurationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"success\": \"SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY\",\r\n  \"rule\": \"RULES APPLIED TO WAF\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// WAF and DDOS test case 
        /// </summary>
        [Test]
        public async Task TestWAFCreation() 
        {
            // Parameters for the API call
            Models.WAFCreationInput input = new Models.WAFCreationInput();
            input.Origin = null;
            input.Cname = null;

            // Perform API call
            Models.WAFCreationModelResponse result = null;

            try
            {
                result = await controller.WAFCreationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"success\": \"SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
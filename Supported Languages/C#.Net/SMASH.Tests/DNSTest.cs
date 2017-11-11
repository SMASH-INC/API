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
    public class DNSTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IDNS controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().DNS;
            applyConfiguration();
        }

        /// <summary>
        /// DNS configuration test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSDC() 
        {
            // Parameters for the API call
            Models.DNSConfigurationInput input = new Models.DNSConfigurationInput();
            input.Domain = null;
            input.Records = null;

            // Perform API call
            Models.DNSConfigurationModelResponse result = null;

            try
            {
                result = await controller.DNSConfigurationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"success\": \"SHOWS TRUE IF RECORDS WERE SUCCESSFULLY SET\",\n    \"domain\": \"DOMAIN\",\n    \"records\": \"RECORDS SET TO DOMAIN\"\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// DNS addition test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSDA() 
        {
            // Parameters for the API call
            string domain = null;

            // Perform API call
            Models.DNSCreationModelResponse result = null;

            try
            {
                result = await controller.DNSCreationAsync(domain);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"domain\": \"LIST OF DOMAINS ADDED\",\n    \"nameservers\": {\n        \"ns1\": \"NAME SERVER ONE TO POINT YOUR DOMAIN AT\",\n        \"ns2\": \"NAME SERVER TWO TO POINT YOUR DOMAIN AT\",\n        \"ns3\": \"NAME SERVER THREE TO POINT YOUR DOMAIN AT\",\n        \"ns4\": \"NAME SERVER FOUR TO POINT YOUR DOMAIN AT\"\n    }\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
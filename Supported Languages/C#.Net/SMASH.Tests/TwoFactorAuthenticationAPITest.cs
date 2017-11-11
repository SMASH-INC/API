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
    public class TwoFactorAuthenticationAPITest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static ITwoFactorAuthenticationAPI controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().TwoFactorAuthenticationAPI;
            applyConfiguration();
        }

        /// <summary>
        /// User 2FA response test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApi2faT() 
        {
            // Parameters for the API call
            Models.M2FATokenResponseInput input = new Models.M2FATokenResponseInput();
            input.User = null;
            input.Code = null;

            // Perform API call
            Models.TwoFactorAuthenticationTokenModelResponse result = null;

            try
            {
                result = await controller.M2FATokenResponseAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"correct\": \"RETURNS IF 2FA TOKEN IS CORRECT\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// 2FA test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApi2fa() 
        {
            // Parameters for the API call
            string to = null;

            // Perform API call
            Models.TwoFactorAuthenticationModelResponse result = null;

            try
            {
                result = await controller.TwoFactorAuthenticationAsync(to);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test headers
            Dictionary<string, string> headers = new Dictionary<string, string>();
            headers.Add("Accept-Ranges", null);
            headers.Add("Connection", null);
            headers.Add("Content-Length", null);
            headers.Add("Content-Type", null);
            headers.Add("Date", null);
            headers.Add("Server", null);
            headers.Add("Vary", null);
            headers.Add("Via", null);
            headers.Add("X-Cache", null);
            headers.Add("X-Cache-Hits", null);
            headers.Add("X-Served-By", null);
            headers.Add("X-Timer", null);
            headers.Add("access-control-allow-origin", null);
            headers.Add("cache-control", null);
            headers.Add("etag", null);
            headers.Add("function-execution-id", null);
            headers.Add("strict-transport-security", null);
            headers.Add("x-cloud-trace-context", null);
            headers.Add("x-content-type-options", null);
            headers.Add("x-dns-prefetch-control", null);
            headers.Add("x-download-options", null);
            headers.Add("x-frame-options", null);
            headers.Add("x-powered-by", null);
            headers.Add("x-xss-protection", null);

            Assert.IsTrue(TestHelper.AreHeadersProperSubsetOf (
                    headers, httpCallBackHandler.Response.Headers),
                    "Headers should match");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"request\": \"REQUEST TYPE\",\n    \"to\": \"USER BEING VERIFIED\",\n    \"verified\": \"RETURNS TRUE OR FALSE\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
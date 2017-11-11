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
    public class VerificationTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IVerification controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().Verification;
            applyConfiguration();
        }

        /// <summary>
        /// User address verification test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiVA() 
        {
            // Parameters for the API call
            Models.UserAddressVerificationInput input = new Models.UserAddressVerificationInput();
            input.User = null;
            input.A = null;
            input.Sa = null;
            input.C = null;
            input.S = null;
            input.Z = 0;
            input.Address = null;

            // Perform API call
            Models.VerifyAddressResponse result = null;

            try
            {
                result = await controller.UserAddressVerificationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"active\": \"RETURNS TRUE, IF ADDRESS IS ACTIVE AND IF USER IS CURRENTLY THERE\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

        /// <summary>
        /// User verification response test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiVU() 
        {
            // Parameters for the API call
            Models.UserVerificationResponseInput input = new Models.UserVerificationResponseInput();
            input.User = null;
            input.Code = null;

            // Perform API call
            Models.VerifyUserModelResponse result = null;

            try
            {
                result = await controller.UserVerificationResponseAsync(input);
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
        /// User verification test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiV() 
        {
            // Parameters for the API call
            string user = null;

            // Perform API call
            Models.VerifyModelResponse result = null;

            try
            {
                result = await controller.UserVerificationAsync(user);
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
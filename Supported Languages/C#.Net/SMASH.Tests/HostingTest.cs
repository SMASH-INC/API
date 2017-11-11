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
    public class HostingTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IHosting controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().Hosting;
            applyConfiguration();
        }

        /// <summary>
        /// Web hosting testing case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSH() 
        {
            // Parameters for the API call
            Models.HostingSetupInput input = new Models.HostingSetupInput();
            input.App = null;
            input.Domain = null;

            // Perform API call
            Models.HostingModelResponse result = null;

            try
            {
                result = await controller.HostingSetupAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"url\": \"RETURNED APP HOSTING URL\",\r\n  \"success\": \"RETURNS TRUE IF APP WAS SUCCESSFULLY DEPLOYED\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
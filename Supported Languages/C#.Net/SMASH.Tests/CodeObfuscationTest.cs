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
    public class CodeObfuscationTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static ICodeObfuscation controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().CodeObfuscation;
            applyConfiguration();
        }

        /// <summary>
        /// Code obfuscation test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSO() 
        {
            // Parameters for the API call
            string app = null;

            // Perform API call
            Models.CodeProtectionModelResponse result = null;

            try
            {
                result = await controller.ObfuscationAndAntiTamperingAsync(app);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\r\n  \"success\": \"RETURNS TRUE IF APP WAS SUCCESSFULLY OBFUSCTATED AND PROTECTED\",\r\n  \"app\": \"OBFUSCATED APP URL\"\r\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
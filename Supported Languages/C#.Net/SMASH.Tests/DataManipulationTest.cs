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
    public class DataManipulationTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IDataManipulation controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().DataManipulation;
            applyConfiguration();
        }

        /// <summary>
        /// Data Manipulation test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiD() 
        {
            // Parameters for the API call
            Models.HttpsApiRestShApiDInput input = new Models.HttpsApiRestShApiDInput();
            input.Data = null;
            input.Transform = null;

            // Perform API call
            Models.DataManipulationModelResponse result = null;

            try
            {
                result = await controller.HttpsApiRestShApiDAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"request\": \"REQUEST TYPE\",\n    \"url\": \"RETURNED DATA URL\",\n    \"success\": \"RETURNS TRUE IF DATA MANIPULATION WAS SUCCESSFULL\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
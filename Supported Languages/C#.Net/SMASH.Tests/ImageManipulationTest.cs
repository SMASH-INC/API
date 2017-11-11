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
    public class ImageManipulationTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IImageManipulation controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().ImageManipulation;
            applyConfiguration();
        }

        /// <summary>
        /// Image manipulation test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiI() 
        {
            // Parameters for the API call
            Models.ImageManipulationInput input = new Models.ImageManipulationInput();
            input.Image = null;
            input.Transform = null;

            // Perform API call
            Models.ImageManipulationModelResponse result = null;

            try
            {
                result = await controller.ImageManipulationAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"request\": \"REQUEST TYPE\",\n    \"url\": \"RETURNED IMAGE URL AND DATA\",\n    \"success\": \"RETURNS TRUE IF IMAGE MANIPULATION WAS SUCCESSFULL\",\n    \"moderated\": \"RETURNS TRUE IF IMAGE CONTAINED GRAPHIC IMAGERY\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
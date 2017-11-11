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
    public class EncryptionTest : ControllerTestBase
    {
        /// <summary>
        /// Controller instance (for all tests)
        /// </summary>
        private static IEncryption controller;

        /// <summary>
        /// Setup test class
        /// </summary>
        [SetUp]
        public static void SetUpClass()
        {
            controller = GetClient().Encryption;
            applyConfiguration();
        }

        /// <summary>
        /// File and Data encryption test case 
        /// </summary>
        [Test]
        public async Task TestHttpsApiRestShApiSE() 
        {
            // Parameters for the API call
            Models.DataAndFileEncryptionInput input = new Models.DataAndFileEncryptionInput();
            input.Data = null;
            input.Method = null;
            input.Bit = 0;

            // Perform API call
            Models.EncryptionModelResponse result = null;

            try
            {
                result = await controller.DataAndFileEncryptionAsync(input);
            }
            catch(APIException) {};

            // Test response code
            Assert.AreEqual(200, httpCallBackHandler.Response.StatusCode,
                    "Status should be 200");

            // Test whether the captured response is as we expected
            Assert.IsNotNull(result, "Result should exist");

            Assert.AreEqual("{\n    \"data\": \"RETURNED ENCRYPTED DATA URL\",\n    \"file\": \"RETURNED ENCRYPTED FILE URL\",\n    \"success\": \"SHOWS TRUE IF ENCRYPTION WAS SUCCESSFULL\",\n    \"public\": \"PUBLIC ENCRYPTION KEY FOR YOUR DATA OR FILES\",\n    \"private\": \"PRIVATE ENCRYPTION KEY FOR YOUR DATA OR FILES\"\n}", 
                    TestHelper.ConvertStreamToString(httpCallBackHandler.Response.RawBody),
                    "Response body should match exactly (string literal match)");
        }

    }
}
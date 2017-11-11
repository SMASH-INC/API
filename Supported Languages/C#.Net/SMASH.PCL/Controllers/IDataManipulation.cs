/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using System.Collections.Generic;
using System.Dynamic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SMASH.SDK.Common;
using SMASH.SDK.Http.Request;
using SMASH.SDK.Http.Response;
using SMASH.SDK.Http.Client;

namespace SMASH.Controllers
{
    public partial interface IDataManipulation
    {
        /// <summary>
        /// Data Manipulation API
        /// </summary>
        /// <param name="Models.HttpsApiRestShApiDInput">Object containing request parameters</param>
        /// <return>Returns the Models.DataManipulationModelResponse response from the API call</return>
        Models.DataManipulationModelResponse HttpsApiRestShApiD(Models.HttpsApiRestShApiDInput input);

        /// <summary>
        /// Data Manipulation API
        /// </summary>
        /// <param name="Models.HttpsApiRestShApiDInput">Object containing request parameters</param>
        /// <return>Returns the Models.DataManipulationModelResponse response from the API call</return>
        Task<Models.DataManipulationModelResponse> HttpsApiRestShApiDAsync(Models.HttpsApiRestShApiDInput input);

    }
} 
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
    public partial interface IWAFAndDDOSProtection
    {
        /// <summary>
        /// WAF and DDOS Configuration
        /// </summary>
        /// <param name="Models.WAFConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFConfigurationModelResponse response from the API call</return>
        Models.WAFConfigurationModelResponse WAFConfiguration(Models.WAFConfigurationInput input);

        /// <summary>
        /// WAF and DDOS Configuration
        /// </summary>
        /// <param name="Models.WAFConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFConfigurationModelResponse response from the API call</return>
        Task<Models.WAFConfigurationModelResponse> WAFConfigurationAsync(Models.WAFConfigurationInput input);

        /// <summary>
        /// WAF and DDOS Creation
        /// </summary>
        /// <param name="Models.WAFCreationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFCreationModelResponse response from the API call</return>
        Models.WAFCreationModelResponse WAFCreation(Models.WAFCreationInput input);

        /// <summary>
        /// WAF and DDOS Creation
        /// </summary>
        /// <param name="Models.WAFCreationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFCreationModelResponse response from the API call</return>
        Task<Models.WAFCreationModelResponse> WAFCreationAsync(Models.WAFCreationInput input);

    }
} 
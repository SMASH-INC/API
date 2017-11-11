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
    public partial interface IAdvancedLogging
    {
        /// <summary>
        /// WAF Log Configuration
        /// </summary>
        /// <param name="Models.LoggingConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingSetupModelResponse response from the API call</return>
        Models.LoggingSetupModelResponse LoggingConfiguration(Models.LoggingConfigurationInput input);

        /// <summary>
        /// WAF Log Configuration
        /// </summary>
        /// <param name="Models.LoggingConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingSetupModelResponse response from the API call</return>
        Task<Models.LoggingSetupModelResponse> LoggingConfigurationAsync(Models.LoggingConfigurationInput input);

        /// <summary>
        /// WAF Log Info
        /// </summary>
        /// <param name="Models.LoggingInfoInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingLogsModelResponse response from the API call</return>
        Models.LoggingLogsModelResponse LoggingInfo(Models.LoggingInfoInput input);

        /// <summary>
        /// WAF Log Info
        /// </summary>
        /// <param name="Models.LoggingInfoInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingLogsModelResponse response from the API call</return>
        Task<Models.LoggingLogsModelResponse> LoggingInfoAsync(Models.LoggingInfoInput input);

    }
} 
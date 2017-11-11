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
    public partial interface IDNS
    {
        /// <summary>
        /// DNS Configuration API
        /// </summary>
        /// <param name="Models.DNSConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.DNSConfigurationModelResponse response from the API call</return>
        Models.DNSConfigurationModelResponse DNSConfiguration(Models.DNSConfigurationInput input);

        /// <summary>
        /// DNS Configuration API
        /// </summary>
        /// <param name="Models.DNSConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.DNSConfigurationModelResponse response from the API call</return>
        Task<Models.DNSConfigurationModelResponse> DNSConfigurationAsync(Models.DNSConfigurationInput input);

        /// <summary>
        /// DNS Creation API
        /// </summary>
        /// <param name="domain">Required parameter: Domain or domain names separated by a comma</param>
        /// <return>Returns the Models.DNSCreationModelResponse response from the API call</return>
        Models.DNSCreationModelResponse DNSCreation(string domain);

        /// <summary>
        /// DNS Creation API
        /// </summary>
        /// <param name="domain">Required parameter: Domain or domain names separated by a comma</param>
        /// <return>Returns the Models.DNSCreationModelResponse response from the API call</return>
        Task<Models.DNSCreationModelResponse> DNSCreationAsync(string domain);

    }
} 
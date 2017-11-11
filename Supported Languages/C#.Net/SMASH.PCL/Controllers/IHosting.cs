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
    public partial interface IHosting
    {
        /// <summary>
        /// Node.JS and Static Web APP Hosting
        /// </summary>
        /// <param name="Models.HostingSetupInput">Object containing request parameters</param>
        /// <return>Returns the Models.HostingModelResponse response from the API call</return>
        Models.HostingModelResponse HostingSetup(Models.HostingSetupInput input);

        /// <summary>
        /// Node.JS and Static Web APP Hosting
        /// </summary>
        /// <param name="Models.HostingSetupInput">Object containing request parameters</param>
        /// <return>Returns the Models.HostingModelResponse response from the API call</return>
        Task<Models.HostingModelResponse> HostingSetupAsync(Models.HostingSetupInput input);

    }
} 
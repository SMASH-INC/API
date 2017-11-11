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
    public partial interface ICDN
    {
        /// <summary>
        /// CDN Push Zone API
        /// </summary>
        /// <param name="Models.CDNPushZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPushModelResponse response from the API call</return>
        Models.CDNPushModelResponse CDNPushZone(Models.CDNPushZoneInput input);

        /// <summary>
        /// CDN Push Zone API
        /// </summary>
        /// <param name="Models.CDNPushZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPushModelResponse response from the API call</return>
        Task<Models.CDNPushModelResponse> CDNPushZoneAsync(Models.CDNPushZoneInput input);

        /// <summary>
        /// CDN Pull Zone API
        /// </summary>
        /// <param name="Models.CDNPullZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPullModelResponse response from the API call</return>
        Models.CDNPullModelResponse CDNPullZone(Models.CDNPullZoneInput input);

        /// <summary>
        /// CDN Pull Zone API
        /// </summary>
        /// <param name="Models.CDNPullZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPullModelResponse response from the API call</return>
        Task<Models.CDNPullModelResponse> CDNPullZoneAsync(Models.CDNPullZoneInput input);

    }
} 
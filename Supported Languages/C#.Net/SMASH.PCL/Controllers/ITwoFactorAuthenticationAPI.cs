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
    public partial interface ITwoFactorAuthenticationAPI
    {
        /// <summary>
        /// Two Factor Authentication Token Reply
        /// </summary>
        /// <param name="Models.M2FATokenResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.TwoFactorAuthenticationTokenModelResponse response from the API call</return>
        Models.TwoFactorAuthenticationTokenModelResponse M2FATokenResponse(Models.M2FATokenResponseInput input);

        /// <summary>
        /// Two Factor Authentication Token Reply
        /// </summary>
        /// <param name="Models.M2FATokenResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.TwoFactorAuthenticationTokenModelResponse response from the API call</return>
        Task<Models.TwoFactorAuthenticationTokenModelResponse> M2FATokenResponseAsync(Models.M2FATokenResponseInput input);

        /// <summary>
        /// Two Factor Authentication API
        /// </summary>
        /// <param name="to">Required parameter: Users UID, Username, Email, Or Cellphone number</param>
        /// <return>Returns the Models.TwoFactorAuthenticationModelResponse response from the API call</return>
        Models.TwoFactorAuthenticationModelResponse TwoFactorAuthentication(string to);

        /// <summary>
        /// Two Factor Authentication API
        /// </summary>
        /// <param name="to">Required parameter: Users UID, Username, Email, Or Cellphone number</param>
        /// <return>Returns the Models.TwoFactorAuthenticationModelResponse response from the API call</return>
        Task<Models.TwoFactorAuthenticationModelResponse> TwoFactorAuthenticationAsync(string to);

    }
} 
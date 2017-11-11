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
    public partial interface ILoginAndRegistration
    {
        /// <summary>
        /// User Registration API
        /// </summary>
        /// <param name="Models.UserRegistrationInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserRegistrationModelResponse response from the API call</return>
        Models.UserRegistrationModelResponse UserRegistration(Models.UserRegistrationInput input, Dictionary<string, object> queryParameters = null);

        /// <summary>
        /// User Registration API
        /// </summary>
        /// <param name="Models.UserRegistrationInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserRegistrationModelResponse response from the API call</return>
        Task<Models.UserRegistrationModelResponse> UserRegistrationAsync(Models.UserRegistrationInput input, Dictionary<string, object> queryParameters = null);

        /// <summary>
        /// User Authentication API
        /// </summary>
        /// <param name="Models.UserAuthenticationInput">Object containing request parameters</param>
        /// <return>Returns the Models.UserAuthenticationModelResponse response from the API call</return>
        Models.UserAuthenticationModelResponse UserAuthentication(Models.UserAuthenticationInput input);

        /// <summary>
        /// User Authentication API
        /// </summary>
        /// <param name="Models.UserAuthenticationInput">Object containing request parameters</param>
        /// <return>Returns the Models.UserAuthenticationModelResponse response from the API call</return>
        Task<Models.UserAuthenticationModelResponse> UserAuthenticationAsync(Models.UserAuthenticationInput input);

    }
} 
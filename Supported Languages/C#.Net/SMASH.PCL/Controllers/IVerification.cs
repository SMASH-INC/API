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
    public partial interface IVerification
    {
        /// <summary>
        /// User Address Verification API
        /// </summary>
        /// <param name="Models.UserAddressVerificationInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyAddressResponse response from the API call</return>
        Models.VerifyAddressResponse UserAddressVerification(Models.UserAddressVerificationInput input);

        /// <summary>
        /// User Address Verification API
        /// </summary>
        /// <param name="Models.UserAddressVerificationInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyAddressResponse response from the API call</return>
        Task<Models.VerifyAddressResponse> UserAddressVerificationAsync(Models.UserAddressVerificationInput input);

        /// <summary>
        /// Users Verification Response API
        /// </summary>
        /// <param name="Models.UserVerificationResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyUserModelResponse response from the API call</return>
        Models.VerifyUserModelResponse UserVerificationResponse(Models.UserVerificationResponseInput input);

        /// <summary>
        /// Users Verification Response API
        /// </summary>
        /// <param name="Models.UserVerificationResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyUserModelResponse response from the API call</return>
        Task<Models.VerifyUserModelResponse> UserVerificationResponseAsync(Models.UserVerificationResponseInput input);

        /// <summary>
        /// User Verification API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, Or Email</param>
        /// <return>Returns the Models.VerifyModelResponse response from the API call</return>
        Models.VerifyModelResponse UserVerification(string user);

        /// <summary>
        /// User Verification API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, Or Email</param>
        /// <return>Returns the Models.VerifyModelResponse response from the API call</return>
        Task<Models.VerifyModelResponse> UserVerificationAsync(string user);

    }
} 
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
    public partial interface IUserManagement
    {
        /// <summary>
        /// Get User Info API
        /// </summary>
        /// <param name="user">Required parameter: Users User ID</param>
        /// <return>Returns the Models.UserInformationModelResponse response from the API call</return>
        Models.UserInformationModelResponse GetUserInfo(string user);

        /// <summary>
        /// Get User Info API
        /// </summary>
        /// <param name="user">Required parameter: Users User ID</param>
        /// <return>Returns the Models.UserInformationModelResponse response from the API call</return>
        Task<Models.UserInformationModelResponse> GetUserInfoAsync(string user);

        /// <summary>
        /// Update User API
        /// </summary>
        /// <param name="Models.UpdateUserInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserUpdateModelResponse response from the API call</return>
        Models.UserUpdateModelResponse UpdateUser(Models.UpdateUserInput input, Dictionary<string, object> queryParameters = null);

        /// <summary>
        /// Update User API
        /// </summary>
        /// <param name="Models.UpdateUserInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserUpdateModelResponse response from the API call</return>
        Task<Models.UserUpdateModelResponse> UpdateUserAsync(Models.UpdateUserInput input, Dictionary<string, object> queryParameters = null);

        /// <summary>
        /// Delete User API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, or Email</param>
        /// <return>Returns the Models.UserDeletionResponseModel response from the API call</return>
        Models.UserDeletionResponseModel DeleteUser(string user);

        /// <summary>
        /// Delete User API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, or Email</param>
        /// <return>Returns the Models.UserDeletionResponseModel response from the API call</return>
        Task<Models.UserDeletionResponseModel> DeleteUserAsync(string user);

    }
} 
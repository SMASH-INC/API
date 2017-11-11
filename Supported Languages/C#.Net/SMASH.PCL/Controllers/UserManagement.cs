/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Converters;
using SMASH.SDK.Common;
using SMASH.SDK.Http.Request;
using SMASH.SDK.Http.Response;
using SMASH.SDK.Http.Client;

namespace SMASH.Controllers
{
    public partial class UserManagement: BaseController, IUserManagement
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static UserManagement instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static UserManagement Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new UserManagement();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// Get User Info API
        /// </summary>
        /// <param name="user">Required parameter: Users User ID</param>
        /// <return>Returns the Models.UserInformationModelResponse response from the API call</return>
        public Models.UserInformationModelResponse GetUserInfo(string user)
        {
            Task<Models.UserInformationModelResponse> t = GetUserInfoAsync(user);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Get User Info API
        /// </summary>
        /// <param name="user">Required parameter: Users User ID</param>
        /// <return>Returns the Models.UserInformationModelResponse response from the API call</return>
        public async Task<Models.UserInformationModelResponse> GetUserInfoAsync(string user)
        {
            //validating required parameters
            if (null == user)
                throw new ArgumentNullException("user", "The parameter \"user\" is a required parameter and cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/u/i");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "user", user }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "SMASH" }
            };

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.Get(_queryUrl,_headers);

            //Custom Authentication to be added for authorization
            AuthUtility.AppendCustomAuthParams(_request);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //return null on 404
            if (_response.StatusCode == 404)
                 return null;

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.UserInformationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Update User API
        /// </summary>
        /// <param name="Models.UpdateUserInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserUpdateModelResponse response from the API call</return>
        public Models.UserUpdateModelResponse UpdateUser(Models.UpdateUserInput input, Dictionary<string, object> queryParameters = null)
        {
            Task<Models.UserUpdateModelResponse> t = UpdateUserAsync(input, queryParameters);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Update User API
        /// </summary>
        /// <param name="Models.UpdateUserInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserUpdateModelResponse response from the API call</return>
        public async Task<Models.UserUpdateModelResponse> UpdateUserAsync(Models.UpdateUserInput input, Dictionary<string, object> queryParameters = null)
        {
            //validating required parameters
            if (null == input.User)
                throw new ArgumentNullException("user", "The property \"User\" in the input object cannot be null.");

            if (null == input.Avatar)
                throw new ArgumentNullException("avatar", "The property \"Avatar\" in the input object cannot be null.");

            if (null == input.CustomInput)
                throw new ArgumentNullException("customInput", "The property \"CustomInput\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/u/u");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "user", input.User },
                { "avatar", input.Avatar },
                { "custom input", input.CustomInput }
            },ArrayDeserializationFormat,ParameterSeparator);

            //append optional parameters to the query
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, queryParameters,ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "SMASH" }
            };

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.Get(_queryUrl,_headers);

            //Custom Authentication to be added for authorization
            AuthUtility.AppendCustomAuthParams(_request);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //return null on 404
            if (_response.StatusCode == 404)
                 return null;

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.UserUpdateModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Delete User API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, or Email</param>
        /// <return>Returns the Models.UserDeletionResponseModel response from the API call</return>
        public Models.UserDeletionResponseModel DeleteUser(string user)
        {
            Task<Models.UserDeletionResponseModel> t = DeleteUserAsync(user);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Delete User API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, or Email</param>
        /// <return>Returns the Models.UserDeletionResponseModel response from the API call</return>
        public async Task<Models.UserDeletionResponseModel> DeleteUserAsync(string user)
        {
            //validating required parameters
            if (null == user)
                throw new ArgumentNullException("user", "The parameter \"user\" is a required parameter and cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/u/d");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "user", user }
            },ArrayDeserializationFormat,ParameterSeparator);


            //validate and preprocess url
            string _queryUrl = APIHelper.CleanUrl(_queryBuilder);

            //append request with appropriate headers and parameters
            var _headers = new Dictionary<string,string>()
            {
                { "user-agent", "SMASH" }
            };

            //prepare the API call request to fetch the response
            HttpRequest _request = ClientInstance.Get(_queryUrl,_headers);

            //Custom Authentication to be added for authorization
            AuthUtility.AppendCustomAuthParams(_request);

            //invoke request and get response
            HttpStringResponse _response = (HttpStringResponse) await ClientInstance.ExecuteAsStringAsync(_request).ConfigureAwait(false);
            HttpContext _context = new HttpContext(_request,_response);

            //return null on 404
            if (_response.StatusCode == 404)
                 return null;

            //handle errors defined at the API level
            base.ValidateResponse(_response, _context);

            try
            {
                return APIHelper.JsonDeserialize<Models.UserDeletionResponseModel>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
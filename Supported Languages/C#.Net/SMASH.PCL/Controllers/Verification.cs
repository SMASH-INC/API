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
    public partial class Verification: BaseController, IVerification
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static Verification instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static Verification Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new Verification();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// User Address Verification API
        /// </summary>
        /// <param name="Models.UserAddressVerificationInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyAddressResponse response from the API call</return>
        public Models.VerifyAddressResponse UserAddressVerification(Models.UserAddressVerificationInput input)
        {
            Task<Models.VerifyAddressResponse> t = UserAddressVerificationAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// User Address Verification API
        /// </summary>
        /// <param name="Models.UserAddressVerificationInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyAddressResponse response from the API call</return>
        public async Task<Models.VerifyAddressResponse> UserAddressVerificationAsync(Models.UserAddressVerificationInput input)
        {
            //validating required parameters
            if (null == input.User)
                throw new ArgumentNullException("user", "The property \"User\" in the input object cannot be null.");

            if (null == input.A)
                throw new ArgumentNullException("a", "The property \"A\" in the input object cannot be null.");

            if (null == input.Sa)
                throw new ArgumentNullException("sa", "The property \"Sa\" in the input object cannot be null.");

            if (null == input.C)
                throw new ArgumentNullException("c", "The property \"C\" in the input object cannot be null.");

            if (null == input.S)
                throw new ArgumentNullException("s", "The property \"S\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/v/a");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "user", input.User },
                { "a", input.A },
                { "sa", input.Sa },
                { "c", input.C },
                { "s", input.S },
                { "z", input.Z },
                { "address", input.Address }
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
                return APIHelper.JsonDeserialize<Models.VerifyAddressResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Users Verification Response API
        /// </summary>
        /// <param name="Models.UserVerificationResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyUserModelResponse response from the API call</return>
        public Models.VerifyUserModelResponse UserVerificationResponse(Models.UserVerificationResponseInput input)
        {
            Task<Models.VerifyUserModelResponse> t = UserVerificationResponseAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Users Verification Response API
        /// </summary>
        /// <param name="Models.UserVerificationResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.VerifyUserModelResponse response from the API call</return>
        public async Task<Models.VerifyUserModelResponse> UserVerificationResponseAsync(Models.UserVerificationResponseInput input)
        {
            //validating required parameters
            if (null == input.User)
                throw new ArgumentNullException("user", "The property \"User\" in the input object cannot be null.");

            if (null == input.Code)
                throw new ArgumentNullException("code", "The property \"Code\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/v/u");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "user", input.User },
                { "code", input.Code }
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
                return APIHelper.JsonDeserialize<Models.VerifyUserModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// User Verification API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, Or Email</param>
        /// <return>Returns the Models.VerifyModelResponse response from the API call</return>
        public Models.VerifyModelResponse UserVerification(string user)
        {
            Task<Models.VerifyModelResponse> t = UserVerificationAsync(user);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// User Verification API
        /// </summary>
        /// <param name="user">Required parameter: Users UID, Username, Or Email</param>
        /// <return>Returns the Models.VerifyModelResponse response from the API call</return>
        public async Task<Models.VerifyModelResponse> UserVerificationAsync(string user)
        {
            //validating required parameters
            if (null == user)
                throw new ArgumentNullException("user", "The parameter \"user\" is a required parameter and cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/v");

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
                return APIHelper.JsonDeserialize<Models.VerifyModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
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
    public partial class TwoFactorAuthenticationAPI: BaseController, ITwoFactorAuthenticationAPI
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static TwoFactorAuthenticationAPI instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static TwoFactorAuthenticationAPI Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new TwoFactorAuthenticationAPI();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// Two Factor Authentication Token Reply
        /// </summary>
        /// <param name="Models.M2FATokenResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.TwoFactorAuthenticationTokenModelResponse response from the API call</return>
        public Models.TwoFactorAuthenticationTokenModelResponse M2FATokenResponse(Models.M2FATokenResponseInput input)
        {
            Task<Models.TwoFactorAuthenticationTokenModelResponse> t = M2FATokenResponseAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Two Factor Authentication Token Reply
        /// </summary>
        /// <param name="Models.M2FATokenResponseInput">Object containing request parameters</param>
        /// <return>Returns the Models.TwoFactorAuthenticationTokenModelResponse response from the API call</return>
        public async Task<Models.TwoFactorAuthenticationTokenModelResponse> M2FATokenResponseAsync(Models.M2FATokenResponseInput input)
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
            _queryBuilder.Append("/2fa/t");

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
                return APIHelper.JsonDeserialize<Models.TwoFactorAuthenticationTokenModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// Two Factor Authentication API
        /// </summary>
        /// <param name="to">Required parameter: Users UID, Username, Email, Or Cellphone number</param>
        /// <return>Returns the Models.TwoFactorAuthenticationModelResponse response from the API call</return>
        public Models.TwoFactorAuthenticationModelResponse TwoFactorAuthentication(string to)
        {
            Task<Models.TwoFactorAuthenticationModelResponse> t = TwoFactorAuthenticationAsync(to);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Two Factor Authentication API
        /// </summary>
        /// <param name="to">Required parameter: Users UID, Username, Email, Or Cellphone number</param>
        /// <return>Returns the Models.TwoFactorAuthenticationModelResponse response from the API call</return>
        public async Task<Models.TwoFactorAuthenticationModelResponse> TwoFactorAuthenticationAsync(string to)
        {
            //validating required parameters
            if (null == to)
                throw new ArgumentNullException("to", "The parameter \"to\" is a required parameter and cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/2fa");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "to", to }
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
                return APIHelper.JsonDeserialize<Models.TwoFactorAuthenticationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
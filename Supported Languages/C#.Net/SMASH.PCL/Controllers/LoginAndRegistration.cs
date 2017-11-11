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
    public partial class LoginAndRegistration: BaseController, ILoginAndRegistration
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static LoginAndRegistration instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static LoginAndRegistration Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new LoginAndRegistration();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// User Registration API
        /// </summary>
        /// <param name="Models.UserRegistrationInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserRegistrationModelResponse response from the API call</return>
        public Models.UserRegistrationModelResponse UserRegistration(Models.UserRegistrationInput input, Dictionary<string, object> queryParameters = null)
        {
            Task<Models.UserRegistrationModelResponse> t = UserRegistrationAsync(input, queryParameters);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// User Registration API
        /// </summary>
        /// <param name="Models.UserRegistrationInput">Object containing request parameters</param>
        /// <param name="queryParameters">Additional optional query parameters are supported by this endpoint</param>
        /// <return>Returns the Models.UserRegistrationModelResponse response from the API call</return>
        public async Task<Models.UserRegistrationModelResponse> UserRegistrationAsync(Models.UserRegistrationInput input, Dictionary<string, object> queryParameters = null)
        {
            //validating required parameters
            if (null == input.Email)
                throw new ArgumentNullException("email", "The property \"Email\" in the input object cannot be null.");

            if (null == input.User)
                throw new ArgumentNullException("user", "The property \"User\" in the input object cannot be null.");

            if (null == input.Password)
                throw new ArgumentNullException("password", "The property \"Password\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/a/u/r");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "email", input.Email },
                { "user", input.User },
                { "password", input.Password },
                { "name", input.Name },
                { "phone", input.Phone },
                { "countrycode", input.Countrycode },
                { "address", input.Address }
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
                return APIHelper.JsonDeserialize<Models.UserRegistrationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// User Authentication API
        /// </summary>
        /// <param name="Models.UserAuthenticationInput">Object containing request parameters</param>
        /// <return>Returns the Models.UserAuthenticationModelResponse response from the API call</return>
        public Models.UserAuthenticationModelResponse UserAuthentication(Models.UserAuthenticationInput input)
        {
            Task<Models.UserAuthenticationModelResponse> t = UserAuthenticationAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// User Authentication API
        /// </summary>
        /// <param name="Models.UserAuthenticationInput">Object containing request parameters</param>
        /// <return>Returns the Models.UserAuthenticationModelResponse response from the API call</return>
        public async Task<Models.UserAuthenticationModelResponse> UserAuthenticationAsync(Models.UserAuthenticationInput input)
        {
            //validating required parameters
            if (null == input.User)
                throw new ArgumentNullException("user", "The property \"User\" in the input object cannot be null.");

            if (null == input.Password)
                throw new ArgumentNullException("password", "The property \"Password\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/a/u/l");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "user", input.User },
                { "password", input.Password }
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
                return APIHelper.JsonDeserialize<Models.UserAuthenticationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
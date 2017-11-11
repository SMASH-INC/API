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
    public partial class WAFAndDDOSProtection: BaseController, IWAFAndDDOSProtection
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static WAFAndDDOSProtection instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static WAFAndDDOSProtection Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new WAFAndDDOSProtection();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// WAF and DDOS Configuration
        /// </summary>
        /// <param name="Models.WAFConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFConfigurationModelResponse response from the API call</return>
        public Models.WAFConfigurationModelResponse WAFConfiguration(Models.WAFConfigurationInput input)
        {
            Task<Models.WAFConfigurationModelResponse> t = WAFConfigurationAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// WAF and DDOS Configuration
        /// </summary>
        /// <param name="Models.WAFConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFConfigurationModelResponse response from the API call</return>
        public async Task<Models.WAFConfigurationModelResponse> WAFConfigurationAsync(Models.WAFConfigurationInput input)
        {
            //validating required parameters
            if (null == input.Name)
                throw new ArgumentNullException("name", "The property \"Name\" in the input object cannot be null.");

            if (null == input.Rule)
                throw new ArgumentNullException("rule", "The property \"Rule\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/w/c");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "name", input.Name },
                { "rule", input.Rule }
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
                return APIHelper.JsonDeserialize<Models.WAFConfigurationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// WAF and DDOS Creation
        /// </summary>
        /// <param name="Models.WAFCreationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFCreationModelResponse response from the API call</return>
        public Models.WAFCreationModelResponse WAFCreation(Models.WAFCreationInput input)
        {
            Task<Models.WAFCreationModelResponse> t = WAFCreationAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// WAF and DDOS Creation
        /// </summary>
        /// <param name="Models.WAFCreationInput">Object containing request parameters</param>
        /// <return>Returns the Models.WAFCreationModelResponse response from the API call</return>
        public async Task<Models.WAFCreationModelResponse> WAFCreationAsync(Models.WAFCreationInput input)
        {
            //validating required parameters
            if (null == input.Origin)
                throw new ArgumentNullException("origin", "The property \"Origin\" in the input object cannot be null.");

            if (null == input.Cname)
                throw new ArgumentNullException("cname", "The property \"Cname\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/w");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "origin", input.Origin },
                { "cname", input.Cname }
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
                return APIHelper.JsonDeserialize<Models.WAFCreationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
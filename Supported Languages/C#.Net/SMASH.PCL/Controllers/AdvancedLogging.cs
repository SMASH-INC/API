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
    public partial class AdvancedLogging: BaseController, IAdvancedLogging
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static AdvancedLogging instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static AdvancedLogging Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new AdvancedLogging();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// WAF Log Configuration
        /// </summary>
        /// <param name="Models.LoggingConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingSetupModelResponse response from the API call</return>
        public Models.LoggingSetupModelResponse LoggingConfiguration(Models.LoggingConfigurationInput input)
        {
            Task<Models.LoggingSetupModelResponse> t = LoggingConfigurationAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// WAF Log Configuration
        /// </summary>
        /// <param name="Models.LoggingConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingSetupModelResponse response from the API call</return>
        public async Task<Models.LoggingSetupModelResponse> LoggingConfigurationAsync(Models.LoggingConfigurationInput input)
        {
            //validating required parameters
            if (null == input.Name)
                throw new ArgumentNullException("name", "The property \"Name\" in the input object cannot be null.");

            if (null == input.Origin)
                throw new ArgumentNullException("origin", "The property \"Origin\" in the input object cannot be null.");

            if (null == input.Activate)
                throw new ArgumentNullException("activate", "The property \"Activate\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/l");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "name", input.Name },
                { "origin", input.Origin },
                { "activate", input.Activate }
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
                return APIHelper.JsonDeserialize<Models.LoggingSetupModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// WAF Log Info
        /// </summary>
        /// <param name="Models.LoggingInfoInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingLogsModelResponse response from the API call</return>
        public Models.LoggingLogsModelResponse LoggingInfo(Models.LoggingInfoInput input)
        {
            Task<Models.LoggingLogsModelResponse> t = LoggingInfoAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// WAF Log Info
        /// </summary>
        /// <param name="Models.LoggingInfoInput">Object containing request parameters</param>
        /// <return>Returns the Models.LoggingLogsModelResponse response from the API call</return>
        public async Task<Models.LoggingLogsModelResponse> LoggingInfoAsync(Models.LoggingInfoInput input)
        {
            //validating required parameters
            if (null == input.Name)
                throw new ArgumentNullException("name", "The property \"Name\" in the input object cannot be null.");

            if (null == input.Origin)
                throw new ArgumentNullException("origin", "The property \"Origin\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/l/i");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "name", input.Name },
                { "origin", input.Origin },
                { "time", input.Time }
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
                return APIHelper.JsonDeserialize<Models.LoggingLogsModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
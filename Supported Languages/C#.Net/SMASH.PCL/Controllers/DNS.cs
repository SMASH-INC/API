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
    public partial class DNS: BaseController, IDNS
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static DNS instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static DNS Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new DNS();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// DNS Configuration API
        /// </summary>
        /// <param name="Models.DNSConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.DNSConfigurationModelResponse response from the API call</return>
        public Models.DNSConfigurationModelResponse DNSConfiguration(Models.DNSConfigurationInput input)
        {
            Task<Models.DNSConfigurationModelResponse> t = DNSConfigurationAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// DNS Configuration API
        /// </summary>
        /// <param name="Models.DNSConfigurationInput">Object containing request parameters</param>
        /// <return>Returns the Models.DNSConfigurationModelResponse response from the API call</return>
        public async Task<Models.DNSConfigurationModelResponse> DNSConfigurationAsync(Models.DNSConfigurationInput input)
        {
            //validating required parameters
            if (null == input.Domain)
                throw new ArgumentNullException("domain", "The property \"Domain\" in the input object cannot be null.");

            if (null == input.Records)
                throw new ArgumentNullException("records", "The property \"Records\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/d/c");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "domain", input.Domain },
                { "records", input.Records }
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
                return APIHelper.JsonDeserialize<Models.DNSConfigurationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// DNS Creation API
        /// </summary>
        /// <param name="domain">Required parameter: Domain or domain names separated by a comma</param>
        /// <return>Returns the Models.DNSCreationModelResponse response from the API call</return>
        public Models.DNSCreationModelResponse DNSCreation(string domain)
        {
            Task<Models.DNSCreationModelResponse> t = DNSCreationAsync(domain);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// DNS Creation API
        /// </summary>
        /// <param name="domain">Required parameter: Domain or domain names separated by a comma</param>
        /// <return>Returns the Models.DNSCreationModelResponse response from the API call</return>
        public async Task<Models.DNSCreationModelResponse> DNSCreationAsync(string domain)
        {
            //validating required parameters
            if (null == domain)
                throw new ArgumentNullException("domain", "The parameter \"domain\" is a required parameter and cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/d/a");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "domain", domain }
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
                return APIHelper.JsonDeserialize<Models.DNSCreationModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
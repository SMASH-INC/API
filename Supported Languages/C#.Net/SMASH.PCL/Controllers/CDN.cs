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
    public partial class CDN: BaseController, ICDN
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static CDN instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static CDN Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new CDN();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// CDN Push Zone API
        /// </summary>
        /// <param name="Models.CDNPushZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPushModelResponse response from the API call</return>
        public Models.CDNPushModelResponse CDNPushZone(Models.CDNPushZoneInput input)
        {
            Task<Models.CDNPushModelResponse> t = CDNPushZoneAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// CDN Push Zone API
        /// </summary>
        /// <param name="Models.CDNPushZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPushModelResponse response from the API call</return>
        public async Task<Models.CDNPushModelResponse> CDNPushZoneAsync(Models.CDNPushZoneInput input)
        {
            //validating required parameters
            if (null == input.Cname)
                throw new ArgumentNullException("cname", "The property \"Cname\" in the input object cannot be null.");

            if (null == input.File)
                throw new ArgumentNullException("file", "The property \"File\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/c/push");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "cname", input.Cname },
                { "file", input.File }
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
                return APIHelper.JsonDeserialize<Models.CDNPushModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

        /// <summary>
        /// CDN Pull Zone API
        /// </summary>
        /// <param name="Models.CDNPullZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPullModelResponse response from the API call</return>
        public Models.CDNPullModelResponse CDNPullZone(Models.CDNPullZoneInput input)
        {
            Task<Models.CDNPullModelResponse> t = CDNPullZoneAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// CDN Pull Zone API
        /// </summary>
        /// <param name="Models.CDNPullZoneInput">Object containing request parameters</param>
        /// <return>Returns the Models.CDNPullModelResponse response from the API call</return>
        public async Task<Models.CDNPullModelResponse> CDNPullZoneAsync(Models.CDNPullZoneInput input)
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
            _queryBuilder.Append("/s/c/pull");

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
                return APIHelper.JsonDeserialize<Models.CDNPullModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
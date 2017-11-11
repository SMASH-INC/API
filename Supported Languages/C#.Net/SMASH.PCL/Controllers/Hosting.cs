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
    public partial class Hosting: BaseController, IHosting
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static Hosting instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static Hosting Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new Hosting();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// Node.JS and Static Web APP Hosting
        /// </summary>
        /// <param name="Models.HostingSetupInput">Object containing request parameters</param>
        /// <return>Returns the Models.HostingModelResponse response from the API call</return>
        public Models.HostingModelResponse HostingSetup(Models.HostingSetupInput input)
        {
            Task<Models.HostingModelResponse> t = HostingSetupAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Node.JS and Static Web APP Hosting
        /// </summary>
        /// <param name="Models.HostingSetupInput">Object containing request parameters</param>
        /// <return>Returns the Models.HostingModelResponse response from the API call</return>
        public async Task<Models.HostingModelResponse> HostingSetupAsync(Models.HostingSetupInput input)
        {
            //validating required parameters
            if (null == input.App)
                throw new ArgumentNullException("app", "The property \"App\" in the input object cannot be null.");

            if (null == input.Domain)
                throw new ArgumentNullException("domain", "The property \"Domain\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/h");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "app", input.App },
                { "domain", input.Domain }
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
                return APIHelper.JsonDeserialize<Models.HostingModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
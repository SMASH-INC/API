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
    public partial class Encryption: BaseController, IEncryption
    {
        #region Singleton Pattern

        //private static variables for the singleton pattern
        private static object syncObject = new object();
        private static Encryption instance = null;

        /// <summary>
        /// Singleton pattern implementation
        /// </summary>
        internal static Encryption Instance
        {
            get
            {
                lock (syncObject)
                {
                    if (null == instance)
                    {
                        instance = new Encryption();
                    }
                }
                return instance;
            }
        }

        #endregion Singleton Pattern

        /// <summary>
        /// Data and File Encryption API
        /// </summary>
        /// <param name="Models.DataAndFileEncryptionInput">Object containing request parameters</param>
        /// <return>Returns the Models.EncryptionModelResponse response from the API call</return>
        public Models.EncryptionModelResponse DataAndFileEncryption(Models.DataAndFileEncryptionInput input)
        {
            Task<Models.EncryptionModelResponse> t = DataAndFileEncryptionAsync(input);
            APIHelper.RunTaskSynchronously(t);
            return t.Result;
        }

        /// <summary>
        /// Data and File Encryption API
        /// </summary>
        /// <param name="Models.DataAndFileEncryptionInput">Object containing request parameters</param>
        /// <return>Returns the Models.EncryptionModelResponse response from the API call</return>
        public async Task<Models.EncryptionModelResponse> DataAndFileEncryptionAsync(Models.DataAndFileEncryptionInput input)
        {
            //validating required parameters
            if (null == input.Data)
                throw new ArgumentNullException("data", "The property \"Data\" in the input object cannot be null.");

            if (null == input.Method)
                throw new ArgumentNullException("method", "The property \"Method\" in the input object cannot be null.");

            //the base uri for api requests
            string _baseUri = Configuration.GetBaseURI(Configuration.Servers.PATH);

            //prepare query string for API call
            StringBuilder _queryBuilder = new StringBuilder(_baseUri);
            _queryBuilder.Append("/s/e");

            //process optional query parameters
            APIHelper.AppendUrlWithQueryParameters(_queryBuilder, new Dictionary<string, object>()
            {
                { "data", input.Data },
                { "method", input.Method },
                { "bit", input.Bit }
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
                return APIHelper.JsonDeserialize<Models.EncryptionModelResponse>(_response.Body);
            }
            catch (Exception _ex)
            {
                throw new APIException("Failed to parse the response: " + _ex.Message, _context);
            }
        }

    }
} 
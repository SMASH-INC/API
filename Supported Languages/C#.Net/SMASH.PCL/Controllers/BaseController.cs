/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using SMASH.SDK.Common;
using SMASH.SDK.Http.Client;
using SMASH.SDK.Http.Response;

namespace SMASH.Controllers
{
    public partial class BaseController
    {
        #region shared http client instance
        private static object syncObject = new object();
        private static IHttpClient clientInstance = null;

        public static IHttpClient ClientInstance
        {
            get
            {
                lock(syncObject)
                {
                    if(null == clientInstance)
                    {
                        clientInstance = new HTTPClient()
;
                        clientInstance.setTimeout(TimeSpan.FromMilliseconds(5000));
                    }
                    return clientInstance;
                }
            }
            set
            {
                lock (syncObject)
                {
                    if (value is IHttpClient)
                    {
                        clientInstance = value;
                    }
                }
            }
        }
        #endregion shared http client instance

        internal ArrayDeserialization ArrayDeserializationFormat = ArrayDeserialization.Indexed;
        internal static char ParameterSeparator = '&';

        /// <summary>
        /// Validates the response against HTTP errors defined at the API level
        /// </summary>
        /// <param name="_response">The response recieved</param>
        /// <param name="_context">Context of the request and the recieved response</param>
        internal void ValidateResponse(HttpResponse _response, HttpContext _context)
        {
            if (_response.StatusCode == 400)
                throw new APIException(@"Bad Request", _context);

            if (_response.StatusCode == 401)
                throw new APIException(@"Incorrect Credentials", _context);

            if (_response.StatusCode == 403)
                throw new APIException(@"Forbidden", _context);

            if (_response.StatusCode == 406)
                throw new APIException(@"Not Acceptable Input", _context);

            if (_response.StatusCode == 409)
                throw new APIException(@"Data Conflict", _context);

            if (_response.StatusCode == 413)
                throw new APIException(@"Payload Too Large", _context);

            if (_response.StatusCode == 415)
                throw new APIException(@"Un-Supported Content Type", _context);

            if (_response.StatusCode == 451)
                throw new APIException(@"Un-Available For Legal Reasons", _context);

            if (_response.StatusCode == 500)
                throw new APIException(@"Internal API Error", _context);

            if (_response.StatusCode == 501)
                throw new APIException(@"Not Implemented", _context);

            if (_response.StatusCode == 503)
                throw new APIException(@"API Unavailable", _context);

            if (_response.StatusCode == 504)
                throw new APIException(@"Request Timeout", _context);

            if (_response.StatusCode == 511)
                throw new APIException(@"Authentication Required", _context);

            if ((_response.StatusCode < 200) || (_response.StatusCode > 208)) //[200,208] = HTTP OK
                throw new APIException(@"HTTP Response Not OK", _context);
        }
    }
} 
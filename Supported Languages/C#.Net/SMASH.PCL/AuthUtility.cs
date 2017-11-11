/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SMASH.Http.Request;
namespace SMASH
{
    internal partial class AuthUtility
    {
        /// <summary>
        /// Appends the necessary Custom Authentication credentials for making this authorized call
        /// </summary>
        /// <param name="request">The out going request to access the resource</param>        
        internal static void AppendCustomAuthParams(HttpRequest request)
        {
            // TODO: Add your custom authentication here
            // The following properties are available to use
			//     Configuration.Uid
			//     Configuration.Secret
			//     Configuration.Key
            // 
            // ie. Add a header through:
            //     request.header("Key", "Value");
        }
    }
}

/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using System.Collections.Generic;
using System.Dynamic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SMASH.SDK.Common;
using SMASH.SDK.Http.Request;
using SMASH.SDK.Http.Response;
using SMASH.SDK.Http.Client;

namespace SMASH.Controllers
{
    public partial interface ICodeObfuscation
    {
        /// <summary>
        /// Javascript and Node.JS Obfuscation and Anti-Tampering API
        /// </summary>
        /// <param name="app">Required parameter: GIT URL or ZIP package containing your APP</param>
        /// <return>Returns the Models.CodeProtectionModelResponse response from the API call</return>
        Models.CodeProtectionModelResponse ObfuscationAndAntiTampering(string app);

        /// <summary>
        /// Javascript and Node.JS Obfuscation and Anti-Tampering API
        /// </summary>
        /// <param name="app">Required parameter: GIT URL or ZIP package containing your APP</param>
        /// <return>Returns the Models.CodeProtectionModelResponse response from the API call</return>
        Task<Models.CodeProtectionModelResponse> ObfuscationAndAntiTamperingAsync(string app);

    }
} 
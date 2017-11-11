/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using SMASH.Controllers;
using SMASH.SDK.Http.Client;
using SMASH.SDK.Common;

namespace SMASH
{
    public partial class SMASHClient: ISMASHClient
    {

        /// <summary>
        /// Singleton access to AdvancedLogging controller
        /// </summary>
        public IAdvancedLogging AdvancedLogging
        {
            get
            {
                return SMASH.Controllers.AdvancedLogging.Instance;
            }
        }

        /// <summary>
        /// Singleton access to WAFAndDDOSProtection controller
        /// </summary>
        public IWAFAndDDOSProtection WAFAndDDOSProtection
        {
            get
            {
                return SMASH.Controllers.WAFAndDDOSProtection.Instance;
            }
        }

        /// <summary>
        /// Singleton access to Encryption controller
        /// </summary>
        public IEncryption Encryption
        {
            get
            {
                return SMASH.Controllers.Encryption.Instance;
            }
        }

        /// <summary>
        /// Singleton access to CDN controller
        /// </summary>
        public ICDN CDN
        {
            get
            {
                return SMASH.Controllers.CDN.Instance;
            }
        }

        /// <summary>
        /// Singleton access to DNS controller
        /// </summary>
        public IDNS DNS
        {
            get
            {
                return SMASH.Controllers.DNS.Instance;
            }
        }

        /// <summary>
        /// Singleton access to CodeObfuscation controller
        /// </summary>
        public ICodeObfuscation CodeObfuscation
        {
            get
            {
                return SMASH.Controllers.CodeObfuscation.Instance;
            }
        }

        /// <summary>
        /// Singleton access to Hosting controller
        /// </summary>
        public IHosting Hosting
        {
            get
            {
                return SMASH.Controllers.Hosting.Instance;
            }
        }

        /// <summary>
        /// Singleton access to DataManipulation controller
        /// </summary>
        public IDataManipulation DataManipulation
        {
            get
            {
                return SMASH.Controllers.DataManipulation.Instance;
            }
        }

        /// <summary>
        /// Singleton access to ImageManipulation controller
        /// </summary>
        public IImageManipulation ImageManipulation
        {
            get
            {
                return SMASH.Controllers.ImageManipulation.Instance;
            }
        }

        /// <summary>
        /// Singleton access to Verification controller
        /// </summary>
        public IVerification Verification
        {
            get
            {
                return SMASH.Controllers.Verification.Instance;
            }
        }

        /// <summary>
        /// Singleton access to TwoFactorAuthenticationAPI controller
        /// </summary>
        public ITwoFactorAuthenticationAPI TwoFactorAuthenticationAPI
        {
            get
            {
                return SMASH.Controllers.TwoFactorAuthenticationAPI.Instance;
            }
        }

        /// <summary>
        /// Singleton access to UserManagement controller
        /// </summary>
        public IUserManagement UserManagement
        {
            get
            {
                return SMASH.Controllers.UserManagement.Instance;
            }
        }

        /// <summary>
        /// Singleton access to LoginAndRegistration controller
        /// </summary>
        public ILoginAndRegistration LoginAndRegistration
        {
            get
            {
                return SMASH.Controllers.LoginAndRegistration.Instance;
            }
        }
        /// <summary>
        /// The shared http client to use for all API calls
        /// </summary>
        public IHttpClient SharedHttpClient
        {
            get
            {
                return BaseController.ClientInstance;
            }
            set
            {
                BaseController.ClientInstance = value;
            }        
        }
        #region Constructors
        /// <summary>
        /// Default constructor
        /// </summary>
        public SMASHClient() { }

        /// <summary>
        /// Client initialization constructor
        /// </summary>
        public SMASHClient(string uid = "UID", string secret = "SECRET", string key = "KEY")
        {
            Configuration.Uid = uid;
            Configuration.Secret = secret;
            Configuration.Key = key;
        }
        #endregion
    }
}
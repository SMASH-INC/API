/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using SMASH.Controllers;

namespace SMASH
{
    public partial interface ISMASHClient
    {

        /// <summary>
        /// Singleton access to AdvancedLogging controller
        /// </summary>
        IAdvancedLogging AdvancedLogging { get;}

        /// <summary>
        /// Singleton access to WAFAndDDOSProtection controller
        /// </summary>
        IWAFAndDDOSProtection WAFAndDDOSProtection { get;}

        /// <summary>
        /// Singleton access to Encryption controller
        /// </summary>
        IEncryption Encryption { get;}

        /// <summary>
        /// Singleton access to CDN controller
        /// </summary>
        ICDN CDN { get;}

        /// <summary>
        /// Singleton access to DNS controller
        /// </summary>
        IDNS DNS { get;}

        /// <summary>
        /// Singleton access to CodeObfuscation controller
        /// </summary>
        ICodeObfuscation CodeObfuscation { get;}

        /// <summary>
        /// Singleton access to Hosting controller
        /// </summary>
        IHosting Hosting { get;}

        /// <summary>
        /// Singleton access to DataManipulation controller
        /// </summary>
        IDataManipulation DataManipulation { get;}

        /// <summary>
        /// Singleton access to ImageManipulation controller
        /// </summary>
        IImageManipulation ImageManipulation { get;}

        /// <summary>
        /// Singleton access to Verification controller
        /// </summary>
        IVerification Verification { get;}

        /// <summary>
        /// Singleton access to TwoFactorAuthenticationAPI controller
        /// </summary>
        ITwoFactorAuthenticationAPI TwoFactorAuthenticationAPI { get;}

        /// <summary>
        /// Singleton access to UserManagement controller
        /// </summary>
        IUserManagement UserManagement { get;}

        /// <summary>
        /// Singleton access to LoginAndRegistration controller
        /// </summary>
        ILoginAndRegistration LoginAndRegistration { get;}

    }
}
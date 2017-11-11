/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH;

import SMASH.controllers.*;
import SMASH.http.client.HttpClient;

public class SMASHClient {
    /**
     * Singleton access to AdvancedLogging controller
     * @return	Returns the AdvancedLogging instance 
     */
    public AdvancedLogging getAdvancedLogging() {
        return AdvancedLogging.getInstance();
    }

    /**
     * Singleton access to WAFAndDDOSProtection controller
     * @return	Returns the WAFAndDDOSProtection instance 
     */
    public WAFAndDDOSProtection getWAFAndDDOSProtection() {
        return WAFAndDDOSProtection.getInstance();
    }

    /**
     * Singleton access to Encryption controller
     * @return	Returns the Encryption instance 
     */
    public Encryption getEncryption() {
        return Encryption.getInstance();
    }

    /**
     * Singleton access to CDN controller
     * @return	Returns the CDN instance 
     */
    public CDN getCDN() {
        return CDN.getInstance();
    }

    /**
     * Singleton access to DNS controller
     * @return	Returns the DNS instance 
     */
    public DNS getDNS() {
        return DNS.getInstance();
    }

    /**
     * Singleton access to CodeObfuscation controller
     * @return	Returns the CodeObfuscation instance 
     */
    public CodeObfuscation getCodeObfuscation() {
        return CodeObfuscation.getInstance();
    }

    /**
     * Singleton access to Hosting controller
     * @return	Returns the Hosting instance 
     */
    public Hosting getHosting() {
        return Hosting.getInstance();
    }

    /**
     * Singleton access to DataManipulation controller
     * @return	Returns the DataManipulation instance 
     */
    public DataManipulation getDataManipulation() {
        return DataManipulation.getInstance();
    }

    /**
     * Singleton access to ImageManipulation controller
     * @return	Returns the ImageManipulation instance 
     */
    public ImageManipulation getImageManipulation() {
        return ImageManipulation.getInstance();
    }

    /**
     * Singleton access to Verification controller
     * @return	Returns the Verification instance 
     */
    public Verification getVerification() {
        return Verification.getInstance();
    }

    /**
     * Singleton access to TwoFactorAuthenticationAPI controller
     * @return	Returns the TwoFactorAuthenticationAPI instance 
     */
    public TwoFactorAuthenticationAPI getTwoFactorAuthenticationAPI() {
        return TwoFactorAuthenticationAPI.getInstance();
    }

    /**
     * Singleton access to UserManagement controller
     * @return	Returns the UserManagement instance 
     */
    public UserManagement getUserManagement() {
        return UserManagement.getInstance();
    }

    /**
     * Singleton access to LoginAndRegistration controller
     * @return	Returns the LoginAndRegistration instance 
     */
    public LoginAndRegistration getLoginAndRegistration() {
        return LoginAndRegistration.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public SMASHClient() {
        Configuration.uid = "UID";
        Configuration.secret = "SECRET";
        Configuration.key = "KEY";
    }

    /**
     * Client initialization constructor 
     */     
    public SMASHClient(String uid, String secret, String key) {
        this();
        if(uid != null) Configuration.uid = uid;
        if(secret != null) Configuration.secret = secret;
        if(key != null) Configuration.key = key;
    }
}
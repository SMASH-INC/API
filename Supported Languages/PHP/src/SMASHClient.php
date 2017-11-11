<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib;

use SMASHLib\Controllers;

/**
 * SMASH client class
 */
class SMASHClient
{
    /**
     * Constructor with authentication and configuration parameters
     */
    public function __construct(
        $uid = null,
        $secret = null,
        $key = null
    ) {
        Configuration::$uid = $uid ? $uid : Configuration::$uid;
        Configuration::$secret = $secret ? $secret : Configuration::$secret;
        Configuration::$key = $key ? $key : Configuration::$key;
    }
    /**
     * Singleton access to AdvancedLogging controller
     * @return Controllers\AdvancedLogging The *Singleton* instance
     */
    public function getAdvancedLogging()
    {
        return Controllers\AdvancedLogging::getInstance();
    }
    /**
     * Singleton access to WAFAndDDOSProtection controller
     * @return Controllers\WAFAndDDOSProtection The *Singleton* instance
     */
    public function getWAFAndDDOSProtection()
    {
        return Controllers\WAFAndDDOSProtection::getInstance();
    }
    /**
     * Singleton access to Encryption controller
     * @return Controllers\Encryption The *Singleton* instance
     */
    public function getEncryption()
    {
        return Controllers\Encryption::getInstance();
    }
    /**
     * Singleton access to CDN controller
     * @return Controllers\CDN The *Singleton* instance
     */
    public function getCDN()
    {
        return Controllers\CDN::getInstance();
    }
    /**
     * Singleton access to DNS controller
     * @return Controllers\DNS The *Singleton* instance
     */
    public function getDNS()
    {
        return Controllers\DNS::getInstance();
    }
    /**
     * Singleton access to CodeObfuscation controller
     * @return Controllers\CodeObfuscation The *Singleton* instance
     */
    public function getCodeObfuscation()
    {
        return Controllers\CodeObfuscation::getInstance();
    }
    /**
     * Singleton access to Hosting controller
     * @return Controllers\Hosting The *Singleton* instance
     */
    public function getHosting()
    {
        return Controllers\Hosting::getInstance();
    }
    /**
     * Singleton access to DataManipulation controller
     * @return Controllers\DataManipulation The *Singleton* instance
     */
    public function getDataManipulation()
    {
        return Controllers\DataManipulation::getInstance();
    }
    /**
     * Singleton access to ImageManipulation controller
     * @return Controllers\ImageManipulation The *Singleton* instance
     */
    public function getImageManipulation()
    {
        return Controllers\ImageManipulation::getInstance();
    }
    /**
     * Singleton access to Verification controller
     * @return Controllers\Verification The *Singleton* instance
     */
    public function getVerification()
    {
        return Controllers\Verification::getInstance();
    }
    /**
     * Singleton access to TwoFactorAuthenticationAPI controller
     * @return Controllers\TwoFactorAuthenticationAPI The *Singleton* instance
     */
    public function getTwoFactorAuthenticationAPI()
    {
        return Controllers\TwoFactorAuthenticationAPI::getInstance();
    }
    /**
     * Singleton access to UserManagement controller
     * @return Controllers\UserManagement The *Singleton* instance
     */
    public function getUserManagement()
    {
        return Controllers\UserManagement::getInstance();
    }
    /**
     * Singleton access to LoginAndRegistration controller
     * @return Controllers\LoginAndRegistration The *Singleton* instance
     */
    public function getLoginAndRegistration()
    {
        return Controllers\LoginAndRegistration::getInstance();
    }
}

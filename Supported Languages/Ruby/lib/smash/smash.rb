# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  #  smash client class.
  class SMASH
    # Singleton access to advanced_logging controller.
    # @return [AdvancedLogging] Returns the controller instance.
    def advanced_logging
      AdvancedLogging.instance
    end

    # Singleton access to waf_and_ddos_protection controller.
    # @return [WAFAndDDOSProtection] Returns the controller instance.
    def waf_and_ddos_protection
      WAFAndDDOSProtection.instance
    end

    # Singleton access to encryption controller.
    # @return [Encryption] Returns the controller instance.
    def encryption
      Encryption.instance
    end

    # Singleton access to cdn controller.
    # @return [CDN] Returns the controller instance.
    def cdn
      CDN.instance
    end

    # Singleton access to dns controller.
    # @return [DNS] Returns the controller instance.
    def dns
      DNS.instance
    end

    # Singleton access to code_obfuscation controller.
    # @return [CodeObfuscation] Returns the controller instance.
    def code_obfuscation
      CodeObfuscation.instance
    end

    # Singleton access to hosting controller.
    # @return [Hosting] Returns the controller instance.
    def hosting
      Hosting.instance
    end

    # Singleton access to data_manipulation controller.
    # @return [DataManipulation] Returns the controller instance.
    def data_manipulation
      DataManipulation.instance
    end

    # Singleton access to image_manipulation controller.
    # @return [ImageManipulation] Returns the controller instance.
    def image_manipulation
      ImageManipulation.instance
    end

    # Singleton access to verification controller.
    # @return [Verification] Returns the controller instance.
    def verification
      Verification.instance
    end

    # Singleton access to two_factor_authentication_api controller.
    # @return [TwoFactorAuthenticationAPI] Returns the controller instance.
    def two_factor_authentication_api
      TwoFactorAuthenticationAPI.instance
    end

    # Singleton access to user_management controller.
    # @return [UserManagement] Returns the controller instance.
    def user_management
      UserManagement.instance
    end

    # Singleton access to login_and_registration controller.
    # @return [LoginAndRegistration] Returns the controller instance.
    def login_and_registration
      LoginAndRegistration.instance
    end

    # Returns the configuration class for easy access.
    # @return [Configuration] Returns the actual configuration class.
    def config
      Configuration
    end

    # Initializer with authentication and configuration parameters.
    def initialize(uid: 'UID', secret: 'SECRET', key: 'KEY')
      Configuration.uid = uid if
        uid
      Configuration.secret = secret if
        secret
      Configuration.key = key if
        key
    end
  end
end

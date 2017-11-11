# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # LoginAndRegistration
  class LoginAndRegistration < BaseController
    @instance = LoginAndRegistration.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # User Registration API
    # @param [String] email Required parameter: Users Email
    # @param [String] user Required parameter: Users Username
    # @param [String] password Required parameter: Users Password
    # @param [String] name Optional parameter: Users Name
    # @param [Integer] phone Optional parameter: Users Cellphone Number
    # @param [Integer] countrycode Optional parameter: Users Country Code (US =
    # 1)
    # @param [String] address Optional parameter: Users Address
    # @param [Hash] _query_parameters Additional optional query parameters are
    # supported by this endpoint.
    # @return UserRegistrationModelResponse response from the API call
    def user_registration(options = {},
                          _query_parameters = nil)
      begin
        @logger.info("user_registration called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for user_registration.")
        validate_parameters(
          'email' => options['email'],
          'user' => options['user'],
          'password' => options['password']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for user_registration.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/a/u/r'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'email' => options['email'],
          'user' => options['user'],
          'password' => options['password'],
          'name' => options['name'],
          'phone' => options['phone'],
          'countrycode' => options['countrycode'],
          'address' => options['address'],
          array_serialization: Configuration.array_serialization
        )
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          _query_parameters,
          array_serialization: Configuration.array_serialization
        )
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          _query_parameters,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for user_registration.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'user_registration')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for user_registration.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for user_registration. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for user_registration.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        UserRegistrationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # User Authentication API
    # @param [String] user Required parameter: Users Username or Email
    # @param [String] password Required parameter: Users Password
    # @return UserAuthenticationModelResponse response from the API call
    def user_authentication(options = {})
      begin
        @logger.info("user_authentication called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for user_authentication.")
        validate_parameters(
          'user' => options['user'],
          'password' => options['password']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for user_authentication.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/a/u/l'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => options['user'],
          'password' => options['password'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for user_authentication.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'user_authentication')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for user_authentication.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for user_authentication. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for user_authentication.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        UserAuthenticationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

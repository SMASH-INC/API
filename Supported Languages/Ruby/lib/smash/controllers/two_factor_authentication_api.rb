# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # TwoFactorAuthenticationAPI
  class TwoFactorAuthenticationAPI < BaseController
    @instance = TwoFactorAuthenticationAPI.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Two Factor Authentication Token Reply
    # @param [String] user Required parameter: Users UID, Username or Email
    # @param [String] code Required parameter: Response From User Containing 2FA
    # Code
    # @return TwoFactorAuthenticationTokenModelResponse response from the API call
    def 2_fa_token_response(options = {})
      begin
        @logger.info("2_fa_token_response called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for 2_fa_token_response.")
        validate_parameters(
          'user' => options['user'],
          'code' => options['code']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for 2_fa_token_response.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/2fa/t'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => options['user'],
          'code' => options['code'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for 2_fa_token_response.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: '2_fa_token_response')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for 2_fa_token_response.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for 2_fa_token_response. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for 2_fa_token_response.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        TwoFactorAuthenticationTokenModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # Two Factor Authentication API
    # @param [String] to Required parameter: Users UID, Username, Email, Or
    # Cellphone number
    # @return TwoFactorAuthenticationModelResponse response from the API call
    def two_factor_authentication(to)
      begin
        @logger.info("two_factor_authentication called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for two_factor_authentication.")
        validate_parameters(
          'to' => to
        )
        # Prepare query url.
        @logger.info("Preparing query URL for two_factor_authentication.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/2fa'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'to' => to,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for two_factor_authentication.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'two_factor_authentication')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for two_factor_authentication.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for two_factor_authentication. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for two_factor_authentication.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        TwoFactorAuthenticationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

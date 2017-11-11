# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # Verification
  class Verification < BaseController
    @instance = Verification.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # User Address Verification API
    # @param [String] user Required parameter: Users UID, Username, or Email
    # @param [String] a Required parameter: Address Line One
    # @param [String] sa Required parameter: Address Line Two
    # @param [String] c Required parameter: Address City
    # @param [String] s Required parameter: Address State or Province
    # @param [Integer] z Required parameter: Address Zipcode
    # @param [String] address Optional parameter: Address as a one line input
    # separated by commas
    # @return VerifyAddressResponse response from the API call
    def user_address_verification(options = {})
      begin
        @logger.info("user_address_verification called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for user_address_verification.")
        validate_parameters(
          'user' => options['user'],
          'a' => options['a'],
          'sa' => options['sa'],
          'c' => options['c'],
          's' => options['s'],
          'z' => options['z']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for user_address_verification.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/v/a'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => options['user'],
          'a' => options['a'],
          'sa' => options['sa'],
          'c' => options['c'],
          's' => options['s'],
          'z' => options['z'],
          'address' => options['address'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for user_address_verification.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'user_address_verification')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for user_address_verification.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for user_address_verification. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for user_address_verification.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        VerifyAddressResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # Users Verification Response API
    # @param [String] user Required parameter: Users UID, Username, Or Email
    # @param [String] code Required parameter: Verification code entered by the
    # user
    # @return VerifyUserModelResponse response from the API call
    def user_verification_response(options = {})
      begin
        @logger.info("user_verification_response called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for user_verification_response.")
        validate_parameters(
          'user' => options['user'],
          'code' => options['code']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for user_verification_response.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/v/u'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => options['user'],
          'code' => options['code'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for user_verification_response.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'user_verification_response')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for user_verification_response.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for user_verification_response. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for user_verification_response.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        VerifyUserModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # User Verification API
    # @param [String] user Required parameter: Users UID, Username, Or Email
    # @return VerifyModelResponse response from the API call
    def user_verification(user)
      begin
        @logger.info("user_verification called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for user_verification.")
        validate_parameters(
          'user' => user
        )
        # Prepare query url.
        @logger.info("Preparing query URL for user_verification.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/v'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => user,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for user_verification.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'user_verification')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for user_verification.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for user_verification. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for user_verification.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        VerifyModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

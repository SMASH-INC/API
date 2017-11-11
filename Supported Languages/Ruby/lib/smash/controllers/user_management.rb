# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserManagement
  class UserManagement < BaseController
    @instance = UserManagement.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Get User Info API
    # @param [String] user Required parameter: Users User ID
    # @return UserInformationModelResponse response from the API call
    def get_user_info(user)
      begin
        @logger.info("get_user_info called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for get_user_info.")
        validate_parameters(
          'user' => user
        )
        # Prepare query url.
        @logger.info("Preparing query URL for get_user_info.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/u/i'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => user,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for get_user_info.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'get_user_info')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for get_user_info.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for get_user_info. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for get_user_info.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        UserInformationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # Update User API
    # @param [String] user Required parameter: Users UID, Username, Or Email
    # @param [String] avatar Required parameter: Avatar Image URL
    # @param [String] custom_input Required parameter: Custom input variable for
    # users profile
    # @param [Hash] _query_parameters Additional optional query parameters are
    # supported by this endpoint.
    # @return UserUpdateModelResponse response from the API call
    def update_user(options = {},
                    _query_parameters = nil)
      begin
        @logger.info("update_user called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for update_user.")
        validate_parameters(
          'user' => options['user'],
          'avatar' => options['avatar'],
          'custom_input' => options['custom_input']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for update_user.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/u/u'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => options['user'],
          'avatar' => options['avatar'],
          'custom input' => options['custom_input'],
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
        @logger.info('Preparing and executing HttpRequest for update_user.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'update_user')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for update_user.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for update_user. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for update_user.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        UserUpdateModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # Delete User API
    # @param [String] user Required parameter: Users UID, Username, or Email
    # @return UserDeletionResponseModel response from the API call
    def delete_user(user)
      begin
        @logger.info("delete_user called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for delete_user.")
        validate_parameters(
          'user' => user
        )
        # Prepare query url.
        @logger.info("Preparing query URL for delete_user.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/u/d'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'user' => user,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for delete_user.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'delete_user')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for delete_user.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for delete_user. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for delete_user.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        UserDeletionResponseModel.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # AdvancedLogging
  class AdvancedLogging < BaseController
    @instance = AdvancedLogging.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # WAF Log Configuration
    # @param [String] name Required parameter: Name of the WAF zone
    # @param [String] origin Required parameter: IP Address of the Web
    # Application you wish to configure logging on
    # @param [String] activate Required parameter: Activate or Disable
    # @return LoggingSetupModelResponse response from the API call
    def logging_configuration(options = {})
      begin
        @logger.info("logging_configuration called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for logging_configuration.")
        validate_parameters(
          'name' => options['name'],
          'origin' => options['origin'],
          'activate' => options['activate']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for logging_configuration.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/l'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'name' => options['name'],
          'origin' => options['origin'],
          'activate' => options['activate'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for logging_configuration.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'logging_configuration')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for logging_configuration.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for logging_configuration. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for logging_configuration.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        LoggingSetupModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # WAF Log Info
    # @param [String] name Required parameter: Name of your WAF zone
    # @param [String] origin Required parameter: IP Address of the Web
    # Application
    # @param [String] time Optional parameter: Specific times or dates to lookup
    # separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year
    # Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
    # @return LoggingLogsModelResponse response from the API call
    def logging_info(options = {})
      begin
        @logger.info("logging_info called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for logging_info.")
        validate_parameters(
          'name' => options['name'],
          'origin' => options['origin']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for logging_info.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/l/i'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'name' => options['name'],
          'origin' => options['origin'],
          'time' => options['time'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for logging_info.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'logging_info')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for logging_info.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for logging_info. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for logging_info.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        LoggingLogsModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

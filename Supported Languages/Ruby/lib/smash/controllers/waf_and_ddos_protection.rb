# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # WAFAndDDOSProtection
  class WAFAndDDOSProtection < BaseController
    @instance = WAFAndDDOSProtection.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # WAF and DDOS Configuration
    # @param [String] name Required parameter: Name of your WAF zone
    # @param [String] rule Required parameter: Rule or rules to add or update
    # separated by a comma
    # @return WAFConfigurationModelResponse response from the API call
    def waf_configuration(options = {})
      begin
        @logger.info("waf_configuration called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for waf_configuration.")
        validate_parameters(
          'name' => options['name'],
          'rule' => options['rule']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for waf_configuration.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/w/c'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'name' => options['name'],
          'rule' => options['rule'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for waf_configuration.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'waf_configuration')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for waf_configuration.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for waf_configuration. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for waf_configuration.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        WAFConfigurationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # WAF and DDOS Creation
    # @param [String] origin Required parameter: IP of the Web server you wish
    # to protect
    # @param [String] cname Required parameter: Domain or domain names separated
    # by a comma you wish to allow CNAME access
    # @return WAFCreationModelResponse response from the API call
    def waf_creation(options = {})
      begin
        @logger.info("waf_creation called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for waf_creation.")
        validate_parameters(
          'origin' => options['origin'],
          'cname' => options['cname']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for waf_creation.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/w'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'origin' => options['origin'],
          'cname' => options['cname'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for waf_creation.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'waf_creation')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for waf_creation.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for waf_creation. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for waf_creation.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        WAFCreationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

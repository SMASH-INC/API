# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # DNS
  class DNS < BaseController
    @instance = DNS.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # DNS Configuration API
    # @param [String] domain Required parameter: Domain or domain names
    # separated by a comma
    # @param [String] records Required parameter: Records to append to domain
    # separated by a comma
    # (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
    # @return DNSConfigurationModelResponse response from the API call
    def dns_configuration(options = {})
      begin
        @logger.info("dns_configuration called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for dns_configuration.")
        validate_parameters(
          'domain' => options['domain'],
          'records' => options['records']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for dns_configuration.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/d/c'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'domain' => options['domain'],
          'records' => options['records'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for dns_configuration.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'dns_configuration')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for dns_configuration.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for dns_configuration. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for dns_configuration.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        DNSConfigurationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # DNS Creation API
    # @param [String] domain Required parameter: Domain or domain names
    # separated by a comma
    # @return DNSCreationModelResponse response from the API call
    def dns_creation(domain)
      begin
        @logger.info("dns_creation called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for dns_creation.")
        validate_parameters(
          'domain' => domain
        )
        # Prepare query url.
        @logger.info("Preparing query URL for dns_creation.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/d/a'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'domain' => domain,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for dns_creation.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'dns_creation')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for dns_creation.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for dns_creation. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for dns_creation.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        DNSCreationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

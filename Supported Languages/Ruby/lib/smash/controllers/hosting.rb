# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # Hosting
  class Hosting < BaseController
    @instance = Hosting.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Node.JS and Static Web APP Hosting
    # @param [String] app Required parameter: GIT URL or ZIP package containing
    # your APP
    # @param [String] domain Required parameter: Domain or domain names
    # separated by a comma
    # @return HostingModelResponse response from the API call
    def hosting_setup(options = {})
      begin
        @logger.info("hosting_setup called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for hosting_setup.")
        validate_parameters(
          'app' => options['app'],
          'domain' => options['domain']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for hosting_setup.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/h'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'app' => options['app'],
          'domain' => options['domain'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for hosting_setup.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'hosting_setup')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for hosting_setup.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for hosting_setup. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for hosting_setup.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        HostingModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

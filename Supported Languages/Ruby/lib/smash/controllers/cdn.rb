# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # CDN
  class CDN < BaseController
    @instance = CDN.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # CDN Push Zone API
    # @param [String] cname Required parameter: Domain or domain names separated
    # by a comma you wish to allow CNAME access
    # @param [String] file Required parameter: GIT URL, file URL, or direct
    # upload of file
    # @return CDNPushModelResponse response from the API call
    def cdn_push_zone(options = {})
      begin
        @logger.info("cdn_push_zone called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for cdn_push_zone.")
        validate_parameters(
          'cname' => options['cname'],
          'file' => options['file']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for cdn_push_zone.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/c/push'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'cname' => options['cname'],
          'file' => options['file'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for cdn_push_zone.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'cdn_push_zone')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for cdn_push_zone.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for cdn_push_zone. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for cdn_push_zone.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        CDNPushModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end

    # CDN Pull Zone API
    # @param [String] origin Required parameter: Domain or domain names
    # separated by a comma
    # @param [String] cname Required parameter: Domain or domain names separated
    # by a comma you wish to allow CNAME access
    # @return CDNPullModelResponse response from the API call
    def cdn_pull_zone(options = {})
      begin
        @logger.info("cdn_pull_zone called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for cdn_pull_zone.")
        validate_parameters(
          'origin' => options['origin'],
          'cname' => options['cname']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for cdn_pull_zone.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/c/pull'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'origin' => options['origin'],
          'cname' => options['cname'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for cdn_pull_zone.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'cdn_pull_zone')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for cdn_pull_zone.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for cdn_pull_zone. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for cdn_pull_zone.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        CDNPullModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

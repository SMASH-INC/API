# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # DataManipulation
  class DataManipulation < BaseController
    @instance = DataManipulation.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Data Manipulation API
    # @param [String] data Required parameter: Data URL, data as a query string,
    # or direct upload
    # @param [String] transform Required parameter: Transformations to perform
    # @return DataManipulationModelResponse response from the API call
    def https_api_rest_sh_api_d(options = {})
      begin
        @logger.info("https_api_rest_sh_api_d called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for https_api_rest_sh_api_d.")
        validate_parameters(
          'data' => options['data'],
          'transform' => options['transform']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for https_api_rest_sh_api_d.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/d'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'data' => options['data'],
          'transform' => options['transform'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for https_api_rest_sh_api_d.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'https_api_rest_sh_api_d')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for https_api_rest_sh_api_d.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for https_api_rest_sh_api_d. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for https_api_rest_sh_api_d.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        DataManipulationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

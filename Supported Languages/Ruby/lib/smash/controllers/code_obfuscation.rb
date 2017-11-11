# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # CodeObfuscation
  class CodeObfuscation < BaseController
    @instance = CodeObfuscation.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Javascript and Node.JS Obfuscation and Anti-Tampering API
    # @param [String] app Required parameter: GIT URL or ZIP package containing
    # your APP
    # @return CodeProtectionModelResponse response from the API call
    def obfuscation_and_anti_tampering(app)
      begin
        @logger.info("obfuscation_and_anti_tampering called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for obfuscation_and_anti_tampering.")
        validate_parameters(
          'app' => app
        )
        # Prepare query url.
        @logger.info("Preparing query URL for obfuscation_and_anti_tampering.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/o'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'app' => app,
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for obfuscation_and_anti_tampering.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'obfuscation_and_anti_tampering')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for obfuscation_and_anti_tampering.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for obfuscation_and_anti_tampering. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for obfuscation_and_anti_tampering.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        CodeProtectionModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

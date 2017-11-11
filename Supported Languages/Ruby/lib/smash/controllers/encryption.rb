# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # Encryption
  class Encryption < BaseController
    @instance = Encryption.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Data and File Encryption API
    # @param [String] data Required parameter: GIT URL, file URL, direct upload
    # of file, or data as a query string
    # @param [String] method Required parameter: Single or multiple encryption
    # types to apply to data or files separated by a comma (DES, RSA, BLOWFISH,
    # TWOFISH, AES, IDEA, PGP)
    # @param [Integer] bit Required parameter: Encryption key size (4096)
    # @return EncryptionModelResponse response from the API call
    def data_and_file_encryption(options = {})
      begin
        @logger.info("data_and_file_encryption called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for data_and_file_encryption.")
        validate_parameters(
          'data' => options['data'],
          'method' => options['method'],
          'bit' => options['bit']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for data_and_file_encryption.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/s/e'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'data' => options['data'],
          'method' => options['method'],
          'bit' => options['bit'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for data_and_file_encryption.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'data_and_file_encryption')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for data_and_file_encryption.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for data_and_file_encryption. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for data_and_file_encryption.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        EncryptionModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # ImageManipulation
  class ImageManipulation < BaseController
    @instance = ImageManipulation.new

    class << self
      attr_accessor :instance
    end

    def instance
      self.class.instance
    end

    # Image Manipulation API
    # @param [String] image Required parameter: Image URL or direct upload
    # @param [String] transform Required parameter: Transformations to perform
    # @return ImageManipulationModelResponse response from the API call
    def image_manipulation(options = {})
      begin
        @logger.info("image_manipulation called.")
        # Validate required parameters.
        @logger.info("Validating required parameters for image_manipulation.")
        validate_parameters(
          'image' => options['image'],
          'transform' => options['transform']
        )
        # Prepare query url.
        @logger.info("Preparing query URL for image_manipulation.")
        _query_builder = Configuration.get_base_uri(
          Configuration::Server::PATH
        )
        _query_builder << '/i'
        _query_builder = APIHelper.append_url_with_query_parameters(
          _query_builder,
          'image' => options['image'],
          'transform' => options['transform'],
          array_serialization: Configuration.array_serialization
        )
        _query_url = APIHelper.clean_url _query_builder
  
        # Prepare and execute HttpRequest.
        @logger.info('Preparing and executing HttpRequest for image_manipulation.')
        _request = @http_client.get(
          _query_url
        )
        CustomAuth.apply(_request)
        _context = execute_request(_request, name: 'image_manipulation')
  
        # Validate response against endpoint and global error codes.
        @logger.info("Validating response for image_manipulation.")
        return nil if _context.response.status_code == 404
          @logger.info("Status code 404 received for image_manipulation. Returning nil.")
        validate_response(_context)
  
        # Return appropriate response type.
        @logger.info("Returning response for image_manipulation.")
        decoded = APIHelper.json_deserialize(_context.response.raw_body)
        ImageManipulationModelResponse.from_hash(decoded)

      rescue Exception => e
        @logger.error(e)
        raise e
      end
    end
  end
end

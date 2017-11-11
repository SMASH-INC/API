# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # Utility class for custom authorization.
  class CustomAuth
    # Add custom authentication to the request.
    # @param [HttpRequest] The HttpRequest object to which authentication will
    # be added.
    def self.apply(http_request)
      # TODO: Add your custom authentication here
      # The following properties are available to use
      #     Configuration.uid
      #     Configuration.secret
      #     Configuration.key
      #
      # Example: 
      # Add a header through: http_request.headers['key'] = 'value'
    end
  end
end

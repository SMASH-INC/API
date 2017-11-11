# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class HostingTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.hosting
  end

  # Web hosting testing case
  def test_https_api_rest_sh_api_s_h()
    # Parameters for the API call
    options = {}
    options['app'] = nil
    options['domain'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.hosting_setup(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "request": "REQUEST TYPE",\r\n  "url": "RETURNED APP HOSTING URL",\r\n  "success": "RETURNS TRUE IF APP WAS SUCCESSFULLY DEPLOYED",\r\n  "id": "TRANSACTION ID"\r\n}', @response_catcher.response.raw_body)
  end

end

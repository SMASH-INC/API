# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class ImageManipulationTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.image_manipulation
  end

  # Image manipulation test case
  def test_https_api_rest_sh_api_i()
    # Parameters for the API call
    options = {}
    options['image'] = nil
    options['transform'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.image_manipulation(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "request": "REQUEST TYPE",\n    "url": "RETURNED IMAGE URL AND DATA",\n    "success": "RETURNS TRUE IF IMAGE MANIPULATION WAS SUCCESSFULL",\n    "moderated": "RETURNS TRUE IF IMAGE CONTAINED GRAPHIC IMAGERY",\n    "id": "TRANSACTION ID"\n}', @response_catcher.response.raw_body)
  end

end

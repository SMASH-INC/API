# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class DataManipulationTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.data_manipulation
  end

  # Data Manipulation test case
  def test_https_api_rest_sh_api_d()
    # Parameters for the API call
    options = {}
    options['data'] = nil
    options['transform'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.https_api_rest_sh_api_d(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "request": "REQUEST TYPE",\n    "url": "RETURNED DATA URL",\n    "success": "RETURNS TRUE IF DATA MANIPULATION WAS SUCCESSFULL",\n    "id": "TRANSACTION ID"\n}', @response_catcher.response.raw_body)
  end

end

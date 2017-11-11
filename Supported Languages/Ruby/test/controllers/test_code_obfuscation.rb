# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class CodeObfuscationTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.code_obfuscation
  end

  # Code obfuscation test case
  def test_https_api_rest_sh_api_s_o()
    # Parameters for the API call
    app = nil

    # Perform the API call through the SDK function
    result = self.class.controller.obfuscation_and_anti_tampering(app)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "success": "RETURNS TRUE IF APP WAS SUCCESSFULLY OBFUSCTATED AND PROTECTED",\r\n  "app": "OBFUSCATED APP URL"\r\n}', @response_catcher.response.raw_body)
  end

end

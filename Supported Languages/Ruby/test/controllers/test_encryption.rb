# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class EncryptionTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.encryption
  end

  # File and Data encryption test case
  def test_https_api_rest_sh_api_s_e()
    # Parameters for the API call
    options = {}
    options['data'] = nil
    options['method'] = nil
    options['bit'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.data_and_file_encryption(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "data": "RETURNED ENCRYPTED DATA URL",\n    "file": "RETURNED ENCRYPTED FILE URL",\n    "success": "SHOWS TRUE IF ENCRYPTION WAS SUCCESSFULL",\n    "public": "PUBLIC ENCRYPTION KEY FOR YOUR DATA OR FILES",\n    "private": "PRIVATE ENCRYPTION KEY FOR YOUR DATA OR FILES"\n}', @response_catcher.response.raw_body)
  end

end

# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class AdvancedLoggingTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.advanced_logging
  end

  # Advanced logging configuration test case
  def test_https_api_rest_sh_api_s_l()
    # Parameters for the API call
    options = {}
    options['name'] = nil
    options['origin'] = nil
    options['activate'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.logging_configuration(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "success": "RETURNS TRUE IF ADVANCED LOGGING IS ACTIVATED"\r\n}', @response_catcher.response.raw_body)
  end

  # Advanced logging info test case
  def test_https_api_rest_sh_api_s_l_i()
    # Parameters for the API call
    options = {}
    options['name'] = nil
    options['origin'] = nil
    options['time'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.logging_info(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "log": {\n        "01010101245901": {\n            "data": {\n                "result": "INFO",\n                "content": "LOG: CONTENT AND ACTIONS PERFORMED",\n                "id": "FUNCTION ID"\n            }\n        },\n        "01010101245902": {\n            "data": {\n                "result": "ERROR",\n                "content": "LOG: ERROR CONTENT AND ACTIONS PERFORMED",\n                "id": "FUNCTION ID"\n            }\n        }\n    }\n}', @response_catcher.response.raw_body)
  end

end

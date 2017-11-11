# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class WAFAndDDOSProtectionTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.waf_and_ddos_protection
  end

  # WAF and DDOS configuration test case
  def test_waf_configuration()
    # Parameters for the API call
    options = {}
    options['name'] = nil
    options['rule'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.waf_configuration(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "success": "SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY",\r\n  "rule": "RULES APPLIED TO WAF"\r\n}', @response_catcher.response.raw_body)
  end

  # WAF and DDOS test case
  def test_waf_creation()
    # Parameters for the API call
    options = {}
    options['origin'] = nil
    options['cname'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.waf_creation(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "success": "SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}', @response_catcher.response.raw_body)
  end

end

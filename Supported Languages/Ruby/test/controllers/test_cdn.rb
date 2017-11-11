# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class CDNTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.cdn
  end

  # CDN push zone creation and configuration test case
  def test_https_api_rest_sh_api_s_c_push()
    # Parameters for the API call
    options = {}
    options['cname'] = nil
    options['file'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.cdn_push_zone(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "success": "SHOWS TRUE WHEN PUSH ZONE IS DEPLOYED SUCCESSFULLY",\r\n  "upload": "LIST OF FILES UPLOADED TO YOUR PUSH ZONE",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}', @response_catcher.response.raw_body)
  end

  # CDN pull zone creation and configuration test case
  def test_https_api_rest_sh_api_s_c_pull()
    # Parameters for the API call
    options = {}
    options['origin'] = nil
    options['cname'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.cdn_pull_zone(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "success": "SHOWS TRUE WHEN PULL ZONE IS DEPLOYED SUCCESSFULLY",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}', @response_catcher.response.raw_body)
  end

end

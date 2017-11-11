# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class VerificationTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.verification
  end

  # User address verification test case
  def test_https_api_rest_sh_api_v_a()
    # Parameters for the API call
    options = {}
    options['user'] = nil
    options['a'] = nil
    options['sa'] = nil
    options['c'] = nil
    options['s'] = nil
    options['z'] = nil
    options['address'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.user_address_verification(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "request": "REQUEST TYPE",\r\n  "active": "RETURNS TRUE, IF ADDRESS IS ACTIVE AND IF USER IS CURRENTLY THERE",\r\n  "id": "TRANSACTION ID"\r\n}', @response_catcher.response.raw_body)
  end

  # User verification response test case
  def test_https_api_rest_sh_api_v_u()
    # Parameters for the API call
    options = {}
    options['user'] = nil
    options['code'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.user_verification_response(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "request": "REQUEST TYPE",\r\n  "correct": "RETURNS IF 2FA TOKEN IS CORRECT",\r\n  "id": "TRANSACTION ID"\r\n}', @response_catcher.response.raw_body)
  end

  # User verification test case
  def test_https_api_rest_sh_api_v()
    # Parameters for the API call
    user = nil

    # Perform the API call through the SDK function
    result = self.class.controller.user_verification(user)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test headers
    expected_headers = {}
    expected_headers['accept-ranges'] = nil
    expected_headers['connection'] = nil
    expected_headers['content-length'] = nil
    expected_headers['content-type'] = nil
    expected_headers['date'] = nil
    expected_headers['server'] = nil
    expected_headers['vary'] = nil
    expected_headers['via'] = nil
    expected_headers['x-cache'] = nil
    expected_headers['x-cache-hits'] = nil
    expected_headers['x-served-by'] = nil
    expected_headers['x-timer'] = nil
    expected_headers['access-control-allow-origin'] = nil
    expected_headers['cache-control'] = nil
    expected_headers['etag'] = nil
    expected_headers['function-execution-id'] = nil
    expected_headers['strict-transport-security'] = nil
    expected_headers['x-cloud-trace-context'] = nil
    expected_headers['x-content-type-options'] = nil
    expected_headers['x-dns-prefetch-control'] = nil
    expected_headers['x-download-options'] = nil
    expected_headers['x-frame-options'] = nil
    expected_headers['x-powered-by'] = nil
    expected_headers['x-xss-protection'] = nil

    assert(TestHelper.match_headers(expected_headers, @response_catcher.response.headers))

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "request": "REQUEST TYPE",\n    "to": "USER BEING VERIFIED",\n    "verified": "RETURNS TRUE OR FALSE",\n    "id": "TRANSACTION ID"\n}', @response_catcher.response.raw_body)
  end

end

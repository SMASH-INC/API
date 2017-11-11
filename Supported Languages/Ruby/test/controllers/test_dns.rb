# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class DNSTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.dns
  end

  # DNS configuration test case
  def test_https_api_rest_sh_api_s_d_c()
    # Parameters for the API call
    options = {}
    options['domain'] = nil
    options['records'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.dns_configuration(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "success": "SHOWS TRUE IF RECORDS WERE SUCCESSFULLY SET",\n    "domain": "DOMAIN",\n    "records": "RECORDS SET TO DOMAIN"\n}', @response_catcher.response.raw_body)
  end

  # DNS addition test case
  def test_https_api_rest_sh_api_s_d_a()
    # Parameters for the API call
    domain = nil

    # Perform the API call through the SDK function
    result = self.class.controller.dns_creation(domain)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "domain": "LIST OF DOMAINS ADDED",\n    "nameservers": {\n        "ns1": "NAME SERVER ONE TO POINT YOUR DOMAIN AT",\n        "ns2": "NAME SERVER TWO TO POINT YOUR DOMAIN AT",\n        "ns3": "NAME SERVER THREE TO POINT YOUR DOMAIN AT",\n        "ns4": "NAME SERVER FOUR TO POINT YOUR DOMAIN AT"\n    }\n}', @response_catcher.response.raw_body)
  end

end

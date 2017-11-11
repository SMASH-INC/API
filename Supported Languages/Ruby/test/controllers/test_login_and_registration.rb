# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class LoginAndRegistrationTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.login_and_registration
  end

  # User registration test case
  def test_https_api_rest_sh_api_a_u_r()
    # Parameters for the API call
    options = {}
    options['email'] = nil
    options['user'] = nil
    options['password'] = nil
    options['name'] = nil
    options['phone'] = nil
    options['countrycode'] = nil
    options['address'] = nil

    # dictionary for optional query parameters
    optional_query_parameters = {}

    # Perform the API call through the SDK function
    result = self.class.controller.user_registration(options, optional_query_parameters)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "request": "REQUEST TYPE",\n    "active": "RETURNS TRUE, IF USER WAS SUCCESSFULLY REGISTERED",\n    "id": "TRANSACTION ID",\n    "info": {\n        "uid": "USERS ID",\n        "apiuid": "API SIDE USER ID",\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n        "email": "USERS EMAIL",\n        "address": "USERS ADDRESS",\n        "phone": "USERS CELL PHONE NUMBER"\n    }\n}', @response_catcher.response.raw_body)
  end

  # User authentication test case
  def test_https_api_rest_sh_api_a_u_l()
    # Parameters for the API call
    options = {}
    options['user'] = nil
    options['password'] = nil

    # Perform the API call through the SDK function
    result = self.class.controller.user_authentication(options)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "request": "REQUEST TYPE",\n    "uid": "Users UID",\n    "valid": "RETURNS TRUE IF USER LOGIN DETAILS ARE VALID",\n    "id": "TRANSACTION ID",\n    "info": {\n    	"uid": "USERS ID",\n    	"apiuid": "API SIDE USER ID",\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n        "avatar": "USER AVATAR URL",\n        "email": "USERS EMAIL",\n        "address": "USERS ADDRESS",\n        "phone": "USERS CELL PHONE NUMBER",\n        "lastlogin": "USERS LAST LOGIN",\n        "ip": "USERS IP",\n        "2fa": "RETURNS TRUE IF 2FA IS ENABLED",\n        "iplock": "RETURNS TRUE IF IP LOCK IS ENABLED"\n    }\n}', @response_catcher.response.raw_body)
  end

end

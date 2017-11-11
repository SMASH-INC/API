# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require_relative 'controller_test_base'

class UserManagementTests < ControllerTestBase
  # Called only once for the class before any test has executed
  def self.startup
    self.controller = @@api_client.user_management
  end

  # User information test case
  def test_https_api_rest_sh_api_u_i()
    # Parameters for the API call
    user = nil

    # Perform the API call through the SDK function
    result = self.class.controller.get_user_info(user)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\n    "request": "REQUEST TYPE",\n    "uid": "Users UID",\n    "apiuid": "API SIDE USER ID",\n    "verified": "RETURNS TRUE IF USER IS VERIFIED",\n    "id": "TRANSACTION ID",\n    "info": {\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n        "avatar": "USER AVATAR URL",\n        "email": "USERS EMAIL",\n        "address": "USERS ADDRESS IN ONE LINE SEPERATED BY COMMAS",\n        "address1": "USERS ADDRESS LINE ONE",\n        "address2": "USERS ADDRESS LINE TWO",\n        "city": "USERS ADDRESS CITY",\n        "state": "USERS ADDRESS STATE",\n        "zipcode": "USERS ADDRESS ZIPCODE",\n        "phone": "USERS CELL PHONE NUMBER",\n        "lastlogin": "USERS LAST LOGIN",\n        "ip": "USERS IP",\n        "2fa": "RETURNS TRUE IF 2FA IS ENABLED",\n        "iplock": "RETURNS TRUE IF IP LOCK IS ENABLED"\n    }\n}', @response_catcher.response.raw_body)
  end

  # User update test case
  def test_https_api_rest_sh_api_u_u()
    # Parameters for the API call
    options = {}
    options['user'] = nil
    options['avatar'] = nil
    options['custom_input'] = nil

    # dictionary for optional query parameters
    optional_query_parameters = {}

    # Perform the API call through the SDK function
    result = self.class.controller.update_user(options, optional_query_parameters)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "request": "REQUEST TYPE",\r\n  "updated": "RETURNS TRUE, IF USERS PROFILE WAS SUCCESSFULLY UPDATED",\r\n  "id": "TRANSACTION ID",\r\n  "info": {\r\n    "uid": "USERS ID",\r\n    "apiuid": "API SIDE USER ID",\r\n    "avatar": "INPUTTED AVATAR URL",\r\n    "custom-input": "CUSTOM INPUTTED PROFILE DATA"\r\n  }\r\n}', @response_catcher.response.raw_body)
  end

  # User deletion test case
  def test_https_api_rest_sh_api_u_d()
    # Parameters for the API call
    user = nil

    # Perform the API call through the SDK function
    result = self.class.controller.delete_user(user)

    # Test response code
    assert_equal(@response_catcher.response.status_code, 200)

    # Test whether the captured response is as we expected
    assert_not_nil(result)
    assert_equal('{\r\n  "request": "REQUEST TYPE",\r\n  "deleted": "RETURNS TRUE, IF USERS ACCOUNT WAS SUCCESSFULLY DELETED",\r\n  "id": "TRANSACTION ID"\r\n}', @response_catcher.response.raw_body)
  end

end

# -*- coding: utf-8 -*-

"""
    tests.controllers.test_login_and_registration

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class LoginAndRegistrationTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(LoginAndRegistrationTests, cls).setUpClass()
        cls.controller = cls.api_client.login_and_registration

    # User registration test case
    def test_https_api_rest_sh_api_a_u_r(self):
        # Parameters for the API call
        options = {}
        options['email'] = None
        options['user'] = None
        options['password'] = None
        options['name'] = None
        options['phone'] = None
        options['countrycode'] = None
        options['address'] = None

        # dictionary for optional query parameters
        optional_query_parameters = {}

        # Perform the API call through the SDK function
        result = self.controller.user_registration(options, optional_query_parameters)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "request": "REQUEST TYPE",\n    "active": "RETURNS TRUE, IF USER WAS SUCCESSFULLY REGISTERED",\n    "id": "TRANSACTION ID",\n    "info": {\n        "uid": "USERS ID",\n        "apiuid": "API SIDE USER ID",\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n        "email": "USERS EMAIL",\n        "address": "USERS ADDRESS",\n        "phone": "USERS CELL PHONE NUMBER"\n    }\n}', self.response_catcher.response.raw_body)


    # User authentication test case
    def test_https_api_rest_sh_api_a_u_l(self):
        # Parameters for the API call
        options = {}
        options['user'] = None
        options['password'] = None

        # Perform the API call through the SDK function
        result = self.controller.user_authentication(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "request": "REQUEST TYPE",\n    "uid": "Users UID",\n    "valid": "RETURNS TRUE IF USER LOGIN DETAILS ARE VALID",\n    "id": "TRANSACTION ID",\n    "info": {\n    	"uid": "USERS ID",\n    	"apiuid": "API SIDE USER ID",\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n        "avatar": "USER AVATAR URL",\n        "email": "USERS EMAIL",\n        "address": "USERS ADDRESS",\n        "phone": "USERS CELL PHONE NUMBER",\n        "lastlogin": "USERS LAST LOGIN",\n        "ip": "USERS IP",\n        "2fa": "RETURNS TRUE IF 2FA IS ENABLED",\n        "iplock": "RETURNS TRUE IF IP LOCK IS ENABLED"\n    }\n}', self.response_catcher.response.raw_body)



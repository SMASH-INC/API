# -*- coding: utf-8 -*-

"""
    tests.controllers.test_advanced_logging

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class AdvancedLoggingTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(AdvancedLoggingTests, cls).setUpClass()
        cls.controller = cls.api_client.advanced_logging

    # Advanced logging configuration test case
    def test_https_api_rest_sh_api_s_l(self):
        # Parameters for the API call
        options = {}
        options['name'] = None
        options['origin'] = None
        options['activate'] = None

        # Perform the API call through the SDK function
        result = self.controller.logging_configuration(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "success": "RETURNS TRUE IF ADVANCED LOGGING IS ACTIVATED"\r\n}', self.response_catcher.response.raw_body)


    # Advanced logging info test case
    def test_https_api_rest_sh_api_s_l_i(self):
        # Parameters for the API call
        options = {}
        options['name'] = None
        options['origin'] = None
        options['time'] = None

        # Perform the API call through the SDK function
        result = self.controller.logging_info(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "log": {\n        "01010101245901": {\n            "data": {\n                "result": "INFO",\n                "content": "LOG: CONTENT AND ACTIONS PERFORMED",\n                "id": "FUNCTION ID"\n            }\n        },\n        "01010101245902": {\n            "data": {\n                "result": "ERROR",\n                "content": "LOG: ERROR CONTENT AND ACTIONS PERFORMED",\n                "id": "FUNCTION ID"\n            }\n        }\n    }\n}', self.response_catcher.response.raw_body)



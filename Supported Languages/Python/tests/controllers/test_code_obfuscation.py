# -*- coding: utf-8 -*-

"""
    tests.controllers.test_code_obfuscation

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class CodeObfuscationTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(CodeObfuscationTests, cls).setUpClass()
        cls.controller = cls.api_client.code_obfuscation

    # Code obfuscation test case
    def test_https_api_rest_sh_api_s_o(self):
        # Parameters for the API call
        app = None

        # Perform the API call through the SDK function
        result = self.controller.obfuscation_and_anti_tampering(app)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "success": "RETURNS TRUE IF APP WAS SUCCESSFULLY OBFUSCTATED AND PROTECTED",\r\n  "app": "OBFUSCATED APP URL"\r\n}', self.response_catcher.response.raw_body)



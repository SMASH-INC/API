# -*- coding: utf-8 -*-

"""
    tests.controllers.test_waf_and_ddos_protection

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class WAFAndDDOSProtectionTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(WAFAndDDOSProtectionTests, cls).setUpClass()
        cls.controller = cls.api_client.waf_and_ddos_protection

    # WAF and DDOS configuration test case
    def test_waf_configuration(self):
        # Parameters for the API call
        options = {}
        options['name'] = None
        options['rule'] = None

        # Perform the API call through the SDK function
        result = self.controller.waf_configuration(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "success": "SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY",\r\n  "rule": "RULES APPLIED TO WAF"\r\n}', self.response_catcher.response.raw_body)


    # WAF and DDOS test case
    def test_waf_creation(self):
        # Parameters for the API call
        options = {}
        options['origin'] = None
        options['cname'] = None

        # Perform the API call through the SDK function
        result = self.controller.waf_creation(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "success": "SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}', self.response_catcher.response.raw_body)



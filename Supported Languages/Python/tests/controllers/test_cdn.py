# -*- coding: utf-8 -*-

"""
    tests.controllers.test_cdn

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class CDNTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(CDNTests, cls).setUpClass()
        cls.controller = cls.api_client.cdn

    # CDN push zone creation and configuration test case
    def test_https_api_rest_sh_api_s_c_push(self):
        # Parameters for the API call
        options = {}
        options['cname'] = None
        options['file'] = None

        # Perform the API call through the SDK function
        result = self.controller.cdn_push_zone(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "success": "SHOWS TRUE WHEN PUSH ZONE IS DEPLOYED SUCCESSFULLY",\r\n  "upload": "LIST OF FILES UPLOADED TO YOUR PUSH ZONE",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}', self.response_catcher.response.raw_body)


    # CDN pull zone creation and configuration test case
    def test_https_api_rest_sh_api_s_c_pull(self):
        # Parameters for the API call
        options = {}
        options['origin'] = None
        options['cname'] = None

        # Perform the API call through the SDK function
        result = self.controller.cdn_pull_zone(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "success": "SHOWS TRUE WHEN PULL ZONE IS DEPLOYED SUCCESSFULLY",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}', self.response_catcher.response.raw_body)



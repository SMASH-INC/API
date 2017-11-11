# -*- coding: utf-8 -*-

"""
    tests.controllers.test_verification

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class VerificationTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(VerificationTests, cls).setUpClass()
        cls.controller = cls.api_client.verification

    # User address verification test case
    def test_https_api_rest_sh_api_v_a(self):
        # Parameters for the API call
        options = {}
        options['user'] = None
        options['a'] = None
        options['sa'] = None
        options['c'] = None
        options['s'] = None
        options['z'] = None
        options['address'] = None

        # Perform the API call through the SDK function
        result = self.controller.user_address_verification(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "request": "REQUEST TYPE",\r\n  "active": "RETURNS TRUE, IF ADDRESS IS ACTIVE AND IF USER IS CURRENTLY THERE",\r\n  "id": "TRANSACTION ID"\r\n}', self.response_catcher.response.raw_body)


    # User verification response test case
    def test_https_api_rest_sh_api_v_u(self):
        # Parameters for the API call
        options = {}
        options['user'] = None
        options['code'] = None

        # Perform the API call through the SDK function
        result = self.controller.user_verification_response(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "request": "REQUEST TYPE",\r\n  "correct": "RETURNS IF 2FA TOKEN IS CORRECT",\r\n  "id": "TRANSACTION ID"\r\n}', self.response_catcher.response.raw_body)


    # User verification test case
    def test_https_api_rest_sh_api_v(self):
        # Parameters for the API call
        user = None

        # Perform the API call through the SDK function
        result = self.controller.user_verification(user)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['accept-ranges'] = None
        expected_headers['connection'] = None
        expected_headers['content-length'] = None
        expected_headers['content-type'] = None
        expected_headers['date'] = None
        expected_headers['server'] = None
        expected_headers['vary'] = None
        expected_headers['via'] = None
        expected_headers['x-cache'] = None
        expected_headers['x-cache-hits'] = None
        expected_headers['x-served-by'] = None
        expected_headers['x-timer'] = None
        expected_headers['access-control-allow-origin'] = None
        expected_headers['cache-control'] = None
        expected_headers['etag'] = None
        expected_headers['function-execution-id'] = None
        expected_headers['strict-transport-security'] = None
        expected_headers['x-cloud-trace-context'] = None
        expected_headers['x-content-type-options'] = None
        expected_headers['x-dns-prefetch-control'] = None
        expected_headers['x-download-options'] = None
        expected_headers['x-frame-options'] = None
        expected_headers['x-powered-by'] = None
        expected_headers['x-xss-protection'] = None

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))

        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "request": "REQUEST TYPE",\n    "to": "USER BEING VERIFIED",\n    "verified": "RETURNS TRUE OR FALSE",\n    "id": "TRANSACTION ID"\n}', self.response_catcher.response.raw_body)



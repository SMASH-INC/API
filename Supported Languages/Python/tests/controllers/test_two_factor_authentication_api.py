# -*- coding: utf-8 -*-

"""
    tests.controllers.test_two_factor_authentication_api

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class TwoFactorAuthenticationAPITests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(TwoFactorAuthenticationAPITests, cls).setUpClass()
        cls.controller = cls.api_client.two_factor_authentication_api

    # User 2FA response test case
    def test_https_api_rest_sh_api_2fa_t(self):
        # Parameters for the API call
        options = {}
        options['user'] = None
        options['code'] = None

        # Perform the API call through the SDK function
        result = self.controller.2_fa_token_response(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "request": "REQUEST TYPE",\r\n  "correct": "RETURNS IF 2FA TOKEN IS CORRECT",\r\n  "id": "TRANSACTION ID"\r\n}', self.response_catcher.response.raw_body)


    # 2FA test case
    def test_https_api_rest_sh_api_2fa(self):
        # Parameters for the API call
        to = None

        # Perform the API call through the SDK function
        result = self.controller.two_factor_authentication(to)

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



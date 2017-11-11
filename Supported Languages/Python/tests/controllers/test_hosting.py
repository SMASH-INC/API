# -*- coding: utf-8 -*-

"""
    tests.controllers.test_hosting

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class HostingTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(HostingTests, cls).setUpClass()
        cls.controller = cls.api_client.hosting

    # Web hosting testing case
    def test_https_api_rest_sh_api_s_h(self):
        # Parameters for the API call
        options = {}
        options['app'] = None
        options['domain'] = None

        # Perform the API call through the SDK function
        result = self.controller.hosting_setup(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\r\n  "request": "REQUEST TYPE",\r\n  "url": "RETURNED APP HOSTING URL",\r\n  "success": "RETURNS TRUE IF APP WAS SUCCESSFULLY DEPLOYED",\r\n  "id": "TRANSACTION ID"\r\n}', self.response_catcher.response.raw_body)



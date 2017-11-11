# -*- coding: utf-8 -*-

"""
    tests.controllers.test_encryption

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class EncryptionTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(EncryptionTests, cls).setUpClass()
        cls.controller = cls.api_client.encryption

    # File and Data encryption test case
    def test_https_api_rest_sh_api_s_e(self):
        # Parameters for the API call
        options = {}
        options['data'] = None
        options['method'] = None
        options['bit'] = None

        # Perform the API call through the SDK function
        result = self.controller.data_and_file_encryption(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "data": "RETURNED ENCRYPTED DATA URL",\n    "file": "RETURNED ENCRYPTED FILE URL",\n    "success": "SHOWS TRUE IF ENCRYPTION WAS SUCCESSFULL",\n    "public": "PUBLIC ENCRYPTION KEY FOR YOUR DATA OR FILES",\n    "private": "PRIVATE ENCRYPTION KEY FOR YOUR DATA OR FILES"\n}', self.response_catcher.response.raw_body)



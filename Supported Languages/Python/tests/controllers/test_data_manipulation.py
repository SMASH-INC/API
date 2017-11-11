# -*- coding: utf-8 -*-

"""
    tests.controllers.test_data_manipulation

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class DataManipulationTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(DataManipulationTests, cls).setUpClass()
        cls.controller = cls.api_client.data_manipulation

    # Data Manipulation test case
    def test_https_api_rest_sh_api_d(self):
        # Parameters for the API call
        options = {}
        options['data'] = None
        options['transform'] = None

        # Perform the API call through the SDK function
        result = self.controller.https_api_rest_sh_api_d(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "request": "REQUEST TYPE",\n    "url": "RETURNED DATA URL",\n    "success": "RETURNS TRUE IF DATA MANIPULATION WAS SUCCESSFULL",\n    "id": "TRANSACTION ID"\n}', self.response_catcher.response.raw_body)



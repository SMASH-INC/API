# -*- coding: utf-8 -*-

"""
    tests.controllers.test_image_manipulation

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class ImageManipulationTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(ImageManipulationTests, cls).setUpClass()
        cls.controller = cls.api_client.image_manipulation

    # Image manipulation test case
    def test_https_api_rest_sh_api_i(self):
        # Parameters for the API call
        options = {}
        options['image'] = None
        options['transform'] = None

        # Perform the API call through the SDK function
        result = self.controller.image_manipulation(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "request": "REQUEST TYPE",\n    "url": "RETURNED IMAGE URL AND DATA",\n    "success": "RETURNS TRUE IF IMAGE MANIPULATION WAS SUCCESSFULL",\n    "moderated": "RETURNS TRUE IF IMAGE CONTAINED GRAPHIC IMAGERY",\n    "id": "TRANSACTION ID"\n}', self.response_catcher.response.raw_body)



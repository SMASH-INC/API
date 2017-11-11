# -*- coding: utf-8 -*-

"""
    tests.controllers.test_dns

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import jsonpickle
import dateutil.parser
from .controller_test_base import ControllerTestBase
from ..test_helper import TestHelper
from smash.api_helper import APIHelper


class DNSTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(DNSTests, cls).setUpClass()
        cls.controller = cls.api_client.dns

    # DNS configuration test case
    def test_https_api_rest_sh_api_s_d_c(self):
        # Parameters for the API call
        options = {}
        options['domain'] = None
        options['records'] = None

        # Perform the API call through the SDK function
        result = self.controller.dns_configuration(options)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "success": "SHOWS TRUE IF RECORDS WERE SUCCESSFULLY SET",\n    "domain": "DOMAIN",\n    "records": "RECORDS SET TO DOMAIN"\n}', self.response_catcher.response.raw_body)


    # DNS addition test case
    def test_https_api_rest_sh_api_s_d_a(self):
        # Parameters for the API call
        domain = None

        # Perform the API call through the SDK function
        result = self.controller.dns_creation(domain)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)
        
        # Test whether the captured response is as we expected
        self.assertIsNotNone(result)
        self.assertEqual('{\n    "domain": "LIST OF DOMAINS ADDED",\n    "nameservers": {\n        "ns1": "NAME SERVER ONE TO POINT YOUR DOMAIN AT",\n        "ns2": "NAME SERVER TWO TO POINT YOUR DOMAIN AT",\n        "ns3": "NAME SERVER THREE TO POINT YOUR DOMAIN AT",\n        "ns4": "NAME SERVER FOUR TO POINT YOUR DOMAIN AT"\n    }\n}', self.response_catcher.response.raw_body)



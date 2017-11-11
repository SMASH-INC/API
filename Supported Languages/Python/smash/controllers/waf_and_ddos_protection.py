# -*- coding: utf-8 -*-

"""
    smash.controllers.waf_and_ddos_protection

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.waf_configuration_model_response import WAFConfigurationModelResponse
from ..models.waf_creation_model_response import WAFCreationModelResponse

class WAFAndDDOSProtection(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(WAFAndDDOSProtection, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def waf_configuration(self,
                          options=dict()):
        """Does a GET request to /s/w/c.

        WAF and DDOS Configuration

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    name -- string -- Name of your WAF zone
                    rule -- string -- Rule or rules to add or update separated
                        by a comma

        Returns:
            WAFConfigurationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('waf_configuration called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for waf_configuration.')
            self.validate_parameters(name=options.get("name"),
                                     rule=options.get("rule"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for waf_configuration.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/w/c'
            _query_parameters = {
                'name': options.get('name', None),
                'rule': options.get('rule', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for waf_configuration.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'waf_configuration')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for waf_configuration.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for waf_configuration. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, WAFConfigurationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def waf_creation(self,
                     options=dict()):
        """Does a GET request to /s/w.

        WAF and DDOS Creation

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    origin -- string -- IP of the Web server you wish to
                        protect
                    cname -- string -- Domain or domain names separated by a
                        comma you wish to allow CNAME access

        Returns:
            WAFCreationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('waf_creation called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for waf_creation.')
            self.validate_parameters(origin=options.get("origin"),
                                     cname=options.get("cname"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for waf_creation.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/w'
            _query_parameters = {
                'origin': options.get('origin', None),
                'cname': options.get('cname', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for waf_creation.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'waf_creation')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for waf_creation.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for waf_creation. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, WAFCreationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

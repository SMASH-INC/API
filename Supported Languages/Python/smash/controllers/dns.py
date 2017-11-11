# -*- coding: utf-8 -*-

"""
    smash.controllers.dns

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.dns_configuration_model_response import DNSConfigurationModelResponse
from ..models.dns_creation_model_response import DNSCreationModelResponse

class DNS(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(DNS, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def dns_configuration(self,
                          options=dict()):
        """Does a GET request to /s/d/c.

        DNS Configuration API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    domain -- string -- Domain or domain names separated by a
                        comma
                    records -- string -- Records to append to domain separated
                        by a comma
                        (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherd
                        omain.com)

        Returns:
            DNSConfigurationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('dns_configuration called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for dns_configuration.')
            self.validate_parameters(domain=options.get("domain"),
                                     records=options.get("records"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for dns_configuration.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/d/c'
            _query_parameters = {
                'domain': options.get('domain', None),
                'records': options.get('records', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for dns_configuration.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'dns_configuration')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for dns_configuration.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for dns_configuration. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, DNSConfigurationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def dns_creation(self,
                     domain):
        """Does a GET request to /s/d/a.

        DNS Creation API

        Args:
            domain (string): Domain or domain names separated by a comma

        Returns:
            DNSCreationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('dns_creation called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for dns_creation.')
            self.validate_parameters(domain=domain)
    
            # Prepare query URL
            self.logger.info('Preparing query URL for dns_creation.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/d/a'
            _query_parameters = {
                'domain': domain
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for dns_creation.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'dns_creation')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for dns_creation.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for dns_creation. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, DNSCreationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

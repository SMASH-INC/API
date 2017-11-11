# -*- coding: utf-8 -*-

"""
    smash.controllers.advanced_logging

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.logging_setup_model_response import LoggingSetupModelResponse
from ..models.logging_logs_model_response import LoggingLogsModelResponse

class AdvancedLogging(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(AdvancedLogging, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def logging_configuration(self,
                              options=dict()):
        """Does a GET request to /s/l.

        WAF Log Configuration

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    name -- string -- Name of the WAF zone
                    origin -- string -- IP Address of the Web Application you
                        wish to configure logging on
                    activate -- string -- Activate or Disable

        Returns:
            LoggingSetupModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('logging_configuration called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for logging_configuration.')
            self.validate_parameters(name=options.get("name"),
                                     origin=options.get("origin"),
                                     activate=options.get("activate"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for logging_configuration.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/l'
            _query_parameters = {
                'name': options.get('name', None),
                'origin': options.get('origin', None),
                'activate': options.get('activate', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for logging_configuration.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'logging_configuration')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for logging_configuration.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for logging_configuration. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, LoggingSetupModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def logging_info(self,
                     options=dict()):
        """Does a GET request to /s/l/i.

        WAF Log Info

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    name -- string -- Name of your WAF zone
                    origin -- string -- IP Address of the Web Application
                    time -- string -- Specific times or dates to lookup
                        separated by a comma in MMDDYYHHMMSS Format ( Month
                        Month Day Day Year Year Year Hour Hour Minute Minute
                        Second Second [01/01/0101;24:59:01])

        Returns:
            LoggingLogsModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('logging_info called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for logging_info.')
            self.validate_parameters(name=options.get("name"),
                                     origin=options.get("origin"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for logging_info.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/l/i'
            _query_parameters = {
                'name': options.get('name', None),
                'origin': options.get('origin', None),
                'time': options.get('time', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for logging_info.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'logging_info')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for logging_info.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for logging_info. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, LoggingLogsModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

# -*- coding: utf-8 -*-

"""
    smash.controllers.cdn

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.cdn_push_model_response import CDNPushModelResponse
from ..models.cdn_pull_model_response import CDNPullModelResponse

class CDN(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(CDN, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def cdn_push_zone(self,
                      options=dict()):
        """Does a GET request to /s/c/push.

        CDN Push Zone API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    cname -- string -- Domain or domain names separated by a
                        comma you wish to allow CNAME access
                    file -- string -- GIT URL, file URL, or direct upload of
                        file

        Returns:
            CDNPushModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('cdn_push_zone called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for cdn_push_zone.')
            self.validate_parameters(cname=options.get("cname"),
                                     file=options.get("file"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for cdn_push_zone.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/c/push'
            _query_parameters = {
                'cname': options.get('cname', None),
                'file': options.get('file', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for cdn_push_zone.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'cdn_push_zone')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for cdn_push_zone.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for cdn_push_zone. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, CDNPushModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def cdn_pull_zone(self,
                      options=dict()):
        """Does a GET request to /s/c/pull.

        CDN Pull Zone API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    origin -- string -- Domain or domain names separated by a
                        comma
                    cname -- string -- Domain or domain names separated by a
                        comma you wish to allow CNAME access

        Returns:
            CDNPullModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('cdn_pull_zone called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for cdn_pull_zone.')
            self.validate_parameters(origin=options.get("origin"),
                                     cname=options.get("cname"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for cdn_pull_zone.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/c/pull'
            _query_parameters = {
                'origin': options.get('origin', None),
                'cname': options.get('cname', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for cdn_pull_zone.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'cdn_pull_zone')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for cdn_pull_zone.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for cdn_pull_zone. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, CDNPullModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

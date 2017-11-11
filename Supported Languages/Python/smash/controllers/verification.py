# -*- coding: utf-8 -*-

"""
    smash.controllers.verification

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.verify_address_response import VerifyAddressResponse
from ..models.verify_user_model_response import VerifyUserModelResponse
from ..models.verify_model_response import VerifyModelResponse

class Verification(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(Verification, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def user_address_verification(self,
                                  options=dict()):
        """Does a GET request to /v/a.

        User Address Verification API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    user -- string -- Users UID, Username, or Email
                    a -- string -- Address Line One
                    sa -- string -- Address Line Two
                    c -- string -- Address City
                    s -- string -- Address State or Province
                    z -- int -- Address Zipcode
                    address -- string -- Address as a one line input separated
                        by commas

        Returns:
            VerifyAddressResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('user_address_verification called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for user_address_verification.')
            self.validate_parameters(user=options.get("user"),
                                     a=options.get("a"),
                                     sa=options.get("sa"),
                                     c=options.get("c"),
                                     s=options.get("s"),
                                     z=options.get("z"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for user_address_verification.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/v/a'
            _query_parameters = {
                'user': options.get('user', None),
                'a': options.get('a', None),
                'sa': options.get('sa', None),
                'c': options.get('c', None),
                's': options.get('s', None),
                'z': options.get('z', None),
                'address': options.get('address', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for user_address_verification.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'user_address_verification')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for user_address_verification.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for user_address_verification. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, VerifyAddressResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def user_verification_response(self,
                                   options=dict()):
        """Does a GET request to /v/u.

        Users Verification Response API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    user -- string -- Users UID, Username, Or Email
                    code -- string -- Verification code entered by the user

        Returns:
            VerifyUserModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('user_verification_response called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for user_verification_response.')
            self.validate_parameters(user=options.get("user"),
                                     code=options.get("code"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for user_verification_response.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/v/u'
            _query_parameters = {
                'user': options.get('user', None),
                'code': options.get('code', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for user_verification_response.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'user_verification_response')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for user_verification_response.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for user_verification_response. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, VerifyUserModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def user_verification(self,
                          user):
        """Does a GET request to /v.

        User Verification API

        Args:
            user (string): Users UID, Username, Or Email

        Returns:
            VerifyModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('user_verification called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for user_verification.')
            self.validate_parameters(user=user)
    
            # Prepare query URL
            self.logger.info('Preparing query URL for user_verification.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/v'
            _query_parameters = {
                'user': user
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for user_verification.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'user_verification')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for user_verification.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for user_verification. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, VerifyModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

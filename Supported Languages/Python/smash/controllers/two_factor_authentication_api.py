# -*- coding: utf-8 -*-

"""
    smash.controllers.two_factor_authentication_api

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.two_factor_authentication_token_model_response import TwoFactorAuthenticationTokenModelResponse
from ..models.two_factor_authentication_model_response import TwoFactorAuthenticationModelResponse

class TwoFactorAuthenticationAPI(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(TwoFactorAuthenticationAPI, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def 2_fa_token_response(self,
                            options=dict()):
        """Does a GET request to /2fa/t.

        Two Factor Authentication Token Reply

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    user -- string -- Users UID, Username or Email
                    code -- string -- Response From User Containing 2FA Code

        Returns:
            TwoFactorAuthenticationTokenModelResponse: Response from the API.
                
        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('2_fa_token_response called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for 2_fa_token_response.')
            self.validate_parameters(user=options.get("user"),
                                     code=options.get("code"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for 2_fa_token_response.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/2fa/t'
            _query_parameters = {
                'user': options.get('user', None),
                'code': options.get('code', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for 2_fa_token_response.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = '2_fa_token_response')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for 2_fa_token_response.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for 2_fa_token_response. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, TwoFactorAuthenticationTokenModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def two_factor_authentication(self,
                                  to):
        """Does a GET request to /2fa.

        Two Factor Authentication API

        Args:
            to (string): Users UID, Username, Email, Or Cellphone number

        Returns:
            TwoFactorAuthenticationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('two_factor_authentication called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for two_factor_authentication.')
            self.validate_parameters(to=to)
    
            # Prepare query URL
            self.logger.info('Preparing query URL for two_factor_authentication.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/2fa'
            _query_parameters = {
                'to': to
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for two_factor_authentication.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'two_factor_authentication')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for two_factor_authentication.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for two_factor_authentication. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, TwoFactorAuthenticationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

# -*- coding: utf-8 -*-

"""
    smash.controllers.login_and_registration

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.user_registration_model_response import UserRegistrationModelResponse
from ..models.user_authentication_model_response import UserAuthenticationModelResponse

class LoginAndRegistration(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(LoginAndRegistration, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def user_registration(self,
                          options=dict(),
                          _optional_query_parameters=None):
        """Does a GET request to /a/u/r.

        User Registration API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    email -- string -- Users Email
                    user -- string -- Users Username
                    password -- string -- Users Password
                    name -- string -- Users Name
                    phone -- int -- Users Cellphone Number
                    countrycode -- int -- Users Country Code (US = 1)
                    address -- string -- Users Address

        Returns:
            UserRegistrationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('user_registration called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for user_registration.')
            self.validate_parameters(email=options.get("email"),
                                     user=options.get("user"),
                                     password=options.get("password"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for user_registration.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/a/u/r'
            _query_parameters = {
                'email': options.get('email', None),
                'user': options.get('user', None),
                'password': options.get('password', None),
                'name': options.get('name', None),
                'phone': options.get('phone', None),
                'countrycode': options.get('countrycode', None),
                'address': options.get('address', None)
            }
            if _query_parameters != None and _optional_query_parameters != None:
                _query_parameters.update(_optional_query_parameters)
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for user_registration.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'user_registration')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for user_registration.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for user_registration. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, UserRegistrationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def user_authentication(self,
                            options=dict()):
        """Does a GET request to /a/u/l.

        User Authentication API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    user -- string -- Users Username or Email
                    password -- string -- Users Password

        Returns:
            UserAuthenticationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('user_authentication called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for user_authentication.')
            self.validate_parameters(user=options.get("user"),
                                     password=options.get("password"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for user_authentication.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/a/u/l'
            _query_parameters = {
                'user': options.get('user', None),
                'password': options.get('password', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for user_authentication.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'user_authentication')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for user_authentication.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for user_authentication. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, UserAuthenticationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

# -*- coding: utf-8 -*-

"""
    smash.controllers.user_management

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.user_information_model_response import UserInformationModelResponse
from ..models.user_update_model_response import UserUpdateModelResponse
from ..models.user_deletion_response_model import UserDeletionResponseModel

class UserManagement(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(UserManagement, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def get_user_info(self,
                      user):
        """Does a GET request to /u/i.

        Get User Info API

        Args:
            user (string): Users User ID

        Returns:
            UserInformationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('get_user_info called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for get_user_info.')
            self.validate_parameters(user=user)
    
            # Prepare query URL
            self.logger.info('Preparing query URL for get_user_info.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/u/i'
            _query_parameters = {
                'user': user
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for get_user_info.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'get_user_info')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for get_user_info.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for get_user_info. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, UserInformationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def update_user(self,
                    options=dict(),
                    _optional_query_parameters=None):
        """Does a GET request to /u/u.

        Update User API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    user -- string -- Users UID, Username, Or Email
                    avatar -- string -- Avatar Image URL
                    custom_input -- string -- Custom input variable for users
                        profile

        Returns:
            UserUpdateModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('update_user called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for update_user.')
            self.validate_parameters(user=options.get("user"),
                                     avatar=options.get("avatar"),
                                     custom_input=options.get("custom_input"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for update_user.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/u/u'
            _query_parameters = {
                'user': options.get('user', None),
                'avatar': options.get('avatar', None),
                'custom input': options.get('custom_input', None)
            }
            if _query_parameters != None and _optional_query_parameters != None:
                _query_parameters.update(_optional_query_parameters)
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for update_user.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'update_user')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for update_user.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for update_user. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, UserUpdateModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

    def delete_user(self,
                    user):
        """Does a GET request to /u/d.

        Delete User API

        Args:
            user (string): Users UID, Username, or Email

        Returns:
            UserDeletionResponseModel: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('delete_user called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for delete_user.')
            self.validate_parameters(user=user)
    
            # Prepare query URL
            self.logger.info('Preparing query URL for delete_user.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/u/d'
            _query_parameters = {
                'user': user
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for delete_user.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'delete_user')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for delete_user.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for delete_user. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, UserDeletionResponseModel.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

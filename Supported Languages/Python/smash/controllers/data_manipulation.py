# -*- coding: utf-8 -*-

"""
    smash.controllers.data_manipulation

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.data_manipulation_model_response import DataManipulationModelResponse

class DataManipulation(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(DataManipulation, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def https_api_rest_sh_api_d(self,
                                options=dict()):
        """Does a GET request to /d.

        Data Manipulation API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    data -- string -- Data URL, data as a query string, or
                        direct upload
                    transform -- string -- Transformations to perform

        Returns:
            DataManipulationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('https_api_rest_sh_api_d called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for https_api_rest_sh_api_d.')
            self.validate_parameters(data=options.get("data"),
                                     transform=options.get("transform"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for https_api_rest_sh_api_d.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/d'
            _query_parameters = {
                'data': options.get('data', None),
                'transform': options.get('transform', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for https_api_rest_sh_api_d.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'https_api_rest_sh_api_d')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for https_api_rest_sh_api_d.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for https_api_rest_sh_api_d. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, DataManipulationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

# -*- coding: utf-8 -*-

"""
    smash.controllers.image_manipulation

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.image_manipulation_model_response import ImageManipulationModelResponse

class ImageManipulation(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(ImageManipulation, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def image_manipulation(self,
                           options=dict()):
        """Does a GET request to /i.

        Image Manipulation API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    image -- string -- Image URL or direct upload
                    transform -- string -- Transformations to perform

        Returns:
            ImageManipulationModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('image_manipulation called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for image_manipulation.')
            self.validate_parameters(image=options.get("image"),
                                     transform=options.get("transform"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for image_manipulation.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/i'
            _query_parameters = {
                'image': options.get('image', None),
                'transform': options.get('transform', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for image_manipulation.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'image_manipulation')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for image_manipulation.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for image_manipulation. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, ImageManipulationModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

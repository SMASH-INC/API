# -*- coding: utf-8 -*-

"""
    smash.controllers.code_obfuscation

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.code_protection_model_response import CodeProtectionModelResponse

class CodeObfuscation(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(CodeObfuscation, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def obfuscation_and_anti_tampering(self,
                                       app):
        """Does a GET request to /s/o.

        Javascript and Node.JS Obfuscation and Anti-Tampering API

        Args:
            app (string): GIT URL or ZIP package containing your APP

        Returns:
            CodeProtectionModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('obfuscation_and_anti_tampering called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for obfuscation_and_anti_tampering.')
            self.validate_parameters(app=app)
    
            # Prepare query URL
            self.logger.info('Preparing query URL for obfuscation_and_anti_tampering.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/o'
            _query_parameters = {
                'app': app
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for obfuscation_and_anti_tampering.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'obfuscation_and_anti_tampering')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for obfuscation_and_anti_tampering.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for obfuscation_and_anti_tampering. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, CodeProtectionModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

# -*- coding: utf-8 -*-

"""
    smash.controllers.encryption

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.encryption_model_response import EncryptionModelResponse

class Encryption(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(Encryption, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def data_and_file_encryption(self,
                                 options=dict()):
        """Does a GET request to /s/e.

        Data and File Encryption API

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    data -- string -- GIT URL, file URL, direct upload of
                        file, or data as a query string
                    method -- string -- Single or multiple encryption types to
                        apply to data or files separated by a comma (DES, RSA,
                        BLOWFISH, TWOFISH, AES, IDEA, PGP)
                    bit -- int -- Encryption key size (4096)

        Returns:
            EncryptionModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('data_and_file_encryption called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for data_and_file_encryption.')
            self.validate_parameters(data=options.get("data"),
                                     method=options.get("method"),
                                     bit=options.get("bit"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for data_and_file_encryption.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/e'
            _query_parameters = {
                'data': options.get('data', None),
                'method': options.get('method', None),
                'bit': options.get('bit', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for data_and_file_encryption.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'data_and_file_encryption')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for data_and_file_encryption.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for data_and_file_encryption. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, EncryptionModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

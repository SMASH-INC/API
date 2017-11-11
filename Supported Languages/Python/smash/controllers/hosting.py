# -*- coding: utf-8 -*-

"""
    smash.controllers.hosting

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""

import logging
from .base_controller import BaseController
from ..api_helper import APIHelper
from ..configuration import Configuration
from ..http.auth.custom_auth import CustomAuth
from ..models.hosting_model_response import HostingModelResponse

class Hosting(BaseController):

    """A Controller to access Endpoints in the smash API."""

    def __init__(self, client=None, call_back=None):
        super(Hosting, self).__init__(client, call_back)
        self.logger = logging.getLogger(__name__)

    def hosting_setup(self,
                      options=dict()):
        """Does a GET request to /s/h.

        Node.JS and Static Web APP Hosting

        Args:
            options (dict, optional): Key-value pairs for any of the
                parameters to this API Endpoint. All parameters to the
                endpoint are supplied through the dictionary with their names
                being the key and their desired values being the value. A list
                of parameters that can be used are::

                    app -- string -- GIT URL or ZIP package containing your
                        APP
                    domain -- string -- Domain or domain names separated by a
                        comma

        Returns:
            HostingModelResponse: Response from the API. 

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """
        try:
            self.logger.info('hosting_setup called.')
    
            # Validate required parameters
            self.logger.info('Validating required parameters for hosting_setup.')
            self.validate_parameters(app=options.get("app"),
                                     domain=options.get("domain"))
    
            # Prepare query URL
            self.logger.info('Preparing query URL for hosting_setup.')
            _query_builder = Configuration.get_base_uri(Configuration.Server.PATH)
            _query_builder += '/s/h'
            _query_parameters = {
                'app': options.get('app', None),
                'domain': options.get('domain', None)
            }
            _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
                _query_parameters, Configuration.array_serialization)
            _query_url = APIHelper.clean_url(_query_builder)
    
            # Prepare and execute request
            self.logger.info('Preparing and executing request for hosting_setup.')
            _request = self.http_client.get(_query_url)
            CustomAuth.apply(_request)
            _context = self.execute_request(_request, name = 'hosting_setup')

            # Endpoint and global error handling using HTTP status codes.
            self.logger.info('Validating response for hosting_setup.')
            if _context.response.status_code == 404:
                self.logger.info('Status code 404 received for hosting_setup. Returning nil.')
                return None
            self.validate_response(_context)
    
            # Return appropriate type
            return APIHelper.json_deserialize(_context.response.raw_body, HostingModelResponse.from_dictionary)

        except Exception as e:
            self.logger.error(e, exc_info = True)
            raise

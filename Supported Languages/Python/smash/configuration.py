# -*- coding: utf-8 -*-

"""
   smash.configuration

   This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""
import sys
import logging

from .api_helper import APIHelper

logging.basicConfig(stream=sys.stdout, level=logging.INFO)

class Configuration(object):

    """A class used for configuring the SDK by a user.

    This class need not be instantiated and all properties and methods
    are accessible without instance creation.

    """

    # Set the array parameter serialization method
    # (allowed: indexed, unindexed, plain, csv, tsv, psv)
    array_serialization = "indexed"

    # An enum for SDK environments
    class Environment(object):
        # Production Enviroment
        PRODUCTION = 0
        # Testing and Debugging
        SANDBOX = 1
        # Updated Nightly (May Contain Bugs)
        BETA = 2

    # An enum for API servers
    class Server(object):
        PATH = 0

    # The environment in which the SDK is running
    environment = Environment.PRODUCTION

    # Your user ID
    uid = 'UID'

    # Your Private API Key
    secret = 'SECRET'

    # Your Public API Key
    key = 'KEY'

    # All the environments the SDK can run in
    environments = {
        Environment.PRODUCTION: {
            Server.PATH: 'https://api.rest.sh/api',
        },
        Environment.SANDBOX: {
            Server.PATH: 'https://sb.rest.sh/api',
        },
        Environment.BETA: {
            Server.PATH: 'https://b.rest.sh/api',
        },
    }

    @classmethod
    def get_base_uri(cls, server=Server.PATH):
        """Generates the appropriate base URI for the environment and the server.

        Args:
            server (Configuration.Server): The server enum for which the base URI is required.

        Returns:
            String: The base URI.

        """
        parameters = {
        }
        return APIHelper.append_url_with_template_parameters(cls.environments[cls.environment][server], parameters)

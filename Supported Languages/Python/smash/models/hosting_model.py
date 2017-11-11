# -*- coding: utf-8 -*-

"""
    smash.models.hosting_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class HostingModel(object):

    """Implementation of the 'Hosting Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        app (string): TODO: type description here.
        domain (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "app" : "app",
        "domain" : "domain"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 app=None,
                 domain=None,
                 additional_properties = {}):
        """Constructor for the HostingModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.app = app
        self.domain = domain

        # Add additional model properties to the instance
        self.additional_properties = additional_properties


    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object as
            obtained from the deserialization of the server's response. The keys
            MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        key = dictionary.get("key")
        uid = dictionary.get("uid")
        app = dictionary.get("app")
        domain = dictionary.get("domain")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   app,
                   domain,
                   dictionary)



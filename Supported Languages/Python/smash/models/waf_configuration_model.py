# -*- coding: utf-8 -*-

"""
    smash.models.waf_configuration_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class WAFConfigurationModel(object):

    """Implementation of the 'WAF Configuration Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        name (string): TODO: type description here.
        origin (string): TODO: type description here.
        cname (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "name" : "name",
        "origin" : "origin",
        "cname" : "cname"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 name=None,
                 origin=None,
                 cname=None,
                 additional_properties = {}):
        """Constructor for the WAFConfigurationModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.name = name
        self.origin = origin
        self.cname = cname

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
        name = dictionary.get("name")
        origin = dictionary.get("origin")
        cname = dictionary.get("cname")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   name,
                   origin,
                   cname,
                   dictionary)



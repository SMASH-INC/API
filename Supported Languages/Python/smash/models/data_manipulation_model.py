# -*- coding: utf-8 -*-

"""
    smash.models.data_manipulation_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class DataManipulationModel(object):

    """Implementation of the 'Data Manipulation Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        user (string): TODO: type description here.
        apiuid (string): TODO: type description here.
        url (string): TODO: type description here.
        manipulation (string): TODO: type description here.
        conversion (string): TODO: type description here.
        sorting (string): TODO: type description here.
        compression (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "user" : "user",
        "apiuid" : "apiuid",
        "url" : "url",
        "manipulation" : "manipulation",
        "conversion" : "conversion",
        "sorting" : "sorting",
        "compression" : "compression"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 user=None,
                 apiuid=None,
                 url=None,
                 manipulation=None,
                 conversion=None,
                 sorting=None,
                 compression=None,
                 additional_properties = {}):
        """Constructor for the DataManipulationModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.user = user
        self.apiuid = apiuid
        self.url = url
        self.manipulation = manipulation
        self.conversion = conversion
        self.sorting = sorting
        self.compression = compression

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
        user = dictionary.get("user")
        apiuid = dictionary.get("apiuid")
        url = dictionary.get("url")
        manipulation = dictionary.get("manipulation")
        conversion = dictionary.get("conversion")
        sorting = dictionary.get("sorting")
        compression = dictionary.get("compression")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   user,
                   apiuid,
                   url,
                   manipulation,
                   conversion,
                   sorting,
                   compression,
                   dictionary)



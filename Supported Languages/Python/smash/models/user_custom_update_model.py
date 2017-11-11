# -*- coding: utf-8 -*-

"""
    smash.models.user_custom_update_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class UserCustomUpdateModel(object):

    """Implementation of the 'User Custom Update Model' model.

    TODO: type model description here.

    Attributes:
        uid (string): TODO: type description here.
        apiuid (string): TODO: type description here.
        avatar (string): TODO: type description here.
        custom_input (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "uid" : "uid",
        "apiuid" : "apiuid",
        "avatar" : "avatar",
        "custom_input" : "custom-input"
    }

    def __init__(self,
                 uid=None,
                 apiuid=None,
                 avatar=None,
                 custom_input=None,
                 additional_properties = {}):
        """Constructor for the UserCustomUpdateModel class"""

        # Initialize members of the class
        self.uid = uid
        self.apiuid = apiuid
        self.avatar = avatar
        self.custom_input = custom_input

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
        uid = dictionary.get("uid")
        apiuid = dictionary.get("apiuid")
        avatar = dictionary.get("avatar")
        custom_input = dictionary.get("custom-input")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(uid,
                   apiuid,
                   avatar,
                   custom_input,
                   dictionary)



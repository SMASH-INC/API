# -*- coding: utf-8 -*-

"""
    smash.models.user_authentication_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class UserAuthenticationModel(object):

    """Implementation of the 'User Authentication Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        user (string): TODO: type description here.
        password (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "user" : "user",
        "password" : "password"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 user=None,
                 password=None,
                 additional_properties = {}):
        """Constructor for the UserAuthenticationModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.user = user
        self.password = password

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
        password = dictionary.get("password")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   user,
                   password,
                   dictionary)



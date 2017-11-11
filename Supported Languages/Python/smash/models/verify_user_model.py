# -*- coding: utf-8 -*-

"""
    smash.models.verify_user_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class VerifyUserModel(object):

    """Implementation of the 'Verify User Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        user (string): TODO: type description here.
        code (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "user" : "user",
        "code" : "code"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 user=None,
                 code=None,
                 additional_properties = {}):
        """Constructor for the VerifyUserModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.user = user
        self.code = code

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
        code = dictionary.get("code")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   user,
                   code,
                   dictionary)



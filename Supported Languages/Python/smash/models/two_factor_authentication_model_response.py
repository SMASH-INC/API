# -*- coding: utf-8 -*-

"""
    smash.models.two_factor_authentication_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class TwoFactorAuthenticationModelResponse(object):

    """Implementation of the 'Two Factor Authentication Model Response' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        to (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "to" : "to"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 to=None,
                 additional_properties = {}):
        """Constructor for the TwoFactorAuthenticationModelResponse class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.to = to

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
        to = dictionary.get("to")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   to,
                   dictionary)



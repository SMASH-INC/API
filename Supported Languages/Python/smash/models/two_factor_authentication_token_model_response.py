# -*- coding: utf-8 -*-

"""
    smash.models.two_factor_authentication_token_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class TwoFactorAuthenticationTokenModelResponse(object):

    """Implementation of the 'Two Factor Authentication Token Model Response' model.

    TODO: type model description here.

    Attributes:
        request (string): TODO: type description here.
        correct (string): TODO: type description here.
        id (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "request" : "request",
        "correct" : "correct",
        "id" : "id"
    }

    def __init__(self,
                 request=None,
                 correct=None,
                 id=None,
                 additional_properties = {}):
        """Constructor for the TwoFactorAuthenticationTokenModelResponse class"""

        # Initialize members of the class
        self.request = request
        self.correct = correct
        self.id = id

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
        request = dictionary.get("request")
        correct = dictionary.get("correct")
        id = dictionary.get("id")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(request,
                   correct,
                   id,
                   dictionary)



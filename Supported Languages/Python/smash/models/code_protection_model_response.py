# -*- coding: utf-8 -*-

"""
    smash.models.code_protection_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class CodeProtectionModelResponse(object):

    """Implementation of the 'Code Protection Model Response' model.

    TODO: type model description here.

    Attributes:
        success (string): TODO: type description here.
        app (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "success" : "success",
        "app" : "app"
    }

    def __init__(self,
                 success=None,
                 app=None,
                 additional_properties = {}):
        """Constructor for the CodeProtectionModelResponse class"""

        # Initialize members of the class
        self.success = success
        self.app = app

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
        success = dictionary.get("success")
        app = dictionary.get("app")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(success,
                   app,
                   dictionary)



# -*- coding: utf-8 -*-

"""
    smash.models.user_authentication_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""
import smash.models.info_model

class UserAuthenticationModelResponse(object):

    """Implementation of the 'User Authentication Model Response' model.

    TODO: type model description here.

    Attributes:
        request (string): TODO: type description here.
        uid (string): TODO: type description here.
        valid (string): TODO: type description here.
        id (string): TODO: type description here.
        info (InfoModel): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "request" : "request",
        "uid" : "uid",
        "valid" : "valid",
        "id" : "id",
        "info" : "info"
    }

    def __init__(self,
                 request=None,
                 uid=None,
                 valid=None,
                 id=None,
                 info=None,
                 additional_properties = {}):
        """Constructor for the UserAuthenticationModelResponse class"""

        # Initialize members of the class
        self.request = request
        self.uid = uid
        self.valid = valid
        self.id = id
        self.info = info

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
        uid = dictionary.get("uid")
        valid = dictionary.get("valid")
        id = dictionary.get("id")
        info = smash.models.info_model.InfoModel.from_dictionary(dictionary.get("info")) if dictionary.get("info") else None

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(request,
                   uid,
                   valid,
                   id,
                   info,
                   dictionary)



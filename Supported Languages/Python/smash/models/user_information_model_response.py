# -*- coding: utf-8 -*-

"""
    smash.models.user_information_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""
import smash.models.user_information_secondary_model

class UserInformationModelResponse(object):

    """Implementation of the 'User Information Model Response' model.

    TODO: type model description here.

    Attributes:
        user (string): TODO: type description here.
        key (string): Users API Private Key
        api (string): Users API Public Key
        info (UserInformationSecondaryModel): Users Profile Information

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "user" : "user",
        "key" : "key",
        "api" : "api",
        "info" : "info"
    }

    def __init__(self,
                 user=None,
                 key=None,
                 api=None,
                 info=None,
                 additional_properties = {}):
        """Constructor for the UserInformationModelResponse class"""

        # Initialize members of the class
        self.user = user
        self.key = key
        self.api = api
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
        user = dictionary.get("user")
        key = dictionary.get("key")
        api = dictionary.get("api")
        info = smash.models.user_information_secondary_model.UserInformationSecondaryModel.from_dictionary(dictionary.get("info")) if dictionary.get("info") else None

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(user,
                   key,
                   api,
                   info,
                   dictionary)



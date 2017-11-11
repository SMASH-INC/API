# -*- coding: utf-8 -*-

"""
    smash.models.user_registration_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""
import smash.models.user_profile_information_model

class UserRegistrationModelResponse(object):

    """Implementation of the 'User Registration Model Response' model.

    TODO: type model description here.

    Attributes:
        request (string): TODO: type description here.
        active (string): TODO: type description here.
        id (string): TODO: type description here.
        info (UserProfileInformationModel): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "request" : "request",
        "active" : "active",
        "id" : "id",
        "info" : "info"
    }

    def __init__(self,
                 request=None,
                 active=None,
                 id=None,
                 info=None,
                 additional_properties = {}):
        """Constructor for the UserRegistrationModelResponse class"""

        # Initialize members of the class
        self.request = request
        self.active = active
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
        active = dictionary.get("active")
        id = dictionary.get("id")
        info = smash.models.user_profile_information_model.UserProfileInformationModel.from_dictionary(dictionary.get("info")) if dictionary.get("info") else None

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(request,
                   active,
                   id,
                   info,
                   dictionary)



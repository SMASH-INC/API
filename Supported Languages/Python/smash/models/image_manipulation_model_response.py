# -*- coding: utf-8 -*-

"""
    smash.models.image_manipulation_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class ImageManipulationModelResponse(object):

    """Implementation of the 'Image Manipulation Model Response' model.

    TODO: type model description here.

    Attributes:
        request (string): TODO: type description here.
        url (string): TODO: type description here.
        success (string): TODO: type description here.
        moderated (string): TODO: type description here.
        id (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "request" : "request",
        "url" : "url",
        "success" : "success",
        "moderated" : "moderated",
        "id" : "id"
    }

    def __init__(self,
                 request=None,
                 url=None,
                 success=None,
                 moderated=None,
                 id=None,
                 additional_properties = {}):
        """Constructor for the ImageManipulationModelResponse class"""

        # Initialize members of the class
        self.request = request
        self.url = url
        self.success = success
        self.moderated = moderated
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
        url = dictionary.get("url")
        success = dictionary.get("success")
        moderated = dictionary.get("moderated")
        id = dictionary.get("id")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(request,
                   url,
                   success,
                   moderated,
                   id,
                   dictionary)



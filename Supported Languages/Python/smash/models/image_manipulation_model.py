# -*- coding: utf-8 -*-

"""
    smash.models.image_manipulation_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class ImageManipulationModel(object):

    """Implementation of the 'Image Manipulation Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        image (string): TODO: type description here.
        transform (string): TODO: type description here.
        moderate (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "image" : "image",
        "transform" : "transform",
        "moderate" : "moderate"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 image=None,
                 transform=None,
                 moderate=None,
                 additional_properties = {}):
        """Constructor for the ImageManipulationModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.image = image
        self.transform = transform
        self.moderate = moderate

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
        image = dictionary.get("image")
        transform = dictionary.get("transform")
        moderate = dictionary.get("moderate")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   image,
                   transform,
                   moderate,
                   dictionary)



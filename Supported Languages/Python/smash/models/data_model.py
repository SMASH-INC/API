# -*- coding: utf-8 -*-

"""
    smash.models.data_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class DataModel(object):

    """Implementation of the 'Data Model' model.

    TODO: type model description here.

    Attributes:
        result (string): TODO: type description here.
        content (string): TODO: type description here.
        id (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "result" : "result",
        "content" : "content",
        "id" : "id"
    }

    def __init__(self,
                 result=None,
                 content=None,
                 id=None,
                 additional_properties = {}):
        """Constructor for the DataModel class"""

        # Initialize members of the class
        self.result = result
        self.content = content
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
        result = dictionary.get("result")
        content = dictionary.get("content")
        id = dictionary.get("id")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(result,
                   content,
                   id,
                   dictionary)



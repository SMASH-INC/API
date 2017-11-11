# -*- coding: utf-8 -*-

"""
    smash.models.encryption_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class EncryptionModelResponse(object):

    """Implementation of the 'Encryption Model Response' model.

    TODO: type model description here.

    Attributes:
        data (string): TODO: type description here.
        file (string): TODO: type description here.
        success (string): TODO: type description here.
        public (string): TODO: type description here.
        private (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "data" : "data",
        "file" : "file",
        "success" : "success",
        "public" : "public",
        "private" : "private"
    }

    def __init__(self,
                 data=None,
                 file=None,
                 success=None,
                 public=None,
                 private=None,
                 additional_properties = {}):
        """Constructor for the EncryptionModelResponse class"""

        # Initialize members of the class
        self.data = data
        self.file = file
        self.success = success
        self.public = public
        self.private = private

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
        data = dictionary.get("data")
        file = dictionary.get("file")
        success = dictionary.get("success")
        public = dictionary.get("public")
        private = dictionary.get("private")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(data,
                   file,
                   success,
                   public,
                   private,
                   dictionary)



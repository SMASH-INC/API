# -*- coding: utf-8 -*-

"""
    smash.models.cdn_push_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class CDNPushModelResponse(object):

    """Implementation of the 'CDN Push Model Response' model.

    TODO: type model description here.

    Attributes:
        success (string): TODO: type description here.
        upload (string): TODO: type description here.
        cname (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "success" : "success",
        "upload" : "upload",
        "cname" : "cname"
    }

    def __init__(self,
                 success=None,
                 upload=None,
                 cname=None,
                 additional_properties = {}):
        """Constructor for the CDNPushModelResponse class"""

        # Initialize members of the class
        self.success = success
        self.upload = upload
        self.cname = cname

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
        upload = dictionary.get("upload")
        cname = dictionary.get("cname")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(success,
                   upload,
                   cname,
                   dictionary)



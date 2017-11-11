# -*- coding: utf-8 -*-

"""
    smash.models.log_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""
import smash.models.mmddyyyyhhmmss_model

class LogModel(object):

    """Implementation of the 'Log Model' model.

    TODO: type model description here.

    Attributes:
        mmddyyyyhhmmssx (MMDDYYYYHHMMSSModel): TODO: type description here.
        mmddyyyyhhmmssy (MMDDYYYYHHMMSSModel): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "mmddyyyyhhmmssx" : "MMDDYYYYHHMMSSX",
        "mmddyyyyhhmmssy" : "MMDDYYYYHHMMSSY"
    }

    def __init__(self,
                 mmddyyyyhhmmssx=None,
                 mmddyyyyhhmmssy=None,
                 additional_properties = {}):
        """Constructor for the LogModel class"""

        # Initialize members of the class
        self.mmddyyyyhhmmssx = mmddyyyyhhmmssx
        self.mmddyyyyhhmmssy = mmddyyyyhhmmssy

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
        mmddyyyyhhmmssx = smash.models.mmddyyyyhhmmss_model.MMDDYYYYHHMMSSModel.from_dictionary(dictionary.get("MMDDYYYYHHMMSSX")) if dictionary.get("MMDDYYYYHHMMSSX") else None
        mmddyyyyhhmmssy = smash.models.mmddyyyyhhmmss_model.MMDDYYYYHHMMSSModel.from_dictionary(dictionary.get("MMDDYYYYHHMMSSY")) if dictionary.get("MMDDYYYYHHMMSSY") else None

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(mmddyyyyhhmmssx,
                   mmddyyyyhhmmssy,
                   dictionary)



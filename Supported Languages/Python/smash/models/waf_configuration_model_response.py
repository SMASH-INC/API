# -*- coding: utf-8 -*-

"""
    smash.models.waf_configuration_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class WAFConfigurationModelResponse(object):

    """Implementation of the 'WAF Configuration Model Response' model.

    TODO: type model description here.

    Attributes:
        success (string): TODO: type description here.
        rule (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "success" : "success",
        "rule" : "rule"
    }

    def __init__(self,
                 success=None,
                 rule=None,
                 additional_properties = {}):
        """Constructor for the WAFConfigurationModelResponse class"""

        # Initialize members of the class
        self.success = success
        self.rule = rule

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
        rule = dictionary.get("rule")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(success,
                   rule,
                   dictionary)



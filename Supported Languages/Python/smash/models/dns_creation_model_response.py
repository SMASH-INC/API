# -*- coding: utf-8 -*-

"""
    smash.models.dns_creation_model_response

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""
import smash.models.nameservers_model

class DNSCreationModelResponse(object):

    """Implementation of the 'DNS Creation Model Response' model.

    TODO: type model description here.

    Attributes:
        domain (string): TODO: type description here.
        nameservers (NameserversModel): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "domain" : "domain",
        "nameservers" : "nameservers"
    }

    def __init__(self,
                 domain=None,
                 nameservers=None,
                 additional_properties = {}):
        """Constructor for the DNSCreationModelResponse class"""

        # Initialize members of the class
        self.domain = domain
        self.nameservers = nameservers

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
        domain = dictionary.get("domain")
        nameservers = smash.models.nameservers_model.NameserversModel.from_dictionary(dictionary.get("nameservers")) if dictionary.get("nameservers") else None

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(domain,
                   nameservers,
                   dictionary)



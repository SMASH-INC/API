# -*- coding: utf-8 -*-

"""
    smash.models.nameservers_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class NameserversModel(object):

    """Implementation of the 'Nameservers Model' model.

    TODO: type model description here.

    Attributes:
        ns_1 (string): TODO: type description here.
        ns_2 (string): TODO: type description here.
        ns_3 (string): TODO: type description here.
        ns_4 (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "ns1" : "ns1",
        "ns2" : "ns2",
        "ns3" : "ns3",
        "ns4" : "ns4"
    }

    def __init__(self,
                 ns1=None,
                 ns2=None,
                 ns3=None,
                 ns4=None,
                 additional_properties = {}):
        """Constructor for the NameserversModel class"""

        # Initialize members of the class
        self.ns1 = ns1
        self.ns2 = ns2
        self.ns3 = ns3
        self.ns4 = ns4

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
        ns1 = dictionary.get("ns1")
        ns2 = dictionary.get("ns2")
        ns3 = dictionary.get("ns3")
        ns4 = dictionary.get("ns4")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(ns1,
                   ns2,
                   ns3,
                   ns4,
                   dictionary)



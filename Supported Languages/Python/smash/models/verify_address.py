# -*- coding: utf-8 -*-

"""
    smash.models.verify_address

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class VerifyAddress(object):

    """Implementation of the 'Verify Address' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        user (string): TODO: type description here.
        address (string): TODO: type description here.
        a (string): TODO: type description here.
        sa (string): TODO: type description here.
        c (string): TODO: type description here.
        s (string): TODO: type description here.
        z (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "user" : "user",
        "address" : "address",
        "a" : "a",
        "sa" : "sa",
        "c" : "c",
        "s" : "s",
        "z" : "z"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 user=None,
                 address=None,
                 a=None,
                 sa=None,
                 c=None,
                 s=None,
                 z=None,
                 additional_properties = {}):
        """Constructor for the VerifyAddress class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.user = user
        self.address = address
        self.a = a
        self.sa = sa
        self.c = c
        self.s = s
        self.z = z

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
        user = dictionary.get("user")
        address = dictionary.get("address")
        a = dictionary.get("a")
        sa = dictionary.get("sa")
        c = dictionary.get("c")
        s = dictionary.get("s")
        z = dictionary.get("z")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   user,
                   address,
                   a,
                   sa,
                   c,
                   s,
                   z,
                   dictionary)



# -*- coding: utf-8 -*-

"""
    smash.models.user_profile_information_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class UserProfileInformationModel(object):

    """Implementation of the 'User Profile Information Model' model.

    TODO: type model description here.

    Attributes:
        uid (string): TODO: type description here.
        apiuid (string): TODO: type description here.
        realname (string): TODO: type description here.
        displayname (string): TODO: type description here.
        email (string): TODO: type description here.
        address (string): TODO: type description here.
        phone (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "uid" : "uid",
        "apiuid" : "apiuid",
        "realname" : "realname",
        "displayname" : "displayname",
        "email" : "email",
        "address" : "address",
        "phone" : "phone"
    }

    def __init__(self,
                 uid=None,
                 apiuid=None,
                 realname=None,
                 displayname=None,
                 email=None,
                 address=None,
                 phone=None,
                 additional_properties = {}):
        """Constructor for the UserProfileInformationModel class"""

        # Initialize members of the class
        self.uid = uid
        self.apiuid = apiuid
        self.realname = realname
        self.displayname = displayname
        self.email = email
        self.address = address
        self.phone = phone

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
        uid = dictionary.get("uid")
        apiuid = dictionary.get("apiuid")
        realname = dictionary.get("realname")
        displayname = dictionary.get("displayname")
        email = dictionary.get("email")
        address = dictionary.get("address")
        phone = dictionary.get("phone")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(uid,
                   apiuid,
                   realname,
                   displayname,
                   email,
                   address,
                   phone,
                   dictionary)



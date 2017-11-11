# -*- coding: utf-8 -*-

"""
    smash.models.info_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class InfoModel(object):

    """Implementation of the 'Info Model' model.

    TODO: type model description here.

    Attributes:
        uid (string): TODO: type description here.
        apiuid (string): TODO: type description here.
        realname (string): TODO: type description here.
        displayname (string): TODO: type description here.
        avatar (string): TODO: type description here.
        email (string): TODO: type description here.
        address (string): TODO: type description here.
        phone (string): TODO: type description here.
        lastlogin (string): TODO: type description here.
        ip (string): TODO: type description here.
        2_fa (string): TODO: type description here.
        iplock (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "uid" : "uid",
        "apiuid" : "apiuid",
        "realname" : "realname",
        "displayname" : "displayname",
        "avatar" : "avatar",
        "email" : "email",
        "address" : "address",
        "phone" : "phone",
        "lastlogin" : "lastlogin",
        "ip" : "ip",
        "2fa" : "2fa",
        "iplock" : "iplock"
    }

    def __init__(self,
                 uid=None,
                 apiuid=None,
                 realname=None,
                 displayname=None,
                 avatar=None,
                 email=None,
                 address=None,
                 phone=None,
                 lastlogin=None,
                 ip=None,
                 2fa=None,
                 iplock=None,
                 additional_properties = {}):
        """Constructor for the InfoModel class"""

        # Initialize members of the class
        self.uid = uid
        self.apiuid = apiuid
        self.realname = realname
        self.displayname = displayname
        self.avatar = avatar
        self.email = email
        self.address = address
        self.phone = phone
        self.lastlogin = lastlogin
        self.ip = ip
        self.2fa = 2fa
        self.iplock = iplock

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
        avatar = dictionary.get("avatar")
        email = dictionary.get("email")
        address = dictionary.get("address")
        phone = dictionary.get("phone")
        lastlogin = dictionary.get("lastlogin")
        ip = dictionary.get("ip")
        2fa = dictionary.get("2fa")
        iplock = dictionary.get("iplock")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(uid,
                   apiuid,
                   realname,
                   displayname,
                   avatar,
                   email,
                   address,
                   phone,
                   lastlogin,
                   ip,
                   2fa,
                   iplock,
                   dictionary)



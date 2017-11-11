# -*- coding: utf-8 -*-

"""
    smash.models.user_update_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class UserUpdateModel(object):

    """Implementation of the 'User Update Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        user (string): TODO: type description here.
        apiuid (string): TODO: type description here.
        oldpassword (string): TODO: type description here.
        newpassword (string): TODO: type description here.
        name (string): TODO: type description here.
        email (string): TODO: type description here.
        phone (string): TODO: type description here.
        avatar (string): TODO: type description here.
        countrycode (string): TODO: type description here.
        address (string): TODO: type description here.
        a (string): TODO: type description here.
        sa (string): TODO: type description here.
        c (string): TODO: type description here.
        s (string): TODO: type description here.
        z (string): TODO: type description here.
        custom_input (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "key" : "key",
        "uid" : "uid",
        "user" : "user",
        "apiuid" : "apiuid",
        "oldpassword" : "oldpassword",
        "newpassword" : "newpassword",
        "name" : "name",
        "email" : "email",
        "phone" : "phone",
        "avatar" : "avatar",
        "countrycode" : "countrycode",
        "address" : "address",
        "a" : "a",
        "sa" : "sa",
        "c" : "c",
        "s" : "s",
        "z" : "z",
        "custom_input" : "custom-input"
    }

    def __init__(self,
                 key=None,
                 uid=None,
                 user=None,
                 apiuid=None,
                 oldpassword=None,
                 newpassword=None,
                 name=None,
                 email=None,
                 phone=None,
                 avatar=None,
                 countrycode=None,
                 address=None,
                 a=None,
                 sa=None,
                 c=None,
                 s=None,
                 z=None,
                 custom_input=None,
                 additional_properties = {}):
        """Constructor for the UserUpdateModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.user = user
        self.apiuid = apiuid
        self.oldpassword = oldpassword
        self.newpassword = newpassword
        self.name = name
        self.email = email
        self.phone = phone
        self.avatar = avatar
        self.countrycode = countrycode
        self.address = address
        self.a = a
        self.sa = sa
        self.c = c
        self.s = s
        self.z = z
        self.custom_input = custom_input

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
        apiuid = dictionary.get("apiuid")
        oldpassword = dictionary.get("oldpassword")
        newpassword = dictionary.get("newpassword")
        name = dictionary.get("name")
        email = dictionary.get("email")
        phone = dictionary.get("phone")
        avatar = dictionary.get("avatar")
        countrycode = dictionary.get("countrycode")
        address = dictionary.get("address")
        a = dictionary.get("a")
        sa = dictionary.get("sa")
        c = dictionary.get("c")
        s = dictionary.get("s")
        z = dictionary.get("z")
        custom_input = dictionary.get("custom-input")

        # Clean out expected properties from dictionary
        for key in cls._names.values():
            if key in dictionary:
                del dictionary[key]

        # Return an object of this model
        return cls(key,
                   uid,
                   user,
                   apiuid,
                   oldpassword,
                   newpassword,
                   name,
                   email,
                   phone,
                   avatar,
                   countrycode,
                   address,
                   a,
                   sa,
                   c,
                   s,
                   z,
                   custom_input,
                   dictionary)



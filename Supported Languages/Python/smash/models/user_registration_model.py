# -*- coding: utf-8 -*-

"""
    smash.models.user_registration_model

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""


class UserRegistrationModel(object):

    """Implementation of the 'User Registration Model' model.

    TODO: type model description here.

    Attributes:
        key (string): TODO: type description here.
        uid (string): TODO: type description here.
        user (string): TODO: type description here.
        password (string): TODO: type description here.
        name (string): TODO: type description here.
        email (string): TODO: type description here.
        phone (string): TODO: type description here.
        countrycode (string): TODO: type description here.
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
        "password" : "password",
        "name" : "name",
        "email" : "email",
        "phone" : "phone",
        "countrycode" : "countrycode",
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
                 password=None,
                 name=None,
                 email=None,
                 phone=None,
                 countrycode=None,
                 address=None,
                 a=None,
                 sa=None,
                 c=None,
                 s=None,
                 z=None,
                 additional_properties = {}):
        """Constructor for the UserRegistrationModel class"""

        # Initialize members of the class
        self.key = key
        self.uid = uid
        self.user = user
        self.password = password
        self.name = name
        self.email = email
        self.phone = phone
        self.countrycode = countrycode
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
        password = dictionary.get("password")
        name = dictionary.get("name")
        email = dictionary.get("email")
        phone = dictionary.get("phone")
        countrycode = dictionary.get("countrycode")
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
                   password,
                   name,
                   email,
                   phone,
                   countrycode,
                   address,
                   a,
                   sa,
                   c,
                   s,
                   z,
                   dictionary)



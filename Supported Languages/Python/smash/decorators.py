# -*- coding: utf-8 -*-

"""
   smash.decorators

   This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
"""

class lazy_property(object):

    """A decorator class for lazy instantiation."""

    def __init__(self, fget):
        self.fget = fget
        self.func_name = fget.__name__

    def __get__(self, obj, cls):
        if obj is None:
            return None
        value = self.fget(obj)
        setattr(obj, self.func_name, value)
        return value

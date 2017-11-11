# -*- coding: utf-8 -*-

"""
    smash.smash_client

    This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).
"""
from .decorators import lazy_property
from .configuration import Configuration
from .controllers.advanced_logging import AdvancedLogging
from .controllers.waf_and_ddos_protection import WAFAndDDOSProtection
from .controllers.encryption import Encryption
from .controllers.cdn import CDN
from .controllers.dns import DNS
from .controllers.code_obfuscation import CodeObfuscation
from .controllers.hosting import Hosting
from .controllers.data_manipulation import DataManipulation
from .controllers.image_manipulation import ImageManipulation
from .controllers.verification import Verification
from .controllers.two_factor_authentication_api import TwoFactorAuthenticationAPI
from .controllers.user_management import UserManagement
from .controllers.login_and_registration import LoginAndRegistration

class SMASH(object):

    config = Configuration

    @lazy_property
    def advanced_logging(self):
        return AdvancedLogging()

    @lazy_property
    def waf_and_ddos_protection(self):
        return WAFAndDDOSProtection()

    @lazy_property
    def encryption(self):
        return Encryption()

    @lazy_property
    def cdn(self):
        return CDN()

    @lazy_property
    def dns(self):
        return DNS()

    @lazy_property
    def code_obfuscation(self):
        return CodeObfuscation()

    @lazy_property
    def hosting(self):
        return Hosting()

    @lazy_property
    def data_manipulation(self):
        return DataManipulation()

    @lazy_property
    def image_manipulation(self):
        return ImageManipulation()

    @lazy_property
    def verification(self):
        return Verification()

    @lazy_property
    def two_factor_authentication_api(self):
        return TwoFactorAuthenticationAPI()

    @lazy_property
    def user_management(self):
        return UserManagement()

    @lazy_property
    def login_and_registration(self):
        return LoginAndRegistration()


    def __init__(self, 
                 uid = 'UID',
                 secret = 'SECRET',
                 key = 'KEY'):
        if uid != None:
            Configuration.uid = uid
        if secret != None:
            Configuration.secret = secret
        if key != None:
            Configuration.key = key



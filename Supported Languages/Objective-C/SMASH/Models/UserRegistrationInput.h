//
//  UserRegistrationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERREGISTRATIONINPUT
#define SMASH_USERREGISTRATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UserRegistrationInput
@end

@interface UserRegistrationInput : NSObject

/**
* Users Email
*/
@property NSString* email;

/**
* Users Username
*/
@property NSString* user;

/**
* Users Password
*/
@property NSString* password;

/**
* Users Name
*/
@property NSString* name;

/**
* Users Cellphone Number
*/
@property NSNumber* phone;

/**
* Users Country Code (US = 1)
*/
@property NSNumber* countrycode;

/**
* Users Address
*/
@property NSString* address;

@end
#endif
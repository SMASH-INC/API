//
//  UserAuthenticationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERAUTHENTICATIONINPUT
#define SMASH_USERAUTHENTICATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UserAuthenticationInput
@end

@interface UserAuthenticationInput : NSObject

/**
* Users Username or Email
*/
@property NSString* user;

/**
* Users Password
*/
@property NSString* password;

@end
#endif
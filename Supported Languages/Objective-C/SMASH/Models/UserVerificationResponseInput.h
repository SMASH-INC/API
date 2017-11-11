//
//  UserVerificationResponseInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERVERIFICATIONRESPONSEINPUT
#define SMASH_USERVERIFICATIONRESPONSEINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UserVerificationResponseInput
@end

@interface UserVerificationResponseInput : NSObject

/**
* Users UID, Username, Or Email
*/
@property NSString* user;

/**
* Verification code entered by the user
*/
@property NSString* code;

@end
#endif
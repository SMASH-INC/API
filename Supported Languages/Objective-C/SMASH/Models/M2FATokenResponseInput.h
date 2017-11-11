//
//  M2FATokenResponseInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_M2FATOKENRESPONSEINPUT
#define SMASH_M2FATOKENRESPONSEINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol M2FATokenResponseInput
@end

@interface M2FATokenResponseInput : NSObject

/**
* Users UID, Username or Email
*/
@property NSString* user;

/**
* Response From User Containing 2FA Code
*/
@property NSString* code;

@end
#endif
//
//  UpdateUserInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_UPDATEUSERINPUT
#define SMASH_UPDATEUSERINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UpdateUserInput
@end

@interface UpdateUserInput : NSObject

/**
* Users UID, Username, Or Email
*/
@property NSString* user;

/**
* Avatar Image URL
*/
@property NSString* avatar;

/**
* Custom input variable for users profile
*/
@property NSString* customInput;

@end
#endif
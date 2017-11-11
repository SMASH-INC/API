//
//  UserAddressVerificationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERADDRESSVERIFICATIONINPUT
#define SMASH_USERADDRESSVERIFICATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UserAddressVerificationInput
@end

@interface UserAddressVerificationInput : NSObject

/**
* Users UID, Username, or Email
*/
@property NSString* user;

/**
* Address Line One
*/
@property NSString* a;

/**
* Address Line Two
*/
@property NSString* sa;

/**
* Address City
*/
@property NSString* c;

/**
* Address State or Province
*/
@property NSString* s;

/**
* Address Zipcode
*/
@property int z;

/**
* Address as a one line input separated by commas
*/
@property NSString* address;

@end
#endif
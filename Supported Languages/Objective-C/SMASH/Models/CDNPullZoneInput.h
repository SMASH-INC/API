//
//  CDNPullZoneInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_CDNPULLZONEINPUT
#define SMASH_CDNPULLZONEINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol CDNPullZoneInput
@end

@interface CDNPullZoneInput : NSObject

/**
* Domain or domain names separated by a comma
*/
@property NSString* origin;

/**
* Domain or domain names separated by a comma you wish to allow CNAME access
*/
@property NSString* cname;

@end
#endif
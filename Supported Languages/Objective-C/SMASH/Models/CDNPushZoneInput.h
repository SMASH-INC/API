//
//  CDNPushZoneInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_CDNPUSHZONEINPUT
#define SMASH_CDNPUSHZONEINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol CDNPushZoneInput
@end

@interface CDNPushZoneInput : NSObject

/**
* Domain or domain names separated by a comma you wish to allow CNAME access
*/
@property NSString* cname;

/**
* GIT URL, file URL, or direct upload of file
*/
@property NSString* file;

@end
#endif
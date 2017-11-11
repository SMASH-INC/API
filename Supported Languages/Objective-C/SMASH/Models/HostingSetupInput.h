//
//  HostingSetupInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_HOSTINGSETUPINPUT
#define SMASH_HOSTINGSETUPINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol HostingSetupInput
@end

@interface HostingSetupInput : NSObject

/**
* GIT URL or ZIP package containing your APP
*/
@property NSString* app;

/**
* Domain or domain names separated by a comma
*/
@property NSString* domain;

@end
#endif
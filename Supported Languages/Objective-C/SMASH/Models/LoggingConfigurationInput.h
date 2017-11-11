//
//  LoggingConfigurationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_LOGGINGCONFIGURATIONINPUT
#define SMASH_LOGGINGCONFIGURATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol LoggingConfigurationInput
@end

@interface LoggingConfigurationInput : NSObject

/**
* Name of the WAF zone
*/
@property NSString* name;

/**
* IP Address of the Web Application you wish to configure logging on
*/
@property NSString* origin;

/**
* Activate or Disable
*/
@property NSString* activate;

@end
#endif
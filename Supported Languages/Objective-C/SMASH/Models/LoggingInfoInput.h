//
//  LoggingInfoInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_LOGGINGINFOINPUT
#define SMASH_LOGGINGINFOINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol LoggingInfoInput
@end

@interface LoggingInfoInput : NSObject

/**
* Name of your WAF zone
*/
@property NSString* name;

/**
* IP Address of the Web Application
*/
@property NSString* origin;

/**
* Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
*/
@property NSString* time;

@end
#endif
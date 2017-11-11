//
//  WAFConfigurationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_WAFCONFIGURATIONINPUT
#define SMASH_WAFCONFIGURATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol WAFConfigurationInput
@end

@interface WAFConfigurationInput : NSObject

/**
* Name of your WAF zone
*/
@property NSString* name;

/**
* Rule or rules to add or update separated by a comma
*/
@property NSString* rule;

@end
#endif
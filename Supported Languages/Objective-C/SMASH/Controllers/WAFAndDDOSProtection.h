//
//  WAFAndDDOSProtection.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import "Configuration.h"
#import "APIHelper.h"
#import "APIError.h"
#import "BaseController.h"
#import "UnirestClient.h"
#import "HttpContext.h"
#import "WAFConfigurationModelResponse.h"
#import "WAFConfigurationInput.h"
#import "WAFCreationModelResponse.h"
#import "WAFCreationInput.h"

@interface WAFAndDDOSProtection : BaseController

/**
* Completion block definition for asynchronous call to WAF Configuration */
typedef void (^CompletedGetWAFConfiguration)(BOOL success, HttpContext* context, WAFConfigurationModelResponse* response, NSError* error);

/**
* WAF and DDOS Configuration
* @param  WAFConfigurationInput     Object with all parameters
*/
- (void) wAFConfigurationAsyncWithWAFConfigurationInput:(WAFConfigurationInput*) input
                completionBlock:(CompletedGetWAFConfiguration) onCompleted;

/**
* Completion block definition for asynchronous call to WAF Creation */
typedef void (^CompletedGetWAFCreation)(BOOL success, HttpContext* context, WAFCreationModelResponse* response, NSError* error);

/**
* WAF and DDOS Creation
* @param  WAFCreationInput     Object with all parameters
*/
- (void) wAFCreationAsyncWithWAFCreationInput:(WAFCreationInput*) input
                completionBlock:(CompletedGetWAFCreation) onCompleted;

@end
//
//  AdvancedLogging.h
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
#import "LoggingSetupModelResponse.h"
#import "LoggingConfigurationInput.h"
#import "LoggingLogsModelResponse.h"
#import "LoggingInfoInput.h"

@interface AdvancedLogging : BaseController

/**
* Completion block definition for asynchronous call to Logging Configuration */
typedef void (^CompletedGetLoggingConfiguration)(BOOL success, HttpContext* context, LoggingSetupModelResponse* response, NSError* error);

/**
* WAF Log Configuration
* @param  LoggingConfigurationInput     Object with all parameters
*/
- (void) loggingConfigurationAsyncWithLoggingConfigurationInput:(LoggingConfigurationInput*) input
                completionBlock:(CompletedGetLoggingConfiguration) onCompleted;

/**
* Completion block definition for asynchronous call to Logging Info */
typedef void (^CompletedGetLoggingInfo)(BOOL success, HttpContext* context, LoggingLogsModelResponse* response, NSError* error);

/**
* WAF Log Info
* @param  LoggingInfoInput     Object with all parameters
*/
- (void) loggingInfoAsyncWithLoggingInfoInput:(LoggingInfoInput*) input
                completionBlock:(CompletedGetLoggingInfo) onCompleted;

@end
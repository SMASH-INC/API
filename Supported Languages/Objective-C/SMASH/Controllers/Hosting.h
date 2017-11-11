//
//  Hosting.h
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
#import "HostingModelResponse.h"
#import "HostingSetupInput.h"

@interface Hosting : BaseController

/**
* Completion block definition for asynchronous call to Hosting Setup */
typedef void (^CompletedGetHostingSetup)(BOOL success, HttpContext* context, HostingModelResponse* response, NSError* error);

/**
* Node.JS and Static Web APP Hosting
* @param  HostingSetupInput     Object with all parameters
*/
- (void) hostingSetupAsyncWithHostingSetupInput:(HostingSetupInput*) input
                completionBlock:(CompletedGetHostingSetup) onCompleted;

@end
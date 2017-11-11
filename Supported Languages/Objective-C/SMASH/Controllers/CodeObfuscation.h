//
//  CodeObfuscation.h
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
#import "CodeProtectionModelResponse.h"

@interface CodeObfuscation : BaseController

/**
* Completion block definition for asynchronous call to Obfuscation and Anti-Tampering */
typedef void (^CompletedGetObfuscationAndAntiTampering)(BOOL success, HttpContext* context, CodeProtectionModelResponse* response, NSError* error);

/**
* Javascript and Node.JS Obfuscation and Anti-Tampering API
* @param    app    Required parameter: GIT URL or ZIP package containing your APP
*/
- (void) obfuscationAndAntiTamperingAsyncWithApp:(NSString*) app
                completionBlock:(CompletedGetObfuscationAndAntiTampering) onCompleted;

@end
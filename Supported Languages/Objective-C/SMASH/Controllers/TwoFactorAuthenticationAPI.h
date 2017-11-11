//
//  TwoFactorAuthenticationAPI.h
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
#import "TwoFactorAuthenticationTokenModelResponse.h"
#import "M2FATokenResponseInput.h"
#import "TwoFactorAuthenticationModelResponse.h"

@interface TwoFactorAuthenticationAPI : BaseController

/**
* Completion block definition for asynchronous call to 2FA Token Response */
typedef void (^CompletedGetM2FATokenResponse)(BOOL success, HttpContext* context, TwoFactorAuthenticationTokenModelResponse* response, NSError* error);

/**
* Two Factor Authentication Token Reply
* @param  M2FATokenResponseInput     Object with all parameters
*/
- (void) m2FATokenResponseAsyncWithM2FATokenResponseInput:(M2FATokenResponseInput*) input
                completionBlock:(CompletedGetM2FATokenResponse) onCompleted;

/**
* Completion block definition for asynchronous call to Two Factor Authentication */
typedef void (^CompletedGetTwoFactorAuthentication)(BOOL success, HttpContext* context, TwoFactorAuthenticationModelResponse* response, NSError* error);

/**
* Two Factor Authentication API
* @param    to    Required parameter: Users UID, Username, Email, Or Cellphone number
*/
- (void) twoFactorAuthenticationAsyncWithTo:(NSString*) to
                completionBlock:(CompletedGetTwoFactorAuthentication) onCompleted;

@end
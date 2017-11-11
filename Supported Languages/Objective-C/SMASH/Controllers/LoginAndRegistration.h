//
//  LoginAndRegistration.h
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
#import "UserRegistrationModelResponse.h"
#import "UserRegistrationInput.h"
#import "UserAuthenticationModelResponse.h"
#import "UserAuthenticationInput.h"

@interface LoginAndRegistration : BaseController

/**
* Completion block definition for asynchronous call to User Registration */
typedef void (^CompletedGetUserRegistration)(BOOL success, HttpContext* context, UserRegistrationModelResponse* response, NSError* error);

/**
* User Registration API
* @param  UserRegistrationInput     Object with all parameters
* @param    queryParameters    Additional optional query parameters are supported by this endpoint
*/
- (void) userRegistrationAsyncWithUserRegistrationInput:(UserRegistrationInput*) input
                queryParameters:(NSDictionary*) queryParameters
                completionBlock:(CompletedGetUserRegistration) onCompleted;

/**
* Completion block definition for asynchronous call to User Authentication */
typedef void (^CompletedGetUserAuthentication)(BOOL success, HttpContext* context, UserAuthenticationModelResponse* response, NSError* error);

/**
* User Authentication API
* @param  UserAuthenticationInput     Object with all parameters
*/
- (void) userAuthenticationAsyncWithUserAuthenticationInput:(UserAuthenticationInput*) input
                completionBlock:(CompletedGetUserAuthentication) onCompleted;

@end
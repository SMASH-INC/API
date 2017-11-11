//
//  Verification.h
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
#import "VerifyAddressResponse.h"
#import "UserAddressVerificationInput.h"
#import "VerifyUserModelResponse.h"
#import "UserVerificationResponseInput.h"
#import "VerifyModelResponse.h"

@interface Verification : BaseController

/**
* Completion block definition for asynchronous call to User Address Verification */
typedef void (^CompletedGetUserAddressVerification)(BOOL success, HttpContext* context, VerifyAddressResponse* response, NSError* error);

/**
* User Address Verification API
* @param  UserAddressVerificationInput     Object with all parameters
*/
- (void) userAddressVerificationAsyncWithUserAddressVerificationInput:(UserAddressVerificationInput*) input
                completionBlock:(CompletedGetUserAddressVerification) onCompleted;

/**
* Completion block definition for asynchronous call to User Verification Response */
typedef void (^CompletedGetUserVerificationResponse)(BOOL success, HttpContext* context, VerifyUserModelResponse* response, NSError* error);

/**
* Users Verification Response API
* @param  UserVerificationResponseInput     Object with all parameters
*/
- (void) userVerificationResponseAsyncWithUserVerificationResponseInput:(UserVerificationResponseInput*) input
                completionBlock:(CompletedGetUserVerificationResponse) onCompleted;

/**
* Completion block definition for asynchronous call to User Verification */
typedef void (^CompletedGetUserVerification)(BOOL success, HttpContext* context, VerifyModelResponse* response, NSError* error);

/**
* User Verification API
* @param    user    Required parameter: Users UID, Username, Or Email
*/
- (void) userVerificationAsyncWithUser:(NSString*) user
                completionBlock:(CompletedGetUserVerification) onCompleted;

@end
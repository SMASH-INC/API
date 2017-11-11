//
//  UserManagement.h
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
#import "UserInformationModelResponse.h"
#import "UserUpdateModelResponse.h"
#import "UpdateUserInput.h"
#import "UserDeletionResponseModel.h"

@interface UserManagement : BaseController

/**
* Completion block definition for asynchronous call to Get User Info */
typedef void (^CompletedGetUserInfo)(BOOL success, HttpContext* context, UserInformationModelResponse* response, NSError* error);

/**
* Get User Info API
* @param    user    Required parameter: Users User ID
*/
- (void) getUserInfoAsyncWithUser:(NSString*) user
                completionBlock:(CompletedGetUserInfo) onCompleted;

/**
* Completion block definition for asynchronous call to Update User */
typedef void (^CompletedGetUpdateUser)(BOOL success, HttpContext* context, UserUpdateModelResponse* response, NSError* error);

/**
* Update User API
* @param  UpdateUserInput     Object with all parameters
* @param    queryParameters    Additional optional query parameters are supported by this endpoint
*/
- (void) updateUserAsyncWithUpdateUserInput:(UpdateUserInput*) input
                queryParameters:(NSDictionary*) queryParameters
                completionBlock:(CompletedGetUpdateUser) onCompleted;

/**
* Completion block definition for asynchronous call to Delete User */
typedef void (^CompletedGetDeleteUser)(BOOL success, HttpContext* context, UserDeletionResponseModel* response, NSError* error);

/**
* Delete User API
* @param    user    Required parameter: Users UID, Username, or Email
*/
- (void) deleteUserAsyncWithUser:(NSString*) user
                completionBlock:(CompletedGetDeleteUser) onCompleted;

@end
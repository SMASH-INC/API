//
//  CDN.h
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
#import "CDNPushModelResponse.h"
#import "CDNPushZoneInput.h"
#import "CDNPullModelResponse.h"
#import "CDNPullZoneInput.h"

@interface CDN : BaseController

/**
* Completion block definition for asynchronous call to CDN Push Zone */
typedef void (^CompletedGetCDNPushZone)(BOOL success, HttpContext* context, CDNPushModelResponse* response, NSError* error);

/**
* CDN Push Zone API
* @param  CDNPushZoneInput     Object with all parameters
*/
- (void) cDNPushZoneAsyncWithCDNPushZoneInput:(CDNPushZoneInput*) input
                completionBlock:(CompletedGetCDNPushZone) onCompleted;

/**
* Completion block definition for asynchronous call to CDN Pull Zone */
typedef void (^CompletedGetCDNPullZone)(BOOL success, HttpContext* context, CDNPullModelResponse* response, NSError* error);

/**
* CDN Pull Zone API
* @param  CDNPullZoneInput     Object with all parameters
*/
- (void) cDNPullZoneAsyncWithCDNPullZoneInput:(CDNPullZoneInput*) input
                completionBlock:(CompletedGetCDNPullZone) onCompleted;

@end
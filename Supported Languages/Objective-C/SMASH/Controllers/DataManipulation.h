//
//  DataManipulation.h
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
#import "DataManipulationModelResponse.h"
#import "HttpsApiRestShApiDInput.h"

@interface DataManipulation : BaseController

/**
* Completion block definition for asynchronous call to https://api.rest.sh/api/d */
typedef void (^CompletedGetHttpsApiRestShApiD)(BOOL success, HttpContext* context, DataManipulationModelResponse* response, NSError* error);

/**
* Data Manipulation API
* @param  HttpsApiRestShApiDInput     Object with all parameters
*/
- (void) httpsApiRestShApiDAsyncWithHttpsApiRestShApiDInput:(HttpsApiRestShApiDInput*) input
                completionBlock:(CompletedGetHttpsApiRestShApiD) onCompleted;

@end
//
//  ImageManipulation.h
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
#import "ImageManipulationModelResponse.h"
#import "ImageManipulationInput.h"

@interface ImageManipulation : BaseController

/**
* Completion block definition for asynchronous call to Image Manipulation */
typedef void (^CompletedGetImageManipulation)(BOOL success, HttpContext* context, ImageManipulationModelResponse* response, NSError* error);

/**
* Image Manipulation API
* @param  ImageManipulationInput     Object with all parameters
*/
- (void) imageManipulationAsyncWithImageManipulationInput:(ImageManipulationInput*) input
                completionBlock:(CompletedGetImageManipulation) onCompleted;

@end
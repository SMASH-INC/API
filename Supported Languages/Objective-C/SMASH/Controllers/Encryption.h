//
//  Encryption.h
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
#import "EncryptionModelResponse.h"
#import "DataAndFileEncryptionInput.h"

@interface Encryption : BaseController

/**
* Completion block definition for asynchronous call to Data and File Encryption */
typedef void (^CompletedGetDataAndFileEncryption)(BOOL success, HttpContext* context, EncryptionModelResponse* response, NSError* error);

/**
* Data and File Encryption API
* @param  DataAndFileEncryptionInput     Object with all parameters
*/
- (void) dataAndFileEncryptionAsyncWithDataAndFileEncryptionInput:(DataAndFileEncryptionInput*) input
                completionBlock:(CompletedGetDataAndFileEncryption) onCompleted;

@end
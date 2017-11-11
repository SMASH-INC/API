//
//  DNS.h
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
#import "DNSConfigurationModelResponse.h"
#import "DNSConfigurationInput.h"
#import "DNSCreationModelResponse.h"

@interface DNS : BaseController

/**
* Completion block definition for asynchronous call to DNS Configuration */
typedef void (^CompletedGetDNSConfiguration)(BOOL success, HttpContext* context, DNSConfigurationModelResponse* response, NSError* error);

/**
* DNS Configuration API
* @param  DNSConfigurationInput     Object with all parameters
*/
- (void) dNSConfigurationAsyncWithDNSConfigurationInput:(DNSConfigurationInput*) input
                completionBlock:(CompletedGetDNSConfiguration) onCompleted;

/**
* Completion block definition for asynchronous call to DNS Creation */
typedef void (^CompletedGetDNSCreation)(BOOL success, HttpContext* context, DNSCreationModelResponse* response, NSError* error);

/**
* DNS Creation API
* @param    domain    Required parameter: Domain or domain names separated by a comma
*/
- (void) dNSCreationAsyncWithDomain:(NSString*) domain
                completionBlock:(CompletedGetDNSCreation) onCompleted;

@end
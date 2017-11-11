//
//  HttpsApiRestShApiDInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_HTTPSAPIRESTSHAPIDINPUT
#define SMASH_HTTPSAPIRESTSHAPIDINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol HttpsApiRestShApiDInput
@end

@interface HttpsApiRestShApiDInput : NSObject

/**
* Data URL, data as a query string, or direct upload
*/
@property NSString* data;

/**
* Transformations to perform
*/
@property NSString* transform;

@end
#endif
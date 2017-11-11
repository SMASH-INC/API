//
//  OAuthUtility.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "Configuration.h"
#import "HttpRequest.h"

@interface CustomAuthUtility : NSObject

/**
* Appends the necessary Custom Authentication credentials for making this authorized call
* @param	request	The out going request to access the resource
*/
+(void) appendCustomAuthParams:(HttpRequest*) request;

@end
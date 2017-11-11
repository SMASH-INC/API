//
//  CustomAuthUtility.m
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "CustomAuthUtility.h"

@implementation CustomAuthUtility

/**
* Appends the necessary OAuth credentials for making this authorized call
* @param	request	The out going request to access the resource
*/
+(void) appendCustomAuthParams:(HttpRequest*) request
{
    // TODO: Add your custom authentication here
    // The following properties are available to use
	//     Configuration_Uid
	//     Configuration_Secret
	//     Configuration_Key
    // 
    // ie. Add a header through:
    //     request.header("Key", "Value");
}

@end

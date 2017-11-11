//
//  LoggingInfoInput.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "LoggingInfoInput.h"

@implementation LoggingInfoInput

/**
* Name of your WAF zone
*/
@synthesize name;

/**
* IP Address of the Web Application
*/
@synthesize origin;

/**
* Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
*/
@synthesize time;

@end
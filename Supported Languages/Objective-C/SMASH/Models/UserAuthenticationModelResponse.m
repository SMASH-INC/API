//
//  UserAuthenticationModelResponse.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "UserAuthenticationModelResponse.h"

@implementation UserAuthenticationModelResponse

/**
* TODO: Write general description for this method
*/
@synthesize request;

/**
* TODO: Write general description for this method
*/
@synthesize uid;

/**
* TODO: Write general description for this method
*/
@synthesize valid;

/**
* TODO: Write general description for this method
*/
@synthesize mid;

/**
* TODO: Write general description for this method
*/
@synthesize info;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"request": @"request",
        @"uid": @"uid",
        @"valid": @"valid",
        @"id": @"mid",
        @"info": @"info"  
    }];

    return map;
}

/**
* Key mapper for json serialization and deserialization
*/
+(JSONKeyMapper*) keyMapper
{ 
  return [[JSONKeyMapper alloc] initWithDictionary: [self keyMap]];
}

/**
* Helps avoiding deserialization errors when one or more properties are missing
* @returns	True, indicating that all properties are optional for deserialization
*/
+(BOOL)propertyIsOptional:(NSString*) propertyName
{
    return YES;
}

@end
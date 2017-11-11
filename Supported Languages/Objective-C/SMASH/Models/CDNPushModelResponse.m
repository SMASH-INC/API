//
//  CDNPushModelResponse.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "CDNPushModelResponse.h"

@implementation CDNPushModelResponse

/**
* TODO: Write general description for this method
*/
@synthesize success;

/**
* TODO: Write general description for this method
*/
@synthesize upload;

/**
* TODO: Write general description for this method
*/
@synthesize cname;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"success": @"success",
        @"upload": @"upload",
        @"cname": @"cname"  
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
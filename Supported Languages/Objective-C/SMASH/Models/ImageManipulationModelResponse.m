//
//  ImageManipulationModelResponse.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "ImageManipulationModelResponse.h"

@implementation ImageManipulationModelResponse

/**
* TODO: Write general description for this method
*/
@synthesize request;

/**
* TODO: Write general description for this method
*/
@synthesize url;

/**
* TODO: Write general description for this method
*/
@synthesize success;

/**
* TODO: Write general description for this method
*/
@synthesize moderated;

/**
* TODO: Write general description for this method
*/
@synthesize mid;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"request": @"request",
        @"url": @"url",
        @"success": @"success",
        @"moderated": @"moderated",
        @"id": @"mid"  
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
//
//  LoggingSetupModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "LoggingSetupModel.h"

@implementation LoggingSetupModel

/**
* TODO: Write general description for this method
*/
@synthesize key;

/**
* TODO: Write general description for this method
*/
@synthesize uid;

/**
* TODO: Write general description for this method
*/
@synthesize name;

/**
* TODO: Write general description for this method
*/
@synthesize origin;

/**
* TODO: Write general description for this method
*/
@synthesize activate;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"key": @"key",
        @"uid": @"uid",
        @"name": @"name",
        @"origin": @"origin",
        @"activate": @"activate"  
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
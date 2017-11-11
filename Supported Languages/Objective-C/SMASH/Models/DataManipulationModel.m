//
//  DataManipulationModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "DataManipulationModel.h"

@implementation DataManipulationModel

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
@synthesize user;

/**
* TODO: Write general description for this method
*/
@synthesize apiuid;

/**
* TODO: Write general description for this method
*/
@synthesize url;

/**
* TODO: Write general description for this method
*/
@synthesize manipulation;

/**
* TODO: Write general description for this method
*/
@synthesize conversion;

/**
* TODO: Write general description for this method
*/
@synthesize sorting;

/**
* TODO: Write general description for this method
*/
@synthesize compression;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"key": @"key",
        @"uid": @"uid",
        @"user": @"user",
        @"apiuid": @"apiuid",
        @"url": @"url",
        @"manipulation": @"manipulation",
        @"conversion": @"conversion",
        @"sorting": @"sorting",
        @"compression": @"compression"  
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
//
//  HostingModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "HostingModel.h"

@implementation HostingModel

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
@synthesize app;

/**
* TODO: Write general description for this method
*/
@synthesize domain;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"key": @"key",
        @"uid": @"uid",
        @"app": @"app",
        @"domain": @"domain"  
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
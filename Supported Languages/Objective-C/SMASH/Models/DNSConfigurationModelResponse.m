//
//  DNSConfigurationModelResponse.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "DNSConfigurationModelResponse.h"

@implementation DNSConfigurationModelResponse

/**
* TODO: Write general description for this method
*/
@synthesize success;

/**
* TODO: Write general description for this method
*/
@synthesize domain;

/**
* TODO: Write general description for this method
*/
@synthesize records;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"success": @"success",
        @"domain": @"domain",
        @"records": @"records"  
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
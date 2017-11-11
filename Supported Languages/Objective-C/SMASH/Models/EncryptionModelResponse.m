//
//  EncryptionModelResponse.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "EncryptionModelResponse.h"

@implementation EncryptionModelResponse

/**
* TODO: Write general description for this method
*/
@synthesize data;

/**
* TODO: Write general description for this method
*/
@synthesize file;

/**
* TODO: Write general description for this method
*/
@synthesize success;

/**
* TODO: Write general description for this method
*/
@synthesize mpublic;

/**
* TODO: Write general description for this method
*/
@synthesize mprivate;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"data": @"data",
        @"file": @"file",
        @"success": @"success",
        @"public": @"mpublic",
        @"private": @"mprivate"  
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
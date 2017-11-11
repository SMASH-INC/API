//
//  UserInformationModelResponse.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "UserInformationModelResponse.h"

@implementation UserInformationModelResponse

/**
* TODO: Write general description for this method
*/
@synthesize user;

/**
* Users API Private Key
*/
@synthesize key;

/**
* Users API Public Key
*/
@synthesize api;

/**
* Users Profile Information
*/
@synthesize info;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"user": @"user",
        @"key": @"key",
        @"api": @"api",
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
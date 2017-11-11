//
//  VerifyAddress.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "VerifyAddress.h"

@implementation VerifyAddress

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
@synthesize address;

/**
* TODO: Write general description for this method
*/
@synthesize a;

/**
* TODO: Write general description for this method
*/
@synthesize sa;

/**
* TODO: Write general description for this method
*/
@synthesize c;

/**
* TODO: Write general description for this method
*/
@synthesize s;

/**
* TODO: Write general description for this method
*/
@synthesize z;



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
        @"address": @"address",
        @"a": @"a",
        @"sa": @"sa",
        @"c": @"c",
        @"s": @"s",
        @"z": @"z"  
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
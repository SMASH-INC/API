//
//  NameserversModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "NameserversModel.h"

@implementation NameserversModel

/**
* TODO: Write general description for this method
*/
@synthesize ns1;

/**
* TODO: Write general description for this method
*/
@synthesize ns2;

/**
* TODO: Write general description for this method
*/
@synthesize ns3;

/**
* TODO: Write general description for this method
*/
@synthesize ns4;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"ns1": @"ns1",
        @"ns2": @"ns2",
        @"ns3": @"ns3",
        @"ns4": @"ns4"  
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
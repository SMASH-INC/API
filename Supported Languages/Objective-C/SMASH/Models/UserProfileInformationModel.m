//
//  UserProfileInformationModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "UserProfileInformationModel.h"

@implementation UserProfileInformationModel

/**
* TODO: Write general description for this method
*/
@synthesize uid;

/**
* TODO: Write general description for this method
*/
@synthesize apiuid;

/**
* TODO: Write general description for this method
*/
@synthesize realname;

/**
* TODO: Write general description for this method
*/
@synthesize displayname;

/**
* TODO: Write general description for this method
*/
@synthesize email;

/**
* TODO: Write general description for this method
*/
@synthesize address;

/**
* TODO: Write general description for this method
*/
@synthesize phone;



/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap
{
    NSMutableDictionary* map = [[NSMutableDictionary alloc] init];
    [map addEntriesFromDictionary: @{
        @"uid": @"uid",
        @"apiuid": @"apiuid",
        @"realname": @"realname",
        @"displayname": @"displayname",
        @"email": @"email",
        @"address": @"address",
        @"phone": @"phone"  
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
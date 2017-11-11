//
//  InfoModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "InfoModel.h"

@implementation InfoModel

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
@synthesize avatar;

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
* TODO: Write general description for this method
*/
@synthesize lastlogin;

/**
* TODO: Write general description for this method
*/
@synthesize ip;

/**
* TODO: Write general description for this method
*/
@synthesize m2fa;

/**
* TODO: Write general description for this method
*/
@synthesize iplock;



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
        @"avatar": @"avatar",
        @"email": @"email",
        @"address": @"address",
        @"phone": @"phone",
        @"lastlogin": @"lastlogin",
        @"ip": @"ip",
        @"2fa": @"m2fa",
        @"iplock": @"iplock"  
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
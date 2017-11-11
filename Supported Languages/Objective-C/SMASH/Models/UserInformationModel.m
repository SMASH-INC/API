//
//  UserInformationModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "UserInformationModel.h"

@implementation UserInformationModel

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
@synthesize address1;

/**
* TODO: Write general description for this method
*/
@synthesize address2;

/**
* TODO: Write general description for this method
*/
@synthesize city;

/**
* TODO: Write general description for this method
*/
@synthesize state;

/**
* TODO: Write general description for this method
*/
@synthesize zipcode;

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
        @"realname": @"realname",
        @"displayname": @"displayname",
        @"avatar": @"avatar",
        @"email": @"email",
        @"address": @"address",
        @"address1": @"address1",
        @"address2": @"address2",
        @"city": @"city",
        @"state": @"state",
        @"zipcode": @"zipcode",
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
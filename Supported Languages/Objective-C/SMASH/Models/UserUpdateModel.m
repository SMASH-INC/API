//
//  UserUpdateModel.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "UserUpdateModel.h"

@implementation UserUpdateModel

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
@synthesize oldpassword;

/**
* TODO: Write general description for this method
*/
@synthesize mnewpassword;

/**
* TODO: Write general description for this method
*/
@synthesize name;

/**
* TODO: Write general description for this method
*/
@synthesize email;

/**
* TODO: Write general description for this method
*/
@synthesize phone;

/**
* TODO: Write general description for this method
*/
@synthesize avatar;

/**
* TODO: Write general description for this method
*/
@synthesize countrycode;

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
* TODO: Write general description for this method
*/
@synthesize customInput;



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
        @"oldpassword": @"oldpassword",
        @"newpassword": @"mnewpassword",
        @"name": @"name",
        @"email": @"email",
        @"phone": @"phone",
        @"avatar": @"avatar",
        @"countrycode": @"countrycode",
        @"address": @"address",
        @"a": @"a",
        @"sa": @"sa",
        @"c": @"c",
        @"s": @"s",
        @"z": @"z",
        @"custom-input": @"customInput"  
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
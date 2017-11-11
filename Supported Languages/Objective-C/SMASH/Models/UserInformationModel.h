//
//  UserInformationModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERINFORMATIONMODEL
#define SMASH_USERINFORMATIONMODEL

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UserInformationModel
@end

@interface UserInformationModel : BaseModel

/**
* TODO: Write general description for this field
*/
@property NSString* realname;

/**
* TODO: Write general description for this field
*/
@property NSString* displayname;

/**
* TODO: Write general description for this field
*/
@property NSString* avatar;

/**
* TODO: Write general description for this field
*/
@property NSString* email;

/**
* TODO: Write general description for this field
*/
@property NSString* address;

/**
* TODO: Write general description for this field
*/
@property NSString* address1;

/**
* TODO: Write general description for this field
*/
@property NSString* address2;

/**
* TODO: Write general description for this field
*/
@property NSString* city;

/**
* TODO: Write general description for this field
*/
@property NSString* state;

/**
* TODO: Write general description for this field
*/
@property NSString* zipcode;

/**
* TODO: Write general description for this field
*/
@property NSString* phone;

/**
* TODO: Write general description for this field
*/
@property NSString* lastlogin;

/**
* TODO: Write general description for this field
*/
@property NSString* ip;

/**
* TODO: Write general description for this field
*/
@property NSString* m2fa;

/**
* TODO: Write general description for this field
*/
@property NSString* iplock;


/**
* Key mappings for the json serialization and deserialization
*/
+(NSDictionary*) keyMap;

/**
* Key mapper for json serialization and deserialization
*/
+(JSONKeyMapper*) keyMapper;

/**
* Helps avoiding deserialization errors when one or more properties are missing
* @returns	True, indicating that all properties are optional for deserialization
*/
+(BOOL)propertyIsOptional:(NSString*) propertyName;

@end
#endif
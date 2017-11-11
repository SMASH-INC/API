//
//  UserUpdateModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERUPDATEMODEL
#define SMASH_USERUPDATEMODEL

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol UserUpdateModel
@end

@interface UserUpdateModel : BaseModel

/**
* TODO: Write general description for this field
*/
@property NSString* key;

/**
* TODO: Write general description for this field
*/
@property NSString* uid;

/**
* TODO: Write general description for this field
*/
@property NSString* user;

/**
* TODO: Write general description for this field
*/
@property NSString* apiuid;

/**
* TODO: Write general description for this field
*/
@property NSString* oldpassword;

/**
* TODO: Write general description for this field
*/
@property NSString* mnewpassword;

/**
* TODO: Write general description for this field
*/
@property NSString* name;

/**
* TODO: Write general description for this field
*/
@property NSString* email;

/**
* TODO: Write general description for this field
*/
@property NSString* phone;

/**
* TODO: Write general description for this field
*/
@property NSString* avatar;

/**
* TODO: Write general description for this field
*/
@property NSString* countrycode;

/**
* TODO: Write general description for this field
*/
@property NSString* address;

/**
* TODO: Write general description for this field
*/
@property NSString* a;

/**
* TODO: Write general description for this field
*/
@property NSString* sa;

/**
* TODO: Write general description for this field
*/
@property NSString* c;

/**
* TODO: Write general description for this field
*/
@property NSString* s;

/**
* TODO: Write general description for this field
*/
@property NSString* z;

/**
* TODO: Write general description for this field
*/
@property NSString* customInput;


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
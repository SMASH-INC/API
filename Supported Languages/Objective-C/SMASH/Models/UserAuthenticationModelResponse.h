//
//  UserAuthenticationModelResponse.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_USERAUTHENTICATIONMODELRESPONSE
#define SMASH_USERAUTHENTICATIONMODELRESPONSE

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"

#import "InfoModel.h"


//protocol defined for deserialization of JSON
@protocol UserAuthenticationModelResponse
@end

@interface UserAuthenticationModelResponse : BaseModel

/**
* TODO: Write general description for this field
*/
@property NSString* request;

/**
* TODO: Write general description for this field
*/
@property NSString* uid;

/**
* TODO: Write general description for this field
*/
@property NSString* valid;

/**
* TODO: Write general description for this field
*/
@property NSString* mid;

/**
* TODO: Write general description for this field
*/
@property InfoModel* info;


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
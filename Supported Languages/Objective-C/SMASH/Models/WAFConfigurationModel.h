//
//  WAFConfigurationModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_WAFCONFIGURATIONMODEL
#define SMASH_WAFCONFIGURATIONMODEL

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol WAFConfigurationModel
@end

@interface WAFConfigurationModel : BaseModel

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
@property NSString* name;

/**
* TODO: Write general description for this field
*/
@property NSString* origin;

/**
* TODO: Write general description for this field
*/
@property NSString* cname;


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
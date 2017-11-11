//
//  DataManipulationModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_DATAMANIPULATIONMODEL
#define SMASH_DATAMANIPULATIONMODEL

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol DataManipulationModel
@end

@interface DataManipulationModel : BaseModel

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
@property NSString* url;

/**
* TODO: Write general description for this field
*/
@property NSString* manipulation;

/**
* TODO: Write general description for this field
*/
@property NSString* conversion;

/**
* TODO: Write general description for this field
*/
@property NSString* sorting;

/**
* TODO: Write general description for this field
*/
@property NSString* compression;


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
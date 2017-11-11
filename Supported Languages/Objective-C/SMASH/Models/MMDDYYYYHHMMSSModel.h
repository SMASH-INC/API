//
//  MMDDYYYYHHMMSSModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_MMDDYYYYHHMMSSMODEL
#define SMASH_MMDDYYYYHHMMSSMODEL

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"

#import "DataModel.h"


//protocol defined for deserialization of JSON
@protocol MMDDYYYYHHMMSSModel
@end

@interface MMDDYYYYHHMMSSModel : BaseModel

/**
* TODO: Write general description for this field
*/
@property DataModel* data;


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
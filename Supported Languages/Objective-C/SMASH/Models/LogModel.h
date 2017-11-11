//
//  LogModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_LOGMODEL
#define SMASH_LOGMODEL

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"

#import "MMDDYYYYHHMMSSModel.h"


//protocol defined for deserialization of JSON
@protocol LogModel
@end

@interface LogModel : BaseModel

/**
* TODO: Write general description for this field
*/
@property MMDDYYYYHHMMSSModel* mMDDYYYYHHMMSSX;

/**
* TODO: Write general description for this field
*/
@property MMDDYYYYHHMMSSModel* mMDDYYYYHHMMSSY;


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
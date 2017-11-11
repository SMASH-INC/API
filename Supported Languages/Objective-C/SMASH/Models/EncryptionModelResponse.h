//
//  EncryptionModelResponse.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_ENCRYPTIONMODELRESPONSE
#define SMASH_ENCRYPTIONMODELRESPONSE

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol EncryptionModelResponse
@end

@interface EncryptionModelResponse : BaseModel

/**
* TODO: Write general description for this field
*/
@property NSString* data;

/**
* TODO: Write general description for this field
*/
@property NSString* file;

/**
* TODO: Write general description for this field
*/
@property NSString* success;

/**
* TODO: Write general description for this field
*/
@property NSString* mpublic;

/**
* TODO: Write general description for this field
*/
@property NSString* mprivate;


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
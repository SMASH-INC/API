//
//  DNSConfigurationModelResponse.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_DNSCONFIGURATIONMODELRESPONSE
#define SMASH_DNSCONFIGURATIONMODELRESPONSE

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol DNSConfigurationModelResponse
@end

@interface DNSConfigurationModelResponse : BaseModel

/**
* TODO: Write general description for this field
*/
@property NSString* success;

/**
* TODO: Write general description for this field
*/
@property NSString* domain;

/**
* TODO: Write general description for this field
*/
@property NSString* records;


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
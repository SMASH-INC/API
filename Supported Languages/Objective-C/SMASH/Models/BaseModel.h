//
//  BaseModel.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_BASEMODEL
#define SMASH_BASEMODEL

#import "JSONModel.h"

//protocol defined for deserialization of JSON
@protocol BaseModel
@end

@interface BaseModel:JSONModel

/**
 * A dictionary to hold additional properties found during JSON serialisation and not defined in the subclasses.
 */
@property NSMutableDictionary<Ignore>* AdditionalProperties;

@end
#endif
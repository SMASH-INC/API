//
//  ImageManipulationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_IMAGEMANIPULATIONINPUT
#define SMASH_IMAGEMANIPULATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol ImageManipulationInput
@end

@interface ImageManipulationInput : NSObject

/**
* Image URL or direct upload
*/
@property NSString* image;

/**
* Transformations to perform
*/
@property NSString* transform;

@end
#endif
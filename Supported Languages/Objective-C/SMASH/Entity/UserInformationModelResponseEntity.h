//
//  UserInformationModelResponseEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@class UserInformationSecondaryModelEntity;


@interface UserInformationModelResponseEntity : NSManagedObject

@property (nonatomic, retain) NSString * user;
@property (nonatomic, retain) NSString * key;
@property (nonatomic, retain) NSString * api;
@property (nonatomic, retain) UserInformationSecondaryModelEntity * info;

@end
//
//  UserUpdateModelResponseEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@class UserCustomUpdateModelEntity;


@interface UserUpdateModelResponseEntity : NSManagedObject

@property (nonatomic, retain) NSString * request;
@property (nonatomic, retain) NSString * updated;
@property (nonatomic, retain) NSString * mid;
@property (nonatomic, retain) UserCustomUpdateModelEntity * info;

@end
//
//  UserRegistrationModelResponseEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@class UserProfileInformationModelEntity;


@interface UserRegistrationModelResponseEntity : NSManagedObject

@property (nonatomic, retain) NSString * request;
@property (nonatomic, retain) NSString * active;
@property (nonatomic, retain) NSString * mid;
@property (nonatomic, retain) UserProfileInformationModelEntity * info;

@end
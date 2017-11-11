//
//  UserAuthenticationModelResponseEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@class InfoModelEntity;


@interface UserAuthenticationModelResponseEntity : NSManagedObject

@property (nonatomic, retain) NSString * request;
@property (nonatomic, retain) NSString * uid;
@property (nonatomic, retain) NSString * valid;
@property (nonatomic, retain) NSString * mid;
@property (nonatomic, retain) InfoModelEntity * info;

@end
//
//  TwoFactorAuthenticationTokenModelResponseEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>



@interface TwoFactorAuthenticationTokenModelResponseEntity : NSManagedObject

@property (nonatomic, retain) NSString * request;
@property (nonatomic, retain) NSString * correct;
@property (nonatomic, retain) NSString * mid;

@end
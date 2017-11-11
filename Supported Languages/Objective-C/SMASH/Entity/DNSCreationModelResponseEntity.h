//
//  DNSCreationModelResponseEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

@class NameserversModelEntity;


@interface DNSCreationModelResponseEntity : NSManagedObject

@property (nonatomic, retain) NSString * domain;
@property (nonatomic, retain) NameserversModelEntity * nameservers;

@end
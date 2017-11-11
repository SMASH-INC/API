//
//  EncryptionModelEntity.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>



@interface EncryptionModelEntity : NSManagedObject

@property (nonatomic, retain) NSString * key;
@property (nonatomic, retain) NSString * uid;
@property (nonatomic, retain) NSString * data;
@property (nonatomic, retain) NSString * file;
@property (nonatomic, retain) NSString * method;
@property (nonatomic, retain) NSString * bit;

@end
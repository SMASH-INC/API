//
//  DNSConfigurationInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_DNSCONFIGURATIONINPUT
#define SMASH_DNSCONFIGURATIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol DNSConfigurationInput
@end

@interface DNSConfigurationInput : NSObject

/**
* Domain or domain names separated by a comma
*/
@property NSString* domain;

/**
* Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
*/
@property NSString* records;

@end
#endif
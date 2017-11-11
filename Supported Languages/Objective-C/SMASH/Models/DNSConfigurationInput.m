//
//  DNSConfigurationInput.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "DNSConfigurationInput.h"

@implementation DNSConfigurationInput

/**
* Domain or domain names separated by a comma
*/
@synthesize domain;

/**
* Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
*/
@synthesize records;

@end
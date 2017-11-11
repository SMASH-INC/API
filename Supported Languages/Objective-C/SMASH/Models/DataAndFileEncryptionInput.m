//
//  DataAndFileEncryptionInput.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "DataAndFileEncryptionInput.h"

@implementation DataAndFileEncryptionInput

/**
* GIT URL, file URL, direct upload of file, or data as a query string
*/
@synthesize data;

/**
* Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP)
*/
@synthesize method;

/**
* Encryption key size (4096)
*/
@synthesize bit;

@end
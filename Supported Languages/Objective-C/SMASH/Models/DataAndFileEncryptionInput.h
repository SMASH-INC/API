//
//  DataAndFileEncryptionInput.h
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#ifndef SMASH_DATAANDFILEENCRYPTIONINPUT
#define SMASH_DATAANDFILEENCRYPTIONINPUT

#import <Foundation/Foundation.h>
#import "JSONModel.h"
#import "BaseModel.h"
#import "APIHelper.h"



//protocol defined for deserialization of JSON
@protocol DataAndFileEncryptionInput
@end

@interface DataAndFileEncryptionInput : NSObject

/**
* GIT URL, file URL, direct upload of file, or data as a query string
*/
@property NSString* data;

/**
* Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP)
*/
@property NSString* method;

/**
* Encryption key size (4096)
*/
@property int bit;

@end
#endif
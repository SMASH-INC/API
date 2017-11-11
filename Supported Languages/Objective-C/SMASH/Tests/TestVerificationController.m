/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "VerificationController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestVerificationController : TestBaseController
//Controller instance for all tests
@property VerificationController* controller;
@end 


@implementation  TestVerificationController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[VerificationController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// User address verification test case    
-(void) testHttpsApiRestShApiVA {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    UserAddressVerificationInput *input = [[UserAddressVerificationInput alloc]init];
    input.user = nil;
    input.a = nil;
    input.sa = nil;
    input.c = nil;
    input.s = nil;
    input.z = 0;
    input.address = nil;

    // Set callback and perform API call
    [self.controller userAddressVerificationAsyncWithUserAddressVerificationInput: input completionBlock:^(BOOL success, HttpContext* context, VerifyAddressResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"active\": \"RETURNS TRUE, IF ADDRESS IS ACTIVE AND IF USER IS CURRENTLY THERE\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// User verification response test case    
-(void) testHttpsApiRestShApiVU {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    UserVerificationResponseInput *input = [[UserVerificationResponseInput alloc]init];
    input.user = nil;
    input.code = nil;

    // Set callback and perform API call
    [self.controller userVerificationResponseAsyncWithUserVerificationResponseInput: input completionBlock:^(BOOL success, HttpContext* context, VerifyUserModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"correct\": \"RETURNS IF 2FA TOKEN IS CORRECT\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// User verification test case    
-(void) testHttpsApiRestShApiV {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    NSString* user = nil;

    // Set callback and perform API call
    [self.controller userVerificationAsyncWithUser: user  completionBlock:^(BOOL success, HttpContext* context, VerifyModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        
        // Test headers
        NSMutableDictionary* headers = [[NSMutableDictionary alloc] init];
        
        [headers setObject:[NSNull null]  forKey:@"Accept-Ranges"];
        
        [headers setObject:[NSNull null]  forKey:@"Connection"];
        
        [headers setObject:[NSNull null]  forKey:@"Content-Length"];
        
        [headers setObject:[NSNull null]  forKey:@"Content-Type"];
        
        [headers setObject:[NSNull null]  forKey:@"Date"];
        
        [headers setObject:[NSNull null]  forKey:@"Server"];
        
        [headers setObject:[NSNull null]  forKey:@"Vary"];
        
        [headers setObject:[NSNull null]  forKey:@"Via"];
        
        [headers setObject:[NSNull null]  forKey:@"X-Cache"];
        
        [headers setObject:[NSNull null]  forKey:@"X-Cache-Hits"];
        
        [headers setObject:[NSNull null]  forKey:@"X-Served-By"];
        
        [headers setObject:[NSNull null]  forKey:@"X-Timer"];
        
        [headers setObject:[NSNull null]  forKey:@"access-control-allow-origin"];
        
        [headers setObject:[NSNull null]  forKey:@"cache-control"];
        
        [headers setObject:[NSNull null]  forKey:@"etag"];
        
        [headers setObject:[NSNull null]  forKey:@"function-execution-id"];
        
        [headers setObject:[NSNull null]  forKey:@"strict-transport-security"];
        
        [headers setObject:[NSNull null]  forKey:@"x-cloud-trace-context"];
        
        [headers setObject:[NSNull null]  forKey:@"x-content-type-options"];
        
        [headers setObject:[NSNull null]  forKey:@"x-dns-prefetch-control"];
        
        [headers setObject:[NSNull null]  forKey:@"x-download-options"];
        
        [headers setObject:[NSNull null]  forKey:@"x-frame-options"];
        
        [headers setObject:[NSNull null]  forKey:@"x-powered-by"];
        
        [headers setObject:[NSNull null]  forKey:@"x-xss-protection"];
        NSDictionary *headersCopy = [headers copy];
        XCTAssertTrue([TestHelper isProperSubsetOf: headersCopy
               rightTree: context.response.headers 
             checkValues: YES
              allowExtra: YES
               isOrdered:NO]);

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"request\": \"REQUEST TYPE\",\n    \"to\": \"USER BEING VERIFIED\",\n    \"verified\": \"RETURNS TRUE OR FALSE\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "TwoFactorAuthenticationAPIController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestTwoFactorAuthenticationAPIController : TestBaseController
//Controller instance for all tests
@property TwoFactorAuthenticationAPIController* controller;
@end 


@implementation  TestTwoFactorAuthenticationAPIController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[TwoFactorAuthenticationAPIController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// User 2FA response test case    
-(void) testHttpsApiRestShApi2faT {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    M2FATokenResponseInput *input = [[M2FATokenResponseInput alloc]init];
    input.user = nil;
    input.code = nil;

    // Set callback and perform API call
    [self.controller m2FATokenResponseAsyncWithM2FATokenResponseInput: input completionBlock:^(BOOL success, HttpContext* context, TwoFactorAuthenticationTokenModelResponse* response, NSError* error) { 
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

// 2FA test case    
-(void) testHttpsApiRestShApi2fa {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    NSString* to = nil;

    // Set callback and perform API call
    [self.controller twoFactorAuthenticationAsyncWithTo: to  completionBlock:^(BOOL success, HttpContext* context, TwoFactorAuthenticationModelResponse* response, NSError* error) { 
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

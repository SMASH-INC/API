/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "CDNController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestCDNController : TestBaseController
//Controller instance for all tests
@property CDNController* controller;
@end 


@implementation  TestCDNController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[CDNController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// CDN push zone creation and configuration test case    
-(void) testHttpsApiRestShApiSCPush {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    CDNPushZoneInput *input = [[CDNPushZoneInput alloc]init];
    input.cname = nil;
    input.file = nil;

    // Set callback and perform API call
    [self.controller cDNPushZoneAsyncWithCDNPushZoneInput: input completionBlock:^(BOOL success, HttpContext* context, CDNPushModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"success\": \"SHOWS TRUE WHEN PUSH ZONE IS DEPLOYED SUCCESSFULLY\",\r\n  \"upload\": \"LIST OF FILES UPLOADED TO YOUR PUSH ZONE\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// CDN pull zone creation and configuration test case    
-(void) testHttpsApiRestShApiSCPull {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    CDNPullZoneInput *input = [[CDNPullZoneInput alloc]init];
    input.origin = nil;
    input.cname = nil;

    // Set callback and perform API call
    [self.controller cDNPullZoneAsyncWithCDNPullZoneInput: input completionBlock:^(BOOL success, HttpContext* context, CDNPullModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"success\": \"SHOWS TRUE WHEN PULL ZONE IS DEPLOYED SUCCESSFULLY\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "WAFAndDDOSProtectionController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestWAFAndDDOSProtectionController : TestBaseController
//Controller instance for all tests
@property WAFAndDDOSProtectionController* controller;
@end 


@implementation  TestWAFAndDDOSProtectionController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[WAFAndDDOSProtectionController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// WAF and DDOS configuration test case    
-(void) testWAFConfiguration {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    WAFConfigurationInput *input = [[WAFConfigurationInput alloc]init];
    input.name = nil;
    input.rule = nil;

    // Set callback and perform API call
    [self.controller wAFConfigurationAsyncWithWAFConfigurationInput: input completionBlock:^(BOOL success, HttpContext* context, WAFConfigurationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"success\": \"SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY\",\r\n  \"rule\": \"RULES APPLIED TO WAF\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// WAF and DDOS test case    
-(void) testWAFCreation {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    WAFCreationInput *input = [[WAFCreationInput alloc]init];
    input.origin = nil;
    input.cname = nil;

    // Set callback and perform API call
    [self.controller wAFCreationAsyncWithWAFCreationInput: input completionBlock:^(BOOL success, HttpContext* context, WAFCreationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"success\": \"SHOWS TRUE WHEN THE WAF AND ORIGIN SHIELD (DDOS PROTECTION) IS DEPLOYED SUCCESSFULLY\",\r\n  \"cname\": \"RECORD TO APPEND YOUR URLS TO VIA A CNAME\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "AdvancedLoggingController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestAdvancedLoggingController : TestBaseController
//Controller instance for all tests
@property AdvancedLoggingController* controller;
@end 


@implementation  TestAdvancedLoggingController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[AdvancedLoggingController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// Advanced logging configuration test case    
-(void) testHttpsApiRestShApiSL {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    LoggingConfigurationInput *input = [[LoggingConfigurationInput alloc]init];
    input.name = nil;
    input.origin = nil;
    input.activate = nil;

    // Set callback and perform API call
    [self.controller loggingConfigurationAsyncWithLoggingConfigurationInput: input completionBlock:^(BOOL success, HttpContext* context, LoggingSetupModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"success\": \"RETURNS TRUE IF ADVANCED LOGGING IS ACTIVATED\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// Advanced logging info test case    
-(void) testHttpsApiRestShApiSLI {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    LoggingInfoInput *input = [[LoggingInfoInput alloc]init];
    input.name = nil;
    input.origin = nil;
    input.time = nil;

    // Set callback and perform API call
    [self.controller loggingInfoAsyncWithLoggingInfoInput: input completionBlock:^(BOOL success, HttpContext* context, LoggingLogsModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"log\": {\n        \"01010101245901\": {\n            \"data\": {\n                \"result\": \"INFO\",\n                \"content\": \"LOG: CONTENT AND ACTIONS PERFORMED\",\n                \"id\": \"FUNCTION ID\"\n            }\n        },\n        \"01010101245902\": {\n            \"data\": {\n                \"result\": \"ERROR\",\n                \"content\": \"LOG: ERROR CONTENT AND ACTIONS PERFORMED\",\n                \"id\": \"FUNCTION ID\"\n            }\n        }\n    }\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "DataManipulationController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestDataManipulationController : TestBaseController
//Controller instance for all tests
@property DataManipulationController* controller;
@end 


@implementation  TestDataManipulationController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[DataManipulationController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// Data Manipulation test case    
-(void) testHttpsApiRestShApiD {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    HttpsApiRestShApiDInput *input = [[HttpsApiRestShApiDInput alloc]init];
    input.data = nil;
    input.transform = nil;

    // Set callback and perform API call
    [self.controller httpsApiRestShApiDAsyncWithHttpsApiRestShApiDInput: input completionBlock:^(BOOL success, HttpContext* context, DataManipulationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"request\": \"REQUEST TYPE\",\n    \"url\": \"RETURNED DATA URL\",\n    \"success\": \"RETURNS TRUE IF DATA MANIPULATION WAS SUCCESSFULL\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

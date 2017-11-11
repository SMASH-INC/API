/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "ImageManipulationController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestImageManipulationController : TestBaseController
//Controller instance for all tests
@property ImageManipulationController* controller;
@end 


@implementation  TestImageManipulationController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[ImageManipulationController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// Image manipulation test case    
-(void) testHttpsApiRestShApiI {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    ImageManipulationInput *input = [[ImageManipulationInput alloc]init];
    input.image = nil;
    input.transform = nil;

    // Set callback and perform API call
    [self.controller imageManipulationAsyncWithImageManipulationInput: input completionBlock:^(BOOL success, HttpContext* context, ImageManipulationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"request\": \"REQUEST TYPE\",\n    \"url\": \"RETURNED IMAGE URL AND DATA\",\n    \"success\": \"RETURNS TRUE IF IMAGE MANIPULATION WAS SUCCESSFULL\",\n    \"moderated\": \"RETURNS TRUE IF IMAGE CONTAINED GRAPHIC IMAGERY\",\n    \"id\": \"TRANSACTION ID\"\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

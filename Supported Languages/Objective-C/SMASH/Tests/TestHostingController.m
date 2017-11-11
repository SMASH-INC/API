/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "HostingController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestHostingController : TestBaseController
//Controller instance for all tests
@property HostingController* controller;
@end 


@implementation  TestHostingController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[HostingController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// Web hosting testing case    
-(void) testHttpsApiRestShApiSH {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    HostingSetupInput *input = [[HostingSetupInput alloc]init];
    input.app = nil;
    input.domain = nil;

    // Set callback and perform API call
    [self.controller hostingSetupAsyncWithHostingSetupInput: input completionBlock:^(BOOL success, HttpContext* context, HostingModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"url\": \"RETURNED APP HOSTING URL\",\r\n  \"success\": \"RETURNS TRUE IF APP WAS SUCCESSFULLY DEPLOYED\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

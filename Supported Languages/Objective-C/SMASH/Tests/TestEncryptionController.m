/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "EncryptionController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestEncryptionController : TestBaseController
//Controller instance for all tests
@property EncryptionController* controller;
@end 


@implementation  TestEncryptionController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[EncryptionController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// File and Data encryption test case    
-(void) testHttpsApiRestShApiSE {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    DataAndFileEncryptionInput *input = [[DataAndFileEncryptionInput alloc]init];
    input.data = nil;
    input.method = nil;
    input.bit = 0;

    // Set callback and perform API call
    [self.controller dataAndFileEncryptionAsyncWithDataAndFileEncryptionInput: input completionBlock:^(BOOL success, HttpContext* context, EncryptionModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"data\": \"RETURNED ENCRYPTED DATA URL\",\n    \"file\": \"RETURNED ENCRYPTED FILE URL\",\n    \"success\": \"SHOWS TRUE IF ENCRYPTION WAS SUCCESSFULL\",\n    \"public\": \"PUBLIC ENCRYPTION KEY FOR YOUR DATA OR FILES\",\n    \"private\": \"PRIVATE ENCRYPTION KEY FOR YOUR DATA OR FILES\"\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

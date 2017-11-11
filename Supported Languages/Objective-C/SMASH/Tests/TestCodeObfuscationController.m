/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "CodeObfuscationController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestCodeObfuscationController : TestBaseController
//Controller instance for all tests
@property CodeObfuscationController* controller;
@end 


@implementation  TestCodeObfuscationController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[CodeObfuscationController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// Code obfuscation test case    
-(void) testHttpsApiRestShApiSO {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    NSString* app = nil;

    // Set callback and perform API call
    [self.controller obfuscationAndAntiTamperingAsyncWithApp: app  completionBlock:^(BOOL success, HttpContext* context, CodeProtectionModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"success\": \"RETURNS TRUE IF APP WAS SUCCESSFULLY OBFUSCTATED AND PROTECTED\",\r\n  \"app\": \"OBFUSCATED APP URL\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

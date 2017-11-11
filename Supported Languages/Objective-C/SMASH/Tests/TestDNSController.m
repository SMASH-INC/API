/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "DNSController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestDNSController : TestBaseController
//Controller instance for all tests
@property DNSController* controller;
@end 


@implementation  TestDNSController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[DNSController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// DNS configuration test case    
-(void) testHttpsApiRestShApiSDC {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    DNSConfigurationInput *input = [[DNSConfigurationInput alloc]init];
    input.domain = nil;
    input.records = nil;

    // Set callback and perform API call
    [self.controller dNSConfigurationAsyncWithDNSConfigurationInput: input completionBlock:^(BOOL success, HttpContext* context, DNSConfigurationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"success\": \"SHOWS TRUE IF RECORDS WERE SUCCESSFULLY SET\",\n    \"domain\": \"DOMAIN\",\n    \"records\": \"RECORDS SET TO DOMAIN\"\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// DNS addition test case    
-(void) testHttpsApiRestShApiSDA {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    NSString* domain = nil;

    // Set callback and perform API call
    [self.controller dNSCreationAsyncWithDomain: domain  completionBlock:^(BOOL success, HttpContext* context, DNSCreationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"domain\": \"LIST OF DOMAINS ADDED\",\n    \"nameservers\": {\n        \"ns1\": \"NAME SERVER ONE TO POINT YOUR DOMAIN AT\",\n        \"ns2\": \"NAME SERVER TWO TO POINT YOUR DOMAIN AT\",\n        \"ns3\": \"NAME SERVER THREE TO POINT YOUR DOMAIN AT\",\n        \"ns4\": \"NAME SERVER FOUR TO POINT YOUR DOMAIN AT\"\n    }\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "LoginAndRegistrationController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestLoginAndRegistrationController : TestBaseController
//Controller instance for all tests
@property LoginAndRegistrationController* controller;
@end 


@implementation  TestLoginAndRegistrationController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[LoginAndRegistrationController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// User registration test case    
-(void) testHttpsApiRestShApiAUR {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    UserRegistrationInput *input = [[UserRegistrationInput alloc]init];
    input.email = nil;
    input.user = nil;
    input.password = nil;
    input.name = nil;
    input.phone = nil;
    input.countrycode = nil;
    input.address = nil;
    // Dictionary for optional query parameters
    NSMutableDictionary* queryParamsMutable = [[NSMutableDictionary alloc] init];
    NSDictionary *queryParams= [queryParamsMutable copy];

    // Set callback and perform API call
    [self.controller userRegistrationAsyncWithUserRegistrationInput: input queryParameters : queryParams  completionBlock:^(BOOL success, HttpContext* context, UserRegistrationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"request\": \"REQUEST TYPE\",\n    \"active\": \"RETURNS TRUE, IF USER WAS SUCCESSFULLY REGISTERED\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n        \"uid\": \"USERS ID\",\n        \"apiuid\": \"API SIDE USER ID\",\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS\",\n        \"phone\": \"USERS CELL PHONE NUMBER\"\n    }\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// User authentication test case    
-(void) testHttpsApiRestShApiAUL {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    UserAuthenticationInput *input = [[UserAuthenticationInput alloc]init];
    input.user = nil;
    input.password = nil;

    // Set callback and perform API call
    [self.controller userAuthenticationAsyncWithUserAuthenticationInput: input completionBlock:^(BOOL success, HttpContext* context, UserAuthenticationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"request\": \"REQUEST TYPE\",\n    \"uid\": \"Users UID\",\n    \"valid\": \"RETURNS TRUE IF USER LOGIN DETAILS ARE VALID\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n    	\"uid\": \"USERS ID\",\n    	\"apiuid\": \"API SIDE USER ID\",\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"avatar\": \"USER AVATAR URL\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS\",\n        \"phone\": \"USERS CELL PHONE NUMBER\",\n        \"lastlogin\": \"USERS LAST LOGIN\",\n        \"ip\": \"USERS IP\",\n        \"2fa\": \"RETURNS TRUE IF 2FA IS ENABLED\",\n        \"iplock\": \"RETURNS TRUE IF IP LOCK IS ENABLED\"\n    }\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

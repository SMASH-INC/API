/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
#import <XCTest/XCTest.h>
#import "UserManagementController.h"
#import "TestHelper.h"
#import "TestBaseController.h"

@interface  TestUserManagementController : TestBaseController
//Controller instance for all tests
@property UserManagementController* controller;
@end 


@implementation  TestUserManagementController : TestBaseController

//Setup test class
//This method is called before the invocation of each test method in the test class
- (void)setUp {
    [super setUp];
    self.controller = [[UserManagementController alloc]init];
}

//Teardown test class
//This method is called after the invocation of each test method in the test class
- (void)tearDown {
    [super tearDown];
}	


// User information test case    
-(void) testHttpsApiRestShApiUI {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    NSString* user = nil;

    // Set callback and perform API call
    [self.controller getUserInfoAsyncWithUser: user  completionBlock:^(BOOL success, HttpContext* context, UserInformationModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\n    \"request\": \"REQUEST TYPE\",\n    \"uid\": \"Users UID\",\n    \"apiuid\": \"API SIDE USER ID\",\n    \"verified\": \"RETURNS TRUE IF USER IS VERIFIED\",\n    \"id\": \"TRANSACTION ID\",\n    \"info\": {\n        \"realname\": \"USERS REAL NAME\",\n        \"displayname\": \"USERS USERNAME\",\n        \"avatar\": \"USER AVATAR URL\",\n        \"email\": \"USERS EMAIL\",\n        \"address\": \"USERS ADDRESS IN ONE LINE SEPERATED BY COMMAS\",\n        \"address1\": \"USERS ADDRESS LINE ONE\",\n        \"address2\": \"USERS ADDRESS LINE TWO\",\n        \"city\": \"USERS ADDRESS CITY\",\n        \"state\": \"USERS ADDRESS STATE\",\n        \"zipcode\": \"USERS ADDRESS ZIPCODE\",\n        \"phone\": \"USERS CELL PHONE NUMBER\",\n        \"lastlogin\": \"USERS LAST LOGIN\",\n        \"ip\": \"USERS IP\",\n        \"2fa\": \"RETURNS TRUE IF 2FA IS ENABLED\",\n        \"iplock\": \"RETURNS TRUE IF IP LOCK IS ENABLED\"\n    }\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// User update test case    
-(void) testHttpsApiRestShApiUU {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    UpdateUserInput *input = [[UpdateUserInput alloc]init];
    input.user = nil;
    input.avatar = nil;
    input.customInput = nil;
    // Dictionary for optional query parameters
    NSMutableDictionary* queryParamsMutable = [[NSMutableDictionary alloc] init];
    NSDictionary *queryParams= [queryParamsMutable copy];

    // Set callback and perform API call
    [self.controller updateUserAsyncWithUpdateUserInput: input queryParameters : queryParams  completionBlock:^(BOOL success, HttpContext* context, UserUpdateModelResponse* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"updated\": \"RETURNS TRUE, IF USERS PROFILE WAS SUCCESSFULLY UPDATED\",\r\n  \"id\": \"TRANSACTION ID\",\r\n  \"info\": {\r\n    \"uid\": \"USERS ID\",\r\n    \"apiuid\": \"API SIDE USER ID\",\r\n    \"avatar\": \"INPUTTED AVATAR URL\",\r\n    \"custom-input\": \"CUSTOM INPUTTED PROFILE DATA\"\r\n  }\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}

// User deletion test case    
-(void) testHttpsApiRestShApiUD {
    //Set up test expectations
    XCTestExpectation *expectation =[self expectationWithDescription:@"High Expectations"];
    // Parameters for the API call
    NSString* user = nil;

    // Set callback and perform API call
    [self.controller deleteUserAsyncWithUser: user  completionBlock:^(BOOL success, HttpContext* context, UserDeletionResponseModel* response, NSError* error) { 
       // Test response code
        XCTAssertEqual(200, context.response.statusCode);
        

        // Test whether the captured response is not null
        XCTAssertTrue(response!=nil);
		// Test whether the captured response is as we expected
        NSString* rawBody = [[NSString alloc] initWithData:context.response.rawBody encoding:NSUTF8StringEncoding];
        XCTAssertEqualObjects(
                @"{\r\n  \"request\": \"REQUEST TYPE\",\r\n  \"deleted\": \"RETURNS TRUE, IF USERS ACCOUNT WAS SUCCESSFULLY DELETED\",\r\n  \"id\": \"TRANSACTION ID\"\r\n}", 
                rawBody);
        [expectation fulfill];
    }];
    [self wait];
}



@end

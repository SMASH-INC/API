//
//  LoginAndRegistration.m
//  SMASH
//
//  This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io )
//
#import "LoginAndRegistration.h"
#import "CustomAuthUtility.h"

@implementation LoginAndRegistration

/**
* User Registration API
* @param  UserRegistrationInput     Object with all parameters
* @param    queryParameters    Additional optional query parameters are supported by this endpoint
* @return	Returns the void response from the API call */
- (void) userRegistrationAsyncWithUserRegistrationInput:(UserRegistrationInput*) input
                queryParameters:(NSDictionary*) queryParameters
                completionBlock:(CompletedGetUserRegistration) onCompleted
{
    //validating required parameters
    NSError* _validationError = nil;
    if (input.email == nil)
        _validationError = [[APIError alloc] initWithReason: @"The property 'email' in the input object cannot be nil."
                                                    andContext:nil];
    else if (input.user == nil)
        _validationError = [[APIError alloc] initWithReason: @"The property 'user' in the input object cannot be nil."
                                                    andContext:nil];
    else if (input.password == nil)
        _validationError = [[APIError alloc] initWithReason: @"The property 'password' in the input object cannot be nil."
                                                    andContext:nil];
    if(_validationError != nil)
        onCompleted(NO,nil,nil,_validationError);

    //the base uri for api requests
    NSString* _baseUri = [NSString stringWithString: (NSString*) Configuration_BaseUri];

    //prepare query string for API call
    NSMutableString* _queryBuilder = [NSMutableString stringWithString: _baseUri]; 
    [_queryBuilder appendString: @"/a/u/r"];

    //process optional query parameters
    [APIHelper appendUrl: _queryBuilder withQueryParameters: @{
                    @"email": input.email,
                    @"user": input.user,
                    @"password": input.password,
                    @"name": (nil != input.name) ? input.name : [NSNull null],
                    @"phone": (nil != input.phone) ? input.phone : [NSNull null],
                    @"countrycode": (nil != input.countrycode) ? input.countrycode : [NSNull null],
                    @"address": (nil != input.address) ? input.address : [NSNull null]
                }];

    //append optional parameters to the query
    [APIHelper appendUrl: _queryBuilder withQueryParameters: queryParameters];

    //validate and preprocess url
    NSString* _queryUrl = [APIHelper cleanUrl: _queryBuilder];

    //preparing request headers
    NSMutableDictionary* _headers = [[NSMutableDictionary alloc] initWithDictionary: @{
        @"user-agent": @"SMASH"
    }];

    //Remove null values from header collection in order to omit from request
    [APIHelper removeNullValues: _headers];


    //prepare the request and fetch response  
    HttpRequest* _request = [[self clientInstance] get: ^(HttpRequest* _request) 
    { 
        [_request setQueryUrl: _queryUrl]; //set request url        
        [_request setHeaders: _headers]; //set request headers

    }];

    //Custom Auth to be appended for authorization
    [CustomAuthUtility appendCustomAuthParams: _request];

    //use the instance of the http client to make the actual call
    [[self clientInstance]
     executeAsString: _request
     success: ^(id _context, HttpResponse *_response) {
         //Error handling using HTTP status codes
         NSError* _statusError = nil;

         //Error handling using HTTP status codes 
         if (_response.statusCode == 400)
             _statusError = [[APIError alloc] initWithReason: @"Bad Request"
                                               andContext:_context];
         else if (_response.statusCode == 401)
             _statusError = [[APIError alloc] initWithReason: @"Incorrect Credentials"
                                               andContext:_context];
         else if (_response.statusCode == 403)
             _statusError = [[APIError alloc] initWithReason: @"Forbidden"
                                               andContext:_context];
         else if (_response.statusCode == 406)
             _statusError = [[APIError alloc] initWithReason: @"Not Acceptable Input"
                                               andContext:_context];
         else if (_response.statusCode == 409)
             _statusError = [[APIError alloc] initWithReason: @"Data Conflict"
                                               andContext:_context];
         else if (_response.statusCode == 413)
             _statusError = [[APIError alloc] initWithReason: @"Payload Too Large"
                                               andContext:_context];
         else if (_response.statusCode == 415)
             _statusError = [[APIError alloc] initWithReason: @"Un-Supported Content Type"
                                               andContext:_context];
         else if (_response.statusCode == 451)
             _statusError = [[APIError alloc] initWithReason: @"Un-Available For Legal Reasons"
                                               andContext:_context];
         else if (_response.statusCode == 500)
             _statusError = [[APIError alloc] initWithReason: @"Internal API Error"
                                               andContext:_context];
         else if (_response.statusCode == 501)
             _statusError = [[APIError alloc] initWithReason: @"Not Implemented"
                                               andContext:_context];
         else if (_response.statusCode == 503)
             _statusError = [[APIError alloc] initWithReason: @"API Unavailable"
                                               andContext:_context];
         else if (_response.statusCode == 504)
             _statusError = [[APIError alloc] initWithReason: @"Request Timeout"
                                               andContext:_context];
         else if (_response.statusCode == 511)
             _statusError = [[APIError alloc] initWithReason: @"Authentication Required"
                                               andContext:_context];
         else if((_response.statusCode < 200) || (_response.statusCode > 208)) //[200,208] = HTTP OK
             _statusError = [[APIError alloc] initWithReason: @"HTTP Response Not OK"
                                                  andContext:_context];

         if(_statusError != nil)
         {
             //announce completion with failure due to HTTP status code checking
             onCompleted(NO, _context, nil, _statusError);
         }
         else
         {
             //return _response to API caller
             NSString* _strResult = [(HttpStringResponse*)_response body];
             UserRegistrationModelResponse* _result = (UserRegistrationModelResponse*) [APIHelper jsonDeserialize: _strResult
                toClass: UserRegistrationModelResponse.class];

 
             //announce completion with success
             onCompleted(YES, _context, _result, nil);
         }
     } failure:^(id _context, NSError *_error) {
 
         //announce completion with failure
         onCompleted(NO, _context, nil, _error);
     }];
}

/**
* User Authentication API
* @param  UserAuthenticationInput     Object with all parameters
* @return	Returns the void response from the API call */
- (void) userAuthenticationAsyncWithUserAuthenticationInput:(UserAuthenticationInput*) input
                completionBlock:(CompletedGetUserAuthentication) onCompleted
{
    //validating required parameters
    NSError* _validationError = nil;
    if (input.user == nil)
        _validationError = [[APIError alloc] initWithReason: @"The property 'user' in the input object cannot be nil."
                                                    andContext:nil];
    else if (input.password == nil)
        _validationError = [[APIError alloc] initWithReason: @"The property 'password' in the input object cannot be nil."
                                                    andContext:nil];
    if(_validationError != nil)
        onCompleted(NO,nil,nil,_validationError);

    //the base uri for api requests
    NSString* _baseUri = [NSString stringWithString: (NSString*) Configuration_BaseUri];

    //prepare query string for API call
    NSMutableString* _queryBuilder = [NSMutableString stringWithString: _baseUri]; 
    [_queryBuilder appendString: @"/a/u/l"];

    //process optional query parameters
    [APIHelper appendUrl: _queryBuilder withQueryParameters: @{
                    @"user": input.user,
                    @"password": input.password
                }];

    //validate and preprocess url
    NSString* _queryUrl = [APIHelper cleanUrl: _queryBuilder];

    //preparing request headers
    NSMutableDictionary* _headers = [[NSMutableDictionary alloc] initWithDictionary: @{
        @"user-agent": @"SMASH"
    }];

    //Remove null values from header collection in order to omit from request
    [APIHelper removeNullValues: _headers];


    //prepare the request and fetch response  
    HttpRequest* _request = [[self clientInstance] get: ^(HttpRequest* _request) 
    { 
        [_request setQueryUrl: _queryUrl]; //set request url        
        [_request setHeaders: _headers]; //set request headers

    }];

    //Custom Auth to be appended for authorization
    [CustomAuthUtility appendCustomAuthParams: _request];

    //use the instance of the http client to make the actual call
    [[self clientInstance]
     executeAsString: _request
     success: ^(id _context, HttpResponse *_response) {
         //Error handling using HTTP status codes
         NSError* _statusError = nil;

         //Error handling using HTTP status codes 
         if (_response.statusCode == 400)
             _statusError = [[APIError alloc] initWithReason: @"Bad Request"
                                               andContext:_context];
         else if (_response.statusCode == 401)
             _statusError = [[APIError alloc] initWithReason: @"Incorrect Credentials"
                                               andContext:_context];
         else if (_response.statusCode == 403)
             _statusError = [[APIError alloc] initWithReason: @"Forbidden"
                                               andContext:_context];
         else if (_response.statusCode == 406)
             _statusError = [[APIError alloc] initWithReason: @"Not Acceptable Input"
                                               andContext:_context];
         else if (_response.statusCode == 409)
             _statusError = [[APIError alloc] initWithReason: @"Data Conflict"
                                               andContext:_context];
         else if (_response.statusCode == 413)
             _statusError = [[APIError alloc] initWithReason: @"Payload Too Large"
                                               andContext:_context];
         else if (_response.statusCode == 415)
             _statusError = [[APIError alloc] initWithReason: @"Un-Supported Content Type"
                                               andContext:_context];
         else if (_response.statusCode == 451)
             _statusError = [[APIError alloc] initWithReason: @"Un-Available For Legal Reasons"
                                               andContext:_context];
         else if (_response.statusCode == 500)
             _statusError = [[APIError alloc] initWithReason: @"Internal API Error"
                                               andContext:_context];
         else if (_response.statusCode == 501)
             _statusError = [[APIError alloc] initWithReason: @"Not Implemented"
                                               andContext:_context];
         else if (_response.statusCode == 503)
             _statusError = [[APIError alloc] initWithReason: @"API Unavailable"
                                               andContext:_context];
         else if (_response.statusCode == 504)
             _statusError = [[APIError alloc] initWithReason: @"Request Timeout"
                                               andContext:_context];
         else if (_response.statusCode == 511)
             _statusError = [[APIError alloc] initWithReason: @"Authentication Required"
                                               andContext:_context];
         else if((_response.statusCode < 200) || (_response.statusCode > 208)) //[200,208] = HTTP OK
             _statusError = [[APIError alloc] initWithReason: @"HTTP Response Not OK"
                                                  andContext:_context];

         if(_statusError != nil)
         {
             //announce completion with failure due to HTTP status code checking
             onCompleted(NO, _context, nil, _statusError);
         }
         else
         {
             //return _response to API caller
             NSString* _strResult = [(HttpStringResponse*)_response body];
             UserAuthenticationModelResponse* _result = (UserAuthenticationModelResponse*) [APIHelper jsonDeserialize: _strResult
                toClass: UserAuthenticationModelResponse.class];

 
             //announce completion with success
             onCompleted(YES, _context, _result, nil);
         }
     } failure:^(id _context, NSError *_error) {
 
         //announce completion with failure
         onCompleted(NO, _context, nil, _error);
     }];
}


@end
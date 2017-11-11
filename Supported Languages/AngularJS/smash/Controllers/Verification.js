/**
  * SMASH
  *
  * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
  */

;(function (angular) {
'use strict';

angular.module('SMASH')
    .factory('Verification', ['$q',
        'Configuration',
        'Servers',
        'HttpClient',
        'APIHelper',
        'BaseController',
        Verification
    ]);

    function Verification($q, Configuration, Servers, HttpClient, APIHelper, BaseController) {
        return {
            /**
             * User Address Verification API
             *
             * @param {array}  input    Array with all options for search
             * @param {string} input['user'] Users UID, Username, or Email
             * @param {string} input['a'] Address Line One
             * @param {string} input['sa'] Address Line Two
             * @param {string} input['c'] Address City
             * @param {string} input['s'] Address State or Province
             * @param {int} input['z'] Address Zipcode
             * @param {string|null} input['address'] [Optional] Address as a one line input separated by commas
             *
             * @return {promise<Verify Address Response>}
             */
            userAddressVerification: function (input) {
                // Assign default values
                input = input || {};

                //Create promise to return
                var _deffered = $q.defer();
                
                // validating required parameters
                var _missingArgs = false;
                if (input.user === null || input.user === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `user` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.a === null || input.a === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `a` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.sa === null || input.sa === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `sa` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.c === null || input.c === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `c` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.s === null || input.s === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `s` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.z === null || input.z === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `z` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                }

                if (_missingArgs) {
                    return _deffered.promise;
                }

                //prepare query string for API call
                var _baseUri = Configuration.getBaseUri(Servers.PATH);
                var _queryBuilder = _baseUri + '/v/a';
                
                // Process query parameters
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, {
                    'user': input.user,
                    'a': input.a,
                    'sa': input.sa,
                    'c': input.c,
                    's': input.s,
                    'z': input.z,
                    'address': input.address
                });

                //validate and preprocess url
                var _queryUrl = APIHelper.cleanUrl(_queryBuilder);
                
                // prepare headers
                var _headers = {
                    'accept': 'application/json'
                };

                // append custom auth authorization
                CustomAuthUtility.appendCustomAuthParams(_headers);

                // prepare and invoke the API call request to fetch the response
                var _config = {
                    method: 'GET',
                    queryUrl: _queryUrl,
                    headers: _headers,
                };
                
                var _response = new HttpClient(_config);
                
                //process response
                _response.then(function success(_result) {
                    var parsed = _result.body;
                    parsed = BaseController.getObjectMapper().mapObject(parsed, 'VerifyAddressResponse');
                    _result.body = parsed;
                    _deffered.resolve(_result);
                }, function error(_result){
                    // Error handling for custom HTTP status codes
                    if (_result.code === 404) {
                        _deffered.resolve(null);
                    } else if (_result.code === 400) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Bad Request',
                            errorCode: 400,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 401) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Incorrect Credentials',
                            errorCode: 401,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 403) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Forbidden',
                            errorCode: 403,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 406) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Not Acceptable Input',
                            errorCode: 406,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 409) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Data Conflict',
                            errorCode: 409,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 413) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Payload Too Large',
                            errorCode: 413,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 415) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Un-Supported Content Type',
                            errorCode: 415,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 451) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Un-Available For Legal Reasons',
                            errorCode: 451,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 500) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Internal API Error',
                            errorCode: 500,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 501) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Not Implemented',
                            errorCode: 501,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 503) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'API Unavailable',
                            errorCode: 503,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 504) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Request Timeout',
                            errorCode: 504,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 511) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Authentication Required',
                            errorCode: 511,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'HTTP Response Not OK',
                            errorCode: _result.code,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    }
                });
                
                return _deffered.promise;
            },
            /**
             * Users Verification Response API
             *
             * @param {array}  input    Array with all options for search
             * @param {string} input['user'] Users UID, Username, Or Email
             * @param {string} input['code'] Verification code entered by the user
             *
             * @return {promise<Verify User Model Response>}
             */
            userVerificationResponse: function (input) {
                // Assign default values
                input = input || {};

                //Create promise to return
                var _deffered = $q.defer();
                
                // validating required parameters
                var _missingArgs = false;
                if (input.user === null || input.user === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `user` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.code === null || input.code === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `code` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                }

                if (_missingArgs) {
                    return _deffered.promise;
                }

                //prepare query string for API call
                var _baseUri = Configuration.getBaseUri(Servers.PATH);
                var _queryBuilder = _baseUri + '/v/u';
                
                // Process query parameters
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, {
                    'user': input.user,
                    'code': input.code
                });

                //validate and preprocess url
                var _queryUrl = APIHelper.cleanUrl(_queryBuilder);
                
                // prepare headers
                var _headers = {
                    'accept': 'application/json'
                };

                // append custom auth authorization
                CustomAuthUtility.appendCustomAuthParams(_headers);

                // prepare and invoke the API call request to fetch the response
                var _config = {
                    method: 'GET',
                    queryUrl: _queryUrl,
                    headers: _headers,
                };
                
                var _response = new HttpClient(_config);
                
                //process response
                _response.then(function success(_result) {
                    var parsed = _result.body;
                    parsed = BaseController.getObjectMapper().mapObject(parsed, 'VerifyUserModelResponse');
                    _result.body = parsed;
                    _deffered.resolve(_result);
                }, function error(_result){
                    // Error handling for custom HTTP status codes
                    if (_result.code === 404) {
                        _deffered.resolve(null);
                    } else if (_result.code === 400) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Bad Request',
                            errorCode: 400,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 401) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Incorrect Credentials',
                            errorCode: 401,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 403) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Forbidden',
                            errorCode: 403,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 406) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Not Acceptable Input',
                            errorCode: 406,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 409) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Data Conflict',
                            errorCode: 409,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 413) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Payload Too Large',
                            errorCode: 413,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 415) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Un-Supported Content Type',
                            errorCode: 415,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 451) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Un-Available For Legal Reasons',
                            errorCode: 451,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 500) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Internal API Error',
                            errorCode: 500,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 501) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Not Implemented',
                            errorCode: 501,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 503) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'API Unavailable',
                            errorCode: 503,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 504) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Request Timeout',
                            errorCode: 504,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 511) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Authentication Required',
                            errorCode: 511,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'HTTP Response Not OK',
                            errorCode: _result.code,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    }
                });
                
                return _deffered.promise;
            },
            /**
             * User Verification API
             *
             * @param {string} user Users UID, Username, Or Email
             *
             * @return {promise<Verify Model Response>}
             */
            userVerification: function (user) {

                //Create promise to return
                var _deffered = $q.defer();
                
                // validating required parameters
                var _missingArgs = false;
                if (user === null || user === undefined) {
                    _deffered.reject({
                        errorMessage: 'The parameter `user` is a required parameter and cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                }

                if (_missingArgs) {
                    return _deffered.promise;
                }

                //prepare query string for API call
                var _baseUri = Configuration.getBaseUri(Servers.PATH);
                var _queryBuilder = _baseUri + '/v';
                
                // Process query parameters
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, {
                    'user': user
                });

                //validate and preprocess url
                var _queryUrl = APIHelper.cleanUrl(_queryBuilder);
                
                // prepare headers
                var _headers = {
                    'accept': 'application/json'
                };

                // append custom auth authorization
                CustomAuthUtility.appendCustomAuthParams(_headers);

                // prepare and invoke the API call request to fetch the response
                var _config = {
                    method: 'GET',
                    queryUrl: _queryUrl,
                    headers: _headers,
                };
                
                var _response = new HttpClient(_config);
                
                //process response
                _response.then(function success(_result) {
                    var parsed = _result.body;
                    parsed = BaseController.getObjectMapper().mapObject(parsed, 'VerifyModelResponse');
                    _result.body = parsed;
                    _deffered.resolve(_result);
                }, function error(_result){
                    // Error handling for custom HTTP status codes
                    if (_result.code === 404) {
                        _deffered.resolve(null);
                    } else if (_result.code === 400) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Bad Request',
                            errorCode: 400,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 401) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Incorrect Credentials',
                            errorCode: 401,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 403) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Forbidden',
                            errorCode: 403,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 406) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Not Acceptable Input',
                            errorCode: 406,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 409) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Data Conflict',
                            errorCode: 409,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 413) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Payload Too Large',
                            errorCode: 413,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 415) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Un-Supported Content Type',
                            errorCode: 415,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 451) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Un-Available For Legal Reasons',
                            errorCode: 451,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 500) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Internal API Error',
                            errorCode: 500,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 501) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Not Implemented',
                            errorCode: 501,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 503) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'API Unavailable',
                            errorCode: 503,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 504) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Request Timeout',
                            errorCode: 504,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else if (_result.code === 511) {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'Authentication Required',
                            errorCode: 511,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    } else {
                        _deffered.reject(APIHelper.appendContext({
                            errorMessage:'HTTP Response Not OK',
                            errorCode: _result.code,
                            errorResponse: _result.message
                        }, _result.getContext()));
                    }
                });
                
                return _deffered.promise;
            }
        };
    }

}(angular));

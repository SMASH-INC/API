/**
  * SMASH
  *
  * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
  */

;(function (angular) {
'use strict';

angular.module('SMASH')
    .factory('LoginAndRegistration', ['$q',
        'Configuration',
        'Servers',
        'HttpClient',
        'APIHelper',
        'BaseController',
        LoginAndRegistration
    ]);

    function LoginAndRegistration($q, Configuration, Servers, HttpClient, APIHelper, BaseController) {
        return {
            /**
             * User Registration API
             *
             * @param {array}  input    Array with all options for search
             * @param {string} input['email'] Users Email
             * @param {string} input['user'] Users Username
             * @param {string} input['password'] Users Password
             * @param {string|null} input['name'] [Optional] Users Name
             * @param {int|null} input['phone'] [Optional] Users Cellphone Number
             * @param {int|null} input['countrycode'] [Optional] Users Country Code (US = 1)
             * @param {string|null} input['address'] [Optional] Users Address
             * @param    {Dictionary}  queryParameters    Additional optional query parameters are supported by this
             * endpoint
             *
             * @return {promise<User Registration Model Response>}
             */
            userRegistration: function (input, queryParameters) {
                // Assign default values
                input = input || {};
                queryParameters = queryParameters || null;

                //Create promise to return
                var _deffered = $q.defer();
                
                // validating required parameters
                var _missingArgs = false;
                if (input.email === null || input.email === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `email` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.user === null || input.user === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `user` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                } else if (input.password === null || input.password === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `password` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                }

                if (_missingArgs) {
                    return _deffered.promise;
                }

                //prepare query string for API call
                var _baseUri = Configuration.getBaseUri(Servers.PATH);
                var _queryBuilder = _baseUri + '/a/u/r';
                
                // Process query parameters
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, {
                    'email': input.email,
                    'user': input.user,
                    'password': input.password,
                    'name': input.name,
                    'phone': input.phone,
                    'countrycode': input.countrycode,
                    'address': input.address
                });

                //append optional parameters to the query
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, queryParameters);
                
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
                    parsed = BaseController.getObjectMapper().mapObject(parsed, 'UserRegistrationModelResponse');
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
             * User Authentication API
             *
             * @param {array}  input    Array with all options for search
             * @param {string} input['user'] Users Username or Email
             * @param {string} input['password'] Users Password
             *
             * @return {promise<User Authentication Model Response>}
             */
            userAuthentication: function (input) {
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
                } else if (input.password === null || input.password === undefined) {
                    _deffered.reject({
                        errorMessage: 'The property `password` in the input object cannot be null.',
                        errorCode: -1
                    });
                    _missingArgs = true;
                }

                if (_missingArgs) {
                    return _deffered.promise;
                }

                //prepare query string for API call
                var _baseUri = Configuration.getBaseUri(Servers.PATH);
                var _queryBuilder = _baseUri + '/a/u/l';
                
                // Process query parameters
                _queryBuilder = APIHelper.appendUrlWithQueryParameters(_queryBuilder, {
                    'user': input.user,
                    'password': input.password
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
                    parsed = BaseController.getObjectMapper().mapObject(parsed, 'UserAuthenticationModelResponse');
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

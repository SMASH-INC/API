/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import SMASH.*;
import SMASH.models.*;
import SMASH.exceptions.*;
import SMASH.http.client.HttpClient;
import SMASH.http.client.HttpContext;
import SMASH.http.request.HttpRequest;
import SMASH.http.response.HttpResponse;
import SMASH.http.response.HttpStringResponse;
import SMASH.http.client.APICallBack;
import SMASH.controllers.syncwrapper.APICallBackCatcher;

public class UserManagement extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static UserManagement instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the UserManagement class 
     */
    public static UserManagement getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new UserManagement();
            }
        }
        return instance;
    }

    /**
     * Get User Info API
     * @param    user    Required parameter: Users User ID
     * @return    Returns the UserInformationModelResponse response from the API call 
     */
    public UserInformationModelResponse getUserInfo(
                final String user
    ) throws Throwable {
        APICallBackCatcher<UserInformationModelResponse> callback = new APICallBackCatcher<UserInformationModelResponse>();
        getUserInfoAsync(user, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get User Info API
     * @param    user    Required parameter: Users User ID
     * @return    Returns the void response from the API call 
     */
    public void getUserInfoAsync(
                final String user,
                final APICallBack<UserInformationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == user)
            throw new NullPointerException("The parameter \"user\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/u/i");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5227523964982448635L;
            {
                    put( "user", user );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4667457526429852671L;
            {
                    put( "user-agent", "SMASH" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //Custom Authentication to be added for authorization
        CustomAuthUtility.appendCustomAuthParams(_request);

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            UserInformationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UserInformationModelResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Update User API
     * @param    UpdateUserInput    Object containing request parameters
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the UserUpdateModelResponse response from the API call 
     */
    public UserUpdateModelResponse updateUser(
                final UpdateUserInput input,
                Map<String, Object> queryParameters
    ) throws Throwable {
        APICallBackCatcher<UserUpdateModelResponse> callback = new APICallBackCatcher<UserUpdateModelResponse>();
        updateUserAsync(input, queryParameters, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update User API
     * @param    UpdateUserInput    Object containing request parameters
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the void response from the API call 
     */
    public void updateUserAsync(
                final UpdateUserInput input,
                Map<String, Object> queryParameters,
                final APICallBack<UserUpdateModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getUser())
            throw new NullPointerException("The property \"User\" in the input object cannot be null.");

        if (null == input.getAvatar())
            throw new NullPointerException("The property \"Avatar\" in the input object cannot be null.");

        if (null == input.getCustomInput())
            throw new NullPointerException("The property \"CustomInput\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/u/u");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5262259791621242253L;
            {
                    put( "user", input.getUser() );
                    put( "avatar", input.getAvatar() );
                    put( "custom input", input.getCustomInput() );
            }});

        //append optional parameters to the query
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5600308818668807165L;
            {
                    put( "user-agent", "SMASH" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //Custom Authentication to be added for authorization
        CustomAuthUtility.appendCustomAuthParams(_request);

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            UserUpdateModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UserUpdateModelResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Delete User API
     * @param    user    Required parameter: Users UID, Username, or Email
     * @return    Returns the UserDeletionResponseModel response from the API call 
     */
    public UserDeletionResponseModel deleteUser(
                final String user
    ) throws Throwable {
        APICallBackCatcher<UserDeletionResponseModel> callback = new APICallBackCatcher<UserDeletionResponseModel>();
        deleteUserAsync(user, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Delete User API
     * @param    user    Required parameter: Users UID, Username, or Email
     * @return    Returns the void response from the API call 
     */
    public void deleteUserAsync(
                final String user,
                final APICallBack<UserDeletionResponseModel> callBack
    ) {
        //validating required parameters
        if (null == user)
            throw new NullPointerException("The parameter \"user\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/u/d");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5096107395825728632L;
            {
                    put( "user", user );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5340936585655796679L;
            {
                    put( "user-agent", "SMASH" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //Custom Authentication to be added for authorization
        CustomAuthUtility.appendCustomAuthParams(_request);

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            UserDeletionResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UserDeletionResponseModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}
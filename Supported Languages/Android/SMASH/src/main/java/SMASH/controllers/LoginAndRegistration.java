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

public class LoginAndRegistration extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static LoginAndRegistration instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the LoginAndRegistration class 
     */
    public static LoginAndRegistration getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new LoginAndRegistration();
            }
        }
        return instance;
    }

    /**
     * User Registration API
     * @param    UserRegistrationInput    Object containing request parameters
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the void response from the API call 
     */
    public void userRegistrationAsync(
                final UserRegistrationInput input,
                Map<String, Object> queryParameters,
                final APICallBack<UserRegistrationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getEmail())
            throw new NullPointerException("The property \"Email\" in the input object cannot be null.");

        if (null == input.getUser())
            throw new NullPointerException("The property \"User\" in the input object cannot be null.");

        if (null == input.getPassword())
            throw new NullPointerException("The property \"Password\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/a/u/r");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5183601728966014060L;
            {
                    put( "email", input.getEmail() );
                    put( "user", input.getUser() );
                    put( "password", input.getPassword() );
                    put( "name", input.getName() );
                    put( "phone", input.getPhone() );
                    put( "countrycode", input.getCountrycode() );
                    put( "address", input.getAddress() );
            }});

        //append optional parameters to the query
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5204952431179796612L;
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
                            UserRegistrationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UserRegistrationModelResponse>(){});

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
     * User Authentication API
     * @param    UserAuthenticationInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void userAuthenticationAsync(
                final UserAuthenticationInput input,
                final APICallBack<UserAuthenticationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getUser())
            throw new NullPointerException("The property \"User\" in the input object cannot be null.");

        if (null == input.getPassword())
            throw new NullPointerException("The property \"Password\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/a/u/l");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4973541844398614401L;
            {
                    put( "user", input.getUser() );
                    put( "password", input.getPassword() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5453588677846603212L;
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
                            UserAuthenticationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UserAuthenticationModelResponse>(){});

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
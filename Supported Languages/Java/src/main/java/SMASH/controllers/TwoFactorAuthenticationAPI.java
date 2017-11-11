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

public class TwoFactorAuthenticationAPI extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TwoFactorAuthenticationAPI instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TwoFactorAuthenticationAPI class 
     */
    public static TwoFactorAuthenticationAPI getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TwoFactorAuthenticationAPI();
            }
        }
        return instance;
    }

    /**
     * Two Factor Authentication Token Reply
     * @param    M2FATokenResponseInput    Object containing request parameters
     * @return    Returns the TwoFactorAuthenticationTokenModelResponse response from the API call 
     */
    public TwoFactorAuthenticationTokenModelResponse m2FATokenResponse(
                final M2FATokenResponseInput input
    ) throws Throwable {
        APICallBackCatcher<TwoFactorAuthenticationTokenModelResponse> callback = new APICallBackCatcher<TwoFactorAuthenticationTokenModelResponse>();
        m2FATokenResponseAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Two Factor Authentication Token Reply
     * @param    M2FATokenResponseInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void m2FATokenResponseAsync(
                final M2FATokenResponseInput input,
                final APICallBack<TwoFactorAuthenticationTokenModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getUser())
            throw new NullPointerException("The property \"User\" in the input object cannot be null.");

        if (null == input.getCode())
            throw new NullPointerException("The property \"Code\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/2fa/t");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5379252986604131381L;
            {
                    put( "user", input.getUser() );
                    put( "code", input.getCode() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5467248236522583142L;
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
                            TwoFactorAuthenticationTokenModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<TwoFactorAuthenticationTokenModelResponse>(){});

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
     * Two Factor Authentication API
     * @param    to    Required parameter: Users UID, Username, Email, Or Cellphone number
     * @return    Returns the TwoFactorAuthenticationModelResponse response from the API call 
     */
    public TwoFactorAuthenticationModelResponse twoFactorAuthentication(
                final String to
    ) throws Throwable {
        APICallBackCatcher<TwoFactorAuthenticationModelResponse> callback = new APICallBackCatcher<TwoFactorAuthenticationModelResponse>();
        twoFactorAuthenticationAsync(to, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Two Factor Authentication API
     * @param    to    Required parameter: Users UID, Username, Email, Or Cellphone number
     * @return    Returns the void response from the API call 
     */
    public void twoFactorAuthenticationAsync(
                final String to,
                final APICallBack<TwoFactorAuthenticationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == to)
            throw new NullPointerException("The parameter \"to\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/2fa");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5259480238534889207L;
            {
                    put( "to", to );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5560595356356769565L;
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
                            TwoFactorAuthenticationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<TwoFactorAuthenticationModelResponse>(){});

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
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

public class WAFAndDDOSProtection extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static WAFAndDDOSProtection instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the WAFAndDDOSProtection class 
     */
    public static WAFAndDDOSProtection getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new WAFAndDDOSProtection();
            }
        }
        return instance;
    }

    /**
     * WAF and DDOS Configuration
     * @param    WAFConfigurationInput    Object containing request parameters
     * @return    Returns the WAFConfigurationModelResponse response from the API call 
     */
    public WAFConfigurationModelResponse wAFConfiguration(
                final WAFConfigurationInput input
    ) throws Throwable {
        APICallBackCatcher<WAFConfigurationModelResponse> callback = new APICallBackCatcher<WAFConfigurationModelResponse>();
        wAFConfigurationAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * WAF and DDOS Configuration
     * @param    WAFConfigurationInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void wAFConfigurationAsync(
                final WAFConfigurationInput input,
                final APICallBack<WAFConfigurationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getName())
            throw new NullPointerException("The property \"Name\" in the input object cannot be null.");

        if (null == input.getRule())
            throw new NullPointerException("The property \"Rule\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/w/c");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5418311212872245965L;
            {
                    put( "name", input.getName() );
                    put( "rule", input.getRule() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4976521452919073077L;
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
                            WAFConfigurationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<WAFConfigurationModelResponse>(){});

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
     * WAF and DDOS Creation
     * @param    WAFCreationInput    Object containing request parameters
     * @return    Returns the WAFCreationModelResponse response from the API call 
     */
    public WAFCreationModelResponse wAFCreation(
                final WAFCreationInput input
    ) throws Throwable {
        APICallBackCatcher<WAFCreationModelResponse> callback = new APICallBackCatcher<WAFCreationModelResponse>();
        wAFCreationAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * WAF and DDOS Creation
     * @param    WAFCreationInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void wAFCreationAsync(
                final WAFCreationInput input,
                final APICallBack<WAFCreationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getOrigin())
            throw new NullPointerException("The property \"Origin\" in the input object cannot be null.");

        if (null == input.getCname())
            throw new NullPointerException("The property \"Cname\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/w");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5440390733314594244L;
            {
                    put( "origin", input.getOrigin() );
                    put( "cname", input.getCname() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4791170361068650624L;
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
                            WAFCreationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<WAFCreationModelResponse>(){});

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
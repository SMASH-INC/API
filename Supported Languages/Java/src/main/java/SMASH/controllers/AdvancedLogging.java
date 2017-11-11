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

public class AdvancedLogging extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static AdvancedLogging instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the AdvancedLogging class 
     */
    public static AdvancedLogging getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new AdvancedLogging();
            }
        }
        return instance;
    }

    /**
     * WAF Log Configuration
     * @param    LoggingConfigurationInput    Object containing request parameters
     * @return    Returns the LoggingSetupModelResponse response from the API call 
     */
    public LoggingSetupModelResponse loggingConfiguration(
                final LoggingConfigurationInput input
    ) throws Throwable {
        APICallBackCatcher<LoggingSetupModelResponse> callback = new APICallBackCatcher<LoggingSetupModelResponse>();
        loggingConfigurationAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * WAF Log Configuration
     * @param    LoggingConfigurationInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void loggingConfigurationAsync(
                final LoggingConfigurationInput input,
                final APICallBack<LoggingSetupModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getName())
            throw new NullPointerException("The property \"Name\" in the input object cannot be null.");

        if (null == input.getOrigin())
            throw new NullPointerException("The property \"Origin\" in the input object cannot be null.");

        if (null == input.getActivate())
            throw new NullPointerException("The property \"Activate\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/l");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4897853351122296844L;
            {
                    put( "name", input.getName() );
                    put( "origin", input.getOrigin() );
                    put( "activate", input.getActivate() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5156410332624243201L;
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
                            LoggingSetupModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<LoggingSetupModelResponse>(){});

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
     * WAF Log Info
     * @param    LoggingInfoInput    Object containing request parameters
     * @return    Returns the LoggingLogsModelResponse response from the API call 
     */
    public LoggingLogsModelResponse loggingInfo(
                final LoggingInfoInput input
    ) throws Throwable {
        APICallBackCatcher<LoggingLogsModelResponse> callback = new APICallBackCatcher<LoggingLogsModelResponse>();
        loggingInfoAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * WAF Log Info
     * @param    LoggingInfoInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void loggingInfoAsync(
                final LoggingInfoInput input,
                final APICallBack<LoggingLogsModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getName())
            throw new NullPointerException("The property \"Name\" in the input object cannot be null.");

        if (null == input.getOrigin())
            throw new NullPointerException("The property \"Origin\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/l/i");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5394290241967499081L;
            {
                    put( "name", input.getName() );
                    put( "origin", input.getOrigin() );
                    put( "time", input.getTime() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5440952353490104014L;
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
                            LoggingLogsModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<LoggingLogsModelResponse>(){});

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
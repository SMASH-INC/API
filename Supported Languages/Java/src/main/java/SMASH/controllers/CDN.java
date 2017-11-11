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

public class CDN extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static CDN instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CDN class 
     */
    public static CDN getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new CDN();
            }
        }
        return instance;
    }

    /**
     * CDN Push Zone API
     * @param    CDNPushZoneInput    Object containing request parameters
     * @return    Returns the CDNPushModelResponse response from the API call 
     */
    public CDNPushModelResponse cDNPushZone(
                final CDNPushZoneInput input
    ) throws Throwable {
        APICallBackCatcher<CDNPushModelResponse> callback = new APICallBackCatcher<CDNPushModelResponse>();
        cDNPushZoneAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * CDN Push Zone API
     * @param    CDNPushZoneInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void cDNPushZoneAsync(
                final CDNPushZoneInput input,
                final APICallBack<CDNPushModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getCname())
            throw new NullPointerException("The property \"Cname\" in the input object cannot be null.");

        if (null == input.getFile())
            throw new NullPointerException("The property \"File\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/c/push");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4976518704493386302L;
            {
                    put( "cname", input.getCname() );
                    put( "file", input.getFile() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5566212981033743423L;
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
                            CDNPushModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CDNPushModelResponse>(){});

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
     * CDN Pull Zone API
     * @param    CDNPullZoneInput    Object containing request parameters
     * @return    Returns the CDNPullModelResponse response from the API call 
     */
    public CDNPullModelResponse cDNPullZone(
                final CDNPullZoneInput input
    ) throws Throwable {
        APICallBackCatcher<CDNPullModelResponse> callback = new APICallBackCatcher<CDNPullModelResponse>();
        cDNPullZoneAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * CDN Pull Zone API
     * @param    CDNPullZoneInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void cDNPullZoneAsync(
                final CDNPullZoneInput input,
                final APICallBack<CDNPullModelResponse> callBack
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
        _queryBuilder.append("/s/c/pull");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4787613962547951284L;
            {
                    put( "origin", input.getOrigin() );
                    put( "cname", input.getCname() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4675155259643613575L;
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
                            CDNPullModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CDNPullModelResponse>(){});

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
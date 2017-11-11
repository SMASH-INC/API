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

public class DNS extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static DNS instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the DNS class 
     */
    public static DNS getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new DNS();
            }
        }
        return instance;
    }

    /**
     * DNS Configuration API
     * @param    DNSConfigurationInput    Object containing request parameters
     * @return    Returns the DNSConfigurationModelResponse response from the API call 
     */
    public DNSConfigurationModelResponse dNSConfiguration(
                final DNSConfigurationInput input
    ) throws Throwable {
        APICallBackCatcher<DNSConfigurationModelResponse> callback = new APICallBackCatcher<DNSConfigurationModelResponse>();
        dNSConfigurationAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * DNS Configuration API
     * @param    DNSConfigurationInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void dNSConfigurationAsync(
                final DNSConfigurationInput input,
                final APICallBack<DNSConfigurationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == input.getDomain())
            throw new NullPointerException("The property \"Domain\" in the input object cannot be null.");

        if (null == input.getRecords())
            throw new NullPointerException("The property \"Records\" in the input object cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/d/c");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4947742541508337364L;
            {
                    put( "domain", input.getDomain() );
                    put( "records", input.getRecords() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5503383609687559005L;
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
                            DNSConfigurationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<DNSConfigurationModelResponse>(){});

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
     * DNS Creation API
     * @param    domain    Required parameter: Domain or domain names separated by a comma
     * @return    Returns the DNSCreationModelResponse response from the API call 
     */
    public DNSCreationModelResponse dNSCreation(
                final String domain
    ) throws Throwable {
        APICallBackCatcher<DNSCreationModelResponse> callback = new APICallBackCatcher<DNSCreationModelResponse>();
        dNSCreationAsync(domain, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * DNS Creation API
     * @param    domain    Required parameter: Domain or domain names separated by a comma
     * @return    Returns the void response from the API call 
     */
    public void dNSCreationAsync(
                final String domain,
                final APICallBack<DNSCreationModelResponse> callBack
    ) {
        //validating required parameters
        if (null == domain)
            throw new NullPointerException("The parameter \"domain\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri(Servers.PATH);
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/s/d/a");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4735280909897943737L;
            {
                    put( "domain", domain );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4991757475175852389L;
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
                            DNSCreationModelResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<DNSCreationModelResponse>(){});

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
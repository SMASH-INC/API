/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.controllers;

import SMASH.exceptions.*;
import SMASH.http.client.HttpClient;
import SMASH.http.client.HttpContext;
import SMASH.http.client.HttpCallBack;
import SMASH.http.client.VolleyClient;
import SMASH.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static Object syncObject = new Object();

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        synchronized (syncObject) {
            if (null == clientInstance) {
                clientInstance = VolleyClient.getSharedInstance();
                clientInstance.setTimeout(5000);
    }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        synchronized (syncObject) {
            if (null != client) {
                clientInstance = client;
            }
        }
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400)
            throw new APIException("Bad Request", context);

        if (responseCode == 401)
            throw new APIException("Incorrect Credentials", context);

        if (responseCode == 403)
            throw new APIException("Forbidden", context);

        if (responseCode == 406)
            throw new APIException("Not Acceptable Input", context);

        if (responseCode == 409)
            throw new APIException("Data Conflict", context);

        if (responseCode == 413)
            throw new APIException("Payload Too Large", context);

        if (responseCode == 415)
            throw new APIException("Un-Supported Content Type", context);

        if (responseCode == 451)
            throw new APIException("Un-Available For Legal Reasons", context);

        if (responseCode == 500)
            throw new APIException("Internal API Error", context);

        if (responseCode == 501)
            throw new APIException("Not Implemented", context);

        if (responseCode == 503)
            throw new APIException("API Unavailable", context);

        if (responseCode == 504)
            throw new APIException("Request Timeout", context);

        if (responseCode == 511)
            throw new APIException("Authentication Required", context);

        if ((responseCode < 200) || (responseCode > 208)) //[200,208] = HTTP OK
            throw new APIException("HTTP Response Not OK", context);
    }
}

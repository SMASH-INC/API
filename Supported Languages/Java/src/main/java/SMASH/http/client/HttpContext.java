/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.http.client;

import SMASH.http.request.HttpRequest;
import SMASH.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * Getter for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * Getter for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getResponse() {
        return _response;
    }
}
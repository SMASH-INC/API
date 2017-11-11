<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib\Controllers;

use SMASHLib\Http\HttpCallBack;
use SMASHLib\Http\HttpContext;
use SMASHLib\Http\HttpResponse;
use SMASHLib\APIException;
use SMASHLib\Exceptions;
use \SMASH\jsonmapper\JsonMapper;
use Unirest\Request;

/**
* Base controller
*/
class BaseController
{
    /**
     * HttpCallBack instance associated with this controller
     * @var HttpCallBack
     */
    private $httpCallBack = null;

     /**
     * Constructor that sets the timeout of requests
     */
    function __construct(){
        Request::timeout(5);
    }

    /**
     * Set HttpCallBack for this controller
     * @param HttpCallBack $httpCallBack Http Callbacks called before/after each API call
     */
    public function setHttpCallBack(HttpCallBack $httpCallBack)
    {
        $this->httpCallBack = $httpCallBack;
    }

    /**
     * Get HttpCallBack for this controller
     * @return HttpCallBack The HttpCallBack object set for this controller
     */
    public function getHttpCallBack()
    {
        return $this->httpCallBack;
    }

    /**
     * Get a new JsonMapper instance for mapping objects
     * @return \SMASH\jsonmapper\JsonMapper JsonMapper instance
     */
    protected function getJsonMapper()
    {
        $mapper = new JsonMapper();
        $mapper->sAdditionalPropertiesCollectionMethod = 'addAdditionalProperty';
        return $mapper;
    }

    protected function validateResponse(HttpResponse $response, HttpContext $_httpContext)
    {
        if ($response->getStatusCode() == 400) {
            throw new APIException('Bad Request', $_httpContext);
        }

        if ($response->getStatusCode() == 401) {
            throw new APIException('Incorrect Credentials', $_httpContext);
        }

        if ($response->getStatusCode() == 403) {
            throw new APIException('Forbidden', $_httpContext);
        }

        if ($response->getStatusCode() == 406) {
            throw new APIException('Not Acceptable Input', $_httpContext);
        }

        if ($response->getStatusCode() == 409) {
            throw new APIException('Data Conflict', $_httpContext);
        }

        if ($response->getStatusCode() == 413) {
            throw new APIException('Payload Too Large', $_httpContext);
        }

        if ($response->getStatusCode() == 415) {
            throw new APIException('Un-Supported Content Type', $_httpContext);
        }

        if ($response->getStatusCode() == 451) {
            throw new APIException('Un-Available For Legal Reasons', $_httpContext);
        }

        if ($response->getStatusCode() == 500) {
            throw new APIException('Internal API Error', $_httpContext);
        }

        if ($response->getStatusCode() == 501) {
            throw new APIException('Not Implemented', $_httpContext);
        }

        if ($response->getStatusCode() == 503) {
            throw new APIException('API Unavailable', $_httpContext);
        }

        if ($response->getStatusCode() == 504) {
            throw new APIException('Request Timeout', $_httpContext);
        }

        if ($response->getStatusCode() == 511) {
            throw new APIException('Authentication Required', $_httpContext);
        }

        if (($response->getStatusCode() < 200) || ($response->getStatusCode() > 208)) { //[200,208] = HTTP OK
            throw new APIException('HTTP Response Not OK', $_httpContext);
        }
    }
}

<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib\Controllers;

use SMASHLib\APIException;
use SMASHLib\APIHelper;
use SMASHLib\Configuration;
use SMASHLib\Models;
use SMASHLib\Exceptions;
use SMASHLib\Http\HttpRequest;
use SMASHLib\Http\HttpResponse;
use SMASHLib\Http\HttpMethod;
use SMASHLib\Http\HttpContext;
use SMASHLib\Servers;
use SMASHLib\CustomAuthUtility;
use Unirest\Request;

/**
 * @todo Add a general description for this controller.
 */
class Hosting extends BaseController
{
    /**
     * @var Hosting The reference to *Singleton* instance of this class
     */
    private static $instance;

    /**
     * Returns the *Singleton* instance of this class.
     * @return Hosting The *Singleton* instance.
     */
    public static function getInstance()
    {
        if (null === static::$instance) {
            static::$instance = new static();
        }
        
        return static::$instance;
    }

    /**
     * Node.JS and Static Web APP Hosting
     *
     * @param  array  $options    Array with all options for search
     * @param string $options['app']    GIT URL or ZIP package containing your APP
     * @param string $options['domain'] Domain or domain names separated by a comma
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function hostingSetup(
        $options
    ) {
        //check that all required arguments are provided
        if (!isset($options['app'], $options['domain'])) {
            throw new \InvalidArgumentException("One or more required arguments were NULL.");
        }


        //the base uri for api requests
        $_queryBuilder = Configuration::getBaseUri(Servers::PATH);
        
        //prepare query string for API call
        $_queryBuilder = $_queryBuilder.'/s/h';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'app'    => $this->val($options, 'app'),
            'domain' => $this->val($options, 'domain'),
        ));

        //validate and preprocess url
        $_queryUrl = APIHelper::cleanUrl($_queryBuilder);

        //prepare headers
        $_headers = array (
            'user-agent'    => 'SMASH'
        );

        //append custom auth authorization headers
        CustomAuthUtility::appendCustomAuthParams($_headers);

        //call on-before Http callback
        $_httpRequest = new HttpRequest(HttpMethod::GET, $_headers, $_queryUrl);
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        //and invoke the API call request to fetch the response
        $response = Request::get($_queryUrl, $_headers);

        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpContext);

        $mapper = $this->getJsonMapper();

        return $mapper->mapClass($response->body, 'SMASHLib\\Models\\HostingModelResponse');
    }


    /**
    * Array access utility method
     * @param  array          $arr         Array of values to read from
     * @param  string         $key         Key to get the value from the array
     * @param  mixed|null     $default     Default value to use if the key was not found
     * @return mixed
     */
    private function val($arr, $key, $default = null)
    {
        if (isset($arr[$key])) {
            return is_bool($arr[$key]) ? var_export($arr[$key], true) : $arr[$key];
        }
        return $default;
    }
}

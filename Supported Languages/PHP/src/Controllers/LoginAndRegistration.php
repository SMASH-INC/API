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
class LoginAndRegistration extends BaseController
{
    /**
     * @var LoginAndRegistration The reference to *Singleton* instance of this class
     */
    private static $instance;

    /**
     * Returns the *Singleton* instance of this class.
     * @return LoginAndRegistration The *Singleton* instance.
     */
    public static function getInstance()
    {
        if (null === static::$instance) {
            static::$instance = new static();
        }
        
        return static::$instance;
    }

    /**
     * User Registration API
     *
     * @param  array  $options    Array with all options for search
     * @param string  $options['email']       Users Email
     * @param string  $options['user']        Users Username
     * @param string  $options['password']    Users Password
     * @param string  $options['name']        (optional) Users Name
     * @param integer $options['phone']       (optional) Users Cellphone Number
     * @param integer $options['countrycode'] (optional) Users Country Code (US = 1)
     * @param string  $options['address']     (optional) Users Address
     * @param  array  $queryParameters    Additional optional query parameters are supported by this endpoint
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function userRegistration(
        $options,
        $queryParameters = null
    ) {
        //check that all required arguments are provided
        if (!isset($options['email'], $options['user'], $options['password'])) {
            throw new \InvalidArgumentException("One or more required arguments were NULL.");
        }


        //the base uri for api requests
        $_queryBuilder = Configuration::getBaseUri(Servers::PATH);
        
        //prepare query string for API call
        $_queryBuilder = $_queryBuilder.'/a/u/r';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'email'       => $this->val($options, 'email'),
            'user'        => $this->val($options, 'user'),
            'password'    => $this->val($options, 'password'),
            'name'        => $this->val($options, 'name'),
            'phone'       => $this->val($options, 'phone'),
            'countrycode' => $this->val($options, 'countrycode'),
            'address'     => $this->val($options, 'address'),
        ));

        //append optional parameters to the query
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, $queryParameters);

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

        return $mapper->mapClass($response->body, 'SMASHLib\\Models\\UserRegistrationModelResponse');
    }

    /**
     * User Authentication API
     *
     * @param  array  $options    Array with all options for search
     * @param string $options['user']     Users Username or Email
     * @param string $options['password'] Users Password
     * @return mixed response from the API call
     * @throws APIException Thrown if API call fails
     */
    public function userAuthentication(
        $options
    ) {
        //check that all required arguments are provided
        if (!isset($options['user'], $options['password'])) {
            throw new \InvalidArgumentException("One or more required arguments were NULL.");
        }


        //the base uri for api requests
        $_queryBuilder = Configuration::getBaseUri(Servers::PATH);
        
        //prepare query string for API call
        $_queryBuilder = $_queryBuilder.'/a/u/l';

        //process optional query parameters
        APIHelper::appendUrlWithQueryParameters($_queryBuilder, array (
            'user'     => $this->val($options, 'user'),
            'password' => $this->val($options, 'password'),
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

        return $mapper->mapClass($response->body, 'SMASHLib\\Models\\UserAuthenticationModelResponse');
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

<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib;

class CustomAuthUtility
{
    /**
    * Appends the necessary Custom Authentication credentials for making this authorized call
    * @param HttpRequest $request The out going request to access the resource
    */
    public static function appendCustomAuthParams($request)
    {
        // TODO: Add your custom authentication here
        // The following properties are available to use
        //     Configuration::$uid
        //     Configuration::$secret
        //     Configuration::$key
        // 
        // ie. Add a header through:
        //     $request.headers(array("key" => "value"));
    }
}
<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib\Tests;

use SMASHLib\APIException;
use SMASHLib\Exceptions;
use SMASHLib\APIHelper;
use SMASHLib\Models;

class AdvancedLoggingTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\AdvancedLogging Controller instance
     */
    protected static $controller;

    /**
     * @var HttpCallBackCatcher Callback
     */
    protected $httpResponse;

    /**
     * Setup test class
     */
    public static function setUpBeforeClass()
    {
        $client = new \SMASHLib\SMASHClient();
        self::$controller = $client->getAdvancedLogging();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * Advanced logging configuration test case
     */
    public function testHttpsApiRestShApiSL()
    {
        // Parameters for the API call
        $input = array();
        $input['name'] = null;
        $input['origin'] = null;
        $input['activate'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->loggingConfiguration($input);
        } catch (APIException $e) {
        }

        // Test response code
        $this->assertEquals(
            200,
            $this->httpResponse->getResponse()->getStatusCode(),
            "Status is not 200"
        );

        // Test whether the captured response is as we expected
        $this->assertNotNull($result, "Result does not exist");

        $this->assertEquals(
            '{\r\n  "success": "RETURNS TRUE IF ADVANCED LOGGING IS ACTIVATED"\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * Advanced logging info test case
     */
    public function testHttpsApiRestShApiSLI()
    {
        // Parameters for the API call
        $input = array();
        $input['name'] = null;
        $input['origin'] = null;
        $input['time'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->loggingInfo($input);
        } catch (APIException $e) {
        }

        // Test response code
        $this->assertEquals(
            200,
            $this->httpResponse->getResponse()->getStatusCode(),
            "Status is not 200"
        );

        // Test whether the captured response is as we expected
        $this->assertNotNull($result, "Result does not exist");

        $this->assertEquals(
            '{\n    "log": {\n        "01010101245901": {\n            "data": {\n                "result": "INFO' .
                '",\n                "content": "LOG: CONTENT AND ACTIONS PERFORMED",\n                "id": "FUNCTIO' .
                'N ID"\n            }\n        },\n        "01010101245902": {\n            "data": {\n              ' .
                '  "result": "ERROR",\n                "content": "LOG: ERROR CONTENT AND ACTIONS PERFORMED",\n      ' .
                '          "id": "FUNCTION ID"\n            }\n        }\n    }\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

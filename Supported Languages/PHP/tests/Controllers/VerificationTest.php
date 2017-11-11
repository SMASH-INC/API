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

class VerificationTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\Verification Controller instance
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
        self::$controller = $client->getVerification();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * User address verification test case
     */
    public function testHttpsApiRestShApiVA()
    {
        // Parameters for the API call
        $input = array();
        $input['user'] = null;
        $input['a'] = null;
        $input['sa'] = null;
        $input['c'] = null;
        $input['s'] = null;
        $input['z'] = null;
        $input['address'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->userAddressVerification($input);
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
            '{\r\n  "request": "REQUEST TYPE",\r\n  "active": "RETURNS TRUE, IF ADDRESS IS ACTIVE AND IF USER IS ' .
                'CURRENTLY THERE",\r\n  "id": "TRANSACTION ID"\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * User verification response test case
     */
    public function testHttpsApiRestShApiVU()
    {
        // Parameters for the API call
        $input = array();
        $input['user'] = null;
        $input['code'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->userVerificationResponse($input);
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
            '{\r\n  "request": "REQUEST TYPE",\r\n  "correct": "RETURNS IF 2FA TOKEN IS CORRECT",\r\n  "id": "TRA' .
                'NSACTION ID"\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * User verification test case
     */
    public function testHttpsApiRestShApiV()
    {
        // Parameters for the API call
        $user = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->userVerification($user);
        } catch (APIException $e) {
        }

        // Test response code
        $this->assertEquals(
            200,
            $this->httpResponse->getResponse()->getStatusCode(),
            "Status is not 200"
        );

        // Test headers
        $headers = [];
        $headers['Accept-Ranges'] = null ;
        $headers['Connection'] = null ;
        $headers['Content-Length'] = null ;
        $headers['Content-Type'] = null ;
        $headers['Date'] = null ;
        $headers['Server'] = null ;
        $headers['Vary'] = null ;
        $headers['Via'] = null ;
        $headers['X-Cache'] = null ;
        $headers['X-Cache-Hits'] = null ;
        $headers['X-Served-By'] = null ;
        $headers['X-Timer'] = null ;
        $headers['access-control-allow-origin'] = null ;
        $headers['cache-control'] = null ;
        $headers['etag'] = null ;
        $headers['function-execution-id'] = null ;
        $headers['strict-transport-security'] = null ;
        $headers['x-cloud-trace-context'] = null ;
        $headers['x-content-type-options'] = null ;
        $headers['x-dns-prefetch-control'] = null ;
        $headers['x-download-options'] = null ;
        $headers['x-frame-options'] = null ;
        $headers['x-powered-by'] = null ;
        $headers['x-xss-protection'] = null ;
        
        $this->assertTrue(
            TestHelper::areHeadersProperSubsetOf($headers, $this->httpResponse->getResponse()->getHeaders(), true),
            "Headers do not match"
        );

        // Test whether the captured response is as we expected
        $this->assertNotNull($result, "Result does not exist");

        $this->assertEquals(
            '{\n    "request": "REQUEST TYPE",\n    "to": "USER BEING VERIFIED",\n    "verified": "RETURNS TRUE O' .
                'R FALSE",\n    "id": "TRANSACTION ID"\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

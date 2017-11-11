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

class CDNTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\CDN Controller instance
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
        self::$controller = $client->getCDN();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * CDN push zone creation and configuration test case
     */
    public function testHttpsApiRestShApiSCPush()
    {
        // Parameters for the API call
        $input = array();
        $input['cname'] = null;
        $input['file'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->cDNPushZone($input);
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
            '{\r\n  "success": "SHOWS TRUE WHEN PUSH ZONE IS DEPLOYED SUCCESSFULLY",\r\n  "upload": "LIST OF FILE' .
                'S UPLOADED TO YOUR PUSH ZONE",\r\n  "cname": "RECORD TO APPEND YOUR URLS TO VIA A CNAME"\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * CDN pull zone creation and configuration test case
     */
    public function testHttpsApiRestShApiSCPull()
    {
        // Parameters for the API call
        $input = array();
        $input['origin'] = null;
        $input['cname'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->cDNPullZone($input);
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
            '{\r\n  "success": "SHOWS TRUE WHEN PULL ZONE IS DEPLOYED SUCCESSFULLY",\r\n  "cname": "RECORD TO APP' .
                'END YOUR URLS TO VIA A CNAME"\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

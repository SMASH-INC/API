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

class DNSTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\DNS Controller instance
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
        self::$controller = $client->getDNS();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * DNS configuration test case
     */
    public function testHttpsApiRestShApiSDC()
    {
        // Parameters for the API call
        $input = array();
        $input['domain'] = null;
        $input['records'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->dNSConfiguration($input);
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
            '{\n    "success": "SHOWS TRUE IF RECORDS WERE SUCCESSFULLY SET",\n    "domain": "DOMAIN",\n    "reco' .
                'rds": "RECORDS SET TO DOMAIN"\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * DNS addition test case
     */
    public function testHttpsApiRestShApiSDA()
    {
        // Parameters for the API call
        $domain = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->dNSCreation($domain);
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
            '{\n    "domain": "LIST OF DOMAINS ADDED",\n    "nameservers": {\n        "ns1": "NAME SERVER ONE TO ' .
                'POINT YOUR DOMAIN AT",\n        "ns2": "NAME SERVER TWO TO POINT YOUR DOMAIN AT",\n        "ns3": "N' .
                'AME SERVER THREE TO POINT YOUR DOMAIN AT",\n        "ns4": "NAME SERVER FOUR TO POINT YOUR DOMAIN AT' .
                '"\n    }\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

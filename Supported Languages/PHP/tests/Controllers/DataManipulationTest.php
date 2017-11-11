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

class DataManipulationTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\DataManipulation Controller instance
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
        self::$controller = $client->getDataManipulation();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * Data Manipulation test case
     */
    public function testHttpsApiRestShApiD()
    {
        // Parameters for the API call
        $input = array();
        $input['data'] = null;
        $input['transform'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->httpsApiRestShApiD($input);
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
            '{\n    "request": "REQUEST TYPE",\n    "url": "RETURNED DATA URL",\n    "success": "RETURNS TRUE IF ' .
                'DATA MANIPULATION WAS SUCCESSFULL",\n    "id": "TRANSACTION ID"\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

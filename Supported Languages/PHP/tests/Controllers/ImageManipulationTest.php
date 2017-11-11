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

class ImageManipulationTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\ImageManipulation Controller instance
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
        self::$controller = $client->getImageManipulation();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * Image manipulation test case
     */
    public function testHttpsApiRestShApiI()
    {
        // Parameters for the API call
        $input = array();
        $input['image'] = null;
        $input['transform'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->imageManipulation($input);
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
            '{\n    "request": "REQUEST TYPE",\n    "url": "RETURNED IMAGE URL AND DATA",\n    "success": "RETURN' .
                'S TRUE IF IMAGE MANIPULATION WAS SUCCESSFULL",\n    "moderated": "RETURNS TRUE IF IMAGE CONTAINED GR' .
                'APHIC IMAGERY",\n    "id": "TRANSACTION ID"\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

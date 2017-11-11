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

class EncryptionTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\Encryption Controller instance
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
        self::$controller = $client->getEncryption();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * File and Data encryption test case
     */
    public function testHttpsApiRestShApiSE()
    {
        // Parameters for the API call
        $input = array();
        $input['data'] = null;
        $input['method'] = null;
        $input['bit'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->dataAndFileEncryption($input);
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
            '{\n    "data": "RETURNED ENCRYPTED DATA URL",\n    "file": "RETURNED ENCRYPTED FILE URL",\n    "succ' .
                'ess": "SHOWS TRUE IF ENCRYPTION WAS SUCCESSFULL",\n    "public": "PUBLIC ENCRYPTION KEY FOR YOUR DAT' .
                'A OR FILES",\n    "private": "PRIVATE ENCRYPTION KEY FOR YOUR DATA OR FILES"\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

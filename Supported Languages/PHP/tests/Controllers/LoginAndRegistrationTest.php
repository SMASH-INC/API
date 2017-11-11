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

class LoginAndRegistrationTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\LoginAndRegistration Controller instance
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
        self::$controller = $client->getLoginAndRegistration();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * User registration test case
     */
    public function testHttpsApiRestShApiAUR()
    {
        // Parameters for the API call
        $input = array();
        $input['email'] = null;
        $input['user'] = null;
        $input['password'] = null;
        $input['name'] = null;
        $input['phone'] = null;
        $input['countrycode'] = null;
        $input['address'] = null;

        // key-value map for optional query parameters
        $queryParams = [];

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->userRegistration($input, $queryParams);
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
            '{\n    "request": "REQUEST TYPE",\n    "active": "RETURNS TRUE, IF USER WAS SUCCESSFULLY REGISTERED"' .
                ',\n    "id": "TRANSACTION ID",\n    "info": {\n        "uid": "USERS ID",\n        "apiuid": "API SI' .
                'DE USER ID",\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n    ' .
                '    "email": "USERS EMAIL",\n        "address": "USERS ADDRESS",\n        "phone": "USERS CELL PHONE' .
                ' NUMBER"\n    }\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * User authentication test case
     */
    public function testHttpsApiRestShApiAUL()
    {
        // Parameters for the API call
        $input = array();
        $input['user'] = null;
        $input['password'] = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->userAuthentication($input);
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
            '{\n    "request": "REQUEST TYPE",\n    "uid": "Users UID",\n    "valid": "RETURNS TRUE IF USER LOGIN' .
                ' DETAILS ARE VALID",\n    "id": "TRANSACTION ID",\n    "info": {\n    	"uid": "USERS ID",\n    	"api' .
                'uid": "API SIDE USER ID",\n        "realname": "USERS REAL NAME",\n        "displayname": "USERS USE' .
                'RNAME",\n        "avatar": "USER AVATAR URL",\n        "email": "USERS EMAIL",\n        "address": "' .
                'USERS ADDRESS",\n        "phone": "USERS CELL PHONE NUMBER",\n        "lastlogin": "USERS LAST LOGIN' .
                '",\n        "ip": "USERS IP",\n        "2fa": "RETURNS TRUE IF 2FA IS ENABLED",\n        "iplock": "' .
                'RETURNS TRUE IF IP LOCK IS ENABLED"\n    }\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

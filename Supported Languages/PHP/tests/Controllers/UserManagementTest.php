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

class UserManagementTest extends \PHPUnit_Framework_TestCase
{
    /**
     * @var \SMASHLib\Controllers\UserManagement Controller instance
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
        self::$controller = $client->getUserManagement();
    }

    /**
     * Setup test
     */
    protected function setUp()
    {
        $this->httpResponse = new HttpCallBackCatcher();
    }

    /**
     * User information test case
     */
    public function testHttpsApiRestShApiUI()
    {
        // Parameters for the API call
        $user = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->getUserInfo($user);
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
            '{\n    "request": "REQUEST TYPE",\n    "uid": "Users UID",\n    "apiuid": "API SIDE USER ID",\n    "' .
                'verified": "RETURNS TRUE IF USER IS VERIFIED",\n    "id": "TRANSACTION ID",\n    "info": {\n        ' .
                '"realname": "USERS REAL NAME",\n        "displayname": "USERS USERNAME",\n        "avatar": "USER AV' .
                'ATAR URL",\n        "email": "USERS EMAIL",\n        "address": "USERS ADDRESS IN ONE LINE SEPERATED' .
                ' BY COMMAS",\n        "address1": "USERS ADDRESS LINE ONE",\n        "address2": "USERS ADDRESS LINE' .
                ' TWO",\n        "city": "USERS ADDRESS CITY",\n        "state": "USERS ADDRESS STATE",\n        "zip' .
                'code": "USERS ADDRESS ZIPCODE",\n        "phone": "USERS CELL PHONE NUMBER",\n        "lastlogin": "' .
                'USERS LAST LOGIN",\n        "ip": "USERS IP",\n        "2fa": "RETURNS TRUE IF 2FA IS ENABLED",\n   ' .
                '     "iplock": "RETURNS TRUE IF IP LOCK IS ENABLED"\n    }\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * User update test case
     */
    public function testHttpsApiRestShApiUU()
    {
        // Parameters for the API call
        $input = array();
        $input['user'] = null;
        $input['avatar'] = null;
        $input['customInput'] = null;

        // key-value map for optional query parameters
        $queryParams = [];

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->updateUser($input, $queryParams);
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
            '{\r\n  "request": "REQUEST TYPE",\r\n  "updated": "RETURNS TRUE, IF USERS PROFILE WAS SUCCESSFULLY U' .
                'PDATED",\r\n  "id": "TRANSACTION ID",\r\n  "info": {\r\n    "uid": "USERS ID",\r\n    "apiuid": "API' .
                ' SIDE USER ID",\r\n    "avatar": "INPUTTED AVATAR URL",\r\n    "custom-input": "CUSTOM INPUTTED PROF' .
                'ILE DATA"\r\n  }\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }

    /**
     * User deletion test case
     */
    public function testHttpsApiRestShApiUD()
    {
        // Parameters for the API call
        $user = null;

        // Set callback and perform API call
        $result = null;
        self::$controller->setHttpCallBack($this->httpResponse);
        try {
            $result = self::$controller->deleteUser($user);
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
            '{\r\n  "request": "REQUEST TYPE",\r\n  "deleted": "RETURNS TRUE, IF USERS ACCOUNT WAS SUCCESSFULLY D' .
                'ELETED",\r\n  "id": "TRANSACTION ID"\r\n}',
            $this->httpResponse->getResponse()->getRawBody(),
            "Response body does not match exactly"
        );
    }
}

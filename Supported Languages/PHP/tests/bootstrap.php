<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

/**
 * Load the composer's autoload file so that we don't have to require files
 * manually in our code. Also load helper classes for tests.
 */
require __DIR__.'/../vendor/autoload.php';
require __DIR__.'/HttpCallBackCatcher.php';
require __DIR__.'/TestHelper.php';


/**
 * Set Configuration parameters for test execution
 */
SMASHLib\Configuration::$environment = SMASHLib\Environments::PRODUCTION;

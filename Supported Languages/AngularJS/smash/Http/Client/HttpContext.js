/**
  * This file was automatically generated by SMASH v2.0 ( https://smashlabs.io )
  */

;(function (angular) {
'use strict';

/**
 * Creates a instance of HttpContext.
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('HttpContext', [HttpContextService]);

    function HttpContextService() {
        return function HttpContext() {
            this.request = null;
            this.response = null;
        };
    }

}(angular));

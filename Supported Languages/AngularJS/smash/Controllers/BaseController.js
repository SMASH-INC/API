/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
 
;(function (angular) {
'use strict';

angular.module('SMASH')
	.factory('BaseController', ['ObjectMapper', BaseController]);

	function BaseController(ObjectMapper) {
	    /**
	     * Get ObjectMapper instance
	     * @return {ObjectMapper} Shared instance
	     */
	    var getObjectMapper = function() {
	        return ObjectMapper;
	    };

		return {
			getObjectMapper: getObjectMapper
		};
	}

}(angular));

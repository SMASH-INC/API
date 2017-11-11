/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of LoggingSetupModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('LoggingSetupModelResponse', ['BaseModel', LoggingSetupModelResponseModel]);

    function LoggingSetupModelResponseModel(BaseModel) {
        var LoggingSetupModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
        };

        LoggingSetupModelResponse.prototype = new BaseModel();
        LoggingSetupModelResponse.prototype.constructor = LoggingSetupModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        LoggingSetupModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'success', realName: 'success' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        LoggingSetupModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingSetupModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        LoggingSetupModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        return LoggingSetupModelResponse;
    }

}(angular));

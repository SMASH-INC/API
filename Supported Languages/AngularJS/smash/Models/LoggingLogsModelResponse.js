/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of LoggingLogsModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('LoggingLogsModelResponse', ['BaseModel', LoggingLogsModelResponseModel]);

    function LoggingLogsModelResponseModel(BaseModel) {
        var LoggingLogsModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.log = this.getValue(obj.log);
        };

        LoggingLogsModelResponse.prototype = new BaseModel();
        LoggingLogsModelResponse.prototype.constructor = LoggingLogsModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        LoggingLogsModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'log', realName: 'log', type: 'LogModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        LoggingLogsModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {LogModel}
         */
        LoggingLogsModelResponse.prototype.getLog = function () {
            return this.log;
        };
    
        /**
         * Setter for Log
         * 
         * @param {LogModel} value 
         */
        LoggingLogsModelResponse.prototype.setLog = function (value) {
            this.log = value;
        };
    
        return LoggingLogsModelResponse;
    }

}(angular));

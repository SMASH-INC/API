/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of CodeProtectionModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('CodeProtectionModelResponse', ['BaseModel', CodeProtectionModelResponseModel]);

    function CodeProtectionModelResponseModel(BaseModel) {
        var CodeProtectionModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
            this.app = this.getValue(obj.app);
        };

        CodeProtectionModelResponse.prototype = new BaseModel();
        CodeProtectionModelResponse.prototype.constructor = CodeProtectionModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        CodeProtectionModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'success', realName: 'success' },
                { name: 'app', realName: 'app' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        CodeProtectionModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CodeProtectionModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        CodeProtectionModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CodeProtectionModelResponse.prototype.getApp = function () {
            return this.app;
        };
    
        /**
         * Setter for App
         * 
         * @param {string} value 
         */
        CodeProtectionModelResponse.prototype.setApp = function (value) {
            this.app = value;
        };
    
        return CodeProtectionModelResponse;
    }

}(angular));

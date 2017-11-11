/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of WAFConfigurationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('WAFConfigurationModelResponse', ['BaseModel', WAFConfigurationModelResponseModel]);

    function WAFConfigurationModelResponseModel(BaseModel) {
        var WAFConfigurationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
            this.rule = this.getValue(obj.rule);
        };

        WAFConfigurationModelResponse.prototype = new BaseModel();
        WAFConfigurationModelResponse.prototype.constructor = WAFConfigurationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        WAFConfigurationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'success', realName: 'success' },
                { name: 'rule', realName: 'rule' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        WAFConfigurationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        WAFConfigurationModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModelResponse.prototype.getRule = function () {
            return this.rule;
        };
    
        /**
         * Setter for Rule
         * 
         * @param {string} value 
         */
        WAFConfigurationModelResponse.prototype.setRule = function (value) {
            this.rule = value;
        };
    
        return WAFConfigurationModelResponse;
    }

}(angular));

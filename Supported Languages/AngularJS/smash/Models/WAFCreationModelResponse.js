/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of WAFCreationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('WAFCreationModelResponse', ['BaseModel', WAFCreationModelResponseModel]);

    function WAFCreationModelResponseModel(BaseModel) {
        var WAFCreationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
            this.cname = this.getValue(obj.cname);
        };

        WAFCreationModelResponse.prototype = new BaseModel();
        WAFCreationModelResponse.prototype.constructor = WAFCreationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        WAFCreationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'success', realName: 'success' },
                { name: 'cname', realName: 'cname' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        WAFCreationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFCreationModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        WAFCreationModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFCreationModelResponse.prototype.getCname = function () {
            return this.cname;
        };
    
        /**
         * Setter for Cname
         * 
         * @param {string} value 
         */
        WAFCreationModelResponse.prototype.setCname = function (value) {
            this.cname = value;
        };
    
        return WAFCreationModelResponse;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of CDNPullModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('CDNPullModelResponse', ['BaseModel', CDNPullModelResponseModel]);

    function CDNPullModelResponseModel(BaseModel) {
        var CDNPullModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
            this.cname = this.getValue(obj.cname);
        };

        CDNPullModelResponse.prototype = new BaseModel();
        CDNPullModelResponse.prototype.constructor = CDNPullModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        CDNPullModelResponse.prototype.mappingInfo = function() {
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
        CDNPullModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPullModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        CDNPullModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPullModelResponse.prototype.getCname = function () {
            return this.cname;
        };
    
        /**
         * Setter for Cname
         * 
         * @param {string} value 
         */
        CDNPullModelResponse.prototype.setCname = function (value) {
            this.cname = value;
        };
    
        return CDNPullModelResponse;
    }

}(angular));

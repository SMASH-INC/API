/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of CDNPushModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('CDNPushModelResponse', ['BaseModel', CDNPushModelResponseModel]);

    function CDNPushModelResponseModel(BaseModel) {
        var CDNPushModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
            this.upload = this.getValue(obj.upload);
            this.cname = this.getValue(obj.cname);
        };

        CDNPushModelResponse.prototype = new BaseModel();
        CDNPushModelResponse.prototype.constructor = CDNPushModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        CDNPushModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'success', realName: 'success' },
                { name: 'upload', realName: 'upload' },
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
        CDNPushModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        CDNPushModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModelResponse.prototype.getUpload = function () {
            return this.upload;
        };
    
        /**
         * Setter for Upload
         * 
         * @param {string} value 
         */
        CDNPushModelResponse.prototype.setUpload = function (value) {
            this.upload = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModelResponse.prototype.getCname = function () {
            return this.cname;
        };
    
        /**
         * Setter for Cname
         * 
         * @param {string} value 
         */
        CDNPushModelResponse.prototype.setCname = function (value) {
            this.cname = value;
        };
    
        return CDNPushModelResponse;
    }

}(angular));

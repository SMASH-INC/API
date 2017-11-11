/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of HostingModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('HostingModelResponse', ['BaseModel', HostingModelResponseModel]);

    function HostingModelResponseModel(BaseModel) {
        var HostingModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.url = this.getValue(obj.url);
            this.success = this.getValue(obj.success);
            this.id = this.getValue(obj.id);
        };

        HostingModelResponse.prototype = new BaseModel();
        HostingModelResponse.prototype.constructor = HostingModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        HostingModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'url', realName: 'url' },
                { name: 'success', realName: 'success' },
                { name: 'id', realName: 'id' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        HostingModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        HostingModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModelResponse.prototype.getUrl = function () {
            return this.url;
        };
    
        /**
         * Setter for Url
         * 
         * @param {string} value 
         */
        HostingModelResponse.prototype.setUrl = function (value) {
            this.url = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        HostingModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        HostingModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        return HostingModelResponse;
    }

}(angular));

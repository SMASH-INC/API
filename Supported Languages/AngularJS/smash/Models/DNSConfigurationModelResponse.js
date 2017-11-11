/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DNSConfigurationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DNSConfigurationModelResponse', ['BaseModel', DNSConfigurationModelResponseModel]);

    function DNSConfigurationModelResponseModel(BaseModel) {
        var DNSConfigurationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.success = this.getValue(obj.success);
            this.domain = this.getValue(obj.domain);
            this.records = this.getValue(obj.records);
        };

        DNSConfigurationModelResponse.prototype = new BaseModel();
        DNSConfigurationModelResponse.prototype.constructor = DNSConfigurationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DNSConfigurationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'success', realName: 'success' },
                { name: 'domain', realName: 'domain' },
                { name: 'records', realName: 'records' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DNSConfigurationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        DNSConfigurationModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModelResponse.prototype.getDomain = function () {
            return this.domain;
        };
    
        /**
         * Setter for Domain
         * 
         * @param {string} value 
         */
        DNSConfigurationModelResponse.prototype.setDomain = function (value) {
            this.domain = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModelResponse.prototype.getRecords = function () {
            return this.records;
        };
    
        /**
         * Setter for Records
         * 
         * @param {string} value 
         */
        DNSConfigurationModelResponse.prototype.setRecords = function (value) {
            this.records = value;
        };
    
        return DNSConfigurationModelResponse;
    }

}(angular));

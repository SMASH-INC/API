/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of EncryptionModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('EncryptionModelResponse', ['BaseModel', EncryptionModelResponseModel]);

    function EncryptionModelResponseModel(BaseModel) {
        var EncryptionModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.data = this.getValue(obj.data);
            this.file = this.getValue(obj.file);
            this.success = this.getValue(obj.success);
            this.mpublic = this.getValue(obj.mpublic);
            this.mprivate = this.getValue(obj.mprivate);
        };

        EncryptionModelResponse.prototype = new BaseModel();
        EncryptionModelResponse.prototype.constructor = EncryptionModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        EncryptionModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'data', realName: 'data' },
                { name: 'file', realName: 'file' },
                { name: 'success', realName: 'success' },
                { name: 'mpublic', realName: 'public' },
                { name: 'mprivate', realName: 'private' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        EncryptionModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModelResponse.prototype.getData = function () {
            return this.data;
        };
    
        /**
         * Setter for Data
         * 
         * @param {string} value 
         */
        EncryptionModelResponse.prototype.setData = function (value) {
            this.data = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModelResponse.prototype.getFile = function () {
            return this.file;
        };
    
        /**
         * Setter for File
         * 
         * @param {string} value 
         */
        EncryptionModelResponse.prototype.setFile = function (value) {
            this.file = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        EncryptionModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModelResponse.prototype.getPublic = function () {
            return this.mpublic;
        };
    
        /**
         * Setter for Public
         * 
         * @param {string} value 
         */
        EncryptionModelResponse.prototype.setPublic = function (value) {
            this.mpublic = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModelResponse.prototype.getPrivate = function () {
            return this.mprivate;
        };
    
        /**
         * Setter for Private
         * 
         * @param {string} value 
         */
        EncryptionModelResponse.prototype.setPrivate = function (value) {
            this.mprivate = value;
        };
    
        return EncryptionModelResponse;
    }

}(angular));

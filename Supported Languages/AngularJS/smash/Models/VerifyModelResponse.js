/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VerifyModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('VerifyModelResponse', ['BaseModel', VerifyModelResponseModel]);

    function VerifyModelResponseModel(BaseModel) {
        var VerifyModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.to = this.getValue(obj.to);
            this.verified = this.getValue(obj.verified);
            this.id = this.getValue(obj.id);
        };

        VerifyModelResponse.prototype = new BaseModel();
        VerifyModelResponse.prototype.constructor = VerifyModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VerifyModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'to', realName: 'to' },
                { name: 'verified', realName: 'verified' },
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
        VerifyModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        VerifyModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyModelResponse.prototype.getTo = function () {
            return this.to;
        };
    
        /**
         * Setter for To
         * 
         * @param {string} value 
         */
        VerifyModelResponse.prototype.setTo = function (value) {
            this.to = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyModelResponse.prototype.getVerified = function () {
            return this.verified;
        };
    
        /**
         * Setter for Verified
         * 
         * @param {string} value 
         */
        VerifyModelResponse.prototype.setVerified = function (value) {
            this.verified = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        VerifyModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        return VerifyModelResponse;
    }

}(angular));

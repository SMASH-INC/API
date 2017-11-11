/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserAuthenticationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserAuthenticationModelResponse', ['BaseModel', UserAuthenticationModelResponseModel]);

    function UserAuthenticationModelResponseModel(BaseModel) {
        var UserAuthenticationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.uid = this.getValue(obj.uid);
            this.valid = this.getValue(obj.valid);
            this.id = this.getValue(obj.id);
            this.info = this.getValue(obj.info);
        };

        UserAuthenticationModelResponse.prototype = new BaseModel();
        UserAuthenticationModelResponse.prototype.constructor = UserAuthenticationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserAuthenticationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'uid', realName: 'uid' },
                { name: 'valid', realName: 'valid' },
                { name: 'id', realName: 'id' },
                { name: 'info', realName: 'info', type: 'InfoModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserAuthenticationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserAuthenticationModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        UserAuthenticationModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserAuthenticationModelResponse.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        UserAuthenticationModelResponse.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserAuthenticationModelResponse.prototype.getValid = function () {
            return this.valid;
        };
    
        /**
         * Setter for Valid
         * 
         * @param {string} value 
         */
        UserAuthenticationModelResponse.prototype.setValid = function (value) {
            this.valid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserAuthenticationModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        UserAuthenticationModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {InfoModel}
         */
        UserAuthenticationModelResponse.prototype.getInfo = function () {
            return this.info;
        };
    
        /**
         * Setter for Info
         * 
         * @param {InfoModel} value 
         */
        UserAuthenticationModelResponse.prototype.setInfo = function (value) {
            this.info = value;
        };
    
        return UserAuthenticationModelResponse;
    }

}(angular));

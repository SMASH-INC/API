/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserUpdateModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserUpdateModelResponse', ['BaseModel', UserUpdateModelResponseModel]);

    function UserUpdateModelResponseModel(BaseModel) {
        var UserUpdateModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.updated = this.getValue(obj.updated);
            this.id = this.getValue(obj.id);
            this.info = this.getValue(obj.info);
        };

        UserUpdateModelResponse.prototype = new BaseModel();
        UserUpdateModelResponse.prototype.constructor = UserUpdateModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserUpdateModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'updated', realName: 'updated' },
                { name: 'id', realName: 'id' },
                { name: 'info', realName: 'info', type: 'UserCustomUpdateModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserUpdateModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        UserUpdateModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModelResponse.prototype.getUpdated = function () {
            return this.updated;
        };
    
        /**
         * Setter for Updated
         * 
         * @param {string} value 
         */
        UserUpdateModelResponse.prototype.setUpdated = function (value) {
            this.updated = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        UserUpdateModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {UserCustomUpdateModel}
         */
        UserUpdateModelResponse.prototype.getInfo = function () {
            return this.info;
        };
    
        /**
         * Setter for Info
         * 
         * @param {UserCustomUpdateModel} value 
         */
        UserUpdateModelResponse.prototype.setInfo = function (value) {
            this.info = value;
        };
    
        return UserUpdateModelResponse;
    }

}(angular));

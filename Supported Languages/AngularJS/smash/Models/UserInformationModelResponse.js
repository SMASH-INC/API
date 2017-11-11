/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserInformationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserInformationModelResponse', ['BaseModel', UserInformationModelResponseModel]);

    function UserInformationModelResponseModel(BaseModel) {
        var UserInformationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.user = this.getValue(obj.user);
            this.key = this.getValue(obj.key);
            this.api = this.getValue(obj.api);
            this.info = this.getValue(obj.info);
        };

        UserInformationModelResponse.prototype = new BaseModel();
        UserInformationModelResponse.prototype.constructor = UserInformationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserInformationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'user', realName: 'user' },
                { name: 'key', realName: 'key' },
                { name: 'api', realName: 'api' },
                { name: 'info', realName: 'info', type: 'UserInformationSecondaryModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserInformationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModelResponse.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        UserInformationModelResponse.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * Users API Private Key
         *
         * @return {string}
         */
        UserInformationModelResponse.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        UserInformationModelResponse.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * Users API Public Key
         *
         * @return {string}
         */
        UserInformationModelResponse.prototype.getApi = function () {
            return this.api;
        };
    
        /**
         * Setter for Api
         * 
         * @param {string} value 
         */
        UserInformationModelResponse.prototype.setApi = function (value) {
            this.api = value;
        };
    
        /**
         * Users Profile Information
         *
         * @return {UserInformationSecondaryModel}
         */
        UserInformationModelResponse.prototype.getInfo = function () {
            return this.info;
        };
    
        /**
         * Setter for Info
         * 
         * @param {UserInformationSecondaryModel} value 
         */
        UserInformationModelResponse.prototype.setInfo = function (value) {
            this.info = value;
        };
    
        return UserInformationModelResponse;
    }

}(angular));

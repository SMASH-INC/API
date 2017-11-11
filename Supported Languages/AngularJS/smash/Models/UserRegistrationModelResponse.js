/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserRegistrationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserRegistrationModelResponse', ['BaseModel', UserRegistrationModelResponseModel]);

    function UserRegistrationModelResponseModel(BaseModel) {
        var UserRegistrationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.active = this.getValue(obj.active);
            this.id = this.getValue(obj.id);
            this.info = this.getValue(obj.info);
        };

        UserRegistrationModelResponse.prototype = new BaseModel();
        UserRegistrationModelResponse.prototype.constructor = UserRegistrationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserRegistrationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'active', realName: 'active' },
                { name: 'id', realName: 'id' },
                { name: 'info', realName: 'info', type: 'UserProfileInformationModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserRegistrationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        UserRegistrationModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModelResponse.prototype.getActive = function () {
            return this.active;
        };
    
        /**
         * Setter for Active
         * 
         * @param {string} value 
         */
        UserRegistrationModelResponse.prototype.setActive = function (value) {
            this.active = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        UserRegistrationModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {UserProfileInformationModel}
         */
        UserRegistrationModelResponse.prototype.getInfo = function () {
            return this.info;
        };
    
        /**
         * Setter for Info
         * 
         * @param {UserProfileInformationModel} value 
         */
        UserRegistrationModelResponse.prototype.setInfo = function (value) {
            this.info = value;
        };
    
        return UserRegistrationModelResponse;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of TwoFactorAuthenticationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('TwoFactorAuthenticationModelResponse', ['BaseModel', TwoFactorAuthenticationModelResponseModel]);

    function TwoFactorAuthenticationModelResponseModel(BaseModel) {
        var TwoFactorAuthenticationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.to = this.getValue(obj.to);
        };

        TwoFactorAuthenticationModelResponse.prototype = new BaseModel();
        TwoFactorAuthenticationModelResponse.prototype.constructor = TwoFactorAuthenticationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        TwoFactorAuthenticationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'to', realName: 'to' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        TwoFactorAuthenticationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModelResponse.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModelResponse.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModelResponse.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModelResponse.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModelResponse.prototype.getTo = function () {
            return this.to;
        };
    
        /**
         * Setter for To
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModelResponse.prototype.setTo = function (value) {
            this.to = value;
        };
    
        return TwoFactorAuthenticationModelResponse;
    }

}(angular));

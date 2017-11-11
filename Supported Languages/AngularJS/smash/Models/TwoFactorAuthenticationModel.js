/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of TwoFactorAuthenticationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('TwoFactorAuthenticationModel', ['BaseModel', TwoFactorAuthenticationModelModel]);

    function TwoFactorAuthenticationModelModel(BaseModel) {
        var TwoFactorAuthenticationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.to = this.getValue(obj.to);
            this.verified = this.getValue(obj.verified);
            this.id = this.getValue(obj.id);
        };

        TwoFactorAuthenticationModel.prototype = new BaseModel();
        TwoFactorAuthenticationModel.prototype.constructor = TwoFactorAuthenticationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        TwoFactorAuthenticationModel.prototype.mappingInfo = function() {
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
        TwoFactorAuthenticationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModel.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModel.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModel.prototype.getTo = function () {
            return this.to;
        };
    
        /**
         * Setter for To
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModel.prototype.setTo = function (value) {
            this.to = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModel.prototype.getVerified = function () {
            return this.verified;
        };
    
        /**
         * Setter for Verified
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModel.prototype.setVerified = function (value) {
            this.verified = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationModel.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationModel.prototype.setId = function (value) {
            this.id = value;
        };
    
        return TwoFactorAuthenticationModel;
    }

}(angular));

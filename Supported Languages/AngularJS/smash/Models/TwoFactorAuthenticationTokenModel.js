/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of TwoFactorAuthenticationTokenModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('TwoFactorAuthenticationTokenModel', ['BaseModel', TwoFactorAuthenticationTokenModelModel]);

    function TwoFactorAuthenticationTokenModelModel(BaseModel) {
        var TwoFactorAuthenticationTokenModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.user = this.getValue(obj.user);
            this.code = this.getValue(obj.code);
        };

        TwoFactorAuthenticationTokenModel.prototype = new BaseModel();
        TwoFactorAuthenticationTokenModel.prototype.constructor = TwoFactorAuthenticationTokenModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        TwoFactorAuthenticationTokenModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'user', realName: 'user' },
                { name: 'code', realName: 'code' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        TwoFactorAuthenticationTokenModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationTokenModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationTokenModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationTokenModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationTokenModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationTokenModel.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationTokenModel.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        TwoFactorAuthenticationTokenModel.prototype.getCode = function () {
            return this.code;
        };
    
        /**
         * Setter for Code
         * 
         * @param {string} value 
         */
        TwoFactorAuthenticationTokenModel.prototype.setCode = function (value) {
            this.code = value;
        };
    
        return TwoFactorAuthenticationTokenModel;
    }

}(angular));

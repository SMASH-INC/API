/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of CodeProtectionModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('CodeProtectionModel', ['BaseModel', CodeProtectionModelModel]);

    function CodeProtectionModelModel(BaseModel) {
        var CodeProtectionModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.app = this.getValue(obj.app);
        };

        CodeProtectionModel.prototype = new BaseModel();
        CodeProtectionModel.prototype.constructor = CodeProtectionModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        CodeProtectionModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'app', realName: 'app' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        CodeProtectionModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CodeProtectionModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        CodeProtectionModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CodeProtectionModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        CodeProtectionModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CodeProtectionModel.prototype.getApp = function () {
            return this.app;
        };
    
        /**
         * Setter for App
         * 
         * @param {string} value 
         */
        CodeProtectionModel.prototype.setApp = function (value) {
            this.app = value;
        };
    
        return CodeProtectionModel;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of EncryptionModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('EncryptionModel', ['BaseModel', EncryptionModelModel]);

    function EncryptionModelModel(BaseModel) {
        var EncryptionModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.data = this.getValue(obj.data);
            this.file = this.getValue(obj.file);
            this.method = this.getValue(obj.method);
            this.bit = this.getValue(obj.bit);
        };

        EncryptionModel.prototype = new BaseModel();
        EncryptionModel.prototype.constructor = EncryptionModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        EncryptionModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'data', realName: 'data' },
                { name: 'file', realName: 'file' },
                { name: 'method', realName: 'method' },
                { name: 'bit', realName: 'bit' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        EncryptionModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        EncryptionModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        EncryptionModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModel.prototype.getData = function () {
            return this.data;
        };
    
        /**
         * Setter for Data
         * 
         * @param {string} value 
         */
        EncryptionModel.prototype.setData = function (value) {
            this.data = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModel.prototype.getFile = function () {
            return this.file;
        };
    
        /**
         * Setter for File
         * 
         * @param {string} value 
         */
        EncryptionModel.prototype.setFile = function (value) {
            this.file = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModel.prototype.getMethod = function () {
            return this.method;
        };
    
        /**
         * Setter for Method
         * 
         * @param {string} value 
         */
        EncryptionModel.prototype.setMethod = function (value) {
            this.method = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        EncryptionModel.prototype.getBit = function () {
            return this.bit;
        };
    
        /**
         * Setter for Bit
         * 
         * @param {string} value 
         */
        EncryptionModel.prototype.setBit = function (value) {
            this.bit = value;
        };
    
        return EncryptionModel;
    }

}(angular));

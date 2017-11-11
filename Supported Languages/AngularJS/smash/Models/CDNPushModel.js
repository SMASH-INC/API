/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of CDNPushModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('CDNPushModel', ['BaseModel', CDNPushModelModel]);

    function CDNPushModelModel(BaseModel) {
        var CDNPushModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.cname = this.getValue(obj.cname);
            this.file = this.getValue(obj.file);
        };

        CDNPushModel.prototype = new BaseModel();
        CDNPushModel.prototype.constructor = CDNPushModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        CDNPushModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'cname', realName: 'cname' },
                { name: 'file', realName: 'file' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        CDNPushModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        CDNPushModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        CDNPushModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModel.prototype.getCname = function () {
            return this.cname;
        };
    
        /**
         * Setter for Cname
         * 
         * @param {string} value 
         */
        CDNPushModel.prototype.setCname = function (value) {
            this.cname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        CDNPushModel.prototype.getFile = function () {
            return this.file;
        };
    
        /**
         * Setter for File
         * 
         * @param {string} value 
         */
        CDNPushModel.prototype.setFile = function (value) {
            this.file = value;
        };
    
        return CDNPushModel;
    }

}(angular));

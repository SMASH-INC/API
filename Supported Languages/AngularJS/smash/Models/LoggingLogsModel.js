/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of LoggingLogsModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('LoggingLogsModel', ['BaseModel', LoggingLogsModelModel]);

    function LoggingLogsModelModel(BaseModel) {
        var LoggingLogsModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.name = this.getValue(obj.name);
            this.origin = this.getValue(obj.origin);
            this.time = this.getValue(obj.time);
        };

        LoggingLogsModel.prototype = new BaseModel();
        LoggingLogsModel.prototype.constructor = LoggingLogsModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        LoggingLogsModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'name', realName: 'name' },
                { name: 'origin', realName: 'origin' },
                { name: 'time', realName: 'time' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        LoggingLogsModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingLogsModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        LoggingLogsModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingLogsModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        LoggingLogsModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingLogsModel.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        LoggingLogsModel.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingLogsModel.prototype.getOrigin = function () {
            return this.origin;
        };
    
        /**
         * Setter for Origin
         * 
         * @param {string} value 
         */
        LoggingLogsModel.prototype.setOrigin = function (value) {
            this.origin = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingLogsModel.prototype.getTime = function () {
            return this.time;
        };
    
        /**
         * Setter for Time
         * 
         * @param {string} value 
         */
        LoggingLogsModel.prototype.setTime = function (value) {
            this.time = value;
        };
    
        return LoggingLogsModel;
    }

}(angular));

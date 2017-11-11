/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of LoggingSetupModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('LoggingSetupModel', ['BaseModel', LoggingSetupModelModel]);

    function LoggingSetupModelModel(BaseModel) {
        var LoggingSetupModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.name = this.getValue(obj.name);
            this.origin = this.getValue(obj.origin);
            this.activate = this.getValue(obj.activate);
        };

        LoggingSetupModel.prototype = new BaseModel();
        LoggingSetupModel.prototype.constructor = LoggingSetupModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        LoggingSetupModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'name', realName: 'name' },
                { name: 'origin', realName: 'origin' },
                { name: 'activate', realName: 'activate' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        LoggingSetupModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingSetupModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        LoggingSetupModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingSetupModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        LoggingSetupModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingSetupModel.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        LoggingSetupModel.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingSetupModel.prototype.getOrigin = function () {
            return this.origin;
        };
    
        /**
         * Setter for Origin
         * 
         * @param {string} value 
         */
        LoggingSetupModel.prototype.setOrigin = function (value) {
            this.origin = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        LoggingSetupModel.prototype.getActivate = function () {
            return this.activate;
        };
    
        /**
         * Setter for Activate
         * 
         * @param {string} value 
         */
        LoggingSetupModel.prototype.setActivate = function (value) {
            this.activate = value;
        };
    
        return LoggingSetupModel;
    }

}(angular));

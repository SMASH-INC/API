/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of WAFConfigurationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('WAFConfigurationModel', ['BaseModel', WAFConfigurationModelModel]);

    function WAFConfigurationModelModel(BaseModel) {
        var WAFConfigurationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.name = this.getValue(obj.name);
            this.origin = this.getValue(obj.origin);
            this.cname = this.getValue(obj.cname);
        };

        WAFConfigurationModel.prototype = new BaseModel();
        WAFConfigurationModel.prototype.constructor = WAFConfigurationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        WAFConfigurationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'name', realName: 'name' },
                { name: 'origin', realName: 'origin' },
                { name: 'cname', realName: 'cname' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        WAFConfigurationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        WAFConfigurationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        WAFConfigurationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModel.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        WAFConfigurationModel.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModel.prototype.getOrigin = function () {
            return this.origin;
        };
    
        /**
         * Setter for Origin
         * 
         * @param {string} value 
         */
        WAFConfigurationModel.prototype.setOrigin = function (value) {
            this.origin = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFConfigurationModel.prototype.getCname = function () {
            return this.cname;
        };
    
        /**
         * Setter for Cname
         * 
         * @param {string} value 
         */
        WAFConfigurationModel.prototype.setCname = function (value) {
            this.cname = value;
        };
    
        return WAFConfigurationModel;
    }

}(angular));

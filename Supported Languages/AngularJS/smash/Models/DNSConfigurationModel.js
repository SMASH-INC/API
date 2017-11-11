/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DNSConfigurationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DNSConfigurationModel', ['BaseModel', DNSConfigurationModelModel]);

    function DNSConfigurationModelModel(BaseModel) {
        var DNSConfigurationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.domain = this.getValue(obj.domain);
            this.records = this.getValue(obj.records);
        };

        DNSConfigurationModel.prototype = new BaseModel();
        DNSConfigurationModel.prototype.constructor = DNSConfigurationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DNSConfigurationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'domain', realName: 'domain' },
                { name: 'records', realName: 'records' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DNSConfigurationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        DNSConfigurationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        DNSConfigurationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModel.prototype.getDomain = function () {
            return this.domain;
        };
    
        /**
         * Setter for Domain
         * 
         * @param {string} value 
         */
        DNSConfigurationModel.prototype.setDomain = function (value) {
            this.domain = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSConfigurationModel.prototype.getRecords = function () {
            return this.records;
        };
    
        /**
         * Setter for Records
         * 
         * @param {string} value 
         */
        DNSConfigurationModel.prototype.setRecords = function (value) {
            this.records = value;
        };
    
        return DNSConfigurationModel;
    }

}(angular));

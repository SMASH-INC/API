/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DNSCreationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DNSCreationModel', ['BaseModel', DNSCreationModelModel]);

    function DNSCreationModelModel(BaseModel) {
        var DNSCreationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.domain = this.getValue(obj.domain);
        };

        DNSCreationModel.prototype = new BaseModel();
        DNSCreationModel.prototype.constructor = DNSCreationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DNSCreationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'domain', realName: 'domain' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DNSCreationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSCreationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        DNSCreationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSCreationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        DNSCreationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSCreationModel.prototype.getDomain = function () {
            return this.domain;
        };
    
        /**
         * Setter for Domain
         * 
         * @param {string} value 
         */
        DNSCreationModel.prototype.setDomain = function (value) {
            this.domain = value;
        };
    
        return DNSCreationModel;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of HostingModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('HostingModel', ['BaseModel', HostingModelModel]);

    function HostingModelModel(BaseModel) {
        var HostingModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.app = this.getValue(obj.app);
            this.domain = this.getValue(obj.domain);
        };

        HostingModel.prototype = new BaseModel();
        HostingModel.prototype.constructor = HostingModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        HostingModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'app', realName: 'app' },
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
        HostingModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        HostingModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        HostingModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModel.prototype.getApp = function () {
            return this.app;
        };
    
        /**
         * Setter for App
         * 
         * @param {string} value 
         */
        HostingModel.prototype.setApp = function (value) {
            this.app = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        HostingModel.prototype.getDomain = function () {
            return this.domain;
        };
    
        /**
         * Setter for Domain
         * 
         * @param {string} value 
         */
        HostingModel.prototype.setDomain = function (value) {
            this.domain = value;
        };
    
        return HostingModel;
    }

}(angular));

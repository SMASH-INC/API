/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DataManipulationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DataManipulationModel', ['BaseModel', DataManipulationModelModel]);

    function DataManipulationModelModel(BaseModel) {
        var DataManipulationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.user = this.getValue(obj.user);
            this.apiuid = this.getValue(obj.apiuid);
            this.url = this.getValue(obj.url);
            this.manipulation = this.getValue(obj.manipulation);
            this.conversion = this.getValue(obj.conversion);
            this.sorting = this.getValue(obj.sorting);
            this.compression = this.getValue(obj.compression);
        };

        DataManipulationModel.prototype = new BaseModel();
        DataManipulationModel.prototype.constructor = DataManipulationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DataManipulationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'user', realName: 'user' },
                { name: 'apiuid', realName: 'apiuid' },
                { name: 'url', realName: 'url' },
                { name: 'manipulation', realName: 'manipulation' },
                { name: 'conversion', realName: 'conversion' },
                { name: 'sorting', realName: 'sorting' },
                { name: 'compression', realName: 'compression' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DataManipulationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getApiuid = function () {
            return this.apiuid;
        };
    
        /**
         * Setter for Apiuid
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setApiuid = function (value) {
            this.apiuid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getUrl = function () {
            return this.url;
        };
    
        /**
         * Setter for Url
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setUrl = function (value) {
            this.url = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getManipulation = function () {
            return this.manipulation;
        };
    
        /**
         * Setter for Manipulation
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setManipulation = function (value) {
            this.manipulation = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getConversion = function () {
            return this.conversion;
        };
    
        /**
         * Setter for Conversion
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setConversion = function (value) {
            this.conversion = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getSorting = function () {
            return this.sorting;
        };
    
        /**
         * Setter for Sorting
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setSorting = function (value) {
            this.sorting = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModel.prototype.getCompression = function () {
            return this.compression;
        };
    
        /**
         * Setter for Compression
         * 
         * @param {string} value 
         */
        DataManipulationModel.prototype.setCompression = function (value) {
            this.compression = value;
        };
    
        return DataManipulationModel;
    }

}(angular));

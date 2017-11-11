/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DataManipulationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DataManipulationModelResponse', ['BaseModel', DataManipulationModelResponseModel]);

    function DataManipulationModelResponseModel(BaseModel) {
        var DataManipulationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.url = this.getValue(obj.url);
            this.success = this.getValue(obj.success);
            this.id = this.getValue(obj.id);
        };

        DataManipulationModelResponse.prototype = new BaseModel();
        DataManipulationModelResponse.prototype.constructor = DataManipulationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DataManipulationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'url', realName: 'url' },
                { name: 'success', realName: 'success' },
                { name: 'id', realName: 'id' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DataManipulationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        DataManipulationModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModelResponse.prototype.getUrl = function () {
            return this.url;
        };
    
        /**
         * Setter for Url
         * 
         * @param {string} value 
         */
        DataManipulationModelResponse.prototype.setUrl = function (value) {
            this.url = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        DataManipulationModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataManipulationModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        DataManipulationModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        return DataManipulationModelResponse;
    }

}(angular));

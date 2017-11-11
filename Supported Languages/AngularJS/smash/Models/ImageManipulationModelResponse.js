/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of ImageManipulationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('ImageManipulationModelResponse', ['BaseModel', ImageManipulationModelResponseModel]);

    function ImageManipulationModelResponseModel(BaseModel) {
        var ImageManipulationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.url = this.getValue(obj.url);
            this.success = this.getValue(obj.success);
            this.moderated = this.getValue(obj.moderated);
            this.id = this.getValue(obj.id);
        };

        ImageManipulationModelResponse.prototype = new BaseModel();
        ImageManipulationModelResponse.prototype.constructor = ImageManipulationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        ImageManipulationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'url', realName: 'url' },
                { name: 'success', realName: 'success' },
                { name: 'moderated', realName: 'moderated' },
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
        ImageManipulationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        ImageManipulationModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModelResponse.prototype.getUrl = function () {
            return this.url;
        };
    
        /**
         * Setter for Url
         * 
         * @param {string} value 
         */
        ImageManipulationModelResponse.prototype.setUrl = function (value) {
            this.url = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModelResponse.prototype.getSuccess = function () {
            return this.success;
        };
    
        /**
         * Setter for Success
         * 
         * @param {string} value 
         */
        ImageManipulationModelResponse.prototype.setSuccess = function (value) {
            this.success = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModelResponse.prototype.getModerated = function () {
            return this.moderated;
        };
    
        /**
         * Setter for Moderated
         * 
         * @param {string} value 
         */
        ImageManipulationModelResponse.prototype.setModerated = function (value) {
            this.moderated = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        ImageManipulationModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        return ImageManipulationModelResponse;
    }

}(angular));

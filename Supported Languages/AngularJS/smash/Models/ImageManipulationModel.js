/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of ImageManipulationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('ImageManipulationModel', ['BaseModel', ImageManipulationModelModel]);

    function ImageManipulationModelModel(BaseModel) {
        var ImageManipulationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.image = this.getValue(obj.image);
            this.transform = this.getValue(obj.transform);
            this.moderate = this.getValue(obj.moderate);
        };

        ImageManipulationModel.prototype = new BaseModel();
        ImageManipulationModel.prototype.constructor = ImageManipulationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        ImageManipulationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'image', realName: 'image' },
                { name: 'transform', realName: 'transform' },
                { name: 'moderate', realName: 'moderate' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        ImageManipulationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        ImageManipulationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        ImageManipulationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModel.prototype.getImage = function () {
            return this.image;
        };
    
        /**
         * Setter for Image
         * 
         * @param {string} value 
         */
        ImageManipulationModel.prototype.setImage = function (value) {
            this.image = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModel.prototype.getTransform = function () {
            return this.transform;
        };
    
        /**
         * Setter for Transform
         * 
         * @param {string} value 
         */
        ImageManipulationModel.prototype.setTransform = function (value) {
            this.transform = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        ImageManipulationModel.prototype.getModerate = function () {
            return this.moderate;
        };
    
        /**
         * Setter for Moderate
         * 
         * @param {string} value 
         */
        ImageManipulationModel.prototype.setModerate = function (value) {
            this.moderate = value;
        };
    
        return ImageManipulationModel;
    }

}(angular));

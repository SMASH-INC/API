/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DataModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DataModel', ['BaseModel', DataModelModel]);

    function DataModelModel(BaseModel) {
        var DataModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.result = this.getValue(obj.result);
            this.content = this.getValue(obj.content);
            this.id = this.getValue(obj.id);
        };

        DataModel.prototype = new BaseModel();
        DataModel.prototype.constructor = DataModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DataModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'result', realName: 'result' },
                { name: 'content', realName: 'content' },
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
        DataModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataModel.prototype.getResult = function () {
            return this.result;
        };
    
        /**
         * Setter for Result
         * 
         * @param {string} value 
         */
        DataModel.prototype.setResult = function (value) {
            this.result = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataModel.prototype.getContent = function () {
            return this.content;
        };
    
        /**
         * Setter for Content
         * 
         * @param {string} value 
         */
        DataModel.prototype.setContent = function (value) {
            this.content = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DataModel.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        DataModel.prototype.setId = function (value) {
            this.id = value;
        };
    
        return DataModel;
    }

}(angular));

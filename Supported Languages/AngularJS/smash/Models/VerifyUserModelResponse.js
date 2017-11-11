/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VerifyUserModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('VerifyUserModelResponse', ['BaseModel', VerifyUserModelResponseModel]);

    function VerifyUserModelResponseModel(BaseModel) {
        var VerifyUserModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.correct = this.getValue(obj.correct);
            this.id = this.getValue(obj.id);
        };

        VerifyUserModelResponse.prototype = new BaseModel();
        VerifyUserModelResponse.prototype.constructor = VerifyUserModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VerifyUserModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'correct', realName: 'correct' },
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
        VerifyUserModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyUserModelResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        VerifyUserModelResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyUserModelResponse.prototype.getCorrect = function () {
            return this.correct;
        };
    
        /**
         * Setter for Correct
         * 
         * @param {string} value 
         */
        VerifyUserModelResponse.prototype.setCorrect = function (value) {
            this.correct = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyUserModelResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        VerifyUserModelResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        return VerifyUserModelResponse;
    }

}(angular));

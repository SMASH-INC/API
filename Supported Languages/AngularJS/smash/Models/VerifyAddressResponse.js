/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VerifyAddressResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('VerifyAddressResponse', ['BaseModel', VerifyAddressResponseModel]);

    function VerifyAddressResponseModel(BaseModel) {
        var VerifyAddressResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.active = this.getValue(obj.active);
            this.id = this.getValue(obj.id);
        };

        VerifyAddressResponse.prototype = new BaseModel();
        VerifyAddressResponse.prototype.constructor = VerifyAddressResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VerifyAddressResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'active', realName: 'active' },
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
        VerifyAddressResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddressResponse.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        VerifyAddressResponse.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddressResponse.prototype.getActive = function () {
            return this.active;
        };
    
        /**
         * Setter for Active
         * 
         * @param {string} value 
         */
        VerifyAddressResponse.prototype.setActive = function (value) {
            this.active = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddressResponse.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        VerifyAddressResponse.prototype.setId = function (value) {
            this.id = value;
        };
    
        return VerifyAddressResponse;
    }

}(angular));

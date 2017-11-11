/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of DNSCreationModelResponse
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('DNSCreationModelResponse', ['BaseModel', DNSCreationModelResponseModel]);

    function DNSCreationModelResponseModel(BaseModel) {
        var DNSCreationModelResponse = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.domain = this.getValue(obj.domain);
            this.nameservers = this.getValue(obj.nameservers);
        };

        DNSCreationModelResponse.prototype = new BaseModel();
        DNSCreationModelResponse.prototype.constructor = DNSCreationModelResponse;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        DNSCreationModelResponse.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'domain', realName: 'domain' },
                { name: 'nameservers', realName: 'nameservers', type: 'NameserversModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        DNSCreationModelResponse.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        DNSCreationModelResponse.prototype.getDomain = function () {
            return this.domain;
        };
    
        /**
         * Setter for Domain
         * 
         * @param {string} value 
         */
        DNSCreationModelResponse.prototype.setDomain = function (value) {
            this.domain = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {NameserversModel}
         */
        DNSCreationModelResponse.prototype.getNameservers = function () {
            return this.nameservers;
        };
    
        /**
         * Setter for Nameservers
         * 
         * @param {NameserversModel} value 
         */
        DNSCreationModelResponse.prototype.setNameservers = function (value) {
            this.nameservers = value;
        };
    
        return DNSCreationModelResponse;
    }

}(angular));

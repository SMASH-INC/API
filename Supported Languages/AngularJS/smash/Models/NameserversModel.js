/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of NameserversModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('NameserversModel', ['BaseModel', NameserversModelModel]);

    function NameserversModelModel(BaseModel) {
        var NameserversModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.ns1 = this.getValue(obj.ns1);
            this.ns2 = this.getValue(obj.ns2);
            this.ns3 = this.getValue(obj.ns3);
            this.ns4 = this.getValue(obj.ns4);
        };

        NameserversModel.prototype = new BaseModel();
        NameserversModel.prototype.constructor = NameserversModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        NameserversModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'ns1', realName: 'ns1' },
                { name: 'ns2', realName: 'ns2' },
                { name: 'ns3', realName: 'ns3' },
                { name: 'ns4', realName: 'ns4' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        NameserversModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        NameserversModel.prototype.getNs1 = function () {
            return this.ns1;
        };
    
        /**
         * Setter for Ns1
         * 
         * @param {string} value 
         */
        NameserversModel.prototype.setNs1 = function (value) {
            this.ns1 = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        NameserversModel.prototype.getNs2 = function () {
            return this.ns2;
        };
    
        /**
         * Setter for Ns2
         * 
         * @param {string} value 
         */
        NameserversModel.prototype.setNs2 = function (value) {
            this.ns2 = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        NameserversModel.prototype.getNs3 = function () {
            return this.ns3;
        };
    
        /**
         * Setter for Ns3
         * 
         * @param {string} value 
         */
        NameserversModel.prototype.setNs3 = function (value) {
            this.ns3 = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        NameserversModel.prototype.getNs4 = function () {
            return this.ns4;
        };
    
        /**
         * Setter for Ns4
         * 
         * @param {string} value 
         */
        NameserversModel.prototype.setNs4 = function (value) {
            this.ns4 = value;
        };
    
        return NameserversModel;
    }

}(angular));

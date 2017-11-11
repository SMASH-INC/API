/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of VerifyAddress
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('VerifyAddress', ['BaseModel', VerifyAddressModel]);

    function VerifyAddressModel(BaseModel) {
        var VerifyAddress = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.user = this.getValue(obj.user);
            this.address = this.getValue(obj.address);
            this.a = this.getValue(obj.a);
            this.sa = this.getValue(obj.sa);
            this.c = this.getValue(obj.c);
            this.s = this.getValue(obj.s);
            this.z = this.getValue(obj.z);
        };

        VerifyAddress.prototype = new BaseModel();
        VerifyAddress.prototype.constructor = VerifyAddress;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        VerifyAddress.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'user', realName: 'user' },
                { name: 'address', realName: 'address' },
                { name: 'a', realName: 'a' },
                { name: 'sa', realName: 'sa' },
                { name: 'c', realName: 'c' },
                { name: 's', realName: 's' },
                { name: 'z', realName: 'z' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        VerifyAddress.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getA = function () {
            return this.a;
        };
    
        /**
         * Setter for A
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setA = function (value) {
            this.a = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getSa = function () {
            return this.sa;
        };
    
        /**
         * Setter for Sa
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setSa = function (value) {
            this.sa = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getC = function () {
            return this.c;
        };
    
        /**
         * Setter for C
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setC = function (value) {
            this.c = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getS = function () {
            return this.s;
        };
    
        /**
         * Setter for S
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setS = function (value) {
            this.s = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        VerifyAddress.prototype.getZ = function () {
            return this.z;
        };
    
        /**
         * Setter for Z
         * 
         * @param {string} value 
         */
        VerifyAddress.prototype.setZ = function (value) {
            this.z = value;
        };
    
        return VerifyAddress;
    }

}(angular));

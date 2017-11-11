/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserRegistrationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserRegistrationModel', ['BaseModel', UserRegistrationModelModel]);

    function UserRegistrationModelModel(BaseModel) {
        var UserRegistrationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.user = this.getValue(obj.user);
            this.password = this.getValue(obj.password);
            this.name = this.getValue(obj.name);
            this.email = this.getValue(obj.email);
            this.phone = this.getValue(obj.phone);
            this.countrycode = this.getValue(obj.countrycode);
            this.address = this.getValue(obj.address);
            this.a = this.getValue(obj.a);
            this.sa = this.getValue(obj.sa);
            this.c = this.getValue(obj.c);
            this.s = this.getValue(obj.s);
            this.z = this.getValue(obj.z);
        };

        UserRegistrationModel.prototype = new BaseModel();
        UserRegistrationModel.prototype.constructor = UserRegistrationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserRegistrationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'user', realName: 'user' },
                { name: 'password', realName: 'password' },
                { name: 'name', realName: 'name' },
                { name: 'email', realName: 'email' },
                { name: 'phone', realName: 'phone' },
                { name: 'countrycode', realName: 'countrycode' },
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
        UserRegistrationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getPassword = function () {
            return this.password;
        };
    
        /**
         * Setter for Password
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setPassword = function (value) {
            this.password = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getEmail = function () {
            return this.email;
        };
    
        /**
         * Setter for Email
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setEmail = function (value) {
            this.email = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getPhone = function () {
            return this.phone;
        };
    
        /**
         * Setter for Phone
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setPhone = function (value) {
            this.phone = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getCountrycode = function () {
            return this.countrycode;
        };
    
        /**
         * Setter for Countrycode
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setCountrycode = function (value) {
            this.countrycode = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getA = function () {
            return this.a;
        };
    
        /**
         * Setter for A
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setA = function (value) {
            this.a = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getSa = function () {
            return this.sa;
        };
    
        /**
         * Setter for Sa
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setSa = function (value) {
            this.sa = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getC = function () {
            return this.c;
        };
    
        /**
         * Setter for C
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setC = function (value) {
            this.c = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getS = function () {
            return this.s;
        };
    
        /**
         * Setter for S
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setS = function (value) {
            this.s = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserRegistrationModel.prototype.getZ = function () {
            return this.z;
        };
    
        /**
         * Setter for Z
         * 
         * @param {string} value 
         */
        UserRegistrationModel.prototype.setZ = function (value) {
            this.z = value;
        };
    
        return UserRegistrationModel;
    }

}(angular));

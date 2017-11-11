/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserUpdateModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserUpdateModel', ['BaseModel', UserUpdateModelModel]);

    function UserUpdateModelModel(BaseModel) {
        var UserUpdateModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.user = this.getValue(obj.user);
            this.apiuid = this.getValue(obj.apiuid);
            this.oldpassword = this.getValue(obj.oldpassword);
            this.newpassword = this.getValue(obj.newpassword);
            this.name = this.getValue(obj.name);
            this.email = this.getValue(obj.email);
            this.phone = this.getValue(obj.phone);
            this.avatar = this.getValue(obj.avatar);
            this.countrycode = this.getValue(obj.countrycode);
            this.address = this.getValue(obj.address);
            this.a = this.getValue(obj.a);
            this.sa = this.getValue(obj.sa);
            this.c = this.getValue(obj.c);
            this.s = this.getValue(obj.s);
            this.z = this.getValue(obj.z);
            this.customInput = this.getValue(obj.customInput);
        };

        UserUpdateModel.prototype = new BaseModel();
        UserUpdateModel.prototype.constructor = UserUpdateModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserUpdateModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'user', realName: 'user' },
                { name: 'apiuid', realName: 'apiuid' },
                { name: 'oldpassword', realName: 'oldpassword' },
                { name: 'newpassword', realName: 'newpassword' },
                { name: 'name', realName: 'name' },
                { name: 'email', realName: 'email' },
                { name: 'phone', realName: 'phone' },
                { name: 'avatar', realName: 'avatar' },
                { name: 'countrycode', realName: 'countrycode' },
                { name: 'address', realName: 'address' },
                { name: 'a', realName: 'a' },
                { name: 'sa', realName: 'sa' },
                { name: 'c', realName: 'c' },
                { name: 's', realName: 's' },
                { name: 'z', realName: 'z' },
                { name: 'customInput', realName: 'custom-input' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserUpdateModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getApiuid = function () {
            return this.apiuid;
        };
    
        /**
         * Setter for Apiuid
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setApiuid = function (value) {
            this.apiuid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getOldpassword = function () {
            return this.oldpassword;
        };
    
        /**
         * Setter for Oldpassword
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setOldpassword = function (value) {
            this.oldpassword = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getNewpassword = function () {
            return this.newpassword;
        };
    
        /**
         * Setter for Newpassword
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setNewpassword = function (value) {
            this.newpassword = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getName = function () {
            return this.name;
        };
    
        /**
         * Setter for Name
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setName = function (value) {
            this.name = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getEmail = function () {
            return this.email;
        };
    
        /**
         * Setter for Email
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setEmail = function (value) {
            this.email = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getPhone = function () {
            return this.phone;
        };
    
        /**
         * Setter for Phone
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setPhone = function (value) {
            this.phone = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getAvatar = function () {
            return this.avatar;
        };
    
        /**
         * Setter for Avatar
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setAvatar = function (value) {
            this.avatar = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getCountrycode = function () {
            return this.countrycode;
        };
    
        /**
         * Setter for Countrycode
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setCountrycode = function (value) {
            this.countrycode = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getA = function () {
            return this.a;
        };
    
        /**
         * Setter for A
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setA = function (value) {
            this.a = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getSa = function () {
            return this.sa;
        };
    
        /**
         * Setter for Sa
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setSa = function (value) {
            this.sa = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getC = function () {
            return this.c;
        };
    
        /**
         * Setter for C
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setC = function (value) {
            this.c = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getS = function () {
            return this.s;
        };
    
        /**
         * Setter for S
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setS = function (value) {
            this.s = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getZ = function () {
            return this.z;
        };
    
        /**
         * Setter for Z
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setZ = function (value) {
            this.z = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserUpdateModel.prototype.getCustomInput = function () {
            return this.customInput;
        };
    
        /**
         * Setter for CustomInput
         * 
         * @param {string} value 
         */
        UserUpdateModel.prototype.setCustomInput = function (value) {
            this.customInput = value;
        };
    
        return UserUpdateModel;
    }

}(angular));

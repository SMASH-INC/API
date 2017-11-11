/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserInformationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserInformationModel', ['BaseModel', UserInformationModelModel]);

    function UserInformationModelModel(BaseModel) {
        var UserInformationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.realname = this.getValue(obj.realname);
            this.displayname = this.getValue(obj.displayname);
            this.avatar = this.getValue(obj.avatar);
            this.email = this.getValue(obj.email);
            this.address = this.getValue(obj.address);
            this.address1 = this.getValue(obj.address1);
            this.address2 = this.getValue(obj.address2);
            this.city = this.getValue(obj.city);
            this.state = this.getValue(obj.state);
            this.zipcode = this.getValue(obj.zipcode);
            this.phone = this.getValue(obj.phone);
            this.lastlogin = this.getValue(obj.lastlogin);
            this.ip = this.getValue(obj.ip);
            this.m2fa = this.getValue(obj.m2fa);
            this.iplock = this.getValue(obj.iplock);
        };

        UserInformationModel.prototype = new BaseModel();
        UserInformationModel.prototype.constructor = UserInformationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserInformationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'realname', realName: 'realname' },
                { name: 'displayname', realName: 'displayname' },
                { name: 'avatar', realName: 'avatar' },
                { name: 'email', realName: 'email' },
                { name: 'address', realName: 'address' },
                { name: 'address1', realName: 'address1' },
                { name: 'address2', realName: 'address2' },
                { name: 'city', realName: 'city' },
                { name: 'state', realName: 'state' },
                { name: 'zipcode', realName: 'zipcode' },
                { name: 'phone', realName: 'phone' },
                { name: 'lastlogin', realName: 'lastlogin' },
                { name: 'ip', realName: 'ip' },
                { name: 'm2fa', realName: '2fa' },
                { name: 'iplock', realName: 'iplock' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserInformationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getRealname = function () {
            return this.realname;
        };
    
        /**
         * Setter for Realname
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setRealname = function (value) {
            this.realname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getDisplayname = function () {
            return this.displayname;
        };
    
        /**
         * Setter for Displayname
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setDisplayname = function (value) {
            this.displayname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getAvatar = function () {
            return this.avatar;
        };
    
        /**
         * Setter for Avatar
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setAvatar = function (value) {
            this.avatar = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getEmail = function () {
            return this.email;
        };
    
        /**
         * Setter for Email
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setEmail = function (value) {
            this.email = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getAddress1 = function () {
            return this.address1;
        };
    
        /**
         * Setter for Address1
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setAddress1 = function (value) {
            this.address1 = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getAddress2 = function () {
            return this.address2;
        };
    
        /**
         * Setter for Address2
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setAddress2 = function (value) {
            this.address2 = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getCity = function () {
            return this.city;
        };
    
        /**
         * Setter for City
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setCity = function (value) {
            this.city = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getState = function () {
            return this.state;
        };
    
        /**
         * Setter for State
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setState = function (value) {
            this.state = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getZipcode = function () {
            return this.zipcode;
        };
    
        /**
         * Setter for Zipcode
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setZipcode = function (value) {
            this.zipcode = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getPhone = function () {
            return this.phone;
        };
    
        /**
         * Setter for Phone
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setPhone = function (value) {
            this.phone = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getLastlogin = function () {
            return this.lastlogin;
        };
    
        /**
         * Setter for Lastlogin
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setLastlogin = function (value) {
            this.lastlogin = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getIp = function () {
            return this.ip;
        };
    
        /**
         * Setter for Ip
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setIp = function (value) {
            this.ip = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getM2fa = function () {
            return this.m2fa;
        };
    
        /**
         * Setter for M2fa
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setM2fa = function (value) {
            this.m2fa = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationModel.prototype.getIplock = function () {
            return this.iplock;
        };
    
        /**
         * Setter for Iplock
         * 
         * @param {string} value 
         */
        UserInformationModel.prototype.setIplock = function (value) {
            this.iplock = value;
        };
    
        return UserInformationModel;
    }

}(angular));

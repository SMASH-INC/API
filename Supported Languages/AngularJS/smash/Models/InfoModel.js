/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of InfoModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('InfoModel', ['BaseModel', InfoModelModel]);

    function InfoModelModel(BaseModel) {
        var InfoModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.uid = this.getValue(obj.uid);
            this.apiuid = this.getValue(obj.apiuid);
            this.realname = this.getValue(obj.realname);
            this.displayname = this.getValue(obj.displayname);
            this.avatar = this.getValue(obj.avatar);
            this.email = this.getValue(obj.email);
            this.address = this.getValue(obj.address);
            this.phone = this.getValue(obj.phone);
            this.lastlogin = this.getValue(obj.lastlogin);
            this.ip = this.getValue(obj.ip);
            this.m2fa = this.getValue(obj.m2fa);
            this.iplock = this.getValue(obj.iplock);
        };

        InfoModel.prototype = new BaseModel();
        InfoModel.prototype.constructor = InfoModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        InfoModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'uid', realName: 'uid' },
                { name: 'apiuid', realName: 'apiuid' },
                { name: 'realname', realName: 'realname' },
                { name: 'displayname', realName: 'displayname' },
                { name: 'avatar', realName: 'avatar' },
                { name: 'email', realName: 'email' },
                { name: 'address', realName: 'address' },
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
        InfoModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getApiuid = function () {
            return this.apiuid;
        };
    
        /**
         * Setter for Apiuid
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setApiuid = function (value) {
            this.apiuid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getRealname = function () {
            return this.realname;
        };
    
        /**
         * Setter for Realname
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setRealname = function (value) {
            this.realname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getDisplayname = function () {
            return this.displayname;
        };
    
        /**
         * Setter for Displayname
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setDisplayname = function (value) {
            this.displayname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getAvatar = function () {
            return this.avatar;
        };
    
        /**
         * Setter for Avatar
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setAvatar = function (value) {
            this.avatar = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getEmail = function () {
            return this.email;
        };
    
        /**
         * Setter for Email
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setEmail = function (value) {
            this.email = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getPhone = function () {
            return this.phone;
        };
    
        /**
         * Setter for Phone
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setPhone = function (value) {
            this.phone = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getLastlogin = function () {
            return this.lastlogin;
        };
    
        /**
         * Setter for Lastlogin
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setLastlogin = function (value) {
            this.lastlogin = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getIp = function () {
            return this.ip;
        };
    
        /**
         * Setter for Ip
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setIp = function (value) {
            this.ip = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getM2fa = function () {
            return this.m2fa;
        };
    
        /**
         * Setter for M2fa
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setM2fa = function (value) {
            this.m2fa = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        InfoModel.prototype.getIplock = function () {
            return this.iplock;
        };
    
        /**
         * Setter for Iplock
         * 
         * @param {string} value 
         */
        InfoModel.prototype.setIplock = function (value) {
            this.iplock = value;
        };
    
        return InfoModel;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserProfileInformationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserProfileInformationModel', ['BaseModel', UserProfileInformationModelModel]);

    function UserProfileInformationModelModel(BaseModel) {
        var UserProfileInformationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.uid = this.getValue(obj.uid);
            this.apiuid = this.getValue(obj.apiuid);
            this.realname = this.getValue(obj.realname);
            this.displayname = this.getValue(obj.displayname);
            this.email = this.getValue(obj.email);
            this.address = this.getValue(obj.address);
            this.phone = this.getValue(obj.phone);
        };

        UserProfileInformationModel.prototype = new BaseModel();
        UserProfileInformationModel.prototype.constructor = UserProfileInformationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserProfileInformationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'uid', realName: 'uid' },
                { name: 'apiuid', realName: 'apiuid' },
                { name: 'realname', realName: 'realname' },
                { name: 'displayname', realName: 'displayname' },
                { name: 'email', realName: 'email' },
                { name: 'address', realName: 'address' },
                { name: 'phone', realName: 'phone' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserProfileInformationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getApiuid = function () {
            return this.apiuid;
        };
    
        /**
         * Setter for Apiuid
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setApiuid = function (value) {
            this.apiuid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getRealname = function () {
            return this.realname;
        };
    
        /**
         * Setter for Realname
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setRealname = function (value) {
            this.realname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getDisplayname = function () {
            return this.displayname;
        };
    
        /**
         * Setter for Displayname
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setDisplayname = function (value) {
            this.displayname = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getEmail = function () {
            return this.email;
        };
    
        /**
         * Setter for Email
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setEmail = function (value) {
            this.email = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getAddress = function () {
            return this.address;
        };
    
        /**
         * Setter for Address
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setAddress = function (value) {
            this.address = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserProfileInformationModel.prototype.getPhone = function () {
            return this.phone;
        };
    
        /**
         * Setter for Phone
         * 
         * @param {string} value 
         */
        UserProfileInformationModel.prototype.setPhone = function (value) {
            this.phone = value;
        };
    
        return UserProfileInformationModel;
    }

}(angular));

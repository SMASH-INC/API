/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserInformationSecondaryModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserInformationSecondaryModel', ['BaseModel', UserInformationSecondaryModelModel]);

    function UserInformationSecondaryModelModel(BaseModel) {
        var UserInformationSecondaryModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.user = this.getValue(obj.user);
            this.apiuid = this.getValue(obj.apiuid);
        };

        UserInformationSecondaryModel.prototype = new BaseModel();
        UserInformationSecondaryModel.prototype.constructor = UserInformationSecondaryModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserInformationSecondaryModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'user', realName: 'user' },
                { name: 'apiuid', realName: 'apiuid' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserInformationSecondaryModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationSecondaryModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        UserInformationSecondaryModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationSecondaryModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        UserInformationSecondaryModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationSecondaryModel.prototype.getUser = function () {
            return this.user;
        };
    
        /**
         * Setter for User
         * 
         * @param {string} value 
         */
        UserInformationSecondaryModel.prototype.setUser = function (value) {
            this.user = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserInformationSecondaryModel.prototype.getApiuid = function () {
            return this.apiuid;
        };
    
        /**
         * Setter for Apiuid
         * 
         * @param {string} value 
         */
        UserInformationSecondaryModel.prototype.setApiuid = function (value) {
            this.apiuid = value;
        };
    
        return UserInformationSecondaryModel;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserCustomUpdateModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserCustomUpdateModel', ['BaseModel', UserCustomUpdateModelModel]);

    function UserCustomUpdateModelModel(BaseModel) {
        var UserCustomUpdateModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.uid = this.getValue(obj.uid);
            this.apiuid = this.getValue(obj.apiuid);
            this.avatar = this.getValue(obj.avatar);
            this.customInput = this.getValue(obj.customInput);
        };

        UserCustomUpdateModel.prototype = new BaseModel();
        UserCustomUpdateModel.prototype.constructor = UserCustomUpdateModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserCustomUpdateModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'uid', realName: 'uid' },
                { name: 'apiuid', realName: 'apiuid' },
                { name: 'avatar', realName: 'avatar' },
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
        UserCustomUpdateModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserCustomUpdateModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        UserCustomUpdateModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserCustomUpdateModel.prototype.getApiuid = function () {
            return this.apiuid;
        };
    
        /**
         * Setter for Apiuid
         * 
         * @param {string} value 
         */
        UserCustomUpdateModel.prototype.setApiuid = function (value) {
            this.apiuid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserCustomUpdateModel.prototype.getAvatar = function () {
            return this.avatar;
        };
    
        /**
         * Setter for Avatar
         * 
         * @param {string} value 
         */
        UserCustomUpdateModel.prototype.setAvatar = function (value) {
            this.avatar = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserCustomUpdateModel.prototype.getCustomInput = function () {
            return this.customInput;
        };
    
        /**
         * Setter for CustomInput
         * 
         * @param {string} value 
         */
        UserCustomUpdateModel.prototype.setCustomInput = function (value) {
            this.customInput = value;
        };
    
        return UserCustomUpdateModel;
    }

}(angular));

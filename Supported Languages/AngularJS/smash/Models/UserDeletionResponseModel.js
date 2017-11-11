/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of UserDeletionResponseModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('UserDeletionResponseModel', ['BaseModel', UserDeletionResponseModelModel]);

    function UserDeletionResponseModelModel(BaseModel) {
        var UserDeletionResponseModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.request = this.getValue(obj.request);
            this.deleted = this.getValue(obj.deleted);
            this.id = this.getValue(obj.id);
        };

        UserDeletionResponseModel.prototype = new BaseModel();
        UserDeletionResponseModel.prototype.constructor = UserDeletionResponseModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        UserDeletionResponseModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'request', realName: 'request' },
                { name: 'deleted', realName: 'deleted' },
                { name: 'id', realName: 'id' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        UserDeletionResponseModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserDeletionResponseModel.prototype.getRequest = function () {
            return this.request;
        };
    
        /**
         * Setter for Request
         * 
         * @param {string} value 
         */
        UserDeletionResponseModel.prototype.setRequest = function (value) {
            this.request = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserDeletionResponseModel.prototype.getDeleted = function () {
            return this.deleted;
        };
    
        /**
         * Setter for Deleted
         * 
         * @param {string} value 
         */
        UserDeletionResponseModel.prototype.setDeleted = function (value) {
            this.deleted = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        UserDeletionResponseModel.prototype.getId = function () {
            return this.id;
        };
    
        /**
         * Setter for Id
         * 
         * @param {string} value 
         */
        UserDeletionResponseModel.prototype.setId = function (value) {
            this.id = value;
        };
    
        return UserDeletionResponseModel;
    }

}(angular));

/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of WAFCreationModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('WAFCreationModel', ['BaseModel', WAFCreationModelModel]);

    function WAFCreationModelModel(BaseModel) {
        var WAFCreationModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.key = this.getValue(obj.key);
            this.uid = this.getValue(obj.uid);
            this.origin = this.getValue(obj.origin);
            this.cname = this.getValue(obj.cname);
        };

        WAFCreationModel.prototype = new BaseModel();
        WAFCreationModel.prototype.constructor = WAFCreationModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        WAFCreationModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'key', realName: 'key' },
                { name: 'uid', realName: 'uid' },
                { name: 'origin', realName: 'origin' },
                { name: 'cname', realName: 'cname' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        WAFCreationModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFCreationModel.prototype.getKey = function () {
            return this.key;
        };
    
        /**
         * Setter for Key
         * 
         * @param {string} value 
         */
        WAFCreationModel.prototype.setKey = function (value) {
            this.key = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFCreationModel.prototype.getUid = function () {
            return this.uid;
        };
    
        /**
         * Setter for Uid
         * 
         * @param {string} value 
         */
        WAFCreationModel.prototype.setUid = function (value) {
            this.uid = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFCreationModel.prototype.getOrigin = function () {
            return this.origin;
        };
    
        /**
         * Setter for Origin
         * 
         * @param {string} value 
         */
        WAFCreationModel.prototype.setOrigin = function (value) {
            this.origin = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {string}
         */
        WAFCreationModel.prototype.getCname = function () {
            return this.cname;
        };
    
        /**
         * Setter for Cname
         * 
         * @param {string} value 
         */
        WAFCreationModel.prototype.setCname = function (value) {
            this.cname = value;
        };
    
        return WAFCreationModel;
    }

}(angular));

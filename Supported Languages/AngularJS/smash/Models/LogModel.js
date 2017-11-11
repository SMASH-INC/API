/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of LogModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('LogModel', ['BaseModel', LogModelModel]);

    function LogModelModel(BaseModel) {
        var LogModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.mMDDYYYYHHMMSSX = this.getValue(obj.mMDDYYYYHHMMSSX);
            this.mMDDYYYYHHMMSSY = this.getValue(obj.mMDDYYYYHHMMSSY);
        };

        LogModel.prototype = new BaseModel();
        LogModel.prototype.constructor = LogModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        LogModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'mMDDYYYYHHMMSSX', realName: 'MMDDYYYYHHMMSSX', type: 'MMDDYYYYHHMMSSModel' },
                { name: 'mMDDYYYYHHMMSSY', realName: 'MMDDYYYYHHMMSSY', type: 'MMDDYYYYHHMMSSModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        LogModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {MMDDYYYYHHMMSSModel}
         */
        LogModel.prototype.getMMDDYYYYHHMMSSX = function () {
            return this.mMDDYYYYHHMMSSX;
        };
    
        /**
         * Setter for MMDDYYYYHHMMSSX
         * 
         * @param {MMDDYYYYHHMMSSModel} value 
         */
        LogModel.prototype.setMMDDYYYYHHMMSSX = function (value) {
            this.mMDDYYYYHHMMSSX = value;
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {MMDDYYYYHHMMSSModel}
         */
        LogModel.prototype.getMMDDYYYYHHMMSSY = function () {
            return this.mMDDYYYYHHMMSSY;
        };
    
        /**
         * Setter for MMDDYYYYHHMMSSY
         * 
         * @param {MMDDYYYYHHMMSSModel} value 
         */
        LogModel.prototype.setMMDDYYYYHHMMSSY = function (value) {
            this.mMDDYYYYHHMMSSY = value;
        };
    
        return LogModel;
    }

}(angular));

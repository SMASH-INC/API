/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

/**
 * Creates a instance of MMDDYYYYHHMMSSModel
 *
 * @constructor
 */
angular.module('SMASH')
    .factory('MMDDYYYYHHMMSSModel', ['BaseModel', MMDDYYYYHHMMSSModelModel]);

    function MMDDYYYYHHMMSSModelModel(BaseModel) {
        var MMDDYYYYHHMMSSModel = function (obj) {
            if (obj === undefined || obj === null) {
                return;
            }
            this.data = this.getValue(obj.data);
        };

        MMDDYYYYHHMMSSModel.prototype = new BaseModel();
        MMDDYYYYHHMMSSModel.prototype.constructor = MMDDYYYYHHMMSSModel;
    
        /**
         * Function containing information about the fields of this model
         * @return   {array}   Array of objects containing information about the fields
         */
        MMDDYYYYHHMMSSModel.prototype.mappingInfo = function() {
            return BaseModel.prototype.mappingInfo.call(this).concat([
                { name: 'data', realName: 'data', type: 'DataModel' }
            ]);
        };
    
        /**
         * Function containing information about discriminator values
         * mapped with their corresponding model class names
         *
         * @return   {object}  Object containing Key-Value pairs mapping discriminator
         *                     values with their corresponding model classes
         */
        MMDDYYYYHHMMSSModel.prototype.discriminatorMap = function() {
            return {};
        };
    
        /**
         * TODO: Write general description for this method
         *
         * @return {DataModel}
         */
        MMDDYYYYHHMMSSModel.prototype.getData = function () {
            return this.data;
        };
    
        /**
         * Setter for Data
         * 
         * @param {DataModel} value 
         */
        MMDDYYYYHHMMSSModel.prototype.setData = function (value) {
            this.data = value;
        };
    
        return MMDDYYYYHHMMSSModel;
    }

}(angular));

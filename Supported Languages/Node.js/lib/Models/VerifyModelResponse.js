/**
 * smash
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of VerifyModelResponse
 */
class VerifyModelResponse extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.request = this.constructor.getValue(obj.request);
        this.to = this.constructor.getValue(obj.to);
        this.verified = this.constructor.getValue(obj.verified);
        this.id = this.constructor.getValue(obj.id);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'request', realName: 'request' },
            { name: 'to', realName: 'to' },
            { name: 'verified', realName: 'verified' },
            { name: 'id', realName: 'id' },
        ]);
    }

    /**
     * Function containing information about discriminator values
     * mapped with their corresponding model class names
     *
     * @return   {object}  Object containing Key-Value pairs mapping discriminator
     *                     values with their corresponding model classes
     */
    static discriminatorMap() {
        return {};
    }
}

module.exports = VerifyModelResponse;

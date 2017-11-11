/**
 * smash
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

'use strict';

const BaseModel = require('./BaseModel');

/**
 * Creates an instance of UserProfileInformationModel
 */
class UserProfileInformationModel extends BaseModel {
    /**
     * @constructor
     * @param   {Object}  obj    The object passed to constructor
     */
    constructor(obj) {
        super(obj);
        if (obj === undefined || obj === null) return;
        this.uid = this.constructor.getValue(obj.uid);
        this.apiuid = this.constructor.getValue(obj.apiuid);
        this.realname = this.constructor.getValue(obj.realname);
        this.displayname = this.constructor.getValue(obj.displayname);
        this.email = this.constructor.getValue(obj.email);
        this.address = this.constructor.getValue(obj.address);
        this.phone = this.constructor.getValue(obj.phone);
    }

    /**
     * Function containing information about the fields of this model
     * @return   {array}   Array of objects containing information about the fields
     */
    static mappingInfo() {
        return super.mappingInfo().concat([
            { name: 'uid', realName: 'uid' },
            { name: 'apiuid', realName: 'apiuid' },
            { name: 'realname', realName: 'realname' },
            { name: 'displayname', realName: 'displayname' },
            { name: 'email', realName: 'email' },
            { name: 'address', realName: 'address' },
            { name: 'phone', realName: 'phone' },
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

module.exports = UserProfileInformationModel;

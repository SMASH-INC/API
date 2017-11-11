<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib\Models;

use JsonSerializable;

/**
 * @todo Write general description for this model
 */
class UserUpdateModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $key public property
     */
    public $key;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $uid public property
     */
    public $uid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $user public property
     */
    public $user;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $apiuid public property
     */
    public $apiuid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $oldpassword public property
     */
    public $oldpassword;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $newpassword public property
     */
    public $newpassword;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $name public property
     */
    public $name;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $email public property
     */
    public $email;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $phone public property
     */
    public $phone;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $avatar public property
     */
    public $avatar;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $countrycode public property
     */
    public $countrycode;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $address public property
     */
    public $address;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $a public property
     */
    public $a;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $sa public property
     */
    public $sa;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $c public property
     */
    public $c;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $s public property
     */
    public $s;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $z public property
     */
    public $z;

    /**
     * @todo Write general description for this property
     * @required
     * @maps custom-input
     * @var string $customInput public property
     */
    public $customInput;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $key         Initialization value for $this->key
     * @param string $uid         Initialization value for $this->uid
     * @param string $user        Initialization value for $this->user
     * @param string $apiuid      Initialization value for $this->apiuid
     * @param string $oldpassword Initialization value for $this->oldpassword
     * @param string $newpassword Initialization value for $this->newpassword
     * @param string $name        Initialization value for $this->name
     * @param string $email       Initialization value for $this->email
     * @param string $phone       Initialization value for $this->phone
     * @param string $avatar      Initialization value for $this->avatar
     * @param string $countrycode Initialization value for $this->countrycode
     * @param string $address     Initialization value for $this->address
     * @param string $a           Initialization value for $this->a
     * @param string $sa          Initialization value for $this->sa
     * @param string $c           Initialization value for $this->c
     * @param string $s           Initialization value for $this->s
     * @param string $z           Initialization value for $this->z
     * @param string $customInput Initialization value for $this->customInput
     */
    public function __construct()
    {
        if (18 == func_num_args()) {
            $this->key         = func_get_arg(0);
            $this->uid         = func_get_arg(1);
            $this->user        = func_get_arg(2);
            $this->apiuid      = func_get_arg(3);
            $this->oldpassword = func_get_arg(4);
            $this->newpassword = func_get_arg(5);
            $this->name        = func_get_arg(6);
            $this->email       = func_get_arg(7);
            $this->phone       = func_get_arg(8);
            $this->avatar      = func_get_arg(9);
            $this->countrycode = func_get_arg(10);
            $this->address     = func_get_arg(11);
            $this->a           = func_get_arg(12);
            $this->sa          = func_get_arg(13);
            $this->c           = func_get_arg(14);
            $this->s           = func_get_arg(15);
            $this->z           = func_get_arg(16);
            $this->customInput = func_get_arg(17);
        }
    }

    
    /**
     * Add an additional property to this model.
     * @param string $name  Name of property
     * @param mixed $value Value of property
     */
    public function addAdditionalProperty($name, $value)
    {
        $this->additionalProperties[$name] = $value;
    }

    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['key']          = $this->key;
        $json['uid']          = $this->uid;
        $json['user']         = $this->user;
        $json['apiuid']       = $this->apiuid;
        $json['oldpassword']  = $this->oldpassword;
        $json['newpassword']  = $this->newpassword;
        $json['name']         = $this->name;
        $json['email']        = $this->email;
        $json['phone']        = $this->phone;
        $json['avatar']       = $this->avatar;
        $json['countrycode']  = $this->countrycode;
        $json['address']      = $this->address;
        $json['a']            = $this->a;
        $json['sa']           = $this->sa;
        $json['c']            = $this->c;
        $json['s']            = $this->s;
        $json['z']            = $this->z;
        $json['custom-input'] = $this->customInput;

        return array_merge($json, $this->additionalProperties);
    }
}

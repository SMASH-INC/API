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
class InfoModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $uid public property
     */
    public $uid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $apiuid public property
     */
    public $apiuid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $realname public property
     */
    public $realname;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $displayname public property
     */
    public $displayname;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $avatar public property
     */
    public $avatar;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $email public property
     */
    public $email;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $address public property
     */
    public $address;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $phone public property
     */
    public $phone;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $lastlogin public property
     */
    public $lastlogin;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $ip public property
     */
    public $ip;

    /**
     * @todo Write general description for this property
     * @required
     * @maps 2fa
     * @var string $m2fa public property
     */
    public $m2fa;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $iplock public property
     */
    public $iplock;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $uid         Initialization value for $this->uid
     * @param string $apiuid      Initialization value for $this->apiuid
     * @param string $realname    Initialization value for $this->realname
     * @param string $displayname Initialization value for $this->displayname
     * @param string $avatar      Initialization value for $this->avatar
     * @param string $email       Initialization value for $this->email
     * @param string $address     Initialization value for $this->address
     * @param string $phone       Initialization value for $this->phone
     * @param string $lastlogin   Initialization value for $this->lastlogin
     * @param string $ip          Initialization value for $this->ip
     * @param string $m2fa        Initialization value for $this->m2fa
     * @param string $iplock      Initialization value for $this->iplock
     */
    public function __construct()
    {
        if (12 == func_num_args()) {
            $this->uid         = func_get_arg(0);
            $this->apiuid      = func_get_arg(1);
            $this->realname    = func_get_arg(2);
            $this->displayname = func_get_arg(3);
            $this->avatar      = func_get_arg(4);
            $this->email       = func_get_arg(5);
            $this->address     = func_get_arg(6);
            $this->phone       = func_get_arg(7);
            $this->lastlogin   = func_get_arg(8);
            $this->ip          = func_get_arg(9);
            $this->m2fa        = func_get_arg(10);
            $this->iplock      = func_get_arg(11);
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
        $json['uid']         = $this->uid;
        $json['apiuid']      = $this->apiuid;
        $json['realname']    = $this->realname;
        $json['displayname'] = $this->displayname;
        $json['avatar']      = $this->avatar;
        $json['email']       = $this->email;
        $json['address']     = $this->address;
        $json['phone']       = $this->phone;
        $json['lastlogin']   = $this->lastlogin;
        $json['ip']          = $this->ip;
        $json['2fa']         = $this->m2fa;
        $json['iplock']      = $this->iplock;

        return array_merge($json, $this->additionalProperties);
    }
}

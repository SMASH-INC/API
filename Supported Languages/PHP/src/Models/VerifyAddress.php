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
class VerifyAddress implements JsonSerializable
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
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $key     Initialization value for $this->key
     * @param string $uid     Initialization value for $this->uid
     * @param string $user    Initialization value for $this->user
     * @param string $address Initialization value for $this->address
     * @param string $a       Initialization value for $this->a
     * @param string $sa      Initialization value for $this->sa
     * @param string $c       Initialization value for $this->c
     * @param string $s       Initialization value for $this->s
     * @param string $z       Initialization value for $this->z
     */
    public function __construct()
    {
        if (9 == func_num_args()) {
            $this->key     = func_get_arg(0);
            $this->uid     = func_get_arg(1);
            $this->user    = func_get_arg(2);
            $this->address = func_get_arg(3);
            $this->a       = func_get_arg(4);
            $this->sa      = func_get_arg(5);
            $this->c       = func_get_arg(6);
            $this->s       = func_get_arg(7);
            $this->z       = func_get_arg(8);
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
        $json['key']     = $this->key;
        $json['uid']     = $this->uid;
        $json['user']    = $this->user;
        $json['address'] = $this->address;
        $json['a']       = $this->a;
        $json['sa']      = $this->sa;
        $json['c']       = $this->c;
        $json['s']       = $this->s;
        $json['z']       = $this->z;

        return array_merge($json, $this->additionalProperties);
    }
}

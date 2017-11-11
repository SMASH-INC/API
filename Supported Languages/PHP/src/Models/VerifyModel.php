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
class VerifyModel implements JsonSerializable
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
     * @var string $to public property
     */
    public $to;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $key Initialization value for $this->key
     * @param string $uid Initialization value for $this->uid
     * @param string $to  Initialization value for $this->to
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->key = func_get_arg(0);
            $this->uid = func_get_arg(1);
            $this->to  = func_get_arg(2);
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
        $json['key'] = $this->key;
        $json['uid'] = $this->uid;
        $json['to']  = $this->to;

        return array_merge($json, $this->additionalProperties);
    }
}

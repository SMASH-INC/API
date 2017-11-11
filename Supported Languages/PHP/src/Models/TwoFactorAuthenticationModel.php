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
class TwoFactorAuthenticationModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $request public property
     */
    public $request;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $to public property
     */
    public $to;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $verified public property
     */
    public $verified;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $id public property
     */
    public $id;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $request  Initialization value for $this->request
     * @param string $to       Initialization value for $this->to
     * @param string $verified Initialization value for $this->verified
     * @param string $id       Initialization value for $this->id
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->request  = func_get_arg(0);
            $this->to       = func_get_arg(1);
            $this->verified = func_get_arg(2);
            $this->id       = func_get_arg(3);
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
        $json['request']  = $this->request;
        $json['to']       = $this->to;
        $json['verified'] = $this->verified;
        $json['id']       = $this->id;

        return array_merge($json, $this->additionalProperties);
    }
}

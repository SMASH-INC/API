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
class TwoFactorAuthenticationTokenModelResponse implements JsonSerializable
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
     * @var string $correct public property
     */
    public $correct;

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
     * @param string $request Initialization value for $this->request
     * @param string $correct Initialization value for $this->correct
     * @param string $id      Initialization value for $this->id
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->request = func_get_arg(0);
            $this->correct = func_get_arg(1);
            $this->id      = func_get_arg(2);
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
        $json['request'] = $this->request;
        $json['correct'] = $this->correct;
        $json['id']      = $this->id;

        return array_merge($json, $this->additionalProperties);
    }
}

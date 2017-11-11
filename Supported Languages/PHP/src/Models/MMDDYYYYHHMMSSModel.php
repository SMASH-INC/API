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
class MMDDYYYYHHMMSSModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var DataModel $data public property
     */
    public $data;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param DataModel $data Initialization value for $this->data
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->data = func_get_arg(0);
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
        $json['data'] = $this->data;

        return array_merge($json, $this->additionalProperties);
    }
}

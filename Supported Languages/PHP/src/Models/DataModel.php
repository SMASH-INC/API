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
class DataModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $result public property
     */
    public $result;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $content public property
     */
    public $content;

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
     * @param string $result  Initialization value for $this->result
     * @param string $content Initialization value for $this->content
     * @param string $id      Initialization value for $this->id
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->result  = func_get_arg(0);
            $this->content = func_get_arg(1);
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
        $json['result']  = $this->result;
        $json['content'] = $this->content;
        $json['id']      = $this->id;

        return array_merge($json, $this->additionalProperties);
    }
}

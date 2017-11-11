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
class EncryptionModel implements JsonSerializable
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
     * @var string $data public property
     */
    public $data;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $file public property
     */
    public $file;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $method public property
     */
    public $method;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $bit public property
     */
    public $bit;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $key    Initialization value for $this->key
     * @param string $uid    Initialization value for $this->uid
     * @param string $data   Initialization value for $this->data
     * @param string $file   Initialization value for $this->file
     * @param string $method Initialization value for $this->method
     * @param string $bit    Initialization value for $this->bit
     */
    public function __construct()
    {
        if (6 == func_num_args()) {
            $this->key    = func_get_arg(0);
            $this->uid    = func_get_arg(1);
            $this->data   = func_get_arg(2);
            $this->file   = func_get_arg(3);
            $this->method = func_get_arg(4);
            $this->bit    = func_get_arg(5);
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
        $json['key']    = $this->key;
        $json['uid']    = $this->uid;
        $json['data']   = $this->data;
        $json['file']   = $this->file;
        $json['method'] = $this->method;
        $json['bit']    = $this->bit;

        return array_merge($json, $this->additionalProperties);
    }
}

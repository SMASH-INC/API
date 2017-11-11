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
class ImageManipulationModel implements JsonSerializable
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
     * @var string $image public property
     */
    public $image;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $transform public property
     */
    public $transform;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $moderate public property
     */
    public $moderate;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $key       Initialization value for $this->key
     * @param string $uid       Initialization value for $this->uid
     * @param string $image     Initialization value for $this->image
     * @param string $transform Initialization value for $this->transform
     * @param string $moderate  Initialization value for $this->moderate
     */
    public function __construct()
    {
        if (5 == func_num_args()) {
            $this->key       = func_get_arg(0);
            $this->uid       = func_get_arg(1);
            $this->image     = func_get_arg(2);
            $this->transform = func_get_arg(3);
            $this->moderate  = func_get_arg(4);
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
        $json['key']       = $this->key;
        $json['uid']       = $this->uid;
        $json['image']     = $this->image;
        $json['transform'] = $this->transform;
        $json['moderate']  = $this->moderate;

        return array_merge($json, $this->additionalProperties);
    }
}

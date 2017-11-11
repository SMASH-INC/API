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
class DataManipulationModelResponse implements JsonSerializable
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
     * @var string $url public property
     */
    public $url;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $success public property
     */
    public $success;

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
     * @param string $url     Initialization value for $this->url
     * @param string $success Initialization value for $this->success
     * @param string $id      Initialization value for $this->id
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->request = func_get_arg(0);
            $this->url     = func_get_arg(1);
            $this->success = func_get_arg(2);
            $this->id      = func_get_arg(3);
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
        $json['url']     = $this->url;
        $json['success'] = $this->success;
        $json['id']      = $this->id;

        return array_merge($json, $this->additionalProperties);
    }
}

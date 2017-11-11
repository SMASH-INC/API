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
class CDNPushModelResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $success public property
     */
    public $success;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $upload public property
     */
    public $upload;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $cname public property
     */
    public $cname;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $success Initialization value for $this->success
     * @param string $upload  Initialization value for $this->upload
     * @param string $cname   Initialization value for $this->cname
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->success = func_get_arg(0);
            $this->upload  = func_get_arg(1);
            $this->cname   = func_get_arg(2);
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
        $json['success'] = $this->success;
        $json['upload']  = $this->upload;
        $json['cname']   = $this->cname;

        return array_merge($json, $this->additionalProperties);
    }
}

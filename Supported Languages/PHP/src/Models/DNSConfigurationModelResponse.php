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
class DNSConfigurationModelResponse implements JsonSerializable
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
     * @var string $domain public property
     */
    public $domain;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $records public property
     */
    public $records;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $success Initialization value for $this->success
     * @param string $domain  Initialization value for $this->domain
     * @param string $records Initialization value for $this->records
     */
    public function __construct()
    {
        if (3 == func_num_args()) {
            $this->success = func_get_arg(0);
            $this->domain  = func_get_arg(1);
            $this->records = func_get_arg(2);
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
        $json['domain']  = $this->domain;
        $json['records'] = $this->records;

        return array_merge($json, $this->additionalProperties);
    }
}

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
class DNSCreationModelResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $domain public property
     */
    public $domain;

    /**
     * @todo Write general description for this property
     * @required
     * @var NameserversModel $nameservers public property
     */
    public $nameservers;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string           $domain      Initialization value for $this->domain
     * @param NameserversModel $nameservers Initialization value for $this->nameservers
     */
    public function __construct()
    {
        if (2 == func_num_args()) {
            $this->domain      = func_get_arg(0);
            $this->nameservers = func_get_arg(1);
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
        $json['domain']      = $this->domain;
        $json['nameservers'] = $this->nameservers;

        return array_merge($json, $this->additionalProperties);
    }
}

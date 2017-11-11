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
class NameserversModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $ns1 public property
     */
    public $ns1;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $ns2 public property
     */
    public $ns2;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $ns3 public property
     */
    public $ns3;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $ns4 public property
     */
    public $ns4;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $ns1 Initialization value for $this->ns1
     * @param string $ns2 Initialization value for $this->ns2
     * @param string $ns3 Initialization value for $this->ns3
     * @param string $ns4 Initialization value for $this->ns4
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->ns1 = func_get_arg(0);
            $this->ns2 = func_get_arg(1);
            $this->ns3 = func_get_arg(2);
            $this->ns4 = func_get_arg(3);
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
        $json['ns1'] = $this->ns1;
        $json['ns2'] = $this->ns2;
        $json['ns3'] = $this->ns3;
        $json['ns4'] = $this->ns4;

        return array_merge($json, $this->additionalProperties);
    }
}

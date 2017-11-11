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
class LoggingLogsModelResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var LogModel $log public property
     */
    public $log;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param LogModel $log Initialization value for $this->log
     */
    public function __construct()
    {
        if (1 == func_num_args()) {
            $this->log = func_get_arg(0);
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
        $json['log'] = $this->log;

        return array_merge($json, $this->additionalProperties);
    }
}

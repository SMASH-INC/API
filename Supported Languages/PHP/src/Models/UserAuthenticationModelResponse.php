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
class UserAuthenticationModelResponse implements JsonSerializable
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
     * @var string $uid public property
     */
    public $uid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $valid public property
     */
    public $valid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $id public property
     */
    public $id;

    /**
     * @todo Write general description for this property
     * @required
     * @var InfoModel $info public property
     */
    public $info;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string    $request Initialization value for $this->request
     * @param string    $uid     Initialization value for $this->uid
     * @param string    $valid   Initialization value for $this->valid
     * @param string    $id      Initialization value for $this->id
     * @param InfoModel $info    Initialization value for $this->info
     */
    public function __construct()
    {
        if (5 == func_num_args()) {
            $this->request = func_get_arg(0);
            $this->uid     = func_get_arg(1);
            $this->valid   = func_get_arg(2);
            $this->id      = func_get_arg(3);
            $this->info    = func_get_arg(4);
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
        $json['uid']     = $this->uid;
        $json['valid']   = $this->valid;
        $json['id']      = $this->id;
        $json['info']    = $this->info;

        return array_merge($json, $this->additionalProperties);
    }
}

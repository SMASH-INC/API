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
class UserInformationModelResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $user public property
     */
    public $user;

    /**
     * Users API Private Key
     * @required
     * @var string $key public property
     */
    public $key;

    /**
     * Users API Public Key
     * @required
     * @var string $api public property
     */
    public $api;

    /**
     * Users Profile Information
     * @required
     * @var UserInformationSecondaryModel $info public property
     */
    public $info;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string                        $user Initialization value for $this->user
     * @param string                        $key  Initialization value for $this->key
     * @param string                        $api  Initialization value for $this->api
     * @param UserInformationSecondaryModel $info Initialization value for $this->info
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->user = func_get_arg(0);
            $this->key  = func_get_arg(1);
            $this->api  = func_get_arg(2);
            $this->info = func_get_arg(3);
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
        $json['user'] = $this->user;
        $json['key']  = $this->key;
        $json['api']  = $this->api;
        $json['info'] = $this->info;

        return array_merge($json, $this->additionalProperties);
    }
}

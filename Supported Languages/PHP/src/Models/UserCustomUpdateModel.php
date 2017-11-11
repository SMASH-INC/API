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
class UserCustomUpdateModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $uid public property
     */
    public $uid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $apiuid public property
     */
    public $apiuid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $avatar public property
     */
    public $avatar;

    /**
     * @todo Write general description for this property
     * @required
     * @maps custom-input
     * @var string $customInput public property
     */
    public $customInput;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $uid         Initialization value for $this->uid
     * @param string $apiuid      Initialization value for $this->apiuid
     * @param string $avatar      Initialization value for $this->avatar
     * @param string $customInput Initialization value for $this->customInput
     */
    public function __construct()
    {
        if (4 == func_num_args()) {
            $this->uid         = func_get_arg(0);
            $this->apiuid      = func_get_arg(1);
            $this->avatar      = func_get_arg(2);
            $this->customInput = func_get_arg(3);
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
        $json['uid']          = $this->uid;
        $json['apiuid']       = $this->apiuid;
        $json['avatar']       = $this->avatar;
        $json['custom-input'] = $this->customInput;

        return array_merge($json, $this->additionalProperties);
    }
}

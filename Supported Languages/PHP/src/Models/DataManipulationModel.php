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
class DataManipulationModel implements JsonSerializable
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
     * @var string $user public property
     */
    public $user;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $apiuid public property
     */
    public $apiuid;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $url public property
     */
    public $url;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $manipulation public property
     */
    public $manipulation;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $conversion public property
     */
    public $conversion;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $sorting public property
     */
    public $sorting;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $compression public property
     */
    public $compression;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $key          Initialization value for $this->key
     * @param string $uid          Initialization value for $this->uid
     * @param string $user         Initialization value for $this->user
     * @param string $apiuid       Initialization value for $this->apiuid
     * @param string $url          Initialization value for $this->url
     * @param string $manipulation Initialization value for $this->manipulation
     * @param string $conversion   Initialization value for $this->conversion
     * @param string $sorting      Initialization value for $this->sorting
     * @param string $compression  Initialization value for $this->compression
     */
    public function __construct()
    {
        if (9 == func_num_args()) {
            $this->key          = func_get_arg(0);
            $this->uid          = func_get_arg(1);
            $this->user         = func_get_arg(2);
            $this->apiuid       = func_get_arg(3);
            $this->url          = func_get_arg(4);
            $this->manipulation = func_get_arg(5);
            $this->conversion   = func_get_arg(6);
            $this->sorting      = func_get_arg(7);
            $this->compression  = func_get_arg(8);
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
        $json['key']          = $this->key;
        $json['uid']          = $this->uid;
        $json['user']         = $this->user;
        $json['apiuid']       = $this->apiuid;
        $json['url']          = $this->url;
        $json['manipulation'] = $this->manipulation;
        $json['conversion']   = $this->conversion;
        $json['sorting']      = $this->sorting;
        $json['compression']  = $this->compression;

        return array_merge($json, $this->additionalProperties);
    }
}

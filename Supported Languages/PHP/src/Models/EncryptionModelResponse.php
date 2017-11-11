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
class EncryptionModelResponse implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @var string $data public property
     */
    public $data;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $file public property
     */
    public $file;

    /**
     * @todo Write general description for this property
     * @required
     * @var string $success public property
     */
    public $success;

    /**
     * @todo Write general description for this property
     * @required
     * @maps public
     * @var string $mpublic public property
     */
    public $mpublic;

    /**
     * @todo Write general description for this property
     * @required
     * @maps private
     * @var string $mprivate public property
     */
    public $mprivate;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param string $data     Initialization value for $this->data
     * @param string $file     Initialization value for $this->file
     * @param string $success  Initialization value for $this->success
     * @param string $mpublic  Initialization value for $this->mpublic
     * @param string $mprivate Initialization value for $this->mprivate
     */
    public function __construct()
    {
        if (5 == func_num_args()) {
            $this->data     = func_get_arg(0);
            $this->file     = func_get_arg(1);
            $this->success  = func_get_arg(2);
            $this->mpublic  = func_get_arg(3);
            $this->mprivate = func_get_arg(4);
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
        $json['data']    = $this->data;
        $json['file']    = $this->file;
        $json['success'] = $this->success;
        $json['public']  = $this->mpublic;
        $json['private'] = $this->mprivate;

        return array_merge($json, $this->additionalProperties);
    }
}

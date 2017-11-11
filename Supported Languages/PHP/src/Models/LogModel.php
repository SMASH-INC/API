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
class LogModel implements JsonSerializable
{
    /**
     * @todo Write general description for this property
     * @required
     * @maps MMDDYYYYHHMMSSX
     * @var MMDDYYYYHHMMSSModel $mMDDYYYYHHMMSSX public property
     */
    public $mMDDYYYYHHMMSSX;

    /**
     * @todo Write general description for this property
     * @required
     * @maps MMDDYYYYHHMMSSY
     * @var MMDDYYYYHHMMSSModel $mMDDYYYYHHMMSSY public property
     */
    public $mMDDYYYYHHMMSSY;

    /**
     * All additional properties for this model
     * @var array $additionalProperties public property
     */
    public $additionalProperties = array();

    /**
     * Constructor to set initial or default values of member properties
     * @param MMDDYYYYHHMMSSModel $mMDDYYYYHHMMSSX Initialization value for $this->mMDDYYYYHHMMSSX
     * @param MMDDYYYYHHMMSSModel $mMDDYYYYHHMMSSY Initialization value for $this->mMDDYYYYHHMMSSY
     */
    public function __construct()
    {
        if (2 == func_num_args()) {
            $this->mMDDYYYYHHMMSSX = func_get_arg(0);
            $this->mMDDYYYYHHMMSSY = func_get_arg(1);
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
        $json['MMDDYYYYHHMMSSX'] = $this->mMDDYYYYHHMMSSX;
        $json['MMDDYYYYHHMMSSY'] = $this->mMDDYYYYHHMMSSY;

        return array_merge($json, $this->additionalProperties);
    }
}

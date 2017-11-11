<?php
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */

namespace SMASHLib;

/**
 * All configuration including auth info and base URI for the API access
 * are configured in this class.
 */
class Configuration
{
    /**
     * The environment being used'
     * @var string
     */
    public static $environment = Environments::PRODUCTION;

    /**
     * Your user ID
     * @var string
     */
    public static $uid = 'UID';

    /**
     * Your Private API Key
     * @var string
     */
    public static $secret = 'SECRET';

    /**
     * Your Public API Key
     * @var string
     */
    public static $key = 'KEY';

    /**
     * Get the base uri for a given server in the current environment
     * @param  string $server Server name
     * @return string         Base URI
     */
    public static function getBaseUri($server = Servers::PATH)
    {
        return APIHelper::appendUrlWithTemplateParameters(
            static::$environmentsMap[static::$environment][$server],
            array(
            )
        );
    }

    /**
     * A map of all baseurls used in different environments and servers
     * @var array
     */
    private static $environmentsMap = array(
        Environments::PRODUCTION => array(
            Servers::PATH => 'https://api.rest.sh/api',
        ),
        Environments::SANDBOX => array(
            Servers::PATH => 'https://sb.rest.sh/api',
        ),
        Environments::BETA => array(
            Servers::PATH => 'https://b.rest.sh/api',
        ),
    );
}

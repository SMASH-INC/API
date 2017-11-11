/**
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

;(function (angular) {
'use strict';

angular.module('SMASH')
    .factory('Configuration', ['APIHelper', 'Servers', 'Environments', Configuration]);

    function Configuration(APIHelper, Servers, Environments) {
        var environmentsMap = [],
            e = Environments, 
            s = Servers;
    
    
        environmentsMap[e.PRODUCTION] = [];
        environmentsMap[e.SANDBOX] = [];
        environmentsMap[e.BETA] = [];
    
        environmentsMap[e.PRODUCTION][s.PATH] = 'https://api.rest.sh/api';
        environmentsMap[e.SANDBOX][s.PATH] = 'https://sb.rest.sh/api';
        environmentsMap[e.BETA][s.PATH] = 'https://b.rest.sh/api';

        return {
            //Your user ID
            uid : 'UID',

            //Your Private API Key
            secret : 'SECRET',

            //Your Public API Key
            key : 'KEY',

            /**
             * Current API environment
             * @type {string}
             */
            currentEnvironment: e.PRODUCTION,
    
            /**
             * Get base URI for a server in the current API environment
             * @param  {string|null} server Server name
             * @return {string}             Base URI for server
             */
            getBaseUri: function (server) {
                var url = environmentsMap[this.currentEnvironment][server || s.PATH];
                var urlParams = {
                    };
                return APIHelper.appendUrlWithTemplateParameters(url, urlParams);
            }
        };
    }

}(angular));

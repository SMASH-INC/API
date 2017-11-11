/**
  * SMASH
  *
  * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
  */

;(function (angular) {
'use strict';

angular.module('SMASH')
    .factory('Environments', [EnvironmentsModel]);

    function EnvironmentsModel() {
        return {
            //Production Enviroment
            PRODUCTION: 'Production',
    
            //Testing and Debugging
            SANDBOX: 'Sandbox',
    
            //Updated Nightly (May Contain Bugs)
            BETA: 'Beta'
        };
    }

}(angular));

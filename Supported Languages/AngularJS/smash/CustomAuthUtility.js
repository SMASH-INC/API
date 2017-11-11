/**
  *
  * SMASH
  *
  * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
  */

;(function (angular) {
'use strict';

angular.module('SMASH')
    .factory('CustomAuthUtility', ['Configuration',
        function(Configuration) {
            return {
                /**
                 * Appends the necessary OAuth credentials for making this authorized call
                 * @param	{dictionary} headers    The out going request to access the resource */
                appendCustomAuthParams:function(headers) {
                    // TODO: Add your custom authentication here
                    // The following properties are available to use
                    //     Configuration.uid
                    //     Configuration.secret
                    //     Configuration.key
                    // 
                    // ie. Add a header through:
                    //     headers["key"] = "value"

                }
            }
        }
    ]);

}(angular));

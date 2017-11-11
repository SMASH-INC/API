/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH;

import SMASH.http.request.HttpRequest;

public class CustomAuthUtility {
    /**
    * Appends the necessary Custom Authentication credentials for making this authorized call
    * @param request The out going request to access the resource
    */
    public static void appendCustomAuthParams(HttpRequest request) {
        // TODO: Add your custom authentication here
        // The following properties are available to use
        //     Configuration.uid
        //     Configuration.secret
        //     Configuration.key
        // 
        // ie. Add a header through:
        //     request.getHeaders().put("Key", "Value");
    }
}
/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import SMASH.models.*;

public class Configuration {

    //retains status whether we have already initialized
    private static boolean initialized = false;
    private static RequestQueue requestQueue = null;

    //Initialization of configuration
    public static void initialize(Context context){
        requestQueue = Volley.newRequestQueue(context);
    
        initialized = true;
    }

    // volley request queue needs to be initialized before use
    public static RequestQueue getRequestQueue() {
        if(!initialized)
            throw new IllegalStateException("Must initialize before accessing request queue");
        return requestQueue;
    }

    //Your user ID
    //TODO: Replace the uid with an appropriate value
    public static String uid = "UID";

    //Your Private API Key
    //TODO: Replace the secret with an appropriate value
    public static String secret = "SECRET";

    //Your Public API Key
    //TODO: Replace the key with an appropriate value
    public static String key = "KEY";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.PRODUCTION;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5142246493347341414L;
            {
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.PATH);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = 5719661105970206444L;
        {
            put(Environments.PRODUCTION , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5318291966481967754L;
                {
                    put(Servers.PATH, "https://api.rest.sh/api");
                }
            });
            put(Environments.SANDBOX , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5001121986155928814L;
                {
                    put(Servers.PATH, "https://sb.rest.sh/api");
                }
            });
            put(Environments.BETA , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 4951733445481736503L;
                {
                    put(Servers.PATH, "https://b.rest.sh/api");
                }
            });
        }
    };
}

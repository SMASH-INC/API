/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import SMASH.models.*;

public class Configuration {
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
            private static final long serialVersionUID = 5071494506715250020L;
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
        private static final long serialVersionUID = 5614052839493675282L;
        {
            put(Environments.PRODUCTION , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5332395877664770934L;
                {
                    put(Servers.PATH, "https://api.rest.sh/api");
                }
            });
            put(Environments.SANDBOX , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5023828545387181732L;
                {
                    put(Servers.PATH, "https://sb.rest.sh/api");
                }
            });
            put(Environments.BETA , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 4867601380639354902L;
                {
                    put(Servers.PATH, "https://b.rest.sh/api");
                }
            });
        }
    };
}

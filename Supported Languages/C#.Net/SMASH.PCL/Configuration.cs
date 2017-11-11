using System.Collections.Generic;
using System.Text;
using SMASH.SDK.Common;
using SMASH.Models;
namespace SMASH
{
    public partial class Configuration
    {

        public enum Environments
        {
            //Production Enviroment
            PRODUCTION,
            //Testing and Debugging
            SANDBOX,
            //Updated Nightly (May Contain Bugs)
            BETA,
        }
        public enum Servers
        {
            PATH,
        }

        //The current environment being used
        public static Environments Environment = Environments.PRODUCTION;

        //Your user ID
        //TODO: Replace the Uid with an appropriate value
        public static string Uid = "UID";

        //Your Private API Key
        //TODO: Replace the Secret with an appropriate value
        public static string Secret = "SECRET";

        //Your Public API Key
        //TODO: Replace the Key with an appropriate value
        public static string Key = "KEY";

        //A map of environments and their corresponding servers/baseurls
        public static Dictionary<Environments, Dictionary<Servers, string>> EnvironmentsMap =
            new Dictionary<Environments, Dictionary<Servers, string>>
            {
                { 
                    Environments.PRODUCTION,new Dictionary<Servers, string>
                    {
                        { Servers.PATH,"https://api.rest.sh/api" },
                    }
                },
                { 
                    Environments.SANDBOX,new Dictionary<Servers, string>
                    {
                        { Servers.PATH,"https://sb.rest.sh/api" },
                    }
                },
                { 
                    Environments.BETA,new Dictionary<Servers, string>
                    {
                        { Servers.PATH,"https://b.rest.sh/api" },
                    }
                },
            };

        /// <summary>
        /// Makes a list of the BaseURL parameters 
        /// </summary>
        /// <return>Returns the parameters list</return>
        internal static List<KeyValuePair<string, object>> GetBaseURIParameters()
        {
            List<KeyValuePair<string, object>> kvpList = new List<KeyValuePair<string, object>>()
            {
            };
            return kvpList; 
        }

        /// <summary>
        /// Gets the URL for a particular alias in the current environment and appends it with template parameters
        /// </summary>
        /// <param name="alias">Default value:PATH</param>
        /// <return>Returns the baseurl</return>
        internal static string GetBaseURI(Servers alias = Servers.PATH)
        {
            StringBuilder Url =  new StringBuilder(EnvironmentsMap[Environment][alias]);
            APIHelper.AppendUrlWithTemplateParameters(Url, GetBaseURIParameters());
            return Url.ToString();        
        }
    }
}
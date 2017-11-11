/*
 * SMASH.PCL
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SMASH.SDK.Common;


namespace SMASH.Models
{
    public class VerifyAddress : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string key;
        private string uid;
        private string user;
        private string address;
        private string a;
        private string sa;
        private string c;
        private string s;
        private string z;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("key")]
        public string Key 
        { 
            get 
            {
                return this.key; 
            } 
            set 
            {
                this.key = value;
                onPropertyChanged("Key");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("uid")]
        public string Uid 
        { 
            get 
            {
                return this.uid; 
            } 
            set 
            {
                this.uid = value;
                onPropertyChanged("Uid");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("user")]
        public string User 
        { 
            get 
            {
                return this.user; 
            } 
            set 
            {
                this.user = value;
                onPropertyChanged("User");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("address")]
        public string Address 
        { 
            get 
            {
                return this.address; 
            } 
            set 
            {
                this.address = value;
                onPropertyChanged("Address");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("a")]
        public string A 
        { 
            get 
            {
                return this.a; 
            } 
            set 
            {
                this.a = value;
                onPropertyChanged("A");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("sa")]
        public string Sa 
        { 
            get 
            {
                return this.sa; 
            } 
            set 
            {
                this.sa = value;
                onPropertyChanged("Sa");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("c")]
        public string C 
        { 
            get 
            {
                return this.c; 
            } 
            set 
            {
                this.c = value;
                onPropertyChanged("C");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("s")]
        public string S 
        { 
            get 
            {
                return this.s; 
            } 
            set 
            {
                this.s = value;
                onPropertyChanged("S");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("z")]
        public string Z 
        { 
            get 
            {
                return this.z; 
            } 
            set 
            {
                this.z = value;
                onPropertyChanged("Z");
            }
        }
    }
} 
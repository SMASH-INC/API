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
    public class HostingModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string key;
        private string uid;
        private string app;
        private string domain;

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
        [JsonProperty("app")]
        public string App 
        { 
            get 
            {
                return this.app; 
            } 
            set 
            {
                this.app = value;
                onPropertyChanged("App");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("domain")]
        public string Domain 
        { 
            get 
            {
                return this.domain; 
            } 
            set 
            {
                this.domain = value;
                onPropertyChanged("Domain");
            }
        }
    }
} 
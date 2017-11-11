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
    public class LoggingConfigurationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string name;
        private string origin;
        private string activate;

        /// <summary>
        /// Name of the WAF zone
        /// </summary>
        [JsonProperty("name")]
        public string Name 
        { 
            get 
            {
                return this.name; 
            } 
            set 
            {
                this.name = value;
                onPropertyChanged("Name");
            }
        }

        /// <summary>
        /// IP Address of the Web Application you wish to configure logging on
        /// </summary>
        [JsonProperty("origin")]
        public string Origin 
        { 
            get 
            {
                return this.origin; 
            } 
            set 
            {
                this.origin = value;
                onPropertyChanged("Origin");
            }
        }

        /// <summary>
        /// Activate or Disable
        /// </summary>
        [JsonProperty("activate")]
        public string Activate 
        { 
            get 
            {
                return this.activate; 
            } 
            set 
            {
                this.activate = value;
                onPropertyChanged("Activate");
            }
        }
    }
} 
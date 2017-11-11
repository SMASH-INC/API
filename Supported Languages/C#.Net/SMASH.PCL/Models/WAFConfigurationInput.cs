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
    public class WAFConfigurationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string name;
        private string rule;

        /// <summary>
        /// Name of your WAF zone
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
        /// Rule or rules to add or update separated by a comma
        /// </summary>
        [JsonProperty("rule")]
        public string Rule 
        { 
            get 
            {
                return this.rule; 
            } 
            set 
            {
                this.rule = value;
                onPropertyChanged("Rule");
            }
        }
    }
} 
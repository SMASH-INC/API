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
    public class LoggingInfoInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string name;
        private string origin;
        private string time;

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
        /// IP Address of the Web Application
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
        /// Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01])
        /// </summary>
        [JsonProperty("time")]
        public string Time 
        { 
            get 
            {
                return this.time; 
            } 
            set 
            {
                this.time = value;
                onPropertyChanged("Time");
            }
        }
    }
} 
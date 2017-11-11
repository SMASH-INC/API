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
    public class WAFCreationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string origin;
        private string cname;

        /// <summary>
        /// IP of the Web server you wish to protect
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
        /// Domain or domain names separated by a comma you wish to allow CNAME access
        /// </summary>
        [JsonProperty("cname")]
        public string Cname 
        { 
            get 
            {
                return this.cname; 
            } 
            set 
            {
                this.cname = value;
                onPropertyChanged("Cname");
            }
        }
    }
} 
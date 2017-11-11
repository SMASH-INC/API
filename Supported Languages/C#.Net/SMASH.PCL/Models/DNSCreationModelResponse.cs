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
    public class DNSCreationModelResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string domain;
        private Models.NameserversModel nameservers;

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

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("nameservers")]
        public Models.NameserversModel Nameservers 
        { 
            get 
            {
                return this.nameservers; 
            } 
            set 
            {
                this.nameservers = value;
                onPropertyChanged("Nameservers");
            }
        }
    }
} 
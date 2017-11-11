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
    public class NameserversModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string ns1;
        private string ns2;
        private string ns3;
        private string ns4;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("ns1")]
        public string Ns1 
        { 
            get 
            {
                return this.ns1; 
            } 
            set 
            {
                this.ns1 = value;
                onPropertyChanged("Ns1");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("ns2")]
        public string Ns2 
        { 
            get 
            {
                return this.ns2; 
            } 
            set 
            {
                this.ns2 = value;
                onPropertyChanged("Ns2");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("ns3")]
        public string Ns3 
        { 
            get 
            {
                return this.ns3; 
            } 
            set 
            {
                this.ns3 = value;
                onPropertyChanged("Ns3");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("ns4")]
        public string Ns4 
        { 
            get 
            {
                return this.ns4; 
            } 
            set 
            {
                this.ns4 = value;
                onPropertyChanged("Ns4");
            }
        }
    }
} 
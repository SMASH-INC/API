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
    public class VerifyAddressResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string request;
        private string active;
        private string id;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("request")]
        public string Request 
        { 
            get 
            {
                return this.request; 
            } 
            set 
            {
                this.request = value;
                onPropertyChanged("Request");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("active")]
        public string Active 
        { 
            get 
            {
                return this.active; 
            } 
            set 
            {
                this.active = value;
                onPropertyChanged("Active");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("id")]
        public string Id 
        { 
            get 
            {
                return this.id; 
            } 
            set 
            {
                this.id = value;
                onPropertyChanged("Id");
            }
        }
    }
} 
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
    public class VerifyModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string key;
        private string uid;
        private string to;

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
        [JsonProperty("to")]
        public string To 
        { 
            get 
            {
                return this.to; 
            } 
            set 
            {
                this.to = value;
                onPropertyChanged("To");
            }
        }
    }
} 
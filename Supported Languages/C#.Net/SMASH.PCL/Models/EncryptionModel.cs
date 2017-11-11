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
    public class EncryptionModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string key;
        private string uid;
        private string data;
        private string file;
        private string method;
        private string bit;

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
        [JsonProperty("data")]
        public string Data 
        { 
            get 
            {
                return this.data; 
            } 
            set 
            {
                this.data = value;
                onPropertyChanged("Data");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("file")]
        public string File 
        { 
            get 
            {
                return this.file; 
            } 
            set 
            {
                this.file = value;
                onPropertyChanged("File");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("method")]
        public string Method 
        { 
            get 
            {
                return this.method; 
            } 
            set 
            {
                this.method = value;
                onPropertyChanged("Method");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("bit")]
        public string Bit 
        { 
            get 
            {
                return this.bit; 
            } 
            set 
            {
                this.bit = value;
                onPropertyChanged("Bit");
            }
        }
    }
} 
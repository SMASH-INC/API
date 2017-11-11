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
    public class EncryptionModelResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string data;
        private string file;
        private string success;
        private string mpublic;
        private string mprivate;

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
        [JsonProperty("success")]
        public string Success 
        { 
            get 
            {
                return this.success; 
            } 
            set 
            {
                this.success = value;
                onPropertyChanged("Success");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("public")]
        public string Public 
        { 
            get 
            {
                return this.mpublic; 
            } 
            set 
            {
                this.mpublic = value;
                onPropertyChanged("Public");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("private")]
        public string Private 
        { 
            get 
            {
                return this.mprivate; 
            } 
            set 
            {
                this.mprivate = value;
                onPropertyChanged("Private");
            }
        }
    }
} 
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
    public class DataManipulationModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string key;
        private string uid;
        private string user;
        private string apiuid;
        private string url;
        private string manipulation;
        private string conversion;
        private string sorting;
        private string compression;

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
        [JsonProperty("user")]
        public string User 
        { 
            get 
            {
                return this.user; 
            } 
            set 
            {
                this.user = value;
                onPropertyChanged("User");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("apiuid")]
        public string Apiuid 
        { 
            get 
            {
                return this.apiuid; 
            } 
            set 
            {
                this.apiuid = value;
                onPropertyChanged("Apiuid");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("url")]
        public string Url 
        { 
            get 
            {
                return this.url; 
            } 
            set 
            {
                this.url = value;
                onPropertyChanged("Url");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("manipulation")]
        public string Manipulation 
        { 
            get 
            {
                return this.manipulation; 
            } 
            set 
            {
                this.manipulation = value;
                onPropertyChanged("Manipulation");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("conversion")]
        public string Conversion 
        { 
            get 
            {
                return this.conversion; 
            } 
            set 
            {
                this.conversion = value;
                onPropertyChanged("Conversion");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("sorting")]
        public string Sorting 
        { 
            get 
            {
                return this.sorting; 
            } 
            set 
            {
                this.sorting = value;
                onPropertyChanged("Sorting");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("compression")]
        public string Compression 
        { 
            get 
            {
                return this.compression; 
            } 
            set 
            {
                this.compression = value;
                onPropertyChanged("Compression");
            }
        }
    }
} 
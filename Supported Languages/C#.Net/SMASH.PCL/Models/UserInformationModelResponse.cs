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
    public class UserInformationModelResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string user;
        private string key;
        private string api;
        private Models.UserInformationSecondaryModel info;

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
        /// Users API Private Key
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
        /// Users API Public Key
        /// </summary>
        [JsonProperty("api")]
        public string Api 
        { 
            get 
            {
                return this.api; 
            } 
            set 
            {
                this.api = value;
                onPropertyChanged("Api");
            }
        }

        /// <summary>
        /// Users Profile Information
        /// </summary>
        [JsonProperty("info")]
        public Models.UserInformationSecondaryModel Info 
        { 
            get 
            {
                return this.info; 
            } 
            set 
            {
                this.info = value;
                onPropertyChanged("Info");
            }
        }
    }
} 
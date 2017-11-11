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
    public class UpdateUserInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string user;
        private string avatar;
        private string customInput;

        /// <summary>
        /// Users UID, Username, Or Email
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
        /// Avatar Image URL
        /// </summary>
        [JsonProperty("avatar")]
        public string Avatar 
        { 
            get 
            {
                return this.avatar; 
            } 
            set 
            {
                this.avatar = value;
                onPropertyChanged("Avatar");
            }
        }

        /// <summary>
        /// Custom input variable for users profile
        /// </summary>
        [JsonProperty("custom input")]
        public string CustomInput 
        { 
            get 
            {
                return this.customInput; 
            } 
            set 
            {
                this.customInput = value;
                onPropertyChanged("CustomInput");
            }
        }
    }
} 
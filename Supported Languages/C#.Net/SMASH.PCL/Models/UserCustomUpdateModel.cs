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
    public class UserCustomUpdateModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string uid;
        private string apiuid;
        private string avatar;
        private string customInput;

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
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("custom-input")]
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
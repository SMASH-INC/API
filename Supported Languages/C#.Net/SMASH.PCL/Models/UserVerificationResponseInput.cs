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
    public class UserVerificationResponseInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string user;
        private string code;

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
        /// Verification code entered by the user
        /// </summary>
        [JsonProperty("code")]
        public string Code 
        { 
            get 
            {
                return this.code; 
            } 
            set 
            {
                this.code = value;
                onPropertyChanged("Code");
            }
        }
    }
} 
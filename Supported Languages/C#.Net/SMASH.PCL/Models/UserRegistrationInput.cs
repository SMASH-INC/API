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
    public class UserRegistrationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string email;
        private string user;
        private string password;
        private string name;
        private int? phone;
        private int? countrycode;
        private string address;

        /// <summary>
        /// Users Email
        /// </summary>
        [JsonProperty("email")]
        public string Email 
        { 
            get 
            {
                return this.email; 
            } 
            set 
            {
                this.email = value;
                onPropertyChanged("Email");
            }
        }

        /// <summary>
        /// Users Username
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
        /// Users Password
        /// </summary>
        [JsonProperty("password")]
        public string Password 
        { 
            get 
            {
                return this.password; 
            } 
            set 
            {
                this.password = value;
                onPropertyChanged("Password");
            }
        }

        /// <summary>
        /// Users Name
        /// </summary>
        [JsonProperty("name")]
        public string Name 
        { 
            get 
            {
                return this.name; 
            } 
            set 
            {
                this.name = value;
                onPropertyChanged("Name");
            }
        }

        /// <summary>
        /// Users Cellphone Number
        /// </summary>
        [JsonProperty("phone")]
        public int? Phone 
        { 
            get 
            {
                return this.phone; 
            } 
            set 
            {
                this.phone = value;
                onPropertyChanged("Phone");
            }
        }

        /// <summary>
        /// Users Country Code (US = 1)
        /// </summary>
        [JsonProperty("countrycode")]
        public int? Countrycode 
        { 
            get 
            {
                return this.countrycode; 
            } 
            set 
            {
                this.countrycode = value;
                onPropertyChanged("Countrycode");
            }
        }

        /// <summary>
        /// Users Address
        /// </summary>
        [JsonProperty("address")]
        public string Address 
        { 
            get 
            {
                return this.address; 
            } 
            set 
            {
                this.address = value;
                onPropertyChanged("Address");
            }
        }
    }
} 
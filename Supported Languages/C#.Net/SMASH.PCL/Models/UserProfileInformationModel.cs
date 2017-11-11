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
    public class UserProfileInformationModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string uid;
        private string apiuid;
        private string realname;
        private string displayname;
        private string email;
        private string address;
        private string phone;

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
        [JsonProperty("realname")]
        public string Realname 
        { 
            get 
            {
                return this.realname; 
            } 
            set 
            {
                this.realname = value;
                onPropertyChanged("Realname");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("displayname")]
        public string Displayname 
        { 
            get 
            {
                return this.displayname; 
            } 
            set 
            {
                this.displayname = value;
                onPropertyChanged("Displayname");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
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
        /// TODO: Write general description for this method
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

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("phone")]
        public string Phone 
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
    }
} 
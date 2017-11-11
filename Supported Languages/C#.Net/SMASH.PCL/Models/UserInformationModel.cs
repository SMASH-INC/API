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
    public class UserInformationModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string realname;
        private string displayname;
        private string avatar;
        private string email;
        private string address;
        private string address1;
        private string address2;
        private string city;
        private string state;
        private string zipcode;
        private string phone;
        private string lastlogin;
        private string ip;
        private string m2fa;
        private string iplock;

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
        [JsonProperty("address1")]
        public string Address1 
        { 
            get 
            {
                return this.address1; 
            } 
            set 
            {
                this.address1 = value;
                onPropertyChanged("Address1");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("address2")]
        public string Address2 
        { 
            get 
            {
                return this.address2; 
            } 
            set 
            {
                this.address2 = value;
                onPropertyChanged("Address2");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("city")]
        public string City 
        { 
            get 
            {
                return this.city; 
            } 
            set 
            {
                this.city = value;
                onPropertyChanged("City");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("state")]
        public string State 
        { 
            get 
            {
                return this.state; 
            } 
            set 
            {
                this.state = value;
                onPropertyChanged("State");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("zipcode")]
        public string Zipcode 
        { 
            get 
            {
                return this.zipcode; 
            } 
            set 
            {
                this.zipcode = value;
                onPropertyChanged("Zipcode");
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

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("lastlogin")]
        public string Lastlogin 
        { 
            get 
            {
                return this.lastlogin; 
            } 
            set 
            {
                this.lastlogin = value;
                onPropertyChanged("Lastlogin");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("ip")]
        public string Ip 
        { 
            get 
            {
                return this.ip; 
            } 
            set 
            {
                this.ip = value;
                onPropertyChanged("Ip");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("2fa")]
        public string M2fa 
        { 
            get 
            {
                return this.m2fa; 
            } 
            set 
            {
                this.m2fa = value;
                onPropertyChanged("M2fa");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("iplock")]
        public string Iplock 
        { 
            get 
            {
                return this.iplock; 
            } 
            set 
            {
                this.iplock = value;
                onPropertyChanged("Iplock");
            }
        }
    }
} 
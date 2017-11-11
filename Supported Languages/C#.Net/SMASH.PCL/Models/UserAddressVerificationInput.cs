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
    public class UserAddressVerificationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string user;
        private string a;
        private string sa;
        private string c;
        private string s;
        private int z;
        private string address;

        /// <summary>
        /// Users UID, Username, or Email
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
        /// Address Line One
        /// </summary>
        [JsonProperty("a")]
        public string A 
        { 
            get 
            {
                return this.a; 
            } 
            set 
            {
                this.a = value;
                onPropertyChanged("A");
            }
        }

        /// <summary>
        /// Address Line Two
        /// </summary>
        [JsonProperty("sa")]
        public string Sa 
        { 
            get 
            {
                return this.sa; 
            } 
            set 
            {
                this.sa = value;
                onPropertyChanged("Sa");
            }
        }

        /// <summary>
        /// Address City
        /// </summary>
        [JsonProperty("c")]
        public string C 
        { 
            get 
            {
                return this.c; 
            } 
            set 
            {
                this.c = value;
                onPropertyChanged("C");
            }
        }

        /// <summary>
        /// Address State or Province
        /// </summary>
        [JsonProperty("s")]
        public string S 
        { 
            get 
            {
                return this.s; 
            } 
            set 
            {
                this.s = value;
                onPropertyChanged("S");
            }
        }

        /// <summary>
        /// Address Zipcode
        /// </summary>
        [JsonProperty("z")]
        public int Z 
        { 
            get 
            {
                return this.z; 
            } 
            set 
            {
                this.z = value;
                onPropertyChanged("Z");
            }
        }

        /// <summary>
        /// Address as a one line input separated by commas
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
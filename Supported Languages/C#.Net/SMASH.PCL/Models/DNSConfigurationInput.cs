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
    public class DNSConfigurationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string domain;
        private string records;

        /// <summary>
        /// Domain or domain names separated by a comma
        /// </summary>
        [JsonProperty("domain")]
        public string Domain 
        { 
            get 
            {
                return this.domain; 
            } 
            set 
            {
                this.domain = value;
                onPropertyChanged("Domain");
            }
        }

        /// <summary>
        /// Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com)
        /// </summary>
        [JsonProperty("records")]
        public string Records 
        { 
            get 
            {
                return this.records; 
            } 
            set 
            {
                this.records = value;
                onPropertyChanged("Records");
            }
        }
    }
} 
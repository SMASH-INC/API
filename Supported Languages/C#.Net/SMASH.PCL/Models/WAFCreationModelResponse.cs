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
    public class WAFCreationModelResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string success;
        private string cname;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("success")]
        public string Success 
        { 
            get 
            {
                return this.success; 
            } 
            set 
            {
                this.success = value;
                onPropertyChanged("Success");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("cname")]
        public string Cname 
        { 
            get 
            {
                return this.cname; 
            } 
            set 
            {
                this.cname = value;
                onPropertyChanged("Cname");
            }
        }
    }
} 
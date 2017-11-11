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
    public class HostingSetupInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string app;
        private string domain;

        /// <summary>
        /// GIT URL or ZIP package containing your APP
        /// </summary>
        [JsonProperty("app")]
        public string App 
        { 
            get 
            {
                return this.app; 
            } 
            set 
            {
                this.app = value;
                onPropertyChanged("App");
            }
        }

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
    }
} 
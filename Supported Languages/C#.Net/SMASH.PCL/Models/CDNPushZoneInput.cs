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
    public class CDNPushZoneInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string cname;
        private string file;

        /// <summary>
        /// Domain or domain names separated by a comma you wish to allow CNAME access
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

        /// <summary>
        /// GIT URL, file URL, or direct upload of file
        /// </summary>
        [JsonProperty("file")]
        public string File 
        { 
            get 
            {
                return this.file; 
            } 
            set 
            {
                this.file = value;
                onPropertyChanged("File");
            }
        }
    }
} 
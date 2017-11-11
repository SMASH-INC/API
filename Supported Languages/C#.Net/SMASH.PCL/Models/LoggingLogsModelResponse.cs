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
    public class LoggingLogsModelResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private Models.LogModel log;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("log")]
        public Models.LogModel Log 
        { 
            get 
            {
                return this.log; 
            } 
            set 
            {
                this.log = value;
                onPropertyChanged("Log");
            }
        }
    }
} 
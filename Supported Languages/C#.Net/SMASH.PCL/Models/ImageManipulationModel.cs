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
    public class ImageManipulationModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string key;
        private string uid;
        private string image;
        private string transform;
        private string moderate;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("key")]
        public string Key 
        { 
            get 
            {
                return this.key; 
            } 
            set 
            {
                this.key = value;
                onPropertyChanged("Key");
            }
        }

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
        [JsonProperty("image")]
        public string Image 
        { 
            get 
            {
                return this.image; 
            } 
            set 
            {
                this.image = value;
                onPropertyChanged("Image");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("transform")]
        public string Transform 
        { 
            get 
            {
                return this.transform; 
            } 
            set 
            {
                this.transform = value;
                onPropertyChanged("Transform");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("moderate")]
        public string Moderate 
        { 
            get 
            {
                return this.moderate; 
            } 
            set 
            {
                this.moderate = value;
                onPropertyChanged("Moderate");
            }
        }
    }
} 
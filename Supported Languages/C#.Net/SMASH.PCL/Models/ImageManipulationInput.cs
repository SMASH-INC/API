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
    public class ImageManipulationInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string image;
        private string transform;

        /// <summary>
        /// Image URL or direct upload
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
        /// Transformations to perform
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
    }
} 
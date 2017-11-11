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
    public class LogModel : BaseModel 
    {
        // These fields hold the values for the public properties.
        private Models.MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSX;
        private Models.MMDDYYYYHHMMSSModel mMDDYYYYHHMMSSY;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("MMDDYYYYHHMMSSX")]
        public Models.MMDDYYYYHHMMSSModel MMDDYYYYHHMMSSX 
        { 
            get 
            {
                return this.mMDDYYYYHHMMSSX; 
            } 
            set 
            {
                this.mMDDYYYYHHMMSSX = value;
                onPropertyChanged("MMDDYYYYHHMMSSX");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("MMDDYYYYHHMMSSY")]
        public Models.MMDDYYYYHHMMSSModel MMDDYYYYHHMMSSY 
        { 
            get 
            {
                return this.mMDDYYYYHHMMSSY; 
            } 
            set 
            {
                this.mMDDYYYYHHMMSSY = value;
                onPropertyChanged("MMDDYYYYHHMMSSY");
            }
        }
    }
} 
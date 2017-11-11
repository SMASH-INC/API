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
    public class DataAndFileEncryptionInput : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string data;
        private string method;
        private int bit;

        /// <summary>
        /// GIT URL, file URL, direct upload of file, or data as a query string
        /// </summary>
        [JsonProperty("data")]
        public string Data 
        { 
            get 
            {
                return this.data; 
            } 
            set 
            {
                this.data = value;
                onPropertyChanged("Data");
            }
        }

        /// <summary>
        /// Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP)
        /// </summary>
        [JsonProperty("method")]
        public string Method 
        { 
            get 
            {
                return this.method; 
            } 
            set 
            {
                this.method = value;
                onPropertyChanged("Method");
            }
        }

        /// <summary>
        /// Encryption key size (4096)
        /// </summary>
        [JsonProperty("bit")]
        public int Bit 
        { 
            get 
            {
                return this.bit; 
            } 
            set 
            {
                this.bit = value;
                onPropertyChanged("Bit");
            }
        }
    }
} 
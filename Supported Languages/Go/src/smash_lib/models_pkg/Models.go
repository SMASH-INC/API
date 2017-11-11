/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package models_pkg


/*
 * Structure for the custom type MMDDYYYYHHMMSSModel
 */
type MMDDYYYYHHMMSSModel struct {
    Data            DataModel       `json:"data" form:"data"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type LoggingLogsModelResponse
 */
type LoggingLogsModelResponse struct {
    Log             LogModel        `json:"log" form:"log"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type LoggingSetupModelResponse
 */
type LoggingSetupModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DataManipulationModel
 */
type DataManipulationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
    Url             string          `json:"url" form:"url"` //TODO: Write general description for this field
    Manipulation    string          `json:"manipulation" form:"manipulation"` //TODO: Write general description for this field
    Conversion      string          `json:"conversion" form:"conversion"` //TODO: Write general description for this field
    Sorting         string          `json:"sorting" form:"sorting"` //TODO: Write general description for this field
    Compression     string          `json:"compression" form:"compression"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type VerifyAddress
 */
type VerifyAddress struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Address         string          `json:"address" form:"address"` //TODO: Write general description for this field
    A               string          `json:"a" form:"a"` //TODO: Write general description for this field
    Sa              string          `json:"sa" form:"sa"` //TODO: Write general description for this field
    C               string          `json:"c" form:"c"` //TODO: Write general description for this field
    S               string          `json:"s" form:"s"` //TODO: Write general description for this field
    Z               string          `json:"z" form:"z"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserInformationModel
 */
type UserInformationModel struct {
    Realname        string          `json:"realname" form:"realname"` //TODO: Write general description for this field
    Displayname     string          `json:"displayname" form:"displayname"` //TODO: Write general description for this field
    Avatar          string          `json:"avatar" form:"avatar"` //TODO: Write general description for this field
    Email           string          `json:"email" form:"email"` //TODO: Write general description for this field
    Address         string          `json:"address" form:"address"` //TODO: Write general description for this field
    Address1        string          `json:"address1" form:"address1"` //TODO: Write general description for this field
    Address2        string          `json:"address2" form:"address2"` //TODO: Write general description for this field
    City            string          `json:"city" form:"city"` //TODO: Write general description for this field
    State           string          `json:"state" form:"state"` //TODO: Write general description for this field
    Zipcode         string          `json:"zipcode" form:"zipcode"` //TODO: Write general description for this field
    Phone           string          `json:"phone" form:"phone"` //TODO: Write general description for this field
    Lastlogin       string          `json:"lastlogin" form:"lastlogin"` //TODO: Write general description for this field
    Ip              string          `json:"ip" form:"ip"` //TODO: Write general description for this field
    M2fa            string          `json:"2fa" form:"2fa"` //TODO: Write general description for this field
    Iplock          string          `json:"iplock" form:"iplock"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserUpdateModel
 */
type UserUpdateModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
    Oldpassword     string          `json:"oldpassword" form:"oldpassword"` //TODO: Write general description for this field
    Newpassword     string          `json:"newpassword" form:"newpassword"` //TODO: Write general description for this field
    Name            string          `json:"name" form:"name"` //TODO: Write general description for this field
    Email           string          `json:"email" form:"email"` //TODO: Write general description for this field
    Phone           string          `json:"phone" form:"phone"` //TODO: Write general description for this field
    Avatar          string          `json:"avatar" form:"avatar"` //TODO: Write general description for this field
    Countrycode     string          `json:"countrycode" form:"countrycode"` //TODO: Write general description for this field
    Address         string          `json:"address" form:"address"` //TODO: Write general description for this field
    A               string          `json:"a" form:"a"` //TODO: Write general description for this field
    Sa              string          `json:"sa" form:"sa"` //TODO: Write general description for this field
    C               string          `json:"c" form:"c"` //TODO: Write general description for this field
    S               string          `json:"s" form:"s"` //TODO: Write general description for this field
    Z               string          `json:"z" form:"z"` //TODO: Write general description for this field
    CustomInput     string          `json:"custom-input" form:"custom-input"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserRegistrationModel
 */
type UserRegistrationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Password        string          `json:"password" form:"password"` //TODO: Write general description for this field
    Name            string          `json:"name" form:"name"` //TODO: Write general description for this field
    Email           string          `json:"email" form:"email"` //TODO: Write general description for this field
    Phone           string          `json:"phone" form:"phone"` //TODO: Write general description for this field
    Countrycode     string          `json:"countrycode" form:"countrycode"` //TODO: Write general description for this field
    Address         string          `json:"address" form:"address"` //TODO: Write general description for this field
    A               string          `json:"a" form:"a"` //TODO: Write general description for this field
    Sa              string          `json:"sa" form:"sa"` //TODO: Write general description for this field
    C               string          `json:"c" form:"c"` //TODO: Write general description for this field
    S               string          `json:"s" form:"s"` //TODO: Write general description for this field
    Z               string          `json:"z" form:"z"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type InfoModel
 */
type InfoModel struct {
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
    Realname        string          `json:"realname" form:"realname"` //TODO: Write general description for this field
    Displayname     string          `json:"displayname" form:"displayname"` //TODO: Write general description for this field
    Avatar          string          `json:"avatar" form:"avatar"` //TODO: Write general description for this field
    Email           string          `json:"email" form:"email"` //TODO: Write general description for this field
    Address         string          `json:"address" form:"address"` //TODO: Write general description for this field
    Phone           string          `json:"phone" form:"phone"` //TODO: Write general description for this field
    Lastlogin       string          `json:"lastlogin" form:"lastlogin"` //TODO: Write general description for this field
    Ip              string          `json:"ip" form:"ip"` //TODO: Write general description for this field
    M2fa            string          `json:"2fa" form:"2fa"` //TODO: Write general description for this field
    Iplock          string          `json:"iplock" form:"iplock"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type LoggingLogsModel
 */
type LoggingLogsModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Name            string          `json:"name" form:"name"` //TODO: Write general description for this field
    Origin          string          `json:"origin" form:"origin"` //TODO: Write general description for this field
    Time            string          `json:"time" form:"time"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type LoggingSetupModel
 */
type LoggingSetupModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Name            string          `json:"name" form:"name"` //TODO: Write general description for this field
    Origin          string          `json:"origin" form:"origin"` //TODO: Write general description for this field
    Activate        string          `json:"activate" form:"activate"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type WAFConfigurationModel
 */
type WAFConfigurationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Name            string          `json:"name" form:"name"` //TODO: Write general description for this field
    Origin          string          `json:"origin" form:"origin"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type WAFCreationModel
 */
type WAFCreationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Origin          string          `json:"origin" form:"origin"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type EncryptionModelResponse
 */
type EncryptionModelResponse struct {
    Data            string          `json:"data" form:"data"` //TODO: Write general description for this field
    File            string          `json:"file" form:"file"` //TODO: Write general description for this field
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Public          string          `json:"public" form:"public"` //TODO: Write general description for this field
    Private         string          `json:"private" form:"private"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type EncryptionModel
 */
type EncryptionModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Data            string          `json:"data" form:"data"` //TODO: Write general description for this field
    File            string          `json:"file" form:"file"` //TODO: Write general description for this field
    Method          string          `json:"method" form:"method"` //TODO: Write general description for this field
    Bit             string          `json:"bit" form:"bit"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type CDNPushModel
 */
type CDNPushModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
    File            string          `json:"file" form:"file"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type CDNPullModel
 */
type CDNPullModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Origin          string          `json:"origin" form:"origin"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DNSConfigurationModel
 */
type DNSConfigurationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Domain          string          `json:"domain" form:"domain"` //TODO: Write general description for this field
    Records         string          `json:"records" form:"records"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type NameserversModel
 */
type NameserversModel struct {
    Ns1             string          `json:"ns1" form:"ns1"` //TODO: Write general description for this field
    Ns2             string          `json:"ns2" form:"ns2"` //TODO: Write general description for this field
    Ns3             string          `json:"ns3" form:"ns3"` //TODO: Write general description for this field
    Ns4             string          `json:"ns4" form:"ns4"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type HostingModelResponse
 */
type HostingModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Url             string          `json:"url" form:"url"` //TODO: Write general description for this field
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type HostingModel
 */
type HostingModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    App             string          `json:"app" form:"app"` //TODO: Write general description for this field
    Domain          string          `json:"domain" form:"domain"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DataManipulationModelResponse
 */
type DataManipulationModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Url             string          `json:"url" form:"url"` //TODO: Write general description for this field
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type ImageManipulationModelResponse
 */
type ImageManipulationModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Url             string          `json:"url" form:"url"` //TODO: Write general description for this field
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Moderated       string          `json:"moderated" form:"moderated"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type ImageManipulationModel
 */
type ImageManipulationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Image           string          `json:"image" form:"image"` //TODO: Write general description for this field
    Transform       string          `json:"transform" form:"transform"` //TODO: Write general description for this field
    Moderate        string          `json:"moderate" form:"moderate"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type TwoFactorAuthenticationTokenModel
 */
type TwoFactorAuthenticationTokenModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Code            string          `json:"code" form:"code"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type TwoFactorAuthenticationModel
 */
type TwoFactorAuthenticationModel struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    To              string          `json:"to" form:"to"` //TODO: Write general description for this field
    Verified        string          `json:"verified" form:"verified"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type VerifyUserModel
 */
type VerifyUserModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Code            string          `json:"code" form:"code"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type VerifyModelResponse
 */
type VerifyModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    To              string          `json:"to" form:"to"` //TODO: Write general description for this field
    Verified        string          `json:"verified" form:"verified"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserDeletionModel
 */
type UserDeletionModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserInformationModelResponse
 */
type UserInformationModelResponse struct {
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Key             string          `json:"key" form:"key"` //Users API Private Key
    Api             string          `json:"api" form:"api"` //Users API Public Key
    Info            UserInformationSecondaryModel `json:"info" form:"info"` //Users Profile Information
}

/*
 * Structure for the custom type UserInformationSecondaryModel
 */
type UserInformationSecondaryModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserCustomUpdateModel
 */
type UserCustomUpdateModel struct {
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
    Avatar          string          `json:"avatar" form:"avatar"` //TODO: Write general description for this field
    CustomInput     string          `json:"custom-input" form:"custom-input"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserUpdateModelResponse
 */
type UserUpdateModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Updated         string          `json:"updated" form:"updated"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
    Info            UserCustomUpdateModel `json:"info" form:"info"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserProfileInformationModel
 */
type UserProfileInformationModel struct {
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Apiuid          string          `json:"apiuid" form:"apiuid"` //TODO: Write general description for this field
    Realname        string          `json:"realname" form:"realname"` //TODO: Write general description for this field
    Displayname     string          `json:"displayname" form:"displayname"` //TODO: Write general description for this field
    Email           string          `json:"email" form:"email"` //TODO: Write general description for this field
    Address         string          `json:"address" form:"address"` //TODO: Write general description for this field
    Phone           string          `json:"phone" form:"phone"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserRegistrationModelResponse
 */
type UserRegistrationModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Active          string          `json:"active" form:"active"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
    Info            UserProfileInformationModel `json:"info" form:"info"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserAuthenticationModelResponse
 */
type UserAuthenticationModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Valid           string          `json:"valid" form:"valid"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
    Info            InfoModel       `json:"info" form:"info"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserAuthenticationModel
 */
type UserAuthenticationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    User            string          `json:"user" form:"user"` //TODO: Write general description for this field
    Password        string          `json:"password" form:"password"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DataModel
 */
type DataModel struct {
    Result          string          `json:"result" form:"result"` //TODO: Write general description for this field
    Content         string          `json:"content" form:"content"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type LogModel
 */
type LogModel struct {
    MMDDYYYYHHMMSSX MMDDYYYYHHMMSSModel `json:"MMDDYYYYHHMMSSX" form:"MMDDYYYYHHMMSSX"` //TODO: Write general description for this field
    MMDDYYYYHHMMSSY MMDDYYYYHHMMSSModel `json:"MMDDYYYYHHMMSSY" form:"MMDDYYYYHHMMSSY"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type WAFConfigurationModelResponse
 */
type WAFConfigurationModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Rule            string          `json:"rule" form:"rule"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type WAFCreationModelResponse
 */
type WAFCreationModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type CodeProtectionModelResponse
 */
type CodeProtectionModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    App             string          `json:"app" form:"app"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type CodeProtectionModel
 */
type CodeProtectionModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    App             string          `json:"app" form:"app"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type CDNPushModelResponse
 */
type CDNPushModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Upload          string          `json:"upload" form:"upload"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type CDNPullModelResponse
 */
type CDNPullModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Cname           string          `json:"cname" form:"cname"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DNSConfigurationModelResponse
 */
type DNSConfigurationModelResponse struct {
    Success         string          `json:"success" form:"success"` //TODO: Write general description for this field
    Domain          string          `json:"domain" form:"domain"` //TODO: Write general description for this field
    Records         string          `json:"records" form:"records"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DNSCreationModelResponse
 */
type DNSCreationModelResponse struct {
    Domain          string          `json:"domain" form:"domain"` //TODO: Write general description for this field
    Nameservers     NameserversModel `json:"nameservers" form:"nameservers"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type DNSCreationModel
 */
type DNSCreationModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    Domain          string          `json:"domain" form:"domain"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type TwoFactorAuthenticationTokenModelResponse
 */
type TwoFactorAuthenticationTokenModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Correct         string          `json:"correct" form:"correct"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type TwoFactorAuthenticationModelResponse
 */
type TwoFactorAuthenticationModelResponse struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    To              string          `json:"to" form:"to"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type VerifyAddressResponse
 */
type VerifyAddressResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Active          string          `json:"active" form:"active"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type VerifyUserModelResponse
 */
type VerifyUserModelResponse struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Correct         string          `json:"correct" form:"correct"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type VerifyModel
 */
type VerifyModel struct {
    Key             string          `json:"key" form:"key"` //TODO: Write general description for this field
    Uid             string          `json:"uid" form:"uid"` //TODO: Write general description for this field
    To              string          `json:"to" form:"to"` //TODO: Write general description for this field
}

/*
 * Structure for the custom type UserDeletionResponseModel
 */
type UserDeletionResponseModel struct {
    Request         string          `json:"request" form:"request"` //TODO: Write general description for this field
    Deleted         string          `json:"deleted" form:"deleted"` //TODO: Write general description for this field
    Id              string          `json:"id" form:"id"` //TODO: Write general description for this field
}

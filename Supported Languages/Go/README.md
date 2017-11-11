# Getting started

# Introduction
* ## Multi-use Flexible API for: 
  * **User**:
    * Login 
    * Registration
    * User Management
    * Profile Updates
    * Two Factor Authentication
     
  * **Verifcation**:
    * Identity Verification
    * Address Verifcation
    * Cell Phone Verification 

  * **Image**:
    * Manipulation
    * Compression
    * Moderation
     
  * **Data**:
    * Manipulation
    * Compression
    * Conversion
    * Sorting

  * **Services**:
    * Node Application Hosting
    * DNS Management
    * CDN (Content Delivery Network)

  * **Security**:
    * Encryption
    * Code Obfuscation
    * Platform Identification
    * WAF and DDOS Protection (Web Application Firewall)
      * Advanced Logging

# Overview

*  **API Domain: api.rest.sh, api.restful.sh**

This API supports both GET and POST API requests with a JSON or XML output.

*~ You can post to this API via a direct body response in JSON/XML, or using URL variables/requests.*

# Authentication
Be sure to include your User API KEY, and UID when sending a POST or GET request to our API.

*~ If domain restriction is enabled in your dashboard, please include your domain in the request and redirect headers for your API calls.*

# Status Codes
* ## Success Codes:
  *   **200**: Information Recieved
  *   **201**: Success, Resource Created, or Updated
  *   **202**: Proccessing

* ## Information Codes:
  *   **400**: Bad Request
  *   **401**: Incorrect Credentials
  *   **403**: Forbidden
  *   **406**: Not Acceptable Input
  *   **409**: Data Conflict
  *   **413**: Payload Too Large
  *   **415**: Un-Supported Content Type
  *   **451**: Un-Available For Legal Reasons

* ## Error Codes:
  *   **500**: Internal API Error
  *   **501**: Not Implemented
  *   **503**: API Unavailable
  *   **504**: Request Timeout
  *   **511**: Authentication Required

# Rate Pricing
* **Verification requests:** 
  * per/1000 Requests: **$50.00**

* **User requests:** 
  * per/1000 Requests: **$0.0072**

* **Image requests:** 
  * per/1000 Requests: **$11.87**

* Data requests: 
  * per/1MB: **$0.00024**

* **Service requests:** 
  * **DNS Pricing Per Month:**
    * Per Hosted Zone: **$1.00**
    * Per Traffic Flow Record: **$100.00**
    * Per 1 Million Queries: **$0.80**
    * Per 1 Million Latency Based Queries: **$1.20**
    * Per 1 Million GEO Queries: **$1.40**
    * Per Health Check: **$1.00**

  * **Hosting Per Month:**
    * Per APP: **$5.00**

  * **CDN Pricing per/1GB:**
    * North America: **$0.17**
    * Europe: **$0.17**
    * Australia: **$0.28**
    * Asia: **$0.28**
    * India: **$0.34**
    * South America: **$0.5**

* **Security requests:** 
  * **WAF and DDOS Pricing Per Month:**
    * per/1000 Web Requests: **$0.0012**
    * Per Web Access Control List: **$10.00**
    * Per Custom Domain Configuration: **$2.00**
  
  * **Encryption:**
    * per/1000 data sets: **$0.0144**
    * per/1MB per file: **$0.00048**

  * **Code Obfuscation Per Month:**
    * per/APP (300 files per app): **$102.00**

  * **Code Obfuscation Per Month:**
    * per/APP (300 files per app): **$102.00**

  * **Advanced Logging:**
    * per/1000 Log Entries: **$0.0072**

## How to Build


* In order to successfully build and run your SDK files, you are required to have the following setup in your system:
    * **Go**  (Visit [https://golang.org/doc/install](https://golang.org/doc/install) for more details on how to install Go)
    * **Java VM** Version 8 or later
    * **Eclipse 4.6 (Neon)** or later ([http://www.eclipse.org/neon/](http://www.eclipse.org/neon/))
    * **GoClipse** setup within above installed Eclipse (Follow the instructions at [this link](https://github.com/GoClipse/goclipse/blob/latest/documentation/Installation.md#instructions) to setup GoClipse)
* Ensure that ```GOPATH``` environment variable is set in the system variables. If not, set it to your workspace directory where you will be adding your Go projects.
* The generated code uses unirest-go http library. Therefore, you will need internet access to resolve this dependency. If Go is properly installed and configured, run the following command to pull the dependency:

```Go
go get github.com/SMASH/unirest-go
```

This will install unirest-go in the ```GOPATH``` you specified in the system variables.

Now follow the steps mentioned below to build your SDK:

1. Open eclipse in the Go language perspective and click on the ```Import``` option in ```File``` menu.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/go?step=import0)

2. Select ```General -> Existing Projects into Workspace``` option from the tree list.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/go?step=import1)

3. In ```Select root directory```, provide path to the unzipped archive for the generated code. Once the path is set and the Project becomes visible under ```Projects``` click ```Finish```

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/go?step=import2&workspaceFolder=SMASH-GoLang&projectName=smash_lib)

4. The Go library will be imported and its files will be visible in the Project Explorer

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/go?step=import3&projectName=smash_lib)

## How to Use

The following section explains how to use the SMASH library in a new project.

### 1. Add a new Test Project

Create a new project in Eclipse by ```File``` -> ```New``` -> ```Go Project```

![Add a new project in Eclipse](https://apidocs.io/illustration/go?step=createNewProject0)

Name the Project as ```Test``` and click ```Finish```

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/go?step=createNewProject1)

Create a new directory in the ```src``` directory of this project

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/go?step=createNewProject2&projectName=smash_lib)

Name it ```test.com```

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/go?step=createNewProject3&projectName=smash_lib)

Now create a new file inside ```src/test.com```

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/go?step=createNewProject4&projectName=smash_lib)

Name it ```testsdk.go```

![Create a new Maven Project - Step 5](https://apidocs.io/illustration/go?step=createNewProject5&projectName=smash_lib)

In this Go file, you can start adding code to initialize the client library. Sample code to initialize the client library and using its methods is given in the subsequent sections.

### 2. Configure the Test Project

You need to import your generated library in this project in order to make use of its functions. In order to import the library, you can add its path in the ```GOPATH``` for this project. Follow the below steps:

Right click on the project name and click on ```Properties```

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/go?step=testProject0&projectName=smash_lib)

Choose ```Go Compiler``` from the side menu. Check ```Use project specific settings``` and uncheck ```Use same value as the GOPATH environment variable.```. By default, the GOPATH value from the environment variables will be visible in ```Eclipse GOPATH```. Do not remove this as this points to the unirest dependency.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/go?step=testProject1)

Append the library path to this GOPATH

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/go?step=testProject2&workspaceFolder=SMASH-GoLang)

Once the path is appended, click on ```OK```

### 3. Build the Test Project

Right click on the project name and click on ```Build Project```

![Build Project](https://apidocs.io/illustration/go?step=buildProject&projectName=smash_lib)

### 4. Run the Test Project

If the build is successful, right click on your Go file and click on ```Run As``` -> ```Go Application```

![Run Project](https://apidocs.io/illustration/go?step=runProject&projectName=smash_lib)

## Initialization

### Authentication
In order to setup authentication of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |


To configure these for your generated code, open the file "Configuration.go" and edit it's contents.


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [advancedlogging_pkg](#advancedlogging_pkg)
* [wafandddosprotection_pkg](#wafandddosprotection_pkg)
* [encryption_pkg](#encryption_pkg)
* [cdn_pkg](#cdn_pkg)
* [dns_pkg](#dns_pkg)
* [codeobfuscation_pkg](#codeobfuscation_pkg)
* [hosting_pkg](#hosting_pkg)
* [datamanipulation_pkg](#datamanipulation_pkg)
* [imagemanipulation_pkg](#imagemanipulation_pkg)
* [verification_pkg](#verification_pkg)
* [twofactorauthenticationapi_pkg](#twofactorauthenticationapi_pkg)
* [usermanagement_pkg](#usermanagement_pkg)
* [loginandregistration_pkg](#loginandregistration_pkg)

## <a name="advancedlogging_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".advancedlogging_pkg") advancedlogging_pkg

### Get instance

Factory for the ``` ADVANCEDLOGGING ``` interface can be accessed from the package advancedlogging_pkg.

```go
advancedLogging := advancedlogging_pkg.NewADVANCEDLOGGING()
```

### <a name="logging_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".advancedlogging_pkg.LoggingConfiguration") LoggingConfiguration

> WAF Log Configuration


```go
func (me *ADVANCEDLOGGING_IMPL) LoggingConfiguration(input *LoggingConfigurationInput)(*models_pkg.LoggingSetupModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |


#### Example Usage

```go
collect := new (advancedlogging_pkg.LoggingConfigurationInput)

name := "name"
collect.Name = name

origin := "origin"
collect.Origin = origin

activate := "activate"
collect.Activate = activate


var result *models_pkg.LoggingSetupModelResponse
result,_ = advancedLogging.LoggingConfiguration(collect)

```


### <a name="logging_info"></a>![Method: ](https://apidocs.io/img/method.png ".advancedlogging_pkg.LoggingInfo") LoggingInfo

> WAF Log Info


```go
func (me *ADVANCEDLOGGING_IMPL) LoggingInfo(input *LoggingInfoInput)(*models_pkg.LoggingLogsModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |


#### Example Usage

```go
collect := new (advancedlogging_pkg.LoggingInfoInput)

name := "name"
collect.Name = name

origin := "origin"
collect.Origin = origin

time := "time"
collect.Time = time


var result *models_pkg.LoggingLogsModelResponse
result,_ = advancedLogging.LoggingInfo(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="wafandddosprotection_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".wafandddosprotection_pkg") wafandddosprotection_pkg

### Get instance

Factory for the ``` WAFANDDDOSPROTECTION ``` interface can be accessed from the package wafandddosprotection_pkg.

```go
wAFAndDDOSProtection := wafandddosprotection_pkg.NewWAFANDDDOSPROTECTION()
```

### <a name="waf_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".wafandddosprotection_pkg.WAFConfiguration") WAFConfiguration

> WAF and DDOS Configuration


```go
func (me *WAFANDDDOSPROTECTION_IMPL) WAFConfiguration(input *WAFConfigurationInput)(*models_pkg.WAFConfigurationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |


#### Example Usage

```go
collect := new (wafandddosprotection_pkg.WAFConfigurationInput)

name := "name"
collect.Name = name

rule := "rule"
collect.Rule = rule


var result *models_pkg.WAFConfigurationModelResponse
result,_ = wAFAndDDOSProtection.WAFConfiguration(collect)

```


### <a name="waf_creation"></a>![Method: ](https://apidocs.io/img/method.png ".wafandddosprotection_pkg.WAFCreation") WAFCreation

> WAF and DDOS Creation


```go
func (me *WAFANDDDOSPROTECTION_IMPL) WAFCreation(input *WAFCreationInput)(*models_pkg.WAFCreationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```go
collect := new (wafandddosprotection_pkg.WAFCreationInput)

origin := "origin"
collect.Origin = origin

cname := "cname"
collect.Cname = cname


var result *models_pkg.WAFCreationModelResponse
result,_ = wAFAndDDOSProtection.WAFCreation(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".encryption_pkg") encryption_pkg

### Get instance

Factory for the ``` ENCRYPTION ``` interface can be accessed from the package encryption_pkg.

```go
encryption := encryption_pkg.NewENCRYPTION()
```

### <a name="data_and_file_encryption"></a>![Method: ](https://apidocs.io/img/method.png ".encryption_pkg.DataAndFileEncryption") DataAndFileEncryption

> Data and File Encryption API


```go
func (me *ENCRYPTION_IMPL) DataAndFileEncryption(input *DataAndFileEncryptionInput)(*models_pkg.EncryptionModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |


#### Example Usage

```go
collect := new (encryption_pkg.DataAndFileEncryptionInput)

data := "data"
collect.Data = data

method := "method"
collect.Method = method

bit,_ := strconv.ParseInt("248", 10, 8)
collect.Bit = bit


var result *models_pkg.EncryptionModelResponse
result,_ = encryption.DataAndFileEncryption(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".cdn_pkg") cdn_pkg

### Get instance

Factory for the ``` CDN ``` interface can be accessed from the package cdn_pkg.

```go
cDN := cdn_pkg.NewCDN()
```

### <a name="cdn_push_zone"></a>![Method: ](https://apidocs.io/img/method.png ".cdn_pkg.CDNPushZone") CDNPushZone

> CDN Push Zone API


```go
func (me *CDN_IMPL) CDNPushZone(input *CDNPushZoneInput)(*models_pkg.CDNPushModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |


#### Example Usage

```go
collect := new (cdn_pkg.CDNPushZoneInput)

cname := "cname"
collect.Cname = cname

file := "file"
collect.File = file


var result *models_pkg.CDNPushModelResponse
result,_ = cDN.CDNPushZone(collect)

```


### <a name="cdn_pull_zone"></a>![Method: ](https://apidocs.io/img/method.png ".cdn_pkg.CDNPullZone") CDNPullZone

> CDN Pull Zone API


```go
func (me *CDN_IMPL) CDNPullZone(input *CDNPullZoneInput)(*models_pkg.CDNPullModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```go
collect := new (cdn_pkg.CDNPullZoneInput)

origin := "origin"
collect.Origin = origin

cname := "cname"
collect.Cname = cname


var result *models_pkg.CDNPullModelResponse
result,_ = cDN.CDNPullZone(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".dns_pkg") dns_pkg

### Get instance

Factory for the ``` DNS ``` interface can be accessed from the package dns_pkg.

```go
dNS := dns_pkg.NewDNS()
```

### <a name="dns_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".dns_pkg.DNSConfiguration") DNSConfiguration

> DNS Configuration API


```go
func (me *DNS_IMPL) DNSConfiguration(input *DNSConfigurationInput)(*models_pkg.DNSConfigurationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |


#### Example Usage

```go
collect := new (dns_pkg.DNSConfigurationInput)

domain := "domain"
collect.Domain = domain

records := "records"
collect.Records = records


var result *models_pkg.DNSConfigurationModelResponse
result,_ = dNS.DNSConfiguration(collect)

```


### <a name="dns_creation"></a>![Method: ](https://apidocs.io/img/method.png ".dns_pkg.DNSCreation") DNSCreation

> DNS Creation API


```go
func (me *DNS_IMPL) DNSCreation(domain string)(*models_pkg.DNSCreationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```go
domain := "domain"

var result *models_pkg.DNSCreationModelResponse
result,_ = dNS.DNSCreation(domain)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="codeobfuscation_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".codeobfuscation_pkg") codeobfuscation_pkg

### Get instance

Factory for the ``` CODEOBFUSCATION ``` interface can be accessed from the package codeobfuscation_pkg.

```go
codeObfuscation := codeobfuscation_pkg.NewCODEOBFUSCATION()
```

### <a name="obfuscation_and_anti_tampering"></a>![Method: ](https://apidocs.io/img/method.png ".codeobfuscation_pkg.ObfuscationAndAntiTampering") ObfuscationAndAntiTampering

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```go
func (me *CODEOBFUSCATION_IMPL) ObfuscationAndAntiTampering(app string)(*models_pkg.CodeProtectionModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |


#### Example Usage

```go
app := "app"

var result *models_pkg.CodeProtectionModelResponse
result,_ = codeObfuscation.ObfuscationAndAntiTampering(app)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".hosting_pkg") hosting_pkg

### Get instance

Factory for the ``` HOSTING ``` interface can be accessed from the package hosting_pkg.

```go
hosting := hosting_pkg.NewHOSTING()
```

### <a name="hosting_setup"></a>![Method: ](https://apidocs.io/img/method.png ".hosting_pkg.HostingSetup") HostingSetup

> Node.JS and Static Web APP Hosting


```go
func (me *HOSTING_IMPL) HostingSetup(input *HostingSetupInput)(*models_pkg.HostingModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```go
collect := new (hosting_pkg.HostingSetupInput)

app := "app"
collect.App = app

domain := "domain"
collect.Domain = domain


var result *models_pkg.HostingModelResponse
result,_ = hosting.HostingSetup(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="datamanipulation_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".datamanipulation_pkg") datamanipulation_pkg

### Get instance

Factory for the ``` DATAMANIPULATION ``` interface can be accessed from the package datamanipulation_pkg.

```go
dataManipulation := datamanipulation_pkg.NewDATAMANIPULATION()
```

### <a name="https_api_rest_sh_api_d"></a>![Method: ](https://apidocs.io/img/method.png ".datamanipulation_pkg.HttpsApiRestShApiD") HttpsApiRestShApiD

> Data Manipulation API


```go
func (me *DATAMANIPULATION_IMPL) HttpsApiRestShApiD(input *HttpsApiRestShApiDInput)(*models_pkg.DataManipulationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```go
collect := new (datamanipulation_pkg.HttpsApiRestShApiDInput)

data := "data"
collect.Data = data

transform := "transform"
collect.Transform = transform


var result *models_pkg.DataManipulationModelResponse
result,_ = dataManipulation.HttpsApiRestShApiD(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="imagemanipulation_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".imagemanipulation_pkg") imagemanipulation_pkg

### Get instance

Factory for the ``` IMAGEMANIPULATION ``` interface can be accessed from the package imagemanipulation_pkg.

```go
imageManipulation := imagemanipulation_pkg.NewIMAGEMANIPULATION()
```

### <a name="image_manipulation"></a>![Method: ](https://apidocs.io/img/method.png ".imagemanipulation_pkg.ImageManipulation") ImageManipulation

> Image Manipulation API


```go
func (me *IMAGEMANIPULATION_IMPL) ImageManipulation(input *ImageManipulationInput)(*models_pkg.ImageManipulationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```go
collect := new (imagemanipulation_pkg.ImageManipulationInput)

image := "image"
collect.Image = image

transform := "transform"
collect.Transform = transform


var result *models_pkg.ImageManipulationModelResponse
result,_ = imageManipulation.ImageManipulation(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".verification_pkg") verification_pkg

### Get instance

Factory for the ``` VERIFICATION ``` interface can be accessed from the package verification_pkg.

```go
verification := verification_pkg.NewVERIFICATION()
```

### <a name="user_address_verification"></a>![Method: ](https://apidocs.io/img/method.png ".verification_pkg.UserAddressVerification") UserAddressVerification

> User Address Verification API


```go
func (me *VERIFICATION_IMPL) UserAddressVerification(input *UserAddressVerificationInput)(*models_pkg.VerifyAddressResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |
| a |  ``` Required ```  | Address Line One |
| sa |  ``` Required ```  | Address Line Two |
| c |  ``` Required ```  | Address City |
| s |  ``` Required ```  | Address State or Province |
| z |  ``` Required ```  | Address Zipcode |
| address |  ``` Optional ```  | Address as a one line input separated by commas |


#### Example Usage

```go
collect := new (verification_pkg.UserAddressVerificationInput)

user := "user"
collect.User = user

a := "a"
collect.A = a

sa := "sa"
collect.Sa = sa

c := "c"
collect.C = c

s := "s"
collect.S = s

z,_ := strconv.ParseInt("248", 10, 8)
collect.Z = z

address := "address"
collect.Address = address


var result *models_pkg.VerifyAddressResponse
result,_ = verification.UserAddressVerification(collect)

```


### <a name="user_verification_response"></a>![Method: ](https://apidocs.io/img/method.png ".verification_pkg.UserVerificationResponse") UserVerificationResponse

> Users Verification Response API


```go
func (me *VERIFICATION_IMPL) UserVerificationResponse(input *UserVerificationResponseInput)(*models_pkg.VerifyUserModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |


#### Example Usage

```go
collect := new (verification_pkg.UserVerificationResponseInput)

user := "user"
collect.User = user

code := "code"
collect.Code = code


var result *models_pkg.VerifyUserModelResponse
result,_ = verification.UserVerificationResponse(collect)

```


### <a name="user_verification"></a>![Method: ](https://apidocs.io/img/method.png ".verification_pkg.UserVerification") UserVerification

> User Verification API


```go
func (me *VERIFICATION_IMPL) UserVerification(user string)(*models_pkg.VerifyModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |


#### Example Usage

```go
user := "user"

var result *models_pkg.VerifyModelResponse
result,_ = verification.UserVerification(user)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="twofactorauthenticationapi_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".twofactorauthenticationapi_pkg") twofactorauthenticationapi_pkg

### Get instance

Factory for the ``` TWOFACTORAUTHENTICATIONAPI ``` interface can be accessed from the package twofactorauthenticationapi_pkg.

```go
twoFactorAuthenticationAPI := twofactorauthenticationapi_pkg.NewTWOFACTORAUTHENTICATIONAPI()
```

### <a name="m2_fa_token_response"></a>![Method: ](https://apidocs.io/img/method.png ".twofactorauthenticationapi_pkg.M2FATokenResponse") M2FATokenResponse

> Two Factor Authentication Token Reply


```go
func (me *TWOFACTORAUTHENTICATIONAPI_IMPL) M2FATokenResponse(input *M2FATokenResponseInput)(*models_pkg.TwoFactorAuthenticationTokenModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |


#### Example Usage

```go
collect := new (twofactorauthenticationapi_pkg.M2FATokenResponseInput)

user := "user"
collect.User = user

code := "code"
collect.Code = code


var result *models_pkg.TwoFactorAuthenticationTokenModelResponse
result,_ = twoFactorAuthenticationAPI.M2FATokenResponse(collect)

```


### <a name="two_factor_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".twofactorauthenticationapi_pkg.TwoFactorAuthentication") TwoFactorAuthentication

> Two Factor Authentication API


```go
func (me *TWOFACTORAUTHENTICATIONAPI_IMPL) TwoFactorAuthentication(to string)(*models_pkg.TwoFactorAuthenticationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |


#### Example Usage

```go
to := "to"

var result *models_pkg.TwoFactorAuthenticationModelResponse
result,_ = twoFactorAuthenticationAPI.TwoFactorAuthentication(to)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="usermanagement_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".usermanagement_pkg") usermanagement_pkg

### Get instance

Factory for the ``` USERMANAGEMENT ``` interface can be accessed from the package usermanagement_pkg.

```go
userManagement := usermanagement_pkg.NewUSERMANAGEMENT()
```

### <a name="get_user_info"></a>![Method: ](https://apidocs.io/img/method.png ".usermanagement_pkg.GetUserInfo") GetUserInfo

> Get User Info API


```go
func (me *USERMANAGEMENT_IMPL) GetUserInfo(user string)(*models_pkg.UserInformationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |


#### Example Usage

```go
user := "user"

var result *models_pkg.UserInformationModelResponse
result,_ = userManagement.GetUserInfo(user)

```


### <a name="update_user"></a>![Method: ](https://apidocs.io/img/method.png ".usermanagement_pkg.UpdateUser") UpdateUser

> Update User API


```go
func (me *USERMANAGEMENT_IMPL) UpdateUser(input *UpdateUserInput, queryParameters map[string]interface{})(*models_pkg.UserUpdateModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```go
collect := new (usermanagement_pkg.UpdateUserInput)

user := "user"
collect.User = user

avatar := "avatar"
collect.Avatar = avatar

customInput := "custom input"
collect.CustomInput = customInput

// key-value map for optional query parameters
	queryParams := map[string]interface{}{"key" : "value"}


var result *models_pkg.UserUpdateModelResponse
result,_ = userManagement.UpdateUser(collect, queryParams, )

```


### <a name="delete_user"></a>![Method: ](https://apidocs.io/img/method.png ".usermanagement_pkg.DeleteUser") DeleteUser

> Delete User API


```go
func (me *USERMANAGEMENT_IMPL) DeleteUser(user string)(*models_pkg.UserDeletionResponseModel,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |


#### Example Usage

```go
user := "user"

var result *models_pkg.UserDeletionResponseModel
result,_ = userManagement.DeleteUser(user)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="loginandregistration_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".loginandregistration_pkg") loginandregistration_pkg

### Get instance

Factory for the ``` LOGINANDREGISTRATION ``` interface can be accessed from the package loginandregistration_pkg.

```go
loginAndRegistration := loginandregistration_pkg.NewLOGINANDREGISTRATION()
```

### <a name="user_registration"></a>![Method: ](https://apidocs.io/img/method.png ".loginandregistration_pkg.UserRegistration") UserRegistration

> User Registration API


```go
func (me *LOGINANDREGISTRATION_IMPL) UserRegistration(input *UserRegistrationInput, queryParameters map[string]interface{})(*models_pkg.UserRegistrationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | Users Email |
| user |  ``` Required ```  | Users Username |
| password |  ``` Required ```  | Users Password |
| name |  ``` Optional ```  | Users Name |
| phone |  ``` Optional ```  | Users Cellphone Number |
| countrycode |  ``` Optional ```  | Users Country Code (US = 1) |
| address |  ``` Optional ```  | Users Address |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```go
collect := new (loginandregistration_pkg.UserRegistrationInput)

email := "email"
collect.Email = email

user := "user"
collect.User = user

password := "password"
collect.Password = password

name := "name"
collect.Name = name

phone,_ := strconv.ParseInt("207", 10, 8)
collect.Phone = phone

countrycode,_ := strconv.ParseInt("207", 10, 8)
collect.Countrycode = countrycode

address := "address"
collect.Address = address

// key-value map for optional query parameters
	queryParams := map[string]interface{}{"key" : "value"}


var result *models_pkg.UserRegistrationModelResponse
result,_ = loginAndRegistration.UserRegistration(collect, queryParams, )

```


### <a name="user_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".loginandregistration_pkg.UserAuthentication") UserAuthentication

> User Authentication API


```go
func (me *LOGINANDREGISTRATION_IMPL) UserAuthentication(input *UserAuthenticationInput)(*models_pkg.UserAuthenticationModelResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |


#### Example Usage

```go
collect := new (loginandregistration_pkg.UserAuthenticationInput)

user := "user"
collect.User = user

password := "password"
collect.Password = password


var result *models_pkg.UserAuthenticationModelResponse
result,_ = loginAndRegistration.UserAuthentication(collect)

```


[Back to List of Controllers](#list_of_controllers)




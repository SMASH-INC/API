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


The generated code has dependencies over external libraries like UniRest. These dependencies are defined in the ```PodFile``` file that comes with the SDK. 
To resolve these dependencies, we use the Cocoapods package manager.
Visit https://guides.cocoapods.org/using/getting-started.html to setup Cocoapods on your system.
Open command prompt and type ```pod --version```. This should display the current version of Cocoapods installed if the installation was successful.

Using command line, navigate to the directory containing the generated files (including ```PodFile```) for the SDK. 
Run the command ```pod install```. This should install all the required dependencies and create the ```pods``` directory in your project directory.

![Installing dependencies using Cocoapods](https://apidocs.io/illustration/objc?step=AddDependencies&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Open the project workspace using the (SMASH.xcworkspace) file. Invoke the build process using `Command(⌘)+B` shortcut key or using the `Build` menu as shown below.

![Building SDK using Xcode](https://apidocs.io/illustration/objc?step=BuildSDK&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)


## How to Use

The generated code is a Cocoa Touch Static Library which can be used in any iOS project. The support for these generated libraries go all the way back to iOS 6.

The following section explains how to use the SMASH library in a new iOS project.     
### 1. Starting a new project
To start a new project, left-click on the ```Create a new Xcode project```.
![Create Test Project - Step 1](https://apidocs.io/illustration/objc?step=Test1&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Next, choose **Single View Application** and click ```Next```.
![Create Test Project - Step 2](https://apidocs.io/illustration/objc?step=Test2&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Provide **Test-Project** as the product name click ```Next```.
![Create Test Project - Step 3](https://apidocs.io/illustration/objc?step=Test3&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Choose the desired location of your project folder and click ```Create```.
![Create Test Project - Step 4](https://apidocs.io/illustration/objc?step=Test4&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

### 2. Adding the static library dependency
To add this dependency open a terminal and navigate to your project folder. Next, input ```pod init``` and press enter.
![Add dependency - Step 1](https://apidocs.io/illustration/objc?step=Add0&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Next, open the newly created ```PodFile``` in your favourite text editor. Add the following line : pod 'SMASH', :path => 'Vendor/SMASH'
![Add dependency - Step 2](https://apidocs.io/illustration/objc?step=Add1&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Execute `pod install` from terminal to install the dependecy in your project. This would add the dependency to the newly created test project.
![Add dependency - Step 3](https://apidocs.io/illustration/objc?step=Add2&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)


## How to Test

Unit tests in this SDK can be run using Xcode. 

First build the SDK as shown in the steps above and naivgate to the project directory and open the SMASH.xcworkspace file.

Go to the test explorer in Xcode as shown in the picture below and click on `run tests` from the menu. 
![Run tests](https://apidocs.io/illustration/objc?step=RunTests&workspaceFolder=SMASH-ObjC&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)


## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



Configuration variables can be set as following.
```Objc
// Configuration parameters and credentials
Configuration_Uid = "UID"; // Your user ID
Configuration_Secret = "SECRET"; // Your Private API Key
Configuration_Key = "KEY"; // Your Public API Key

```

# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [AdvancedLogging](#advanced_logging)
* [WAFAndDDOSProtection](#waf_and_ddos_protection)
* [Encryption](#encryption)
* [CDN](#cdn)
* [DNS](#dns)
* [CodeObfuscation](#code_obfuscation)
* [Hosting](#hosting)
* [DataManipulation](#data_manipulation)
* [ImageManipulation](#image_manipulation)
* [Verification](#verification)
* [TwoFactorAuthenticationAPI](#two_factor_authentication_api)
* [UserManagement](#user_management)
* [LoginAndRegistration](#login_and_registration)

## <a name="advanced_logging"></a>![Class: ](https://apidocs.io/img/class.png ".AdvancedLogging") AdvancedLogging

### Get singleton instance
```objc
AdvancedLogging* advancedLogging = [[AdvancedLogging alloc]init] ;
```

### <a name="logging_configuration_async_with_logging_configuration_input"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.loggingConfigurationAsyncWithLoggingConfigurationInput") loggingConfigurationAsyncWithLoggingConfigurationInput

> WAF Log Configuration


```objc
function loggingConfigurationAsyncWithLoggingConfigurationInput:(LoggingConfigurationInput*) input
                completionBlock:(CompletedGetLoggingConfiguration) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |





#### Example Usage

```objc
    // Parameters for the API call
    LoggingConfigurationInput *input = [[LoggingConfigurationInput alloc]init];
    input.name = @"name";
    input.origin = @"origin";
    input.activate = @"activate";

    [self.advancedLogging loggingConfigurationAsyncWithLoggingConfigurationInput: input completionBlock:^(BOOL success, HttpContext* context, LoggingSetupModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="logging_info_async_with_logging_info_input"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.loggingInfoAsyncWithLoggingInfoInput") loggingInfoAsyncWithLoggingInfoInput

> WAF Log Info


```objc
function loggingInfoAsyncWithLoggingInfoInput:(LoggingInfoInput*) input
                completionBlock:(CompletedGetLoggingInfo) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |





#### Example Usage

```objc
    // Parameters for the API call
    LoggingInfoInput *input = [[LoggingInfoInput alloc]init];
    input.name = @"name";
    input.origin = @"origin";
    input.time = @"time";

    [self.advancedLogging loggingInfoAsyncWithLoggingInfoInput: input completionBlock:^(BOOL success, HttpContext* context, LoggingLogsModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png ".WAFAndDDOSProtection") WAFAndDDOSProtection

### Get singleton instance
```objc
WAFAndDDOSProtection* wAFAndDDOSProtection = [[WAFAndDDOSProtection alloc]init] ;
```

### <a name="w_af_configuration_async_with_waf_configuration_input"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.wAFConfigurationAsyncWithWAFConfigurationInput") wAFConfigurationAsyncWithWAFConfigurationInput

> WAF and DDOS Configuration


```objc
function wAFConfigurationAsyncWithWAFConfigurationInput:(WAFConfigurationInput*) input
                completionBlock:(CompletedGetWAFConfiguration) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |





#### Example Usage

```objc
    // Parameters for the API call
    WAFConfigurationInput *input = [[WAFConfigurationInput alloc]init];
    input.name = @"name";
    input.rule = @"rule";

    [self.wAFAndDDOSProtection wAFConfigurationAsyncWithWAFConfigurationInput: input completionBlock:^(BOOL success, HttpContext* context, WAFConfigurationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="w_af_creation_async_with_waf_creation_input"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.wAFCreationAsyncWithWAFCreationInput") wAFCreationAsyncWithWAFCreationInput

> WAF and DDOS Creation


```objc
function wAFCreationAsyncWithWAFCreationInput:(WAFCreationInput*) input
                completionBlock:(CompletedGetWAFCreation) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |





#### Example Usage

```objc
    // Parameters for the API call
    WAFCreationInput *input = [[WAFCreationInput alloc]init];
    input.origin = @"origin";
    input.cname = @"cname";

    [self.wAFAndDDOSProtection wAFCreationAsyncWithWAFCreationInput: input completionBlock:^(BOOL success, HttpContext* context, WAFCreationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png ".Encryption") Encryption

### Get singleton instance
```objc
Encryption* encryption = [[Encryption alloc]init] ;
```

### <a name="data_and_file_encryption_async_with_data_and_file_encryption_input"></a>![Method: ](https://apidocs.io/img/method.png ".Encryption.dataAndFileEncryptionAsyncWithDataAndFileEncryptionInput") dataAndFileEncryptionAsyncWithDataAndFileEncryptionInput

> Data and File Encryption API


```objc
function dataAndFileEncryptionAsyncWithDataAndFileEncryptionInput:(DataAndFileEncryptionInput*) input
                completionBlock:(CompletedGetDataAndFileEncryption) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |





#### Example Usage

```objc
    // Parameters for the API call
    DataAndFileEncryptionInput *input = [[DataAndFileEncryptionInput alloc]init];
    input.data = @"data";
    input.method = @"method";
    input.bit = 94;

    [self.encryption dataAndFileEncryptionAsyncWithDataAndFileEncryptionInput: input completionBlock:^(BOOL success, HttpContext* context, EncryptionModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png ".CDN") CDN

### Get singleton instance
```objc
CDN* cDN = [[CDN alloc]init] ;
```

### <a name="c_dn_push_zone_async_with_cdn_push_zone_input"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cDNPushZoneAsyncWithCDNPushZoneInput") cDNPushZoneAsyncWithCDNPushZoneInput

> CDN Push Zone API


```objc
function cDNPushZoneAsyncWithCDNPushZoneInput:(CDNPushZoneInput*) input
                completionBlock:(CompletedGetCDNPushZone) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |





#### Example Usage

```objc
    // Parameters for the API call
    CDNPushZoneInput *input = [[CDNPushZoneInput alloc]init];
    input.cname = @"cname";
    input.file = @"file";

    [self.cDN cDNPushZoneAsyncWithCDNPushZoneInput: input completionBlock:^(BOOL success, HttpContext* context, CDNPushModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="c_dn_pull_zone_async_with_cdn_pull_zone_input"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cDNPullZoneAsyncWithCDNPullZoneInput") cDNPullZoneAsyncWithCDNPullZoneInput

> CDN Pull Zone API


```objc
function cDNPullZoneAsyncWithCDNPullZoneInput:(CDNPullZoneInput*) input
                completionBlock:(CompletedGetCDNPullZone) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |





#### Example Usage

```objc
    // Parameters for the API call
    CDNPullZoneInput *input = [[CDNPullZoneInput alloc]init];
    input.origin = @"origin";
    input.cname = @"cname";

    [self.cDN cDNPullZoneAsyncWithCDNPullZoneInput: input completionBlock:^(BOOL success, HttpContext* context, CDNPullModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png ".DNS") DNS

### Get singleton instance
```objc
DNS* dNS = [[DNS alloc]init] ;
```

### <a name="d_ns_configuration_async_with_dns_configuration_input"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dNSConfigurationAsyncWithDNSConfigurationInput") dNSConfigurationAsyncWithDNSConfigurationInput

> DNS Configuration API


```objc
function dNSConfigurationAsyncWithDNSConfigurationInput:(DNSConfigurationInput*) input
                completionBlock:(CompletedGetDNSConfiguration) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |





#### Example Usage

```objc
    // Parameters for the API call
    DNSConfigurationInput *input = [[DNSConfigurationInput alloc]init];
    input.domain = @"domain";
    input.records = @"records";

    [self.dNS dNSConfigurationAsyncWithDNSConfigurationInput: input completionBlock:^(BOOL success, HttpContext* context, DNSConfigurationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="d_ns_creation_async_with_domain"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dNSCreationAsyncWithDomain") dNSCreationAsyncWithDomain

> DNS Creation API


```objc
function dNSCreationAsyncWithDomain:(NSString*) domain
                completionBlock:(CompletedGetDNSCreation) onCompleted(domain)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |





#### Example Usage

```objc
    // Parameters for the API call
    NSString* domain = @"domain";

    [self.dNS dNSCreationAsyncWithDomain: domain  completionBlock:^(BOOL success, HttpContext* context, DNSCreationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png ".CodeObfuscation") CodeObfuscation

### Get singleton instance
```objc
CodeObfuscation* codeObfuscation = [[CodeObfuscation alloc]init] ;
```

### <a name="obfuscation_and_anti_tampering_async_with_app"></a>![Method: ](https://apidocs.io/img/method.png ".CodeObfuscation.obfuscationAndAntiTamperingAsyncWithApp") obfuscationAndAntiTamperingAsyncWithApp

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```objc
function obfuscationAndAntiTamperingAsyncWithApp:(NSString*) app
                completionBlock:(CompletedGetObfuscationAndAntiTampering) onCompleted(app)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |





#### Example Usage

```objc
    // Parameters for the API call
    NSString* app = @"app";

    [self.codeObfuscation obfuscationAndAntiTamperingAsyncWithApp: app  completionBlock:^(BOOL success, HttpContext* context, CodeProtectionModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png ".Hosting") Hosting

### Get singleton instance
```objc
Hosting* hosting = [[Hosting alloc]init] ;
```

### <a name="hosting_setup_async_with_hosting_setup_input"></a>![Method: ](https://apidocs.io/img/method.png ".Hosting.hostingSetupAsyncWithHostingSetupInput") hostingSetupAsyncWithHostingSetupInput

> Node.JS and Static Web APP Hosting


```objc
function hostingSetupAsyncWithHostingSetupInput:(HostingSetupInput*) input
                completionBlock:(CompletedGetHostingSetup) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |





#### Example Usage

```objc
    // Parameters for the API call
    HostingSetupInput *input = [[HostingSetupInput alloc]init];
    input.app = @"app";
    input.domain = @"domain";

    [self.hosting hostingSetupAsyncWithHostingSetupInput: input completionBlock:^(BOOL success, HttpContext* context, HostingModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".DataManipulation") DataManipulation

### Get singleton instance
```objc
DataManipulation* dataManipulation = [[DataManipulation alloc]init] ;
```

### <a name="https_api_rest_sh_api_d_async_with_https_api_rest_sh_api_d_input"></a>![Method: ](https://apidocs.io/img/method.png ".DataManipulation.httpsApiRestShApiDAsyncWithHttpsApiRestShApiDInput") httpsApiRestShApiDAsyncWithHttpsApiRestShApiDInput

> Data Manipulation API


```objc
function httpsApiRestShApiDAsyncWithHttpsApiRestShApiDInput:(HttpsApiRestShApiDInput*) input
                completionBlock:(CompletedGetHttpsApiRestShApiD) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |





#### Example Usage

```objc
    // Parameters for the API call
    HttpsApiRestShApiDInput *input = [[HttpsApiRestShApiDInput alloc]init];
    input.data = @"data";
    input.transform = @"transform";

    [self.dataManipulation httpsApiRestShApiDAsyncWithHttpsApiRestShApiDInput: input completionBlock:^(BOOL success, HttpContext* context, DataManipulationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".ImageManipulation") ImageManipulation

### Get singleton instance
```objc
ImageManipulation* imageManipulation = [[ImageManipulation alloc]init] ;
```

### <a name="image_manipulation_async_with_image_manipulation_input"></a>![Method: ](https://apidocs.io/img/method.png ".ImageManipulation.imageManipulationAsyncWithImageManipulationInput") imageManipulationAsyncWithImageManipulationInput

> Image Manipulation API


```objc
function imageManipulationAsyncWithImageManipulationInput:(ImageManipulationInput*) input
                completionBlock:(CompletedGetImageManipulation) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |





#### Example Usage

```objc
    // Parameters for the API call
    ImageManipulationInput *input = [[ImageManipulationInput alloc]init];
    input.image = @"image";
    input.transform = @"transform";

    [self.imageManipulation imageManipulationAsyncWithImageManipulationInput: input completionBlock:^(BOOL success, HttpContext* context, ImageManipulationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png ".Verification") Verification

### Get singleton instance
```objc
Verification* verification = [[Verification alloc]init] ;
```

### <a name="user_address_verification_async_with_user_address_verification_input"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userAddressVerificationAsyncWithUserAddressVerificationInput") userAddressVerificationAsyncWithUserAddressVerificationInput

> User Address Verification API


```objc
function userAddressVerificationAsyncWithUserAddressVerificationInput:(UserAddressVerificationInput*) input
                completionBlock:(CompletedGetUserAddressVerification) onCompleted(input)
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

```objc
    // Parameters for the API call
    UserAddressVerificationInput *input = [[UserAddressVerificationInput alloc]init];
    input.user = @"user";
    input.a = @"a";
    input.sa = @"sa";
    input.c = @"c";
    input.s = @"s";
    input.z = 94;
    input.address = @"address";

    [self.verification userAddressVerificationAsyncWithUserAddressVerificationInput: input completionBlock:^(BOOL success, HttpContext* context, VerifyAddressResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="user_verification_response_async_with_user_verification_response_input"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userVerificationResponseAsyncWithUserVerificationResponseInput") userVerificationResponseAsyncWithUserVerificationResponseInput

> Users Verification Response API


```objc
function userVerificationResponseAsyncWithUserVerificationResponseInput:(UserVerificationResponseInput*) input
                completionBlock:(CompletedGetUserVerificationResponse) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |





#### Example Usage

```objc
    // Parameters for the API call
    UserVerificationResponseInput *input = [[UserVerificationResponseInput alloc]init];
    input.user = @"user";
    input.code = @"code";

    [self.verification userVerificationResponseAsyncWithUserVerificationResponseInput: input completionBlock:^(BOOL success, HttpContext* context, VerifyUserModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="user_verification_async_with_user"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userVerificationAsyncWithUser") userVerificationAsyncWithUser

> User Verification API


```objc
function userVerificationAsyncWithUser:(NSString*) user
                completionBlock:(CompletedGetUserVerification) onCompleted(user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |





#### Example Usage

```objc
    // Parameters for the API call
    NSString* user = @"user";

    [self.verification userVerificationAsyncWithUser: user  completionBlock:^(BOOL success, HttpContext* context, VerifyModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png ".TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get singleton instance
```objc
TwoFactorAuthenticationAPI* twoFactorAuthenticationAPI = [[TwoFactorAuthenticationAPI alloc]init] ;
```

### <a name="m2_fa_token_response_async_with_m2_fa_token_response_input"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.m2FATokenResponseAsyncWithM2FATokenResponseInput") m2FATokenResponseAsyncWithM2FATokenResponseInput

> Two Factor Authentication Token Reply


```objc
function m2FATokenResponseAsyncWithM2FATokenResponseInput:(M2FATokenResponseInput*) input
                completionBlock:(CompletedGetM2FATokenResponse) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |





#### Example Usage

```objc
    // Parameters for the API call
    M2FATokenResponseInput *input = [[M2FATokenResponseInput alloc]init];
    input.user = @"user";
    input.code = @"code";

    [self.twoFactorAuthenticationAPI m2FATokenResponseAsyncWithM2FATokenResponseInput: input completionBlock:^(BOOL success, HttpContext* context, TwoFactorAuthenticationTokenModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="two_factor_authentication_async_with_to"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.twoFactorAuthenticationAsyncWithTo") twoFactorAuthenticationAsyncWithTo

> Two Factor Authentication API


```objc
function twoFactorAuthenticationAsyncWithTo:(NSString*) to
                completionBlock:(CompletedGetTwoFactorAuthentication) onCompleted(to)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |





#### Example Usage

```objc
    // Parameters for the API call
    NSString* to = @"to";

    [self.twoFactorAuthenticationAPI twoFactorAuthenticationAsyncWithTo: to  completionBlock:^(BOOL success, HttpContext* context, TwoFactorAuthenticationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png ".UserManagement") UserManagement

### Get singleton instance
```objc
UserManagement* userManagement = [[UserManagement alloc]init] ;
```

### <a name="get_user_info_async_with_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.getUserInfoAsyncWithUser") getUserInfoAsyncWithUser

> Get User Info API


```objc
function getUserInfoAsyncWithUser:(NSString*) user
                completionBlock:(CompletedGetUserInfo) onCompleted(user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |





#### Example Usage

```objc
    // Parameters for the API call
    NSString* user = @"user";

    [self.userManagement getUserInfoAsyncWithUser: user  completionBlock:^(BOOL success, HttpContext* context, UserInformationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="update_user_async_with_update_user_input"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.updateUserAsyncWithUpdateUserInput") updateUserAsyncWithUpdateUserInput

> Update User API


```objc
function updateUserAsyncWithUpdateUserInput:(UpdateUserInput*) input
                queryParameters:(NSDictionary*) queryParameters
                completionBlock:(CompletedGetUpdateUser) onCompleted(input queryParameters : queryParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |





#### Example Usage

```objc
    // Parameters for the API call
    UpdateUserInput *input = [[UpdateUserInput alloc]init];
    input.user = @"user";
    input.avatar = @"avatar";
    input.customInput = @"custom input";
    // Dictionary for optional query parameters
    NSMutableDictionary* queryParamsMutable = [[NSMutableDictionary alloc] init];
    NSDictionary *queryParams= [queryParamsMutable copy];

    [self.userManagement updateUserAsyncWithUpdateUserInput: input queryParameters : queryParams  completionBlock:^(BOOL success, HttpContext* context, UserUpdateModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="delete_user_async_with_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.deleteUserAsyncWithUser") deleteUserAsyncWithUser

> Delete User API


```objc
function deleteUserAsyncWithUser:(NSString*) user
                completionBlock:(CompletedGetDeleteUser) onCompleted(user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |





#### Example Usage

```objc
    // Parameters for the API call
    NSString* user = @"user";

    [self.userManagement deleteUserAsyncWithUser: user  completionBlock:^(BOOL success, HttpContext* context, UserDeletionResponseModel* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png ".LoginAndRegistration") LoginAndRegistration

### Get singleton instance
```objc
LoginAndRegistration* loginAndRegistration = [[LoginAndRegistration alloc]init] ;
```

### <a name="user_registration_async_with_user_registration_input"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.userRegistrationAsyncWithUserRegistrationInput") userRegistrationAsyncWithUserRegistrationInput

> User Registration API


```objc
function userRegistrationAsyncWithUserRegistrationInput:(UserRegistrationInput*) input
                queryParameters:(NSDictionary*) queryParameters
                completionBlock:(CompletedGetUserRegistration) onCompleted(input queryParameters : queryParams)
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

```objc
    // Parameters for the API call
    UserRegistrationInput *input = [[UserRegistrationInput alloc]init];
    input.email = @"email";
    input.user = @"user";
    input.password = @"password";
    input.name = @"name";
    input.phone = 94;
    input.countrycode = 94;
    input.address = @"address";
    // Dictionary for optional query parameters
    NSMutableDictionary* queryParamsMutable = [[NSMutableDictionary alloc] init];
    NSDictionary *queryParams= [queryParamsMutable copy];

    [self.loginAndRegistration userRegistrationAsyncWithUserRegistrationInput: input queryParameters : queryParams  completionBlock:^(BOOL success, HttpContext* context, UserRegistrationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


### <a name="user_authentication_async_with_user_authentication_input"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.userAuthenticationAsyncWithUserAuthenticationInput") userAuthenticationAsyncWithUserAuthenticationInput

> User Authentication API


```objc
function userAuthenticationAsyncWithUserAuthenticationInput:(UserAuthenticationInput*) input
                completionBlock:(CompletedGetUserAuthentication) onCompleted(input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |





#### Example Usage

```objc
    // Parameters for the API call
    UserAuthenticationInput *input = [[UserAuthenticationInput alloc]init];
    input.user = @"user";
    input.password = @"password";

    [self.loginAndRegistration userAuthenticationAsyncWithUserAuthenticationInput: input completionBlock:^(BOOL success, HttpContext* context, UserAuthenticationModelResponse* response, NSError* error) { 
       //Add code here
    }];
```


[Back to List of Controllers](#list_of_controllers)




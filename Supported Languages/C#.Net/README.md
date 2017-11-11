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

The generated code uses the Newtonsoft Json.NET NuGet Package. If the automatic NuGet package restore
is enabled, these dependencies will be installed automatically. Therefore,
you will need internet access for build.

1. Open the solution (SMASH.sln) file.
2. Invoke the build process using `Ctrl+Shift+B` shortcut key or using the `Build` menu as shown below.

![Building SDK using Visual Studio](https://apidocs.io/illustration/cs?step=buildSDK&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

## How to Use

The build process generates a portable class library, which can be used like a normal class library. The generated library is compatible with Windows Forms, Windows RT, Windows Phone 8,
Silverlight 5, Xamarin iOS, Xamarin Android and Mono. More information on how to use can be found at the [MSDN Portable Class Libraries documentation](http://msdn.microsoft.com/en-us/library/vstudio/gg597391%28v=vs.100%29.aspx).

The following section explains how to use the SMASH library in a new console project.

### 1. Starting a new project

For starting a new project, right click on the current solution from the *solution explorer* and choose  ``` Add -> New Project ```.

![Add a new project in the existing solution using Visual Studio](https://apidocs.io/illustration/cs?step=addProject&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

Next, choose "Console Application", provide a ``` TestConsoleProject ``` as the project name and click ``` OK ```.

![Create a new console project using Visual Studio](https://apidocs.io/illustration/cs?step=createProject&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

### 2. Set as startup project

The new console project is the entry point for the eventual execution. This requires us to set the ``` TestConsoleProject ``` as the start-up project. To do this, right-click on the  ``` TestConsoleProject ``` and choose  ``` Set as StartUp Project ``` form the context menu.

![Set the new cosole project as the start up project](https://apidocs.io/illustration/cs?step=setStartup&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

### 3. Add reference of the library project

In order to use the SMASH library in the new project, first we must add a projet reference to the ``` TestConsoleProject ```. First, right click on the ``` References ``` node in the *solution explorer* and click ``` Add Reference... ```.

![Open references of the TestConsoleProject](https://apidocs.io/illustration/cs?step=addReference&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

Next, a window will be displayed where we must set the ``` checkbox ``` on ``` SMASH.Tests ``` and click ``` OK ```. By doing this, we have added a reference of the ```SMASH.Tests``` project into the new ``` TestConsoleProject ```.

![Add a reference to the TestConsoleProject](https://apidocs.io/illustration/cs?step=createReference&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

### 4. Write sample code

Once the ``` TestConsoleProject ``` is created, a file named ``` Program.cs ``` will be visible in the *solution explorer* with an empty ``` Main ``` method. This is the entry point for the execution of the entire solution.
Here, you can add code to initialize the client library and acquire the instance of a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Add a reference to the TestConsoleProject](https://apidocs.io/illustration/cs?step=addCode&workspaceFolder=SMASH-CSharp&workspaceName=SMASH&projectName=SMASH.Tests)

## How to Test

The generated SDK also contain one or more Tests, which are contained in the Tests project.
In order to invoke these test cases, you will need *NUnit 3.0 Test Adapter Extension for Visual Studio*.
Once the SDK is complied, the test cases should appear in the Test Explorer window.
Here, you can click *Run All* to execute these test cases.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



API client can be initialized as following.

```csharp
// Configuration parameters and credentials
string uid = "UID"; // Your user ID
string secret = "SECRET"; // Your Private API Key
string key = "KEY"; // Your Public API Key

SMASHClient client = new SMASHClient(uid, secret, key);
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

## <a name="advanced_logging"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.AdvancedLogging") AdvancedLogging

### Get singleton instance

The singleton instance of the ``` AdvancedLogging ``` class can be accessed from the API Client.

```csharp
IAdvancedLogging advancedLogging = client.AdvancedLogging;
```

### <a name="logging_configuration"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.AdvancedLogging.LoggingConfiguration") LoggingConfiguration

> WAF Log Configuration


```csharp
Task<Models.LoggingSetupModelResponse> LoggingConfiguration(Models.LoggingConfigurationInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |


#### Example Usage

```csharp
LoggingConfigurationInput collect = new LoggingConfigurationInput();

string name = "name";
collect.Name = name;

string origin = "origin";
collect.Origin = origin;

string activate = "activate";
collect.Activate = activate;


Models.LoggingSetupModelResponse result = await advancedLogging.LoggingConfiguration(collect);

```


### <a name="logging_info"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.AdvancedLogging.LoggingInfo") LoggingInfo

> WAF Log Info


```csharp
Task<Models.LoggingLogsModelResponse> LoggingInfo(Models.LoggingInfoInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |


#### Example Usage

```csharp
LoggingInfoInput collect = new LoggingInfoInput();

string name = "name";
collect.Name = name;

string origin = "origin";
collect.Origin = origin;

string time = "time";
collect.Time = time;


Models.LoggingLogsModelResponse result = await advancedLogging.LoggingInfo(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.WAFAndDDOSProtection") WAFAndDDOSProtection

### Get singleton instance

The singleton instance of the ``` WAFAndDDOSProtection ``` class can be accessed from the API Client.

```csharp
IWAFAndDDOSProtection wAFAndDDOSProtection = client.WAFAndDDOSProtection;
```

### <a name="waf_configuration"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.WAFAndDDOSProtection.WAFConfiguration") WAFConfiguration

> WAF and DDOS Configuration


```csharp
Task<Models.WAFConfigurationModelResponse> WAFConfiguration(Models.WAFConfigurationInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |


#### Example Usage

```csharp
WAFConfigurationInput collect = new WAFConfigurationInput();

string name = "name";
collect.Name = name;

string rule = "rule";
collect.Rule = rule;


Models.WAFConfigurationModelResponse result = await wAFAndDDOSProtection.WAFConfiguration(collect);

```


### <a name="waf_creation"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.WAFAndDDOSProtection.WAFCreation") WAFCreation

> WAF and DDOS Creation


```csharp
Task<Models.WAFCreationModelResponse> WAFCreation(Models.WAFCreationInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```csharp
WAFCreationInput collect = new WAFCreationInput();

string origin = "origin";
collect.Origin = origin;

string cname = "cname";
collect.Cname = cname;


Models.WAFCreationModelResponse result = await wAFAndDDOSProtection.WAFCreation(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.Encryption") Encryption

### Get singleton instance

The singleton instance of the ``` Encryption ``` class can be accessed from the API Client.

```csharp
IEncryption encryption = client.Encryption;
```

### <a name="data_and_file_encryption"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.Encryption.DataAndFileEncryption") DataAndFileEncryption

> Data and File Encryption API


```csharp
Task<Models.EncryptionModelResponse> DataAndFileEncryption(Models.DataAndFileEncryptionInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |


#### Example Usage

```csharp
DataAndFileEncryptionInput collect = new DataAndFileEncryptionInput();

string data = "data";
collect.Data = data;

string method = "method";
collect.Method = method;

int bit = 118;
collect.Bit = bit;


Models.EncryptionModelResponse result = await encryption.DataAndFileEncryption(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.CDN") CDN

### Get singleton instance

The singleton instance of the ``` CDN ``` class can be accessed from the API Client.

```csharp
ICDN cDN = client.CDN;
```

### <a name="cdn_push_zone"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.CDN.CDNPushZone") CDNPushZone

> CDN Push Zone API


```csharp
Task<Models.CDNPushModelResponse> CDNPushZone(Models.CDNPushZoneInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |


#### Example Usage

```csharp
CDNPushZoneInput collect = new CDNPushZoneInput();

string cname = "cname";
collect.Cname = cname;

string file = "file";
collect.File = file;


Models.CDNPushModelResponse result = await cDN.CDNPushZone(collect);

```


### <a name="cdn_pull_zone"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.CDN.CDNPullZone") CDNPullZone

> CDN Pull Zone API


```csharp
Task<Models.CDNPullModelResponse> CDNPullZone(Models.CDNPullZoneInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```csharp
CDNPullZoneInput collect = new CDNPullZoneInput();

string origin = "origin";
collect.Origin = origin;

string cname = "cname";
collect.Cname = cname;


Models.CDNPullModelResponse result = await cDN.CDNPullZone(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.DNS") DNS

### Get singleton instance

The singleton instance of the ``` DNS ``` class can be accessed from the API Client.

```csharp
IDNS dNS = client.DNS;
```

### <a name="dns_configuration"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.DNS.DNSConfiguration") DNSConfiguration

> DNS Configuration API


```csharp
Task<Models.DNSConfigurationModelResponse> DNSConfiguration(Models.DNSConfigurationInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |


#### Example Usage

```csharp
DNSConfigurationInput collect = new DNSConfigurationInput();

string domain = "domain";
collect.Domain = domain;

string records = "records";
collect.Records = records;


Models.DNSConfigurationModelResponse result = await dNS.DNSConfiguration(collect);

```


### <a name="dns_creation"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.DNS.DNSCreation") DNSCreation

> DNS Creation API


```csharp
Task<Models.DNSCreationModelResponse> DNSCreation(string domain)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```csharp
string domain = "domain";

Models.DNSCreationModelResponse result = await dNS.DNSCreation(domain);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.CodeObfuscation") CodeObfuscation

### Get singleton instance

The singleton instance of the ``` CodeObfuscation ``` class can be accessed from the API Client.

```csharp
ICodeObfuscation codeObfuscation = client.CodeObfuscation;
```

### <a name="obfuscation_and_anti_tampering"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.CodeObfuscation.ObfuscationAndAntiTampering") ObfuscationAndAntiTampering

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```csharp
Task<Models.CodeProtectionModelResponse> ObfuscationAndAntiTampering(string app)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |


#### Example Usage

```csharp
string app = "app";

Models.CodeProtectionModelResponse result = await codeObfuscation.ObfuscationAndAntiTampering(app);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.Hosting") Hosting

### Get singleton instance

The singleton instance of the ``` Hosting ``` class can be accessed from the API Client.

```csharp
IHosting hosting = client.Hosting;
```

### <a name="hosting_setup"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.Hosting.HostingSetup") HostingSetup

> Node.JS and Static Web APP Hosting


```csharp
Task<Models.HostingModelResponse> HostingSetup(Models.HostingSetupInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```csharp
HostingSetupInput collect = new HostingSetupInput();

string app = "app";
collect.App = app;

string domain = "domain";
collect.Domain = domain;


Models.HostingModelResponse result = await hosting.HostingSetup(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.DataManipulation") DataManipulation

### Get singleton instance

The singleton instance of the ``` DataManipulation ``` class can be accessed from the API Client.

```csharp
IDataManipulation dataManipulation = client.DataManipulation;
```

### <a name="https_api_rest_sh_api_d"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.DataManipulation.HttpsApiRestShApiD") HttpsApiRestShApiD

> Data Manipulation API


```csharp
Task<Models.DataManipulationModelResponse> HttpsApiRestShApiD(Models.HttpsApiRestShApiDInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```csharp
HttpsApiRestShApiDInput collect = new HttpsApiRestShApiDInput();

string data = "data";
collect.Data = data;

string transform = "transform";
collect.Transform = transform;


Models.DataManipulationModelResponse result = await dataManipulation.HttpsApiRestShApiD(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.ImageManipulation") ImageManipulation

### Get singleton instance

The singleton instance of the ``` ImageManipulation ``` class can be accessed from the API Client.

```csharp
IImageManipulation imageManipulation = client.ImageManipulation;
```

### <a name="image_manipulation"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.ImageManipulation.ImageManipulation") ImageManipulation

> Image Manipulation API


```csharp
Task<Models.ImageManipulationModelResponse> ImageManipulation(Models.ImageManipulationInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```csharp
ImageManipulationInput collect = new ImageManipulationInput();

string image = "image";
collect.Image = image;

string transform = "transform";
collect.Transform = transform;


Models.ImageManipulationModelResponse result = await imageManipulation.ImageManipulation(collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.Verification") Verification

### Get singleton instance

The singleton instance of the ``` Verification ``` class can be accessed from the API Client.

```csharp
IVerification verification = client.Verification;
```

### <a name="user_address_verification"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.Verification.UserAddressVerification") UserAddressVerification

> User Address Verification API


```csharp
Task<Models.VerifyAddressResponse> UserAddressVerification(Models.UserAddressVerificationInput input)
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

```csharp
UserAddressVerificationInput collect = new UserAddressVerificationInput();

string user = "user";
collect.User = user;

string a = "a";
collect.A = a;

string sa = "sa";
collect.Sa = sa;

string c = "c";
collect.C = c;

string s = "s";
collect.S = s;

int z = 118;
collect.Z = z;

string address = "address";
collect.Address = address;


Models.VerifyAddressResponse result = await verification.UserAddressVerification(collect);

```


### <a name="user_verification_response"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.Verification.UserVerificationResponse") UserVerificationResponse

> Users Verification Response API


```csharp
Task<Models.VerifyUserModelResponse> UserVerificationResponse(Models.UserVerificationResponseInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |


#### Example Usage

```csharp
UserVerificationResponseInput collect = new UserVerificationResponseInput();

string user = "user";
collect.User = user;

string code = "code";
collect.Code = code;


Models.VerifyUserModelResponse result = await verification.UserVerificationResponse(collect);

```


### <a name="user_verification"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.Verification.UserVerification") UserVerification

> User Verification API


```csharp
Task<Models.VerifyModelResponse> UserVerification(string user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |


#### Example Usage

```csharp
string user = "user";

Models.VerifyModelResponse result = await verification.UserVerification(user);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get singleton instance

The singleton instance of the ``` TwoFactorAuthenticationAPI ``` class can be accessed from the API Client.

```csharp
ITwoFactorAuthenticationAPI twoFactorAuthenticationAPI = client.TwoFactorAuthenticationAPI;
```

### <a name="m2_fa_token_response"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.TwoFactorAuthenticationAPI.M2FATokenResponse") M2FATokenResponse

> Two Factor Authentication Token Reply


```csharp
Task<Models.TwoFactorAuthenticationTokenModelResponse> M2FATokenResponse(Models.M2FATokenResponseInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |


#### Example Usage

```csharp
M2FATokenResponseInput collect = new M2FATokenResponseInput();

string user = "user";
collect.User = user;

string code = "code";
collect.Code = code;


Models.TwoFactorAuthenticationTokenModelResponse result = await twoFactorAuthenticationAPI.M2FATokenResponse(collect);

```


### <a name="two_factor_authentication"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.TwoFactorAuthenticationAPI.TwoFactorAuthentication") TwoFactorAuthentication

> Two Factor Authentication API


```csharp
Task<Models.TwoFactorAuthenticationModelResponse> TwoFactorAuthentication(string to)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |


#### Example Usage

```csharp
string to = "to";

Models.TwoFactorAuthenticationModelResponse result = await twoFactorAuthenticationAPI.TwoFactorAuthentication(to);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.UserManagement") UserManagement

### Get singleton instance

The singleton instance of the ``` UserManagement ``` class can be accessed from the API Client.

```csharp
IUserManagement userManagement = client.UserManagement;
```

### <a name="get_user_info"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.UserManagement.GetUserInfo") GetUserInfo

> Get User Info API


```csharp
Task<Models.UserInformationModelResponse> GetUserInfo(string user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |


#### Example Usage

```csharp
string user = "user";

Models.UserInformationModelResponse result = await userManagement.GetUserInfo(user);

```


### <a name="update_user"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.UserManagement.UpdateUser") UpdateUser

> Update User API


```csharp
Task<Models.UserUpdateModelResponse> UpdateUser(Models.UpdateUserInput input, Dictionary<string, object> queryParameters = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```csharp
UpdateUserInput collect = new UpdateUserInput();

string user = "user";
collect.User = user;

string avatar = "avatar";
collect.Avatar = avatar;

string customInput = "custom input";
collect.CustomInput = customInput;

// key-value map for optional query parameters
var queryParams = new Dictionary<string, object>();


Models.UserUpdateModelResponse result = await userManagement.UpdateUser(collect, queryParams, );

```


### <a name="delete_user"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.UserManagement.DeleteUser") DeleteUser

> Delete User API


```csharp
Task<Models.UserDeletionResponseModel> DeleteUser(string user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |


#### Example Usage

```csharp
string user = "user";

Models.UserDeletionResponseModel result = await userManagement.DeleteUser(user);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.Controllers.LoginAndRegistration") LoginAndRegistration

### Get singleton instance

The singleton instance of the ``` LoginAndRegistration ``` class can be accessed from the API Client.

```csharp
ILoginAndRegistration loginAndRegistration = client.LoginAndRegistration;
```

### <a name="user_registration"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.LoginAndRegistration.UserRegistration") UserRegistration

> User Registration API


```csharp
Task<Models.UserRegistrationModelResponse> UserRegistration(Models.UserRegistrationInput input, Dictionary<string, object> queryParameters = null)
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

```csharp
UserRegistrationInput collect = new UserRegistrationInput();

string email = "email";
collect.Email = email;

string user = "user";
collect.User = user;

string password = "password";
collect.Password = password;

string name = "name";
collect.Name = name;

int? phone = 118;
collect.Phone = phone;

int? countrycode = 118;
collect.Countrycode = countrycode;

string address = "address";
collect.Address = address;

// key-value map for optional query parameters
var queryParams = new Dictionary<string, object>();


Models.UserRegistrationModelResponse result = await loginAndRegistration.UserRegistration(collect, queryParams, );

```


### <a name="user_authentication"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.Controllers.LoginAndRegistration.UserAuthentication") UserAuthentication

> User Authentication API


```csharp
Task<Models.UserAuthenticationModelResponse> UserAuthentication(Models.UserAuthenticationInput input)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |


#### Example Usage

```csharp
UserAuthenticationInput collect = new UserAuthenticationInput();

string user = "user";
collect.User = user;

string password = "password";
collect.Password = password;


Models.UserAuthenticationModelResponse result = await loginAndRegistration.UserAuthentication(collect);

```


[Back to List of Controllers](#list_of_controllers)




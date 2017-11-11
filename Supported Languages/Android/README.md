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

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

* Browse to locate the folder containing the source code. Select the location of the SMASH gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

## How to Use

The following section explains how to use the SMASH library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

In the following step naigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':SMASH')``` to the dependencies section as shown in the illustration below.

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=SMASH&workspaceName=SMASH&projectName=SMASH&rootNamespace=SMASH)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > SMASH > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String uid = "UID"; // Your user ID
String secret = "SECRET"; // Your Private API Key
String key = "KEY"; // Your Public API Key

SMASH.Configuration.initialize(appContext);
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

## <a name="advanced_logging"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.AdvancedLogging") AdvancedLogging

### Get singleton instance

The singleton instance of the ``` AdvancedLogging ``` class can be accessed from the API Client.

```java
AdvancedLogging advancedLogging = client.getAdvancedLogging();
```

### <a name="logging_configuration_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.AdvancedLogging.loggingConfigurationAsync") loggingConfigurationAsync

> WAF Log Configuration


```java
void loggingConfigurationAsync(
        final LoggingConfigurationInput input,
        final APICallBack<LoggingSetupModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |


#### Example Usage

```java
LoggingConfigurationInput collect = new LoggingConfigurationInput();

String name = "name";
collect.setName(name);

String origin = "origin";
collect.setOrigin(origin);

String activate = "activate";
collect.setActivate(activate);

// Invoking the API call with sample inputs
advancedLogging.loggingConfigurationAsync(collect, new APICallBack<LoggingSetupModelResponse>() {
    public void onSuccess(HttpContext context, LoggingSetupModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="logging_info_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.AdvancedLogging.loggingInfoAsync") loggingInfoAsync

> WAF Log Info


```java
void loggingInfoAsync(
        final LoggingInfoInput input,
        final APICallBack<LoggingLogsModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |


#### Example Usage

```java
LoggingInfoInput collect = new LoggingInfoInput();

String name = "name";
collect.setName(name);

String origin = "origin";
collect.setOrigin(origin);

String time = "time";
collect.setTime(time);

// Invoking the API call with sample inputs
advancedLogging.loggingInfoAsync(collect, new APICallBack<LoggingLogsModelResponse>() {
    public void onSuccess(HttpContext context, LoggingLogsModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.WAFAndDDOSProtection") WAFAndDDOSProtection

### Get singleton instance

The singleton instance of the ``` WAFAndDDOSProtection ``` class can be accessed from the API Client.

```java
WAFAndDDOSProtection wAFAndDDOSProtection = client.getWAFAndDDOSProtection();
```

### <a name="w_af_configuration_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.WAFAndDDOSProtection.wAFConfigurationAsync") wAFConfigurationAsync

> WAF and DDOS Configuration


```java
void wAFConfigurationAsync(
        final WAFConfigurationInput input,
        final APICallBack<WAFConfigurationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |


#### Example Usage

```java
WAFConfigurationInput collect = new WAFConfigurationInput();

String name = "name";
collect.setName(name);

String rule = "rule";
collect.setRule(rule);

// Invoking the API call with sample inputs
wAFAndDDOSProtection.wAFConfigurationAsync(collect, new APICallBack<WAFConfigurationModelResponse>() {
    public void onSuccess(HttpContext context, WAFConfigurationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="w_af_creation_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.WAFAndDDOSProtection.wAFCreationAsync") wAFCreationAsync

> WAF and DDOS Creation


```java
void wAFCreationAsync(
        final WAFCreationInput input,
        final APICallBack<WAFCreationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```java
WAFCreationInput collect = new WAFCreationInput();

String origin = "origin";
collect.setOrigin(origin);

String cname = "cname";
collect.setCname(cname);

// Invoking the API call with sample inputs
wAFAndDDOSProtection.wAFCreationAsync(collect, new APICallBack<WAFCreationModelResponse>() {
    public void onSuccess(HttpContext context, WAFCreationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.Encryption") Encryption

### Get singleton instance

The singleton instance of the ``` Encryption ``` class can be accessed from the API Client.

```java
Encryption encryption = client.getEncryption();
```

### <a name="data_and_file_encryption_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.Encryption.dataAndFileEncryptionAsync") dataAndFileEncryptionAsync

> Data and File Encryption API


```java
void dataAndFileEncryptionAsync(
        final DataAndFileEncryptionInput input,
        final APICallBack<EncryptionModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |


#### Example Usage

```java
DataAndFileEncryptionInput collect = new DataAndFileEncryptionInput();

String data = "data";
collect.setData(data);

String method = "method";
collect.setMethod(method);

int bit = 94;
collect.setBit(bit);

// Invoking the API call with sample inputs
encryption.dataAndFileEncryptionAsync(collect, new APICallBack<EncryptionModelResponse>() {
    public void onSuccess(HttpContext context, EncryptionModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.CDN") CDN

### Get singleton instance

The singleton instance of the ``` CDN ``` class can be accessed from the API Client.

```java
CDN cDN = client.getCDN();
```

### <a name="c_dn_push_zone_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.CDN.cDNPushZoneAsync") cDNPushZoneAsync

> CDN Push Zone API


```java
void cDNPushZoneAsync(
        final CDNPushZoneInput input,
        final APICallBack<CDNPushModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |


#### Example Usage

```java
CDNPushZoneInput collect = new CDNPushZoneInput();

String cname = "cname";
collect.setCname(cname);

String file = "file";
collect.setFile(file);

// Invoking the API call with sample inputs
cDN.cDNPushZoneAsync(collect, new APICallBack<CDNPushModelResponse>() {
    public void onSuccess(HttpContext context, CDNPushModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="c_dn_pull_zone_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.CDN.cDNPullZoneAsync") cDNPullZoneAsync

> CDN Pull Zone API


```java
void cDNPullZoneAsync(
        final CDNPullZoneInput input,
        final APICallBack<CDNPullModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```java
CDNPullZoneInput collect = new CDNPullZoneInput();

String origin = "origin";
collect.setOrigin(origin);

String cname = "cname";
collect.setCname(cname);

// Invoking the API call with sample inputs
cDN.cDNPullZoneAsync(collect, new APICallBack<CDNPullModelResponse>() {
    public void onSuccess(HttpContext context, CDNPullModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.DNS") DNS

### Get singleton instance

The singleton instance of the ``` DNS ``` class can be accessed from the API Client.

```java
DNS dNS = client.getDNS();
```

### <a name="d_ns_configuration_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.DNS.dNSConfigurationAsync") dNSConfigurationAsync

> DNS Configuration API


```java
void dNSConfigurationAsync(
        final DNSConfigurationInput input,
        final APICallBack<DNSConfigurationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |


#### Example Usage

```java
DNSConfigurationInput collect = new DNSConfigurationInput();

String domain = "domain";
collect.setDomain(domain);

String records = "records";
collect.setRecords(records);

// Invoking the API call with sample inputs
dNS.dNSConfigurationAsync(collect, new APICallBack<DNSConfigurationModelResponse>() {
    public void onSuccess(HttpContext context, DNSConfigurationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="d_ns_creation_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.DNS.dNSCreationAsync") dNSCreationAsync

> DNS Creation API


```java
void dNSCreationAsync(
        final String domain,
        final APICallBack<DNSCreationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```java
String domain = "domain";
// Invoking the API call with sample inputs
dNS.dNSCreationAsync(domain, new APICallBack<DNSCreationModelResponse>() {
    public void onSuccess(HttpContext context, DNSCreationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.CodeObfuscation") CodeObfuscation

### Get singleton instance

The singleton instance of the ``` CodeObfuscation ``` class can be accessed from the API Client.

```java
CodeObfuscation codeObfuscation = client.getCodeObfuscation();
```

### <a name="obfuscation_and_anti_tampering_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.CodeObfuscation.obfuscationAndAntiTamperingAsync") obfuscationAndAntiTamperingAsync

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```java
void obfuscationAndAntiTamperingAsync(
        final String app,
        final APICallBack<CodeProtectionModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |


#### Example Usage

```java
String app = "app";
// Invoking the API call with sample inputs
codeObfuscation.obfuscationAndAntiTamperingAsync(app, new APICallBack<CodeProtectionModelResponse>() {
    public void onSuccess(HttpContext context, CodeProtectionModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.Hosting") Hosting

### Get singleton instance

The singleton instance of the ``` Hosting ``` class can be accessed from the API Client.

```java
Hosting hosting = client.getHosting();
```

### <a name="hosting_setup_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.Hosting.hostingSetupAsync") hostingSetupAsync

> Node.JS and Static Web APP Hosting


```java
void hostingSetupAsync(
        final HostingSetupInput input,
        final APICallBack<HostingModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```java
HostingSetupInput collect = new HostingSetupInput();

String app = "app";
collect.setApp(app);

String domain = "domain";
collect.setDomain(domain);

// Invoking the API call with sample inputs
hosting.hostingSetupAsync(collect, new APICallBack<HostingModelResponse>() {
    public void onSuccess(HttpContext context, HostingModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.DataManipulation") DataManipulation

### Get singleton instance

The singleton instance of the ``` DataManipulation ``` class can be accessed from the API Client.

```java
DataManipulation dataManipulation = client.getDataManipulation();
```

### <a name="https_api_rest_sh_api_d_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.DataManipulation.httpsApiRestShApiDAsync") httpsApiRestShApiDAsync

> Data Manipulation API


```java
void httpsApiRestShApiDAsync(
        final HttpsApiRestShApiDInput input,
        final APICallBack<DataManipulationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```java
HttpsApiRestShApiDInput collect = new HttpsApiRestShApiDInput();

String data = "data";
collect.setData(data);

String transform = "transform";
collect.setTransform(transform);

// Invoking the API call with sample inputs
dataManipulation.httpsApiRestShApiDAsync(collect, new APICallBack<DataManipulationModelResponse>() {
    public void onSuccess(HttpContext context, DataManipulationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.ImageManipulation") ImageManipulation

### Get singleton instance

The singleton instance of the ``` ImageManipulation ``` class can be accessed from the API Client.

```java
ImageManipulation imageManipulation = client.getImageManipulation();
```

### <a name="image_manipulation_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.ImageManipulation.imageManipulationAsync") imageManipulationAsync

> Image Manipulation API


```java
void imageManipulationAsync(
        final ImageManipulationInput input,
        final APICallBack<ImageManipulationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```java
ImageManipulationInput collect = new ImageManipulationInput();

String image = "image";
collect.setImage(image);

String transform = "transform";
collect.setTransform(transform);

// Invoking the API call with sample inputs
imageManipulation.imageManipulationAsync(collect, new APICallBack<ImageManipulationModelResponse>() {
    public void onSuccess(HttpContext context, ImageManipulationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.Verification") Verification

### Get singleton instance

The singleton instance of the ``` Verification ``` class can be accessed from the API Client.

```java
Verification verification = client.getVerification();
```

### <a name="user_address_verification_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.Verification.userAddressVerificationAsync") userAddressVerificationAsync

> User Address Verification API


```java
void userAddressVerificationAsync(
        final UserAddressVerificationInput input,
        final APICallBack<VerifyAddressResponse> callBack)
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

```java
UserAddressVerificationInput collect = new UserAddressVerificationInput();

String user = "user";
collect.setUser(user);

String a = "a";
collect.setA(a);

String sa = "sa";
collect.setSa(sa);

String c = "c";
collect.setC(c);

String s = "s";
collect.setS(s);

int z = 94;
collect.setZ(z);

String address = "address";
collect.setAddress(address);

// Invoking the API call with sample inputs
verification.userAddressVerificationAsync(collect, new APICallBack<VerifyAddressResponse>() {
    public void onSuccess(HttpContext context, VerifyAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="user_verification_response_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.Verification.userVerificationResponseAsync") userVerificationResponseAsync

> Users Verification Response API


```java
void userVerificationResponseAsync(
        final UserVerificationResponseInput input,
        final APICallBack<VerifyUserModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |


#### Example Usage

```java
UserVerificationResponseInput collect = new UserVerificationResponseInput();

String user = "user";
collect.setUser(user);

String code = "code";
collect.setCode(code);

// Invoking the API call with sample inputs
verification.userVerificationResponseAsync(collect, new APICallBack<VerifyUserModelResponse>() {
    public void onSuccess(HttpContext context, VerifyUserModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="user_verification_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.Verification.userVerificationAsync") userVerificationAsync

> User Verification API


```java
void userVerificationAsync(
        final String user,
        final APICallBack<VerifyModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |


#### Example Usage

```java
String user = "user";
// Invoking the API call with sample inputs
verification.userVerificationAsync(user, new APICallBack<VerifyModelResponse>() {
    public void onSuccess(HttpContext context, VerifyModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get singleton instance

The singleton instance of the ``` TwoFactorAuthenticationAPI ``` class can be accessed from the API Client.

```java
TwoFactorAuthenticationAPI twoFactorAuthenticationAPI = client.getTwoFactorAuthenticationAPI();
```

### <a name="m2_fa_token_response_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.TwoFactorAuthenticationAPI.m2FATokenResponseAsync") m2FATokenResponseAsync

> Two Factor Authentication Token Reply


```java
void m2FATokenResponseAsync(
        final M2FATokenResponseInput input,
        final APICallBack<TwoFactorAuthenticationTokenModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |


#### Example Usage

```java
M2FATokenResponseInput collect = new M2FATokenResponseInput();

String user = "user";
collect.setUser(user);

String code = "code";
collect.setCode(code);

// Invoking the API call with sample inputs
twoFactorAuthenticationAPI.m2FATokenResponseAsync(collect, new APICallBack<TwoFactorAuthenticationTokenModelResponse>() {
    public void onSuccess(HttpContext context, TwoFactorAuthenticationTokenModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="two_factor_authentication_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.TwoFactorAuthenticationAPI.twoFactorAuthenticationAsync") twoFactorAuthenticationAsync

> Two Factor Authentication API


```java
void twoFactorAuthenticationAsync(
        final String to,
        final APICallBack<TwoFactorAuthenticationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |


#### Example Usage

```java
String to = "to";
// Invoking the API call with sample inputs
twoFactorAuthenticationAPI.twoFactorAuthenticationAsync(to, new APICallBack<TwoFactorAuthenticationModelResponse>() {
    public void onSuccess(HttpContext context, TwoFactorAuthenticationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.UserManagement") UserManagement

### Get singleton instance

The singleton instance of the ``` UserManagement ``` class can be accessed from the API Client.

```java
UserManagement userManagement = client.getUserManagement();
```

### <a name="get_user_info_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.UserManagement.getUserInfoAsync") getUserInfoAsync

> Get User Info API


```java
void getUserInfoAsync(
        final String user,
        final APICallBack<UserInformationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |


#### Example Usage

```java
String user = "user";
// Invoking the API call with sample inputs
userManagement.getUserInfoAsync(user, new APICallBack<UserInformationModelResponse>() {
    public void onSuccess(HttpContext context, UserInformationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_user_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.UserManagement.updateUserAsync") updateUserAsync

> Update User API


```java
void updateUserAsync(
        final UpdateUserInput input,
        Map<String, Object> queryParameters,
        final APICallBack<UserUpdateModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```java
UpdateUserInput collect = new UpdateUserInput();

String user = "user";
collect.setUser(user);

String avatar = "avatar";
collect.setAvatar(avatar);

String customInput = "custom input";
collect.setCustomInput(customInput);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
userManagement.updateUserAsync(collect, , queryParams, new APICallBack<UserUpdateModelResponse>() {
    public void onSuccess(HttpContext context, UserUpdateModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="delete_user_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.UserManagement.deleteUserAsync") deleteUserAsync

> Delete User API


```java
void deleteUserAsync(
        final String user,
        final APICallBack<UserDeletionResponseModel> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |


#### Example Usage

```java
String user = "user";
// Invoking the API call with sample inputs
userManagement.deleteUserAsync(user, new APICallBack<UserDeletionResponseModel>() {
    public void onSuccess(HttpContext context, UserDeletionResponseModel response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png "SMASH.controllers.LoginAndRegistration") LoginAndRegistration

### Get singleton instance

The singleton instance of the ``` LoginAndRegistration ``` class can be accessed from the API Client.

```java
LoginAndRegistration loginAndRegistration = client.getLoginAndRegistration();
```

### <a name="user_registration_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.LoginAndRegistration.userRegistrationAsync") userRegistrationAsync

> User Registration API


```java
void userRegistrationAsync(
        final UserRegistrationInput input,
        Map<String, Object> queryParameters,
        final APICallBack<UserRegistrationModelResponse> callBack)
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

```java
UserRegistrationInput collect = new UserRegistrationInput();

String email = "email";
collect.setEmail(email);

String user = "user";
collect.setUser(user);

String password = "password";
collect.setPassword(password);

String name = "name";
collect.setName(name);

Integer phone = 94;
collect.setPhone(phone);

Integer countrycode = 94;
collect.setCountrycode(countrycode);

String address = "address";
collect.setAddress(address);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
loginAndRegistration.userRegistrationAsync(collect, , queryParams, new APICallBack<UserRegistrationModelResponse>() {
    public void onSuccess(HttpContext context, UserRegistrationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


### <a name="user_authentication_async"></a>![Method: ](https://apidocs.io/img/method.png "SMASH.controllers.LoginAndRegistration.userAuthenticationAsync") userAuthenticationAsync

> User Authentication API


```java
void userAuthenticationAsync(
        final UserAuthenticationInput input,
        final APICallBack<UserAuthenticationModelResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |


#### Example Usage

```java
UserAuthenticationInput collect = new UserAuthenticationInput();

String user = "user";
collect.setUser(user);

String password = "password";
collect.setPassword(password);

// Invoking the API call with sample inputs
loginAndRegistration.userAuthenticationAsync(collect, new APICallBack<UserAuthenticationModelResponse>() {
    public void onSuccess(HttpContext context, UserAuthenticationModelResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)




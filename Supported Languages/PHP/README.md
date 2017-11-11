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

The generated code has dependencies over external libraries like UniRest. These dependencies are defined in the ```composer.json``` file that comes with the SDK. 
To resolve these dependencies, we use the Composer package manager which requires PHP greater than 5.3.2 installed in your system. 
Visit [https://getcomposer.org/download/](https://getcomposer.org/download/) to download the installer file for Composer and run it in your system. 
Open command prompt and type ```composer --version```. This should display the current version of the Composer installed if the installation was successful.

* Using command line, navigate to the directory containing the generated files (including ```composer.json```) for the SDK. 
* Run the command ```composer install```. This should install all the required dependencies and create the ```vendor``` directory in your project directory.

![Building SDK - Step 1](https://apidocs.io/illustration/php?step=installDependencies&workspaceFolder=SMASH-PHP)

### [For Windows Users Only] Configuring CURL Certificate Path in php.ini

CURL used to include a list of accepted CAs, but no longer bundles ANY CA certs. So by default it will reject all SSL certificates as unverifiable. You will have to get your CA's cert and point curl at it. The steps are as follows:

1. Download the certificate bundle (.pem file) from [https://curl.haxx.se/docs/caextract.html](https://curl.haxx.se/docs/caextract.html) on to your system.
2. Add curl.cainfo = "PATH_TO/cacert.pem" to your php.ini file located in your php installation. “PATH_TO” must be an absolute path containing the .pem file.

```ini
[curl]
; A default value for the CURLOPT_CAINFO option. This is required to be an
; absolute path.
;curl.cainfo =
```

## How to Use

The following section explains how to use the SMASH library in a new project.

### 1. Open Project in an IDE

Open an IDE for PHP like PhpStorm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PHPStorm - Step 1](https://apidocs.io/illustration/php?step=openIDE&workspaceFolder=SMASH-PHP)

Click on ```Open``` in PhpStorm to browse to your generated SDK directory and then click ```OK```.

![Open project in PHPStorm - Step 2](https://apidocs.io/illustration/php?step=openProject0&workspaceFolder=SMASH-PHP)     

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PHPStorm - Step 1](https://apidocs.io/illustration/php?step=createDirectory&workspaceFolder=SMASH-PHP)

Name the directory as "test"

![Add a new project in PHPStorm - Step 2](https://apidocs.io/illustration/php?step=nameDirectory&workspaceFolder=SMASH-PHP)
   
Add a PHP file to this project

![Add a new project in PHPStorm - Step 3](https://apidocs.io/illustration/php?step=createFile&workspaceFolder=SMASH-PHP)

Name it "testSDK"

![Add a new project in PHPStorm - Step 4](https://apidocs.io/illustration/php?step=nameFile&workspaceFolder=SMASH-PHP)

Depending on your project setup, you might need to include composer's autoloader in your PHP code to enable auto loading of classes.

```PHP
require_once "../vendor/autoload.php";
```

It is important that the path inside require_once correctly points to the file ```autoload.php``` inside the vendor directory created during dependency installations.

![Add a new project in PHPStorm - Step 4](https://apidocs.io/illustration/php?step=projectFiles&workspaceFolder=SMASH-PHP)

After this you can add code to initialize the client library and acquire the instance of a Controller class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

### 3. Run the Test Project

To run your project you must set the Interpreter for your project. Interpreter is the PHP engine installed on your computer.

Open ```Settings``` from ```File``` menu.

![Run Test Project - Step 1](https://apidocs.io/illustration/php?step=openSettings&workspaceFolder=SMASH-PHP)

Select ```PHP``` from within ```Languages & Frameworks```

![Run Test Project - Step 2](https://apidocs.io/illustration/php?step=setInterpreter0&workspaceFolder=SMASH-PHP)

Browse for Interpreters near the ```Interpreter``` option and choose your interpreter.

![Run Test Project - Step 3](https://apidocs.io/illustration/php?step=setInterpreter1&workspaceFolder=SMASH-PHP)

Once the interpreter is selected, click ```OK```

![Run Test Project - Step 4](https://apidocs.io/illustration/php?step=setInterpreter2&workspaceFolder=SMASH-PHP)

To run your project, right click on your PHP file inside your Test project and click on ```Run```

![Run Test Project - Step 5](https://apidocs.io/illustration/php?step=runProject&workspaceFolder=SMASH-PHP)

## How to Test

Unit tests in this SDK can be run using PHPUnit. 

1. First install the dependencies using composer including the `require-dev` dependencies.
2. Run `vendor\bin\phpunit --verbose` from commandline to execute tests. If you have 
   installed PHPUnit globally, run tests using `phpunit --verbose` instead.

You can change the PHPUnit test configuration in the `phpunit.xml` file.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



API client can be initialized as following.

```php
$uid = 'UID'; // Your user ID
$secret = 'SECRET'; // Your Private API Key
$key = 'KEY'; // Your Public API Key

$client = new SMASHLib\SMASHClient($uid, $secret, $key);
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

The singleton instance of the ``` AdvancedLogging ``` class can be accessed from the API Client.

```php
$advancedLogging = $client->getAdvancedLogging();
```

### <a name="logging_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.loggingConfiguration") loggingConfiguration

> WAF Log Configuration


```php
function loggingConfiguration($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |



#### Example Usage

```php
$name = 'name';
$collect['name'] = $name;

$origin = 'origin';
$collect['origin'] = $origin;

$activate = 'activate';
$collect['activate'] = $activate;


$result = $advancedLogging->loggingConfiguration($collect);

```


### <a name="logging_info"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.loggingInfo") loggingInfo

> WAF Log Info


```php
function loggingInfo($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |



#### Example Usage

```php
$name = 'name';
$collect['name'] = $name;

$origin = 'origin';
$collect['origin'] = $origin;

$time = 'time';
$collect['time'] = $time;


$result = $advancedLogging->loggingInfo($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png ".WAFAndDDOSProtection") WAFAndDDOSProtection

### Get singleton instance

The singleton instance of the ``` WAFAndDDOSProtection ``` class can be accessed from the API Client.

```php
$wAFAndDDOSProtection = $client->getWAFAndDDOSProtection();
```

### <a name="w_af_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.wAFConfiguration") wAFConfiguration

> WAF and DDOS Configuration


```php
function wAFConfiguration($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |



#### Example Usage

```php
$name = 'name';
$collect['name'] = $name;

$rule = 'rule';
$collect['rule'] = $rule;


$result = $wAFAndDDOSProtection->wAFConfiguration($collect);

```


### <a name="w_af_creation"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.wAFCreation") wAFCreation

> WAF and DDOS Creation


```php
function wAFCreation($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |



#### Example Usage

```php
$origin = 'origin';
$collect['origin'] = $origin;

$cname = 'cname';
$collect['cname'] = $cname;


$result = $wAFAndDDOSProtection->wAFCreation($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png ".Encryption") Encryption

### Get singleton instance

The singleton instance of the ``` Encryption ``` class can be accessed from the API Client.

```php
$encryption = $client->getEncryption();
```

### <a name="data_and_file_encryption"></a>![Method: ](https://apidocs.io/img/method.png ".Encryption.dataAndFileEncryption") dataAndFileEncryption

> Data and File Encryption API


```php
function dataAndFileEncryption($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |



#### Example Usage

```php
$data = 'data';
$collect['data'] = $data;

$method = 'method';
$collect['method'] = $method;

$bit = 86;
$collect['bit'] = $bit;


$result = $encryption->dataAndFileEncryption($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png ".CDN") CDN

### Get singleton instance

The singleton instance of the ``` CDN ``` class can be accessed from the API Client.

```php
$cDN = $client->getCDN();
```

### <a name="c_dn_push_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cDNPushZone") cDNPushZone

> CDN Push Zone API


```php
function cDNPushZone($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |



#### Example Usage

```php
$cname = 'cname';
$collect['cname'] = $cname;

$file = 'file';
$collect['file'] = $file;


$result = $cDN->cDNPushZone($collect);

```


### <a name="c_dn_pull_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cDNPullZone") cDNPullZone

> CDN Pull Zone API


```php
function cDNPullZone($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |



#### Example Usage

```php
$origin = 'origin';
$collect['origin'] = $origin;

$cname = 'cname';
$collect['cname'] = $cname;


$result = $cDN->cDNPullZone($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png ".DNS") DNS

### Get singleton instance

The singleton instance of the ``` DNS ``` class can be accessed from the API Client.

```php
$dNS = $client->getDNS();
```

### <a name="d_ns_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dNSConfiguration") dNSConfiguration

> DNS Configuration API


```php
function dNSConfiguration($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |



#### Example Usage

```php
$domain = 'domain';
$collect['domain'] = $domain;

$records = 'records';
$collect['records'] = $records;


$result = $dNS->dNSConfiguration($collect);

```


### <a name="d_ns_creation"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dNSCreation") dNSCreation

> DNS Creation API


```php
function dNSCreation($domain)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |



#### Example Usage

```php
$domain = 'domain';

$result = $dNS->dNSCreation($domain);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png ".CodeObfuscation") CodeObfuscation

### Get singleton instance

The singleton instance of the ``` CodeObfuscation ``` class can be accessed from the API Client.

```php
$codeObfuscation = $client->getCodeObfuscation();
```

### <a name="obfuscation_and_anti_tampering"></a>![Method: ](https://apidocs.io/img/method.png ".CodeObfuscation.obfuscationAndAntiTampering") obfuscationAndAntiTampering

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```php
function obfuscationAndAntiTampering($app)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |



#### Example Usage

```php
$app = 'app';

$result = $codeObfuscation->obfuscationAndAntiTampering($app);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png ".Hosting") Hosting

### Get singleton instance

The singleton instance of the ``` Hosting ``` class can be accessed from the API Client.

```php
$hosting = $client->getHosting();
```

### <a name="hosting_setup"></a>![Method: ](https://apidocs.io/img/method.png ".Hosting.hostingSetup") hostingSetup

> Node.JS and Static Web APP Hosting


```php
function hostingSetup($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |



#### Example Usage

```php
$app = 'app';
$collect['app'] = $app;

$domain = 'domain';
$collect['domain'] = $domain;


$result = $hosting->hostingSetup($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".DataManipulation") DataManipulation

### Get singleton instance

The singleton instance of the ``` DataManipulation ``` class can be accessed from the API Client.

```php
$dataManipulation = $client->getDataManipulation();
```

### <a name="https_api_rest_sh_api_d"></a>![Method: ](https://apidocs.io/img/method.png ".DataManipulation.httpsApiRestShApiD") httpsApiRestShApiD

> Data Manipulation API


```php
function httpsApiRestShApiD($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |



#### Example Usage

```php
$data = 'data';
$collect['data'] = $data;

$transform = 'transform';
$collect['transform'] = $transform;


$result = $dataManipulation->httpsApiRestShApiD($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".ImageManipulation") ImageManipulation

### Get singleton instance

The singleton instance of the ``` ImageManipulation ``` class can be accessed from the API Client.

```php
$imageManipulation = $client->getImageManipulation();
```

### <a name="image_manipulation"></a>![Method: ](https://apidocs.io/img/method.png ".ImageManipulation.imageManipulation") imageManipulation

> Image Manipulation API


```php
function imageManipulation($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |



#### Example Usage

```php
$image = 'image';
$collect['image'] = $image;

$transform = 'transform';
$collect['transform'] = $transform;


$result = $imageManipulation->imageManipulation($collect);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png ".Verification") Verification

### Get singleton instance

The singleton instance of the ``` Verification ``` class can be accessed from the API Client.

```php
$verification = $client->getVerification();
```

### <a name="user_address_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userAddressVerification") userAddressVerification

> User Address Verification API


```php
function userAddressVerification($options)
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

```php
$user = 'user';
$collect['user'] = $user;

$a = 'a';
$collect['a'] = $a;

$sa = 'sa';
$collect['sa'] = $sa;

$c = 'c';
$collect['c'] = $c;

$s = 's';
$collect['s'] = $s;

$z = 86;
$collect['z'] = $z;

$address = 'address';
$collect['address'] = $address;


$result = $verification->userAddressVerification($collect);

```


### <a name="user_verification_response"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userVerificationResponse") userVerificationResponse

> Users Verification Response API


```php
function userVerificationResponse($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |



#### Example Usage

```php
$user = 'user';
$collect['user'] = $user;

$code = 'code';
$collect['code'] = $code;


$result = $verification->userVerificationResponse($collect);

```


### <a name="user_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userVerification") userVerification

> User Verification API


```php
function userVerification($user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |



#### Example Usage

```php
$user = 'user';

$result = $verification->userVerification($user);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png ".TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get singleton instance

The singleton instance of the ``` TwoFactorAuthenticationAPI ``` class can be accessed from the API Client.

```php
$twoFactorAuthenticationAPI = $client->getTwoFactorAuthenticationAPI();
```

### <a name="m2_fa_token_response"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.m2FATokenResponse") m2FATokenResponse

> Two Factor Authentication Token Reply


```php
function m2FATokenResponse($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |



#### Example Usage

```php
$user = 'user';
$collect['user'] = $user;

$code = 'code';
$collect['code'] = $code;


$result = $twoFactorAuthenticationAPI->m2FATokenResponse($collect);

```


### <a name="two_factor_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.twoFactorAuthentication") twoFactorAuthentication

> Two Factor Authentication API


```php
function twoFactorAuthentication($to)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |



#### Example Usage

```php
$to = 'to';

$result = $twoFactorAuthenticationAPI->twoFactorAuthentication($to);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png ".UserManagement") UserManagement

### Get singleton instance

The singleton instance of the ``` UserManagement ``` class can be accessed from the API Client.

```php
$userManagement = $client->getUserManagement();
```

### <a name="get_user_info"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.getUserInfo") getUserInfo

> Get User Info API


```php
function getUserInfo($user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |



#### Example Usage

```php
$user = 'user';

$result = $userManagement->getUserInfo($user);

```


### <a name="update_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.updateUser") updateUser

> Update User API


```php
function updateUser(
        $options,
        $queryParameters = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage

```php
$user = 'user';
$collect['user'] = $user;

$avatar = 'avatar';
$collect['avatar'] = $avatar;

$customInput = 'custom input';
$collect['customInput'] = $customInput;

// key-value map for optional query parameters
$queryParams = array('key' => 'value');


$result = $userManagement->updateUser($collect, $queryParams, );

```


### <a name="delete_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.deleteUser") deleteUser

> Delete User API


```php
function deleteUser($user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |



#### Example Usage

```php
$user = 'user';

$result = $userManagement->deleteUser($user);

```


[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png ".LoginAndRegistration") LoginAndRegistration

### Get singleton instance

The singleton instance of the ``` LoginAndRegistration ``` class can be accessed from the API Client.

```php
$loginAndRegistration = $client->getLoginAndRegistration();
```

### <a name="user_registration"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.userRegistration") userRegistration

> User Registration API


```php
function userRegistration(
        $options,
        $queryParameters = null)
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

```php
$email = 'email';
$collect['email'] = $email;

$user = 'user';
$collect['user'] = $user;

$password = 'password';
$collect['password'] = $password;

$name = 'name';
$collect['name'] = $name;

$phone = 86;
$collect['phone'] = $phone;

$countrycode = 86;
$collect['countrycode'] = $countrycode;

$address = 'address';
$collect['address'] = $address;

// key-value map for optional query parameters
$queryParams = array('key' => 'value');


$result = $loginAndRegistration->userRegistration($collect, $queryParams, );

```


### <a name="user_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.userAuthentication") userAuthentication

> User Authentication API


```php
function userAuthentication($options)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |



#### Example Usage

```php
$user = 'user';
$collect['user'] = $user;

$password = 'password';
$collect['password'] = $password;


$result = $loginAndRegistration->userAuthentication($collect);

```


[Back to List of Controllers](#list_of_controllers)




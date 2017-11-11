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

This client library is a Ruby gem which can be compiled and used in your Ruby and Ruby on Rails project. This library requires a few gems from the RubyGems repository.

1. Open the command line interface or the terminal and navigate to the folder containing the source code.
2. Run ``` gem build smash.gemspec ``` to build the gem.
3. Once built, the gem can be installed on the current work environment using ``` gem install smash-1.19.0.gem ```

![Building Gem](https://apidocs.io/illustration/ruby?step=buildSDK&workspaceFolder=SMASH-Ruby&workspaceName=SMASH-Ruby&projectName=smash&gemName=smash&gemVer=1.19.0)

## How to Use

The following section explains how to use the SMASH Ruby Gem in a new Rails project using RubyMine&trade;. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

### 1. Starting a new project

Close any existing projects in RubyMine&trade; by selecting ``` File -> Close Project ```. Next, click on ``` Create New Project ``` to create a new project from scratch.

![Create a new project in RubyMine](https://apidocs.io/illustration/ruby?step=createNewProject0&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

Next, provide ``` TestApp ``` as the project name, choose ``` Rails Application ``` as the project type, and click ``` OK ```.

![Create a new Rails Application in RubyMine - step 1](https://apidocs.io/illustration/ruby?step=createNewProject1&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

In the next dialog make sure that correct *Ruby SDK* is being used (minimum 2.0.0) and click ``` OK ```.

![Create a new Rails Application in RubyMine - step 2](https://apidocs.io/illustration/ruby?step=createNewProject2&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

This will create a new Rails Application project with an existing set of files and folder.

### 2. Add reference of the gem

In order to use the SMASH gem in the new project we must add a gem reference. Locate the ```Gemfile``` in the *Project Explorer* window under the ``` TestApp ``` project node. The file contains references to all gems being used in the project. Here, add the reference to the library gem by adding the following line: ``` gem 'smash', '~> 1.19.0' ```

![Add references of the Gemfile](https://apidocs.io/illustration/ruby?step=addReference&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

### 3. Adding a new Rails Controller

Once the ``` TestApp ``` project is created, a folder named ``` controllers ``` will be visible in the *Project Explorer* under the following path: ``` TestApp > app > controllers ```. Right click on this folder and select ``` New -> Run Rails Generator... ```.

![Run Rails Generator on Controllers Folder](https://apidocs.io/illustration/ruby?step=addCode0&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

Selecting the said option will popup a small window where the generator names are displayed. Here, select the ``` controller ``` template.

![Create a new Controller](https://apidocs.io/illustration/ruby?step=addCode1&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

Next, a popup window will ask you for a Controller name and included Actions. For controller name provide ``` Hello ``` and include an action named ``` Index ``` and click ``` OK ```.

![Add a new Controller](https://apidocs.io/illustration/ruby?step=addCode2&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

A new controller class anmed ``` HelloController ``` will be created in a file named ``` hello_controller.rb ``` containing a method named ``` Index ```. In this method, add code for initialization and a sample for its usage.

![Initialize the library](https://apidocs.io/illustration/ruby?step=addCode3&workspaceFolder=SMASH-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0)

## How to Test

You can test the generated SDK and the server with automatically generated test
cases as follows:

  1. From terminal/cmd navigate to the root directory of the SDK.
  2. Invoke: `bundle exec rake`

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



API client can be initialized as following.

```ruby
# Configuration parameters and credentials
uid = 'UID' # Your user ID
secret = 'SECRET' # Your Private API Key
key = 'KEY' # Your Public API Key

client = Smash::SMASH.new(
  uid: uid,
  secret: secret,
  key: key
)
```

The added initlization code can be debugged by putting a breakpoint in the ``` Index ``` method and running the project in debug mode by selecting ``` Run -> Debug 'Development: TestApp' ```.

![Debug the TestApp](https://apidocs.io/illustration/ruby?step=addCode4&workspaceFolder=SMASH%20-%20API-Ruby&workspaceName=SMASH&projectName=smash&gemName=smash&gemVer=1.19.0&initLine=client%2520%253D%2520SMASH.new%2528%2527uid%2527%252C%2520%2527secret%2527%252C%2520%2527key%2527%2529)



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

```ruby
advancedLogging = client.advanced_logging
```

### <a name="logging_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.logging_configuration") logging_configuration

> WAF Log Configuration


```ruby
def logging_configuration(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |


#### Example Usage

```ruby
collect = Hash.new

name = 'name'
collect['name'] = name

origin = 'origin'
collect['origin'] = origin

activate = 'activate'
collect['activate'] = activate


result = advancedLogging.logging_configuration(collect)

```


### <a name="logging_info"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.logging_info") logging_info

> WAF Log Info


```ruby
def logging_info(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |


#### Example Usage

```ruby
collect = Hash.new

name = 'name'
collect['name'] = name

origin = 'origin'
collect['origin'] = origin

time = 'time'
collect['time'] = time


result = advancedLogging.logging_info(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png ".WAFAndDDOSProtection") WAFAndDDOSProtection

### Get singleton instance

The singleton instance of the ``` WAFAndDDOSProtection ``` class can be accessed from the API Client.

```ruby
wAFAndDDOSProtection = client.waf_and_ddos_protection
```

### <a name="waf_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.waf_configuration") waf_configuration

> WAF and DDOS Configuration


```ruby
def waf_configuration(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |


#### Example Usage

```ruby
collect = Hash.new

name = 'name'
collect['name'] = name

rule = 'rule'
collect['rule'] = rule


result = wAFAndDDOSProtection.waf_configuration(collect)

```


### <a name="waf_creation"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.waf_creation") waf_creation

> WAF and DDOS Creation


```ruby
def waf_creation(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```ruby
collect = Hash.new

origin = 'origin'
collect['origin'] = origin

cname = 'cname'
collect['cname'] = cname


result = wAFAndDDOSProtection.waf_creation(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png ".Encryption") Encryption

### Get singleton instance

The singleton instance of the ``` Encryption ``` class can be accessed from the API Client.

```ruby
encryption = client.encryption
```

### <a name="data_and_file_encryption"></a>![Method: ](https://apidocs.io/img/method.png ".Encryption.data_and_file_encryption") data_and_file_encryption

> Data and File Encryption API


```ruby
def data_and_file_encryption(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |


#### Example Usage

```ruby
collect = Hash.new

data = 'data'
collect['data'] = data

method = 'method'
collect['method'] = method

bit = 222
collect['bit'] = bit


result = encryption.data_and_file_encryption(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png ".CDN") CDN

### Get singleton instance

The singleton instance of the ``` CDN ``` class can be accessed from the API Client.

```ruby
cDN = client.cdn
```

### <a name="cdn_push_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cdn_push_zone") cdn_push_zone

> CDN Push Zone API


```ruby
def cdn_push_zone(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |


#### Example Usage

```ruby
collect = Hash.new

cname = 'cname'
collect['cname'] = cname

file = 'file'
collect['file'] = file


result = cDN.cdn_push_zone(collect)

```


### <a name="cdn_pull_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cdn_pull_zone") cdn_pull_zone

> CDN Pull Zone API


```ruby
def cdn_pull_zone(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |


#### Example Usage

```ruby
collect = Hash.new

origin = 'origin'
collect['origin'] = origin

cname = 'cname'
collect['cname'] = cname


result = cDN.cdn_pull_zone(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png ".DNS") DNS

### Get singleton instance

The singleton instance of the ``` DNS ``` class can be accessed from the API Client.

```ruby
dNS = client.dns
```

### <a name="dns_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dns_configuration") dns_configuration

> DNS Configuration API


```ruby
def dns_configuration(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |


#### Example Usage

```ruby
collect = Hash.new

domain = 'domain'
collect['domain'] = domain

records = 'records'
collect['records'] = records


result = dNS.dns_configuration(collect)

```


### <a name="dns_creation"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dns_creation") dns_creation

> DNS Creation API


```ruby
def dns_creation(domain); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```ruby
domain = 'domain'

result = dNS.dns_creation(domain)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png ".CodeObfuscation") CodeObfuscation

### Get singleton instance

The singleton instance of the ``` CodeObfuscation ``` class can be accessed from the API Client.

```ruby
codeObfuscation = client.code_obfuscation
```

### <a name="obfuscation_and_anti_tampering"></a>![Method: ](https://apidocs.io/img/method.png ".CodeObfuscation.obfuscation_and_anti_tampering") obfuscation_and_anti_tampering

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```ruby
def obfuscation_and_anti_tampering(app); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |


#### Example Usage

```ruby
app = 'app'

result = codeObfuscation.obfuscation_and_anti_tampering(app)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png ".Hosting") Hosting

### Get singleton instance

The singleton instance of the ``` Hosting ``` class can be accessed from the API Client.

```ruby
hosting = client.hosting
```

### <a name="hosting_setup"></a>![Method: ](https://apidocs.io/img/method.png ".Hosting.hosting_setup") hosting_setup

> Node.JS and Static Web APP Hosting


```ruby
def hosting_setup(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |


#### Example Usage

```ruby
collect = Hash.new

app = 'app'
collect['app'] = app

domain = 'domain'
collect['domain'] = domain


result = hosting.hosting_setup(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".DataManipulation") DataManipulation

### Get singleton instance

The singleton instance of the ``` DataManipulation ``` class can be accessed from the API Client.

```ruby
dataManipulation = client.data_manipulation
```

### <a name="https_api_rest_sh_api_d"></a>![Method: ](https://apidocs.io/img/method.png ".DataManipulation.https_api_rest_sh_api_d") https_api_rest_sh_api_d

> Data Manipulation API


```ruby
def https_api_rest_sh_api_d(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```ruby
collect = Hash.new

data = 'data'
collect['data'] = data

transform = 'transform'
collect['transform'] = transform


result = dataManipulation.https_api_rest_sh_api_d(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".ImageManipulation") ImageManipulation

### Get singleton instance

The singleton instance of the ``` ImageManipulation ``` class can be accessed from the API Client.

```ruby
imageManipulation = client.image_manipulation
```

### <a name="image_manipulation"></a>![Method: ](https://apidocs.io/img/method.png ".ImageManipulation.image_manipulation") image_manipulation

> Image Manipulation API


```ruby
def image_manipulation(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |


#### Example Usage

```ruby
collect = Hash.new

image = 'image'
collect['image'] = image

transform = 'transform'
collect['transform'] = transform


result = imageManipulation.image_manipulation(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png ".Verification") Verification

### Get singleton instance

The singleton instance of the ``` Verification ``` class can be accessed from the API Client.

```ruby
verification = client.verification
```

### <a name="user_address_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.user_address_verification") user_address_verification

> User Address Verification API


```ruby
def user_address_verification(options = {}); end
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

```ruby
collect = Hash.new

user = 'user'
collect['user'] = user

a = 'a'
collect['a'] = a

sa = 'sa'
collect['sa'] = sa

c = 'c'
collect['c'] = c

s = 's'
collect['s'] = s

z = 58
collect['z'] = z

address = 'address'
collect['address'] = address


result = verification.user_address_verification(collect)

```


### <a name="user_verification_response"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.user_verification_response") user_verification_response

> Users Verification Response API


```ruby
def user_verification_response(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |


#### Example Usage

```ruby
collect = Hash.new

user = 'user'
collect['user'] = user

code = 'code'
collect['code'] = code


result = verification.user_verification_response(collect)

```


### <a name="user_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.user_verification") user_verification

> User Verification API


```ruby
def user_verification(user); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |


#### Example Usage

```ruby
user = 'user'

result = verification.user_verification(user)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png ".TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get singleton instance

The singleton instance of the ``` TwoFactorAuthenticationAPI ``` class can be accessed from the API Client.

```ruby
twoFactorAuthenticationAPI = client.two_factor_authentication_api
```

### <a name="2_fa_token_response"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.2_fa_token_response") 2_fa_token_response

> Two Factor Authentication Token Reply


```ruby
def 2_fa_token_response(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |


#### Example Usage

```ruby
collect = Hash.new

user = 'user'
collect['user'] = user

code = 'code'
collect['code'] = code


result = twoFactorAuthenticationAPI.2_fa_token_response(collect)

```


### <a name="two_factor_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.two_factor_authentication") two_factor_authentication

> Two Factor Authentication API


```ruby
def two_factor_authentication(to); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |


#### Example Usage

```ruby
to = 'to'

result = twoFactorAuthenticationAPI.two_factor_authentication(to)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png ".UserManagement") UserManagement

### Get singleton instance

The singleton instance of the ``` UserManagement ``` class can be accessed from the API Client.

```ruby
userManagement = client.user_management
```

### <a name="get_user_info"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.get_user_info") get_user_info

> Get User Info API


```ruby
def get_user_info(user); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |


#### Example Usage

```ruby
user = 'user'

result = userManagement.get_user_info(user)

```


### <a name="update_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.update_user") update_user

> Update User API


```ruby
def update_user(options = {},
                    _query_parameters = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| custom_input |  ``` Required ```  | Custom input variable for users profile |
| _query_parameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```ruby
collect = Hash.new

user = 'user'
collect['user'] = user

avatar = 'avatar'
collect['avatar'] = avatar

custom_input = 'custom input'
collect['custom_input'] = custom_input

# key-value map for optional query parameters
queryParams = { 'key' => 'value' }

result = userManagement.update_user(collect, queryParams, )

```


### <a name="delete_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.delete_user") delete_user

> Delete User API


```ruby
def delete_user(user); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |


#### Example Usage

```ruby
user = 'user'

result = userManagement.delete_user(user)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png ".LoginAndRegistration") LoginAndRegistration

### Get singleton instance

The singleton instance of the ``` LoginAndRegistration ``` class can be accessed from the API Client.

```ruby
loginAndRegistration = client.login_and_registration
```

### <a name="user_registration"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.user_registration") user_registration

> User Registration API


```ruby
def user_registration(options = {},
                          _query_parameters = nil); end
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
| _query_parameters | ``` Optional ``` | Additional optional query parameters are supported by this method |


#### Example Usage

```ruby
collect = Hash.new

email = 'email'
collect['email'] = email

user = 'user'
collect['user'] = user

password = 'password'
collect['password'] = password

name = 'name'
collect['name'] = name

phone = 58
collect['phone'] = phone

countrycode = 58
collect['countrycode'] = countrycode

address = 'address'
collect['address'] = address

# key-value map for optional query parameters
queryParams = { 'key' => 'value' }

result = loginAndRegistration.user_registration(collect, queryParams, )

```


### <a name="user_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.user_authentication") user_authentication

> User Authentication API


```ruby
def user_authentication(options = {}); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |


#### Example Usage

```ruby
collect = Hash.new

user = 'user'
collect['user'] = user

password = 'password'
collect['password'] = password


result = loginAndRegistration.user_authentication(collect)

```


[Back to List of Controllers](#list_of_controllers)




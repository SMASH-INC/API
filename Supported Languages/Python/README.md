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


You must have Python 2 >=2.7.9 or Python 3 >=3.4 installed on your system to install and run this SDK. This SDK package depends on other Python packages like nose, jsonpickle etc. 
These dependencies are defined in the ```requirements.txt``` file that comes with the SDK.
To resolve these dependencies, you can use the PIP Dependency manager. Install it by following steps at [https://pip.pypa.io/en/stable/installing/](https://pip.pypa.io/en/stable/installing/).

Python and PIP executables should be defined in your PATH. Open command prompt and type ```pip --version```.
This should display the version of the PIP Dependency Manager installed if your installation was successful and the paths are properly defined.

* Using command line, navigate to the directory containing the generated files (including ```requirements.txt```) for the SDK.
* Run the command ```pip install -r requirements.txt```. This should install all the required dependencies.

![Building SDK - Step 1](https://apidocs.io/illustration/python?step=installDependencies&workspaceFolder=SMASH-Python)


## How to Use

The following section explains how to use the SMASH SDK package in a new project.

### 1. Open Project in an IDE

Open up a Python IDE like PyCharm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PyCharm - Step 1](https://apidocs.io/illustration/python?step=pyCharm)

Click on ```Open``` in PyCharm to browse to your generated SDK directory and then click ```OK```.

![Open project in PyCharm - Step 2](https://apidocs.io/illustration/python?step=openProject0&workspaceFolder=SMASH-Python)     

The project files will be displayed in the side bar as follows:

![Open project in PyCharm - Step 3](https://apidocs.io/illustration/python?step=openProject1&workspaceFolder=SMASH-Python&projectName=smash)     

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PyCharm - Step 1](https://apidocs.io/illustration/python?step=createDirectory&workspaceFolder=SMASH-Python&projectName=smash)

Name the directory as "test"

![Add a new project in PyCharm - Step 2](https://apidocs.io/illustration/python?step=nameDirectory)
   
Add a python file to this project with the name "testsdk"

![Add a new project in PyCharm - Step 3](https://apidocs.io/illustration/python?step=createFile&workspaceFolder=SMASH-Python&projectName=smash)

Name it "testsdk"

![Add a new project in PyCharm - Step 4](https://apidocs.io/illustration/python?step=nameFile)

In your python file you will be required to import the generated python library using the following code lines

```Python
from smash.smash import SMASH
```

![Add a new project in PyCharm - Step 4](https://apidocs.io/illustration/python?step=projectFiles&workspaceFolder=SMASH-Python&libraryName=smash.smash&projectName=smash)

After this you can write code to instantiate an API client object, get a controller object and  make API calls. Sample code is given in the subsequent sections.

### 3. Run the Test Project

To run the file within your test project, right click on your Python file inside your Test project and click on ```Run```

![Run Test Project - Step 1](https://apidocs.io/illustration/python?step=runProject&workspaceFolder=SMASH-Python&libraryName=smash.smash&projectName=smash)


## How to Test

You can test the generated SDK and the server with automatically generated test
cases. unittest is used as the testing framework and nose is used as the test
runner. You can run the tests as follows:

  1. From terminal/cmd navigate to the root directory of the SDK.
  2. Invoke 'pip install -r test-requirements.txt'
  3. Invoke 'nosetests'

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



API client can be initialized as following.

```python
# Configuration parameters and credentials
uid = 'UID' # Your user ID
secret = 'SECRET' # Your Private API Key
key = 'KEY' # Your Public API Key

client = SMASH(uid, secret, key)
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

### Get controller instance

An instance of the ``` AdvancedLogging ``` class can be accessed from the API Client.

```python
 advanced_logging_client = client.advanced_logging
```

### <a name="logging_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.logging_configuration") logging_configuration

> WAF Log Configuration

```python
def logging_configuration(self,
                              options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |



#### Example Usage

```python
collect = {}

name = 'name'
collect['name'] = name

origin = 'origin'
collect['origin'] = origin

activate = 'activate'
collect['activate'] = activate


result = advanced_logging_client.logging_configuration(collect)

```


### <a name="logging_info"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.logging_info") logging_info

> WAF Log Info

```python
def logging_info(self,
                     options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |



#### Example Usage

```python
collect = {}

name = 'name'
collect['name'] = name

origin = 'origin'
collect['origin'] = origin

time = 'time'
collect['time'] = time


result = advanced_logging_client.logging_info(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png ".WAFAndDDOSProtection") WAFAndDDOSProtection

### Get controller instance

An instance of the ``` WAFAndDDOSProtection ``` class can be accessed from the API Client.

```python
 waf_and_ddos_protection_client = client.waf_and_ddos_protection
```

### <a name="waf_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.waf_configuration") waf_configuration

> WAF and DDOS Configuration

```python
def waf_configuration(self,
                          options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |



#### Example Usage

```python
collect = {}

name = 'name'
collect['name'] = name

rule = 'rule'
collect['rule'] = rule


result = waf_and_ddos_protection_client.waf_configuration(collect)

```


### <a name="waf_creation"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.waf_creation") waf_creation

> WAF and DDOS Creation

```python
def waf_creation(self,
                     options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |



#### Example Usage

```python
collect = {}

origin = 'origin'
collect['origin'] = origin

cname = 'cname'
collect['cname'] = cname


result = waf_and_ddos_protection_client.waf_creation(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png ".Encryption") Encryption

### Get controller instance

An instance of the ``` Encryption ``` class can be accessed from the API Client.

```python
 encryption_client = client.encryption
```

### <a name="data_and_file_encryption"></a>![Method: ](https://apidocs.io/img/method.png ".Encryption.data_and_file_encryption") data_and_file_encryption

> Data and File Encryption API

```python
def data_and_file_encryption(self,
                                 options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |



#### Example Usage

```python
collect = {}

data = 'data'
collect['data'] = data

method = 'method'
collect['method'] = method

bit = 43
collect['bit'] = bit


result = encryption_client.data_and_file_encryption(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png ".CDN") CDN

### Get controller instance

An instance of the ``` CDN ``` class can be accessed from the API Client.

```python
 cdn_client = client.cdn
```

### <a name="cdn_push_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cdn_push_zone") cdn_push_zone

> CDN Push Zone API

```python
def cdn_push_zone(self,
                      options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |



#### Example Usage

```python
collect = {}

cname = 'cname'
collect['cname'] = cname

file = 'file'
collect['file'] = file


result = cdn_client.cdn_push_zone(collect)

```


### <a name="cdn_pull_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cdn_pull_zone") cdn_pull_zone

> CDN Pull Zone API

```python
def cdn_pull_zone(self,
                      options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |



#### Example Usage

```python
collect = {}

origin = 'origin'
collect['origin'] = origin

cname = 'cname'
collect['cname'] = cname


result = cdn_client.cdn_pull_zone(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png ".DNS") DNS

### Get controller instance

An instance of the ``` DNS ``` class can be accessed from the API Client.

```python
 dns_client = client.dns
```

### <a name="dns_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dns_configuration") dns_configuration

> DNS Configuration API

```python
def dns_configuration(self,
                          options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |



#### Example Usage

```python
collect = {}

domain = 'domain'
collect['domain'] = domain

records = 'records'
collect['records'] = records


result = dns_client.dns_configuration(collect)

```


### <a name="dns_creation"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dns_creation") dns_creation

> DNS Creation API

```python
def dns_creation(self,
                     domain)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |



#### Example Usage

```python
domain = 'domain'

result = dns_client.dns_creation(domain)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png ".CodeObfuscation") CodeObfuscation

### Get controller instance

An instance of the ``` CodeObfuscation ``` class can be accessed from the API Client.

```python
 code_obfuscation_client = client.code_obfuscation
```

### <a name="obfuscation_and_anti_tampering"></a>![Method: ](https://apidocs.io/img/method.png ".CodeObfuscation.obfuscation_and_anti_tampering") obfuscation_and_anti_tampering

> Javascript and Node.JS Obfuscation and Anti-Tampering API

```python
def obfuscation_and_anti_tampering(self,
                                       app)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |



#### Example Usage

```python
app = 'app'

result = code_obfuscation_client.obfuscation_and_anti_tampering(app)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png ".Hosting") Hosting

### Get controller instance

An instance of the ``` Hosting ``` class can be accessed from the API Client.

```python
 hosting_client = client.hosting
```

### <a name="hosting_setup"></a>![Method: ](https://apidocs.io/img/method.png ".Hosting.hosting_setup") hosting_setup

> Node.JS and Static Web APP Hosting

```python
def hosting_setup(self,
                      options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |



#### Example Usage

```python
collect = {}

app = 'app'
collect['app'] = app

domain = 'domain'
collect['domain'] = domain


result = hosting_client.hosting_setup(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".DataManipulation") DataManipulation

### Get controller instance

An instance of the ``` DataManipulation ``` class can be accessed from the API Client.

```python
 data_manipulation_client = client.data_manipulation
```

### <a name="https_api_rest_sh_api_d"></a>![Method: ](https://apidocs.io/img/method.png ".DataManipulation.https_api_rest_sh_api_d") https_api_rest_sh_api_d

> Data Manipulation API

```python
def https_api_rest_sh_api_d(self,
                                options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |



#### Example Usage

```python
collect = {}

data = 'data'
collect['data'] = data

transform = 'transform'
collect['transform'] = transform


result = data_manipulation_client.https_api_rest_sh_api_d(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".ImageManipulation") ImageManipulation

### Get controller instance

An instance of the ``` ImageManipulation ``` class can be accessed from the API Client.

```python
 image_manipulation_client = client.image_manipulation
```

### <a name="image_manipulation"></a>![Method: ](https://apidocs.io/img/method.png ".ImageManipulation.image_manipulation") image_manipulation

> Image Manipulation API

```python
def image_manipulation(self,
                           options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |



#### Example Usage

```python
collect = {}

image = 'image'
collect['image'] = image

transform = 'transform'
collect['transform'] = transform


result = image_manipulation_client.image_manipulation(collect)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png ".Verification") Verification

### Get controller instance

An instance of the ``` Verification ``` class can be accessed from the API Client.

```python
 verification_client = client.verification
```

### <a name="user_address_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.user_address_verification") user_address_verification

> User Address Verification API

```python
def user_address_verification(self,
                                  options=dict())
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

```python
collect = {}

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

z = 43
collect['z'] = z

address = 'address'
collect['address'] = address


result = verification_client.user_address_verification(collect)

```


### <a name="user_verification_response"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.user_verification_response") user_verification_response

> Users Verification Response API

```python
def user_verification_response(self,
                                   options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |



#### Example Usage

```python
collect = {}

user = 'user'
collect['user'] = user

code = 'code'
collect['code'] = code


result = verification_client.user_verification_response(collect)

```


### <a name="user_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.user_verification") user_verification

> User Verification API

```python
def user_verification(self,
                          user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |



#### Example Usage

```python
user = 'user'

result = verification_client.user_verification(user)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png ".TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get controller instance

An instance of the ``` TwoFactorAuthenticationAPI ``` class can be accessed from the API Client.

```python
 two_factor_authentication_api_client = client.two_factor_authentication_api
```

### <a name="2_fa_token_response"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.2_fa_token_response") 2_fa_token_response

> Two Factor Authentication Token Reply

```python
def 2_fa_token_response(self,
                            options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |



#### Example Usage

```python
collect = {}

user = 'user'
collect['user'] = user

code = 'code'
collect['code'] = code


result = two_factor_authentication_api_client.2_fa_token_response(collect)

```


### <a name="two_factor_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.two_factor_authentication") two_factor_authentication

> Two Factor Authentication API

```python
def two_factor_authentication(self,
                                  to)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |



#### Example Usage

```python
to = 'to'

result = two_factor_authentication_api_client.two_factor_authentication(to)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png ".UserManagement") UserManagement

### Get controller instance

An instance of the ``` UserManagement ``` class can be accessed from the API Client.

```python
 user_management_client = client.user_management
```

### <a name="get_user_info"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.get_user_info") get_user_info

> Get User Info API

```python
def get_user_info(self,
                      user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |



#### Example Usage

```python
user = 'user'

result = user_management_client.get_user_info(user)

```


### <a name="update_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.update_user") update_user

> Update User API

```python
def update_user(self,
                    options=dict(),
                    _optional_query_parameters=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| _optional_query_parameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage

```python
collect = {}

user = 'user'
collect['user'] = user

avatar = 'avatar'
collect['avatar'] = avatar

custom_input = 'custom input'
collect['custom_input'] = custom_input

# key-value map for optional query parameters
optional_query_parameters = { }


result = user_management_client.update_user(collect, optional_query_parameters, )

```


### <a name="delete_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.delete_user") delete_user

> Delete User API

```python
def delete_user(self,
                    user)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |



#### Example Usage

```python
user = 'user'

result = user_management_client.delete_user(user)

```


[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png ".LoginAndRegistration") LoginAndRegistration

### Get controller instance

An instance of the ``` LoginAndRegistration ``` class can be accessed from the API Client.

```python
 login_and_registration_client = client.login_and_registration
```

### <a name="user_registration"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.user_registration") user_registration

> User Registration API

```python
def user_registration(self,
                          options=dict(),
                          _optional_query_parameters=None)
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
| _optional_query_parameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage

```python
collect = {}

email = 'email'
collect['email'] = email

user = 'user'
collect['user'] = user

password = 'password'
collect['password'] = password

name = 'name'
collect['name'] = name

phone = 43
collect['phone'] = phone

countrycode = 43
collect['countrycode'] = countrycode

address = 'address'
collect['address'] = address

# key-value map for optional query parameters
optional_query_parameters = { }


result = login_and_registration_client.user_registration(collect, optional_query_parameters, )

```


### <a name="user_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.user_authentication") user_authentication

> User Authentication API

```python
def user_authentication(self,
                            options=dict())
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |



#### Example Usage

```python
collect = {}

user = 'user'
collect['user'] = user

password = 'password'
collect['password'] = password


result = login_and_registration_client.user_authentication(collect)

```


[Back to List of Controllers](#list_of_controllers)




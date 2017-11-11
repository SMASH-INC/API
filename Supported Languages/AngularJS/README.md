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

The generated SDK requires AngularJS framework to work. If you do not already have angular downloaded, please go ahead and do it from [here](https://angularjs.org/).
If any of your models have `Date` or `Datetime` type fields or your endpoints have `Date`/`Datetime` type response, you will need to download and link [angular-moment](https://cdnjs.cloudflare.com/ajax/libs/angular-moment/1.0.1/angular-moment.min.js) and [moment.js](https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.17.1/moment.min.js) with your project.

## How to Use

The following section describes how to use the generated SDK in an existing/new project.

### 1. Configure Angular and Generated SDK
Perform the following steps to configure angular and the SDK:
+ Make a `scripts` folder inside the root folder of the project. If you already have a `scripts` folder, skip to the next step.
+ Move the `angular.min.js` file inside the scripts folder. 
+ Move the `SMASH` folder inside the scripts folder.
+ If any of the Custom Types in your API have `Date`/`Datetime` type fields or any endpoint has `Date`/`Datetime` response, you will need to download angular-moment and moment.js. Move these 2 files into the `scripts` folder as well.

![folder-structure-image](https://apidocs.io/illustration/angularjs?step=folderStructure&workspaceFolder=SMASH-Angular&projectName=SMASH)

### 2. Open Project Folder
Open an IDE/Text Editor for JavaScript like Sublime Text. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.  
Click on `File` and select `Open Folder`

Select the folder of your SDK and click on `Select Folder` to open it up in Sublime Text. The folder will become visible in the bar on the left.

![open-folder-image](https://apidocs.io/illustration/angularjs?step=openFolder&workspaceFolder=SMASH-Angular)

### 3. Create an Angular Application
Since Angular JS is used for client-side web development, in order to use the generated library, you will have to develop an application first.
If you already have an angular application, [skip to Step 6](#6-include-sdk-references-in-html-file). Otherwise, follow these steps to create one:

+ In the IDE, click on `File` and choose `New File` to create a new file.
+ Add the following starting code in the file:
```js
var app = angular.module('myApp', []);
app.controller('testController', function($scope) 
{

});
```
+ Save it with the name `app.js` in the `scripts` folder.


### 4. Create HTML File
Skip to the next step if you are working with an existing project and already have an html file. Otherwise follow the steps to create one:
+ Inside the IDE, right click on the project folder name and select the `New File` option to create a new test file.
+ Save it with an appropriate name such as `index.html` in the root of your project folder.
`index.html` should look like this:
```html
<!DOCTYPE html>
<html>
<head>
	<title>Angular Project</title>
	<script></script>
</head>

<body>
</body>

</html>
```

![initial-html-code-image](https://apidocs.io/illustration/angularjs?step=initialCode&workspaceFolder=SMASH-Angular)

### 5. Including links to Angular in HTML file
Your HTML file needs to have a link to `angular.min.js` file to use Angular-JS. Add the link using `script` tags inside the `head` section of `index.html` like:
```html
<script src="scripts/angular.min.js" ></script>
```
If any of the Custom Types that you have defined have `Date`/`Datetime` type fields or any endpoint has `Date`/`Datetime` response, you will also need to link to angular-moment and moment.js like:
```html
<script src="scripts/angular.min.js" ></script>
<script src="scripts/moment.min.js" ></script>
<script src="scripts/angular-moment.min.js" ></script>
```

### 6. Include SDK references in HTML file
Import the reference to the generated SDK files inside your html file like:
```html
<head>
    ...
    <!-- Helper files -->
    <script src="scripts/SMASH/Module.js"></script>
    <script src="scripts/SMASH/Configuration.js"></script>
    <script src="scripts/SMASH/ModelFactory.js"></script>
    <script src="scripts/SMASH/ObjectMapper.js"></script>
    <script src="scripts/SMASH/APIHelper.js"></script>
    <script src="scripts/SMASH/Http/Client/HttpContext.js"></script>
    <script src="scripts/SMASH/Http/Client/RequestClient.js"></script>
    <script src="scripts/SMASH/Http/Request/HttpRequest.js"></script>
    <script src="scripts/SMASH/Http/Response/HttpResponse.js"></script>

    <!-- API Controllers -->
    <script src="scripts/SMASH/Controllers/BaseController.js"></script>
    <script src="scripts/SMASH/Controllers/AdvancedLogging.js"></script>
    <script src="scripts/SMASH/Controllers/WAFAndDDOSProtection.js"></script>
    <script src="scripts/SMASH/Controllers/Encryption.js"></script>
    <script src="scripts/SMASH/Controllers/CDN.js"></script>
    <script src="scripts/SMASH/Controllers/DNS.js"></script>
    <script src="scripts/SMASH/Controllers/CodeObfuscation.js"></script>
    <script src="scripts/SMASH/Controllers/Hosting.js"></script>
    <script src="scripts/SMASH/Controllers/DataManipulation.js"></script>
    <script src="scripts/SMASH/Controllers/ImageManipulation.js"></script>
    <script src="scripts/SMASH/Controllers/Verification.js"></script>
    <script src="scripts/SMASH/Controllers/TwoFactorAuthenticationAPI.js"></script>
    <script src="scripts/SMASH/Controllers/UserManagement.js"></script>
    <script src="scripts/SMASH/Controllers/LoginAndRegistration.js"></script>


    <!-- Models -->
    <script src="scripts/SMASH/Models/BaseModel.js"></script>
    <script src="scripts/SMASH/Models/MMDDYYYYHHMMSSModel.js"></script>
    <script src="scripts/SMASH/Models/LoggingLogsModelResponse.js"></script>
    <script src="scripts/SMASH/Models/LoggingSetupModelResponse.js"></script>
    <script src="scripts/SMASH/Models/DataManipulationModel.js"></script>
    <script src="scripts/SMASH/Models/VerifyAddress.js"></script>
    <script src="scripts/SMASH/Models/UserInformationModel.js"></script>
    <script src="scripts/SMASH/Models/UserUpdateModel.js"></script>
    <script src="scripts/SMASH/Models/UserRegistrationModel.js"></script>
    <script src="scripts/SMASH/Models/InfoModel.js"></script>
    <script src="scripts/SMASH/Models/LoggingLogsModel.js"></script>
    <script src="scripts/SMASH/Models/LoggingSetupModel.js"></script>
    <script src="scripts/SMASH/Models/WAFConfigurationModel.js"></script>
    <script src="scripts/SMASH/Models/WAFCreationModel.js"></script>
    <script src="scripts/SMASH/Models/EncryptionModelResponse.js"></script>
    <script src="scripts/SMASH/Models/EncryptionModel.js"></script>
    <script src="scripts/SMASH/Models/CDNPushModel.js"></script>
    <script src="scripts/SMASH/Models/CDNPullModel.js"></script>
    <script src="scripts/SMASH/Models/DNSConfigurationModel.js"></script>
    <script src="scripts/SMASH/Models/NameserversModel.js"></script>
    <script src="scripts/SMASH/Models/HostingModelResponse.js"></script>
    <script src="scripts/SMASH/Models/HostingModel.js"></script>
    <script src="scripts/SMASH/Models/DataManipulationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/ImageManipulationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/ImageManipulationModel.js"></script>
    <script src="scripts/SMASH/Models/TwoFactorAuthenticationTokenModel.js"></script>
    <script src="scripts/SMASH/Models/TwoFactorAuthenticationModel.js"></script>
    <script src="scripts/SMASH/Models/VerifyUserModel.js"></script>
    <script src="scripts/SMASH/Models/VerifyModelResponse.js"></script>
    <script src="scripts/SMASH/Models/UserDeletionModel.js"></script>
    <script src="scripts/SMASH/Models/UserInformationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/UserInformationSecondaryModel.js"></script>
    <script src="scripts/SMASH/Models/UserCustomUpdateModel.js"></script>
    <script src="scripts/SMASH/Models/UserUpdateModelResponse.js"></script>
    <script src="scripts/SMASH/Models/UserProfileInformationModel.js"></script>
    <script src="scripts/SMASH/Models/UserRegistrationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/UserAuthenticationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/UserAuthenticationModel.js"></script>
    <script src="scripts/SMASH/Models/DataModel.js"></script>
    <script src="scripts/SMASH/Models/LogModel.js"></script>
    <script src="scripts/SMASH/Models/WAFConfigurationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/WAFCreationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/CodeProtectionModelResponse.js"></script>
    <script src="scripts/SMASH/Models/CodeProtectionModel.js"></script>
    <script src="scripts/SMASH/Models/CDNPushModelResponse.js"></script>
    <script src="scripts/SMASH/Models/CDNPullModelResponse.js"></script>
    <script src="scripts/SMASH/Models/DNSConfigurationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/DNSCreationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/DNSCreationModel.js"></script>
    <script src="scripts/SMASH/Models/TwoFactorAuthenticationTokenModelResponse.js"></script>
    <script src="scripts/SMASH/Models/TwoFactorAuthenticationModelResponse.js"></script>
    <script src="scripts/SMASH/Models/VerifyAddressResponse.js"></script>
    <script src="scripts/SMASH/Models/VerifyUserModelResponse.js"></script>
    <script src="scripts/SMASH/Models/VerifyModel.js"></script>
    <script src="scripts/SMASH/Models/UserDeletionResponseModel.js"></script>

    ...
</head>
```
> The `Module.js` file should be imported before the other files. After `Module.js`, `Configuration.js` should be imported.
> The `ModelFactory.js` file is needed by `ObjectMapper.js` file. The `ObjectMapper` in turn, is needed by `BaseController.js`.

### 7. Including link to `app.js` in HTML file
Link your `app.js` file to your `index.html` file like:
```html
<head>
	...
	<script src="scripts/app.js"></script>
</head>
```
> The link to app.js needs to be included at the very end of the head tag, after the SDK references have been added

### 8. Initializing the Angular App
You need to initialize your app and the controller associated with your view inside your `index.html` file. Do so like:
+ Add ng-app directive to initialize your app inside the `body` tag.
```html
<body ng-app="myApp">
```
+ Add ng-controller directive to initialize your controller and bind it with your view (`index.html` file).
```html
...
<body ng-app="myApp">
	<div ng-controller="testController">
		...
	</div>
	...
</body>
...
```

### 9. Consuming the SDK 
In order to use the generated SDK's modules, controllers and factories, the project needs to be added as a dependency in your angular app's module. This will be done inside the `app.js` file.
Add the dependency like this:

```js
var app = angular.module('myApp', ['SMASH']);
```
At this point, the SDK has been successfully included in your project. Further steps include using a service/factory from the generated SDK. To see working example of this, please head on [over here](#list-of-controllers) and choose any class to see its functions and example usage.  

### 10. Running The App
To run the app, simply open up the `index.html` file in a browser.

![app-running](https://apidocs.io/illustration/angularjs?step=appRunning)

## Initialization


The Angular Application can be initialized as following:
```JavaScript
var app = angular.module('myApp', [SMASH]);
// now controllers/services can be created which import
// the factories provided by the sdk
```
### Authentication
In order to setup authentication and initialization of the Angular App, you need the following information.

| Parameter | Description |
|-----------|-------------|
| uid | Your user ID |
| secret | Your Private API Key |
| key | Your Public API Key |



```JavaScript
var app = angular.module('myApp', [SMASH]);
app.factory('config', function($scope, Configuration) 
{
    return {
        setConfigVars: function() {
            // Configuration parameters and credentials
            Configuration.uid = 'UID'; // Your user ID
            Configuration.secret = 'SECRET'; // Your Private API Key
            Configuration.key = 'KEY'; // Your Public API Key
            
        }
    };
});
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

The singleton instance of the ``` AdvancedLogging ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, AdvancedLogging, LoggingSetupModelResponse, LoggingLogsModelResponse){
	});
```

### <a name="logging_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.loggingConfiguration") loggingConfiguration

> WAF Log Configuration


```javascript
function loggingConfiguration(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of the WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application you wish to configure logging on |
| activate |  ``` Required ```  | Activate or Disable |



#### Example Usage

```javascript


	app.controller("testController", function($scope, AdvancedLogging, LoggingSetupModelResponse){
        var input = [];
        input['name'] = 'name';
        input['origin'] = 'origin';
        input['activate'] = 'activate';


		var result = AdvancedLogging.loggingConfiguration(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="logging_info"></a>![Method: ](https://apidocs.io/img/method.png ".AdvancedLogging.loggingInfo") loggingInfo

> WAF Log Info


```javascript
function loggingInfo(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| origin |  ``` Required ```  | IP Address of the Web Application |
| time |  ``` Optional ```  | Specific times or dates to lookup separated by a comma in MMDDYYHHMMSS Format ( Month Month Day Day Year Year Year Hour Hour Minute Minute Second Second [01/01/0101;24:59:01]) |



#### Example Usage

```javascript


	app.controller("testController", function($scope, AdvancedLogging, LoggingLogsModelResponse){
        var input = [];
        input['name'] = 'name';
        input['origin'] = 'origin';
        input['time'] = 'time';


		var result = AdvancedLogging.loggingInfo(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="waf_and_ddos_protection"></a>![Class: ](https://apidocs.io/img/class.png ".WAFAndDDOSProtection") WAFAndDDOSProtection

### Get singleton instance

The singleton instance of the ``` WAFAndDDOSProtection ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, WAFAndDDOSProtection, WAFConfigurationModelResponse, WAFCreationModelResponse){
	});
```

### <a name="w_af_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.wAFConfiguration") wAFConfiguration

> WAF and DDOS Configuration


```javascript
function wAFConfiguration(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of your WAF zone |
| rule |  ``` Required ```  | Rule or rules to add or update separated by a comma |



#### Example Usage

```javascript


	app.controller("testController", function($scope, WAFAndDDOSProtection, WAFConfigurationModelResponse){
        var input = [];
        input['name'] = 'name';
        input['rule'] = 'rule';


		var result = WAFAndDDOSProtection.wAFConfiguration(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="w_af_creation"></a>![Method: ](https://apidocs.io/img/method.png ".WAFAndDDOSProtection.wAFCreation") wAFCreation

> WAF and DDOS Creation


```javascript
function wAFCreation(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | IP of the Web server you wish to protect |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |



#### Example Usage

```javascript


	app.controller("testController", function($scope, WAFAndDDOSProtection, WAFCreationModelResponse){
        var input = [];
        input['origin'] = 'origin';
        input['cname'] = 'cname';


		var result = WAFAndDDOSProtection.wAFCreation(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="encryption"></a>![Class: ](https://apidocs.io/img/class.png ".Encryption") Encryption

### Get singleton instance

The singleton instance of the ``` Encryption ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, Encryption, EncryptionModelResponse){
	});
```

### <a name="data_and_file_encryption"></a>![Method: ](https://apidocs.io/img/method.png ".Encryption.dataAndFileEncryption") dataAndFileEncryption

> Data and File Encryption API


```javascript
function dataAndFileEncryption(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | GIT URL, file URL, direct upload of file, or data as a query string |
| method |  ``` Required ```  | Single or multiple encryption types to apply to data or files separated by a comma (DES, RSA, BLOWFISH, TWOFISH, AES, IDEA, PGP) |
| bit |  ``` Required ```  | Encryption key size (4096) |



#### Example Usage

```javascript


	app.controller("testController", function($scope, Encryption, EncryptionModelResponse){
        var input = [];
        input['data'] = 'data';
        input['method'] = 'method';
        input['bit'] = 196;


		var result = Encryption.dataAndFileEncryption(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="cdn"></a>![Class: ](https://apidocs.io/img/class.png ".CDN") CDN

### Get singleton instance

The singleton instance of the ``` CDN ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, CDN, CDNPushModelResponse, CDNPullModelResponse){
	});
```

### <a name="c_dn_push_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cDNPushZone") cDNPushZone

> CDN Push Zone API


```javascript
function cDNPushZone(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |
| file |  ``` Required ```  | GIT URL, file URL, or direct upload of file |



#### Example Usage

```javascript


	app.controller("testController", function($scope, CDN, CDNPushModelResponse){
        var input = [];
        input['cname'] = 'cname';
        input['file'] = 'file';


		var result = CDN.cDNPushZone(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="c_dn_pull_zone"></a>![Method: ](https://apidocs.io/img/method.png ".CDN.cDNPullZone") cDNPullZone

> CDN Pull Zone API


```javascript
function cDNPullZone(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | Domain or domain names separated by a comma |
| cname |  ``` Required ```  | Domain or domain names separated by a comma you wish to allow CNAME access |



#### Example Usage

```javascript


	app.controller("testController", function($scope, CDN, CDNPullModelResponse){
        var input = [];
        input['origin'] = 'origin';
        input['cname'] = 'cname';


		var result = CDN.cDNPullZone(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="dns"></a>![Class: ](https://apidocs.io/img/class.png ".DNS") DNS

### Get singleton instance

The singleton instance of the ``` DNS ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, DNS, DNSConfigurationModelResponse, DNSCreationModelResponse){
	});
```

### <a name="d_ns_configuration"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dNSConfiguration") dNSConfiguration

> DNS Configuration API


```javascript
function dNSConfiguration(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |
| records |  ``` Required ```  | Records to append to domain separated by a comma (a;www.mydomain.com;127.0.0.0,cname;mydomain.com;otherdomain.com) |



#### Example Usage

```javascript


	app.controller("testController", function($scope, DNS, DNSConfigurationModelResponse){
        var input = [];
        input['domain'] = 'domain';
        input['records'] = 'records';


		var result = DNS.dNSConfiguration(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="d_ns_creation"></a>![Method: ](https://apidocs.io/img/method.png ".DNS.dNSCreation") dNSCreation

> DNS Creation API


```javascript
function dNSCreation(domain)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| domain |  ``` Required ```  | Domain or domain names separated by a comma |



#### Example Usage

```javascript


	app.controller("testController", function($scope, DNS, DNSCreationModelResponse){
        var domain = 'domain';


		var result = DNS.dNSCreation(domain);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="code_obfuscation"></a>![Class: ](https://apidocs.io/img/class.png ".CodeObfuscation") CodeObfuscation

### Get singleton instance

The singleton instance of the ``` CodeObfuscation ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, CodeObfuscation, CodeProtectionModelResponse){
	});
```

### <a name="obfuscation_and_anti_tampering"></a>![Method: ](https://apidocs.io/img/method.png ".CodeObfuscation.obfuscationAndAntiTampering") obfuscationAndAntiTampering

> Javascript and Node.JS Obfuscation and Anti-Tampering API


```javascript
function obfuscationAndAntiTampering(app)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |



#### Example Usage

```javascript


	app.controller("testController", function($scope, CodeObfuscation, CodeProtectionModelResponse){
        var app = 'app';


		var result = CodeObfuscation.obfuscationAndAntiTampering(app);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="hosting"></a>![Class: ](https://apidocs.io/img/class.png ".Hosting") Hosting

### Get singleton instance

The singleton instance of the ``` Hosting ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, Hosting, HostingModelResponse){
	});
```

### <a name="hosting_setup"></a>![Method: ](https://apidocs.io/img/method.png ".Hosting.hostingSetup") hostingSetup

> Node.JS and Static Web APP Hosting


```javascript
function hostingSetup(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| app |  ``` Required ```  | GIT URL or ZIP package containing your APP |
| domain |  ``` Required ```  | Domain or domain names separated by a comma |



#### Example Usage

```javascript


	app.controller("testController", function($scope, Hosting, HostingModelResponse){
        var input = [];
        input['app'] = 'app';
        input['domain'] = 'domain';


		var result = Hosting.hostingSetup(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="data_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".DataManipulation") DataManipulation

### Get singleton instance

The singleton instance of the ``` DataManipulation ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, DataManipulation, DataManipulationModelResponse){
	});
```

### <a name="https_api_rest_sh_api_d"></a>![Method: ](https://apidocs.io/img/method.png ".DataManipulation.httpsApiRestShApiD") httpsApiRestShApiD

> Data Manipulation API


```javascript
function httpsApiRestShApiD(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Data URL, data as a query string, or direct upload |
| transform |  ``` Required ```  | Transformations to perform |



#### Example Usage

```javascript


	app.controller("testController", function($scope, DataManipulation, DataManipulationModelResponse){
        var input = [];
        input['data'] = 'data';
        input['transform'] = 'transform';


		var result = DataManipulation.httpsApiRestShApiD(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="image_manipulation"></a>![Class: ](https://apidocs.io/img/class.png ".ImageManipulation") ImageManipulation

### Get singleton instance

The singleton instance of the ``` ImageManipulation ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, ImageManipulation, ImageManipulationModelResponse){
	});
```

### <a name="image_manipulation"></a>![Method: ](https://apidocs.io/img/method.png ".ImageManipulation.imageManipulation") imageManipulation

> Image Manipulation API


```javascript
function imageManipulation(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| image |  ``` Required ```  | Image URL or direct upload |
| transform |  ``` Required ```  | Transformations to perform |



#### Example Usage

```javascript


	app.controller("testController", function($scope, ImageManipulation, ImageManipulationModelResponse){
        var input = [];
        input['image'] = 'image';
        input['transform'] = 'transform';


		var result = ImageManipulation.imageManipulation(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="verification"></a>![Class: ](https://apidocs.io/img/class.png ".Verification") Verification

### Get singleton instance

The singleton instance of the ``` Verification ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, Verification, VerifyAddressResponse, VerifyUserModelResponse, VerifyModelResponse){
	});
```

### <a name="user_address_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userAddressVerification") userAddressVerification

> User Address Verification API


```javascript
function userAddressVerification(input)
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

```javascript


	app.controller("testController", function($scope, Verification, VerifyAddressResponse){
        var input = [];
        input['user'] = 'user';
        input['a'] = 'a';
        input['sa'] = 'sa';
        input['c'] = 'c';
        input['s'] = 's';
        input['z'] = 196;
        input['address'] = 'address';


		var result = Verification.userAddressVerification(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="user_verification_response"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userVerificationResponse") userVerificationResponse

> Users Verification Response API


```javascript
function userVerificationResponse(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| code |  ``` Required ```  | Verification code entered by the user |



#### Example Usage

```javascript


	app.controller("testController", function($scope, Verification, VerifyUserModelResponse){
        var input = [];
        input['user'] = 'user';
        input['code'] = 'code';


		var result = Verification.userVerificationResponse(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="user_verification"></a>![Method: ](https://apidocs.io/img/method.png ".Verification.userVerification") userVerification

> User Verification API


```javascript
function userVerification(user)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |



#### Example Usage

```javascript


	app.controller("testController", function($scope, Verification, VerifyModelResponse){
        var user = 'user';


		var result = Verification.userVerification(user);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="two_factor_authentication_api"></a>![Class: ](https://apidocs.io/img/class.png ".TwoFactorAuthenticationAPI") TwoFactorAuthenticationAPI

### Get singleton instance

The singleton instance of the ``` TwoFactorAuthenticationAPI ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, TwoFactorAuthenticationAPI, TwoFactorAuthenticationTokenModelResponse, TwoFactorAuthenticationModelResponse){
	});
```

### <a name="m2_fa_token_response"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.m2FATokenResponse") m2FATokenResponse

> Two Factor Authentication Token Reply


```javascript
function m2FATokenResponse(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username or Email |
| code |  ``` Required ```  | Response From User Containing 2FA Code |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TwoFactorAuthenticationAPI, TwoFactorAuthenticationTokenModelResponse){
        var input = [];
        input['user'] = 'user';
        input['code'] = 'code';


		var result = TwoFactorAuthenticationAPI.m2FATokenResponse(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="two_factor_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".TwoFactorAuthenticationAPI.twoFactorAuthentication") twoFactorAuthentication

> Two Factor Authentication API


```javascript
function twoFactorAuthentication(to)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | Users UID, Username, Email, Or Cellphone number |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TwoFactorAuthenticationAPI, TwoFactorAuthenticationModelResponse){
        var to = 'to';


		var result = TwoFactorAuthenticationAPI.twoFactorAuthentication(to);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="user_management"></a>![Class: ](https://apidocs.io/img/class.png ".UserManagement") UserManagement

### Get singleton instance

The singleton instance of the ``` UserManagement ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, UserManagement, UserInformationModelResponse, UserUpdateModelResponse, UserDeletionResponseModel){
	});
```

### <a name="get_user_info"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.getUserInfo") getUserInfo

> Get User Info API


```javascript
function getUserInfo(user)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users User ID |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UserManagement, UserInformationModelResponse){
        var user = 'user';


		var result = UserManagement.getUserInfo(user);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="update_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.updateUser") updateUser

> Update User API


```javascript
function updateUser(input, queryParameters)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, Or Email |
| avatar |  ``` Required ```  | Avatar Image URL |
| customInput |  ``` Required ```  | Custom input variable for users profile |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UserManagement, UserUpdateModelResponse){
        var input = [];
        input['user'] = 'user';
        input['avatar'] = 'avatar';
        input['customInput'] = custom input;

        // key-value map for optional query parameters
        var queryParameters = [];


		var result = UserManagement.updateUser(input, queryParameters);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="delete_user"></a>![Method: ](https://apidocs.io/img/method.png ".UserManagement.deleteUser") deleteUser

> Delete User API


```javascript
function deleteUser(user)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users UID, Username, or Email |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UserManagement, UserDeletionResponseModel){
        var user = 'user';


		var result = UserManagement.deleteUser(user);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)

## <a name="login_and_registration"></a>![Class: ](https://apidocs.io/img/class.png ".LoginAndRegistration") LoginAndRegistration

### Get singleton instance

The singleton instance of the ``` LoginAndRegistration ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, LoginAndRegistration, UserRegistrationModelResponse, UserAuthenticationModelResponse){
	});
```

### <a name="user_registration"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.userRegistration") userRegistration

> User Registration API


```javascript
function userRegistration(input, queryParameters)
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

```javascript


	app.controller("testController", function($scope, LoginAndRegistration, UserRegistrationModelResponse){
        var input = [];
        input['email'] = 'email';
        input['user'] = 'user';
        input['password'] = 'password';
        input['name'] = 'name';
        input['phone'] = 196;
        input['countrycode'] = 196;
        input['address'] = 'address';

        // key-value map for optional query parameters
        var queryParameters = [];


		var result = LoginAndRegistration.userRegistration(input, queryParameters);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



### <a name="user_authentication"></a>![Method: ](https://apidocs.io/img/method.png ".LoginAndRegistration.userAuthentication") userAuthentication

> User Authentication API


```javascript
function userAuthentication(input)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| user |  ``` Required ```  | Users Username or Email |
| password |  ``` Required ```  | Users Password |



#### Example Usage

```javascript


	app.controller("testController", function($scope, LoginAndRegistration, UserAuthenticationModelResponse){
        var input = [];
        input['user'] = 'user';
        input['password'] = 'password';


		var result = LoginAndRegistration.userAuthentication(input);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```



[Back to List of Controllers](#list_of_controllers)




from setuptools import setup, find_packages

# Try to convert markdown README to rst format for PyPI.
try:
    import pypandoc
    long_description = pypandoc.convert('README.md', 'rst')
except(IOError, ImportError):
    long_description = open('README.md').read()

setup(
    name='smash',
    version='1.19.0',
    description='# Introduction * ## Multi-use Flexible API for:    * **User**:     * Login      * Registration     * User Management     * Profile Updates     * Two Factor Authentication         * **Verifcation**:     * Identity Verification     * Address Verifcation     * Cell Phone Verification     * **Image**:     * Manipulation     * Compression     * Moderation         * **Data**:     * Manipulation     * Compression     * Conversion     * Sorting    * **Services**:     * Node Application Hosting     * DNS Management     * CDN (Content Delivery Network)    * **Security**:     * Encryption     * Code Obfuscation     * Platform Identification     * WAF and DDOS Protection (Web Application Firewall)       * Advanced Logging  # Overview  *  **API Domain: api.rest.sh, api.restful.sh**  This API supports both GET and POST API requests with a JSON or XML output.  *~ You can post to this API via a direct body response in JSON/XML, or using URL variables/requests.*  # Authentication Be sure to include your User API KEY, and UID when sending a POST or GET request to our API.  *~ If domain restriction is enabled in your dashboard, please include your domain in the request and redirect headers for your API calls.*  # Status Codes * ## Success Codes:   *   **200**: Information Recieved   *   **201**: Success, Resource Created, or Updated   *   **202**: Proccessing  * ## Information Codes:   *   **400**: Bad Request   *   **401**: Incorrect Credentials   *   **403**: Forbidden   *   **406**: Not Acceptable Input   *   **409**: Data Conflict   *   **413**: Payload Too Large   *   **415**: Un-Supported Content Type   *   **451**: Un-Available For Legal Reasons  * ## Error Codes:   *   **500**: Internal API Error   *   **501**: Not Implemented   *   **503**: API Unavailable   *   **504**: Request Timeout   *   **511**: Authentication Required  # Rate Pricing * **Verification requests:**    * per/1000 Requests: **$50.00**  * **User requests:**    * per/1000 Requests: **$0.0072**  * **Image requests:**    * per/1000 Requests: **$11.87**  * Data requests:    * per/1MB: **$0.00024**  * **Service requests:**    * **DNS Pricing Per Month:**     * Per Hosted Zone: **$1.00**     * Per Traffic Flow Record: **$100.00**     * Per 1 Million Queries: **$0.80**     * Per 1 Million Latency Based Queries: **$1.20**     * Per 1 Million GEO Queries: **$1.40**     * Per Health Check: **$1.00**    * **Hosting Per Month:**     * Per APP: **$5.00**    * **CDN Pricing per/1GB:**     * North America: **$0.17**     * Europe: **$0.17**     * Australia: **$0.28**     * Asia: **$0.28**     * India: **$0.34**     * South America: **$0.5**  * **Security requests:**    * **WAF and DDOS Pricing Per Month:**     * per/1000 Web Requests: **$0.0012**     * Per Web Access Control List: **$10.00**     * Per Custom Domain Configuration: **$2.00**      * **Encryption:**     * per/1000 data sets: **$0.0144**     * per/1MB per file: **$0.00048**    * **Code Obfuscation Per Month:**     * per/APP (300 files per app): **$102.00**    * **Code Obfuscation Per Month:**     * per/APP (300 files per app): **$102.00**    * **Advanced Logging:**     * per/1000 Log Entries: **$0.0072**',
    long_description=long_description,
    author='SMASH, INC',
    author_email='support@smashlabs.io',
    url='https://smashlabs.io/',
    packages=find_packages(),
    install_requires=[
        'requests>=2.9.1, <3.0',
        'jsonpickle>=0.7.1, <1.0',
        'cachecontrol>=0.11.7, <1.0',
        'python-dateutil>=2.5.3, <3.0'
    ],
    tests_require=[
        'nose>=1.3.7'
    ],
    test_suite = 'nose.collector'
)
/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */
package datamanipulation_pkg


import(
	"encoding/json"
	"smash_lib/models_pkg"
	"github.com/SMASH/unirest-go"
	"smash_lib"
	"smash_lib/apihelper_pkg"
)

/*
 * Input structure for the method HttpsApiRestShApiD
 */
type HttpsApiRestShApiDInput struct {
    Data            string          //Data URL, data as a query string, or direct upload
    Transform       string          //Transformations to perform
}

/*
 * Client structure as interface implementation
 */
type DATAMANIPULATION_IMPL struct { }

/**
 * Data Manipulation API
 * @param  HttpsApiRestShApiDInput     Structure with all inputs
 * @return	Returns the *models_pkg.DataManipulationModelResponse response from the API call
 */
func (me *DATAMANIPULATION_IMPL) HttpsApiRestShApiD (input *HttpsApiRestShApiDInput) (*models_pkg.DataManipulationModelResponse, error) {
        //the base uri for api requests
    _queryBuilder := smash_lib.BASEURI;

    //prepare query string for API call
   _queryBuilder = _queryBuilder + "/d"

    //variable to hold errors
    var err error = nil
    //process optional query parameters
    _queryBuilder, err = apihelper_pkg.AppendUrlWithQueryParameters(_queryBuilder, map[string]interface{} {
        "data" : input.Data,
        "transform" : input.Transform,
    })
    if err != nil {
        //error in query param handling
        return nil, err
    }

    //validate and preprocess url
    _queryBuilder, err = apihelper_pkg.CleanUrl(_queryBuilder)
    if err != nil {
        //error in url validation or cleaning
        return nil, err
    }

    //prepare headers for the outgoing request
    headers := map[string]interface{} {
        "user-agent" : "SMASH",
    }

    //prepare API request
    _request := unirest.Get(_queryBuilder, headers)

    //Custom Authentication to be added by the developers for authorization
    apihelper_pkg.AppendCustomAuthParams(_request)
    //and invoke the API call request to fetch the response
    _response, err := unirest.AsString(_request);
    if err != nil {
        //error in API invocation
        return nil, err
    }

    //error handling using HTTP status codes
    if (_response.Code == 400) {
        err = apihelper_pkg.NewAPIError("Bad Request", _response.Code, _response.RawBody)
    } else if (_response.Code == 401) {
        err = apihelper_pkg.NewAPIError("Incorrect Credentials", _response.Code, _response.RawBody)
    } else if (_response.Code == 403) {
        err = apihelper_pkg.NewAPIError("Forbidden", _response.Code, _response.RawBody)
    } else if (_response.Code == 406) {
        err = apihelper_pkg.NewAPIError("Not Acceptable Input", _response.Code, _response.RawBody)
    } else if (_response.Code == 409) {
        err = apihelper_pkg.NewAPIError("Data Conflict", _response.Code, _response.RawBody)
    } else if (_response.Code == 413) {
        err = apihelper_pkg.NewAPIError("Payload Too Large", _response.Code, _response.RawBody)
    } else if (_response.Code == 415) {
        err = apihelper_pkg.NewAPIError("Un-Supported Content Type", _response.Code, _response.RawBody)
    } else if (_response.Code == 451) {
        err = apihelper_pkg.NewAPIError("Un-Available For Legal Reasons", _response.Code, _response.RawBody)
    } else if (_response.Code == 500) {
        err = apihelper_pkg.NewAPIError("Internal API Error", _response.Code, _response.RawBody)
    } else if (_response.Code == 501) {
        err = apihelper_pkg.NewAPIError("Not Implemented", _response.Code, _response.RawBody)
    } else if (_response.Code == 503) {
        err = apihelper_pkg.NewAPIError("API Unavailable", _response.Code, _response.RawBody)
    } else if (_response.Code == 504) {
        err = apihelper_pkg.NewAPIError("Request Timeout", _response.Code, _response.RawBody)
    } else if (_response.Code == 511) {
        err = apihelper_pkg.NewAPIError("Authentication Required", _response.Code, _response.RawBody)
    } else if (_response.Code < 200) || (_response.Code > 206) { //[200,206] = HTTP OK
            err = apihelper_pkg.NewAPIError("HTTP Response Not OK", _response.Code, _response.RawBody)
        }
    if(err != nil) {
        //error detected in status code validation
        return nil, err
    }

    //returning the response
    var retVal *models_pkg.DataManipulationModelResponse = &models_pkg.DataManipulationModelResponse{}
    err = json.Unmarshal(_response.RawBody, &retVal)

    if err != nil {
        //error in parsing
        return nil, err
    }
    return retVal, nil
}


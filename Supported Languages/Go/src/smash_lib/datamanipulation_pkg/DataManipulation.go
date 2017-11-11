/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package datamanipulation_pkg


/*
 * Interface for the DATAMANIPULATION_IMPL
 */
type DATAMANIPULATION interface {
    HttpsApiRestShApiD (*HttpsApiRestShApiDInput) (*models_pkg.DataManipulationModelResponse, error)
}

/*
 * Factory for the DATAMANIPULATION interaface returning DATAMANIPULATION_IMPL
 */
func NewDATAMANIPULATION() DATAMANIPULATION {
    return &DATAMANIPULATION_IMPL{}
}
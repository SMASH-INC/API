/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package imagemanipulation_pkg


/*
 * Interface for the IMAGEMANIPULATION_IMPL
 */
type IMAGEMANIPULATION interface {
    ImageManipulation (*ImageManipulationInput) (*models_pkg.ImageManipulationModelResponse, error)
}

/*
 * Factory for the IMAGEMANIPULATION interaface returning IMAGEMANIPULATION_IMPL
 */
func NewIMAGEMANIPULATION() IMAGEMANIPULATION {
    return &IMAGEMANIPULATION_IMPL{}
}
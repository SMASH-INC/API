/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package wafandddosprotection_pkg


/*
 * Interface for the WAFANDDDOSPROTECTION_IMPL
 */
type WAFANDDDOSPROTECTION interface {
    WAFConfiguration (*WAFConfigurationInput) (*models_pkg.WAFConfigurationModelResponse, error)

    WAFCreation (*WAFCreationInput) (*models_pkg.WAFCreationModelResponse, error)
}

/*
 * Factory for the WAFANDDDOSPROTECTION interaface returning WAFANDDDOSPROTECTION_IMPL
 */
func NewWAFANDDDOSPROTECTION() WAFANDDDOSPROTECTION {
    return &WAFANDDDOSPROTECTION_IMPL{}
}
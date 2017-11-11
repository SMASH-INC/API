/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package hosting_pkg


/*
 * Interface for the HOSTING_IMPL
 */
type HOSTING interface {
    HostingSetup (*HostingSetupInput) (*models_pkg.HostingModelResponse, error)
}

/*
 * Factory for the HOSTING interaface returning HOSTING_IMPL
 */
func NewHOSTING() HOSTING {
    return &HOSTING_IMPL{}
}
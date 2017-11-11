/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package verification_pkg

import "smash_lib/models_pkg"

/*
 * Interface for the VERIFICATION_IMPL
 */
type VERIFICATION interface {
    UserAddressVerification (*UserAddressVerificationInput) (*models_pkg.VerifyAddressResponse, error)

    UserVerificationResponse (*UserVerificationResponseInput) (*models_pkg.VerifyUserModelResponse, error)

    UserVerification (string) (*models_pkg.VerifyModelResponse, error)
}

/*
 * Factory for the VERIFICATION interaface returning VERIFICATION_IMPL
 */
func NewVERIFICATION() VERIFICATION {
    return &VERIFICATION_IMPL{}
}
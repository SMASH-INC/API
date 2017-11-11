/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package twofactorauthenticationapi_pkg

import "smash_lib/models_pkg"

/*
 * Interface for the TWOFACTORAUTHENTICATIONAPI_IMPL
 */
type TWOFACTORAUTHENTICATIONAPI interface {
    M2FATokenResponse (*M2FATokenResponseInput) (*models_pkg.TwoFactorAuthenticationTokenModelResponse, error)

    TwoFactorAuthentication (string) (*models_pkg.TwoFactorAuthenticationModelResponse, error)
}

/*
 * Factory for the TWOFACTORAUTHENTICATIONAPI interaface returning TWOFACTORAUTHENTICATIONAPI_IMPL
 */
func NewTWOFACTORAUTHENTICATIONAPI() TWOFACTORAUTHENTICATIONAPI {
    return &TWOFACTORAUTHENTICATIONAPI_IMPL{}
}
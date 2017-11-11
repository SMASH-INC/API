/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package loginandregistration_pkg


/*
 * Interface for the LOGINANDREGISTRATION_IMPL
 */
type LOGINANDREGISTRATION interface {
    UserRegistration (*UserRegistrationInput, map[string]interface{}) (*models_pkg.UserRegistrationModelResponse, error)

    UserAuthentication (*UserAuthenticationInput) (*models_pkg.UserAuthenticationModelResponse, error)
}

/*
 * Factory for the LOGINANDREGISTRATION interaface returning LOGINANDREGISTRATION_IMPL
 */
func NewLOGINANDREGISTRATION() LOGINANDREGISTRATION {
    return &LOGINANDREGISTRATION_IMPL{}
}
/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package usermanagement_pkg

import "smash_lib/models_pkg"

/*
 * Interface for the USERMANAGEMENT_IMPL
 */
type USERMANAGEMENT interface {
    GetUserInfo (string) (*models_pkg.UserInformationModelResponse, error)

    UpdateUser (*UpdateUserInput, map[string]interface{}) (*models_pkg.UserUpdateModelResponse, error)

    DeleteUser (string) (*models_pkg.UserDeletionResponseModel, error)
}

/*
 * Factory for the USERMANAGEMENT interaface returning USERMANAGEMENT_IMPL
 */
func NewUSERMANAGEMENT() USERMANAGEMENT {
    return &USERMANAGEMENT_IMPL{}
}
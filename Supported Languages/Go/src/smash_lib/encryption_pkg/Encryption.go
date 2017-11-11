/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package encryption_pkg


/*
 * Interface for the ENCRYPTION_IMPL
 */
type ENCRYPTION interface {
    DataAndFileEncryption (*DataAndFileEncryptionInput) (*models_pkg.EncryptionModelResponse, error)
}

/*
 * Factory for the ENCRYPTION interaface returning ENCRYPTION_IMPL
 */
func NewENCRYPTION() ENCRYPTION {
    return &ENCRYPTION_IMPL{}
}
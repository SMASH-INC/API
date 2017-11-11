/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package codeobfuscation_pkg

import "smash_lib/models_pkg"

/*
 * Interface for the CODEOBFUSCATION_IMPL
 */
type CODEOBFUSCATION interface {
    ObfuscationAndAntiTampering (string) (*models_pkg.CodeProtectionModelResponse, error)
}

/*
 * Factory for the CODEOBFUSCATION interaface returning CODEOBFUSCATION_IMPL
 */
func NewCODEOBFUSCATION() CODEOBFUSCATION {
    return &CODEOBFUSCATION_IMPL{}
}
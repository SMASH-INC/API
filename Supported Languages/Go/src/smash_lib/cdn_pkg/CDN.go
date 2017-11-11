/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package cdn_pkg


/*
 * Interface for the CDN_IMPL
 */
type CDN interface {
    CDNPushZone (*CDNPushZoneInput) (*models_pkg.CDNPushModelResponse, error)

    CDNPullZone (*CDNPullZoneInput) (*models_pkg.CDNPullModelResponse, error)
}

/*
 * Factory for the CDN interaface returning CDN_IMPL
 */
func NewCDN() CDN {
    return &CDN_IMPL{}
}
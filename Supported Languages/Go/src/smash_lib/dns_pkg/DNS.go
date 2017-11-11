/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package dns_pkg

import "smash_lib/models_pkg"

/*
 * Interface for the DNS_IMPL
 */
type DNS interface {
    DNSConfiguration (*DNSConfigurationInput) (*models_pkg.DNSConfigurationModelResponse, error)

    DNSCreation (string) (*models_pkg.DNSCreationModelResponse, error)
}

/*
 * Factory for the DNS interaface returning DNS_IMPL
 */
func NewDNS() DNS {
    return &DNS_IMPL{}
}
/*
 * smash_lib
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
 */

package advancedlogging_pkg


/*
 * Interface for the ADVANCEDLOGGING_IMPL
 */
type ADVANCEDLOGGING interface {
    LoggingConfiguration (*LoggingConfigurationInput) (*models_pkg.LoggingSetupModelResponse, error)

    LoggingInfo (*LoggingInfoInput) (*models_pkg.LoggingLogsModelResponse, error)
}

/*
 * Factory for the ADVANCEDLOGGING interaface returning ADVANCEDLOGGING_IMPL
 */
func NewADVANCEDLOGGING() ADVANCEDLOGGING {
    return &ADVANCEDLOGGING_IMPL{}
}
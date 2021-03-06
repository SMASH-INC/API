/**
  * SMASH
  *
  * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io )
  */

;(function (angular) {
'use strict';
angular.module('SMASH')
    .factory('ModelFactory', ['MMDDYYYYHHMMSSModel',
        'LoggingLogsModelResponse',
        'LoggingSetupModelResponse',
        'DataManipulationModel',
        'VerifyAddress',
        'UserInformationModel',
        'UserUpdateModel',
        'UserRegistrationModel',
        'InfoModel',
        'LoggingLogsModel',
        'LoggingSetupModel',
        'WAFConfigurationModel',
        'WAFCreationModel',
        'EncryptionModelResponse',
        'EncryptionModel',
        'CDNPushModel',
        'CDNPullModel',
        'DNSConfigurationModel',
        'NameserversModel',
        'HostingModelResponse',
        'HostingModel',
        'DataManipulationModelResponse',
        'ImageManipulationModelResponse',
        'ImageManipulationModel',
        'TwoFactorAuthenticationTokenModel',
        'TwoFactorAuthenticationModel',
        'VerifyUserModel',
        'VerifyModelResponse',
        'UserDeletionModel',
        'UserInformationModelResponse',
        'UserInformationSecondaryModel',
        'UserCustomUpdateModel',
        'UserUpdateModelResponse',
        'UserProfileInformationModel',
        'UserRegistrationModelResponse',
        'UserAuthenticationModelResponse',
        'UserAuthenticationModel',
        'DataModel',
        'LogModel',
        'WAFConfigurationModelResponse',
        'WAFCreationModelResponse',
        'CodeProtectionModelResponse',
        'CodeProtectionModel',
        'CDNPushModelResponse',
        'CDNPullModelResponse',
        'DNSConfigurationModelResponse',
        'DNSCreationModelResponse',
        'DNSCreationModel',
        'TwoFactorAuthenticationTokenModelResponse',
        'TwoFactorAuthenticationModelResponse',
        'VerifyAddressResponse',
        'VerifyUserModelResponse',
        'VerifyModel',
        'UserDeletionResponseModel',
        ModelFactory]);

	/**
	 * Factory service to create instances of models and exception classes
	 */
    function ModelFactory(MMDDYYYYHHMMSSModel,
        LoggingLogsModelResponse,
        LoggingSetupModelResponse,
        DataManipulationModel,
        VerifyAddress,
        UserInformationModel,
        UserUpdateModel,
        UserRegistrationModel,
        InfoModel,
        LoggingLogsModel,
        LoggingSetupModel,
        WAFConfigurationModel,
        WAFCreationModel,
        EncryptionModelResponse,
        EncryptionModel,
        CDNPushModel,
        CDNPullModel,
        DNSConfigurationModel,
        NameserversModel,
        HostingModelResponse,
        HostingModel,
        DataManipulationModelResponse,
        ImageManipulationModelResponse,
        ImageManipulationModel,
        TwoFactorAuthenticationTokenModel,
        TwoFactorAuthenticationModel,
        VerifyUserModel,
        VerifyModelResponse,
        UserDeletionModel,
        UserInformationModelResponse,
        UserInformationSecondaryModel,
        UserCustomUpdateModel,
        UserUpdateModelResponse,
        UserProfileInformationModel,
        UserRegistrationModelResponse,
        UserAuthenticationModelResponse,
        UserAuthenticationModel,
        DataModel,
        LogModel,
        WAFConfigurationModelResponse,
        WAFCreationModelResponse,
        CodeProtectionModelResponse,
        CodeProtectionModel,
        CDNPushModelResponse,
        CDNPullModelResponse,
        DNSConfigurationModelResponse,
        DNSCreationModelResponse,
        DNSCreationModel,
        TwoFactorAuthenticationTokenModelResponse,
        TwoFactorAuthenticationModelResponse,
        VerifyAddressResponse,
        VerifyUserModelResponse,
        VerifyModel,
        UserDeletionResponseModel) {

		var classMap = {
            MMDDYYYYHHMMSSModel: MMDDYYYYHHMMSSModel,
            LoggingLogsModelResponse: LoggingLogsModelResponse,
            LoggingSetupModelResponse: LoggingSetupModelResponse,
            DataManipulationModel: DataManipulationModel,
            VerifyAddress: VerifyAddress,
            UserInformationModel: UserInformationModel,
            UserUpdateModel: UserUpdateModel,
            UserRegistrationModel: UserRegistrationModel,
            InfoModel: InfoModel,
            LoggingLogsModel: LoggingLogsModel,
            LoggingSetupModel: LoggingSetupModel,
            WAFConfigurationModel: WAFConfigurationModel,
            WAFCreationModel: WAFCreationModel,
            EncryptionModelResponse: EncryptionModelResponse,
            EncryptionModel: EncryptionModel,
            CDNPushModel: CDNPushModel,
            CDNPullModel: CDNPullModel,
            DNSConfigurationModel: DNSConfigurationModel,
            NameserversModel: NameserversModel,
            HostingModelResponse: HostingModelResponse,
            HostingModel: HostingModel,
            DataManipulationModelResponse: DataManipulationModelResponse,
            ImageManipulationModelResponse: ImageManipulationModelResponse,
            ImageManipulationModel: ImageManipulationModel,
            TwoFactorAuthenticationTokenModel: TwoFactorAuthenticationTokenModel,
            TwoFactorAuthenticationModel: TwoFactorAuthenticationModel,
            VerifyUserModel: VerifyUserModel,
            VerifyModelResponse: VerifyModelResponse,
            UserDeletionModel: UserDeletionModel,
            UserInformationModelResponse: UserInformationModelResponse,
            UserInformationSecondaryModel: UserInformationSecondaryModel,
            UserCustomUpdateModel: UserCustomUpdateModel,
            UserUpdateModelResponse: UserUpdateModelResponse,
            UserProfileInformationModel: UserProfileInformationModel,
            UserRegistrationModelResponse: UserRegistrationModelResponse,
            UserAuthenticationModelResponse: UserAuthenticationModelResponse,
            UserAuthenticationModel: UserAuthenticationModel,
            DataModel: DataModel,
            LogModel: LogModel,
            WAFConfigurationModelResponse: WAFConfigurationModelResponse,
            WAFCreationModelResponse: WAFCreationModelResponse,
            CodeProtectionModelResponse: CodeProtectionModelResponse,
            CodeProtectionModel: CodeProtectionModel,
            CDNPushModelResponse: CDNPushModelResponse,
            CDNPullModelResponse: CDNPullModelResponse,
            DNSConfigurationModelResponse: DNSConfigurationModelResponse,
            DNSCreationModelResponse: DNSCreationModelResponse,
            DNSCreationModel: DNSCreationModel,
            TwoFactorAuthenticationTokenModelResponse: TwoFactorAuthenticationTokenModelResponse,
            TwoFactorAuthenticationModelResponse: TwoFactorAuthenticationModelResponse,
            VerifyAddressResponse: VerifyAddressResponse,
            VerifyUserModelResponse: VerifyUserModelResponse,
            VerifyModel: VerifyModel,
            UserDeletionResponseModel: UserDeletionResponseModel
		};

		return {
		    /**
		     * Creates instance of a model class
		     * @param  modelName  {string}  Name of class to instantiate
		     * @returns  {object} Instance of the model class
		     */
			getInstance: function(modelName) {
        		return new classMap[modelName]();
			}
		};
	}

}(angular));
